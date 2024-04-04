
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyConnection {
	private Connection conexao;
	
	private String bdHost; // Máquina onde está o banco de dados
	private String bdUser; // Admnistrador do banco de dados
	private String bdPass;
	private String bdDatabase;
	
	public Connection getConexao() {
		return conexao;
	}
	
	public MyConnection() {
		bdHost = "localhost:3306";
		bdUser = "root";
		bdPass = "ifsuldeminas";
	}
	
	public MyConnection(String bdDatabase) {
		this();
		this.bdDatabase = bdDatabase;
		conectar(bdDatabase);
	}
	
	public void conectar(String bdDatabase) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://" + bdHost + "/" + bdDatabase;
			
			conexao = (Connection) DriverManager.getConnection(url, bdUser, bdPass);
			
			if(conexao != null) {
				System.out.println("Sucesso ao conectar com a base de dados.");
			} else {
				System.out.println("Falha ao conectar com a base de dados.");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void efetuarConsulta(String query) throws SQLException {
		PreparedStatement instrucao = null;
		try {
			instrucao = conexao.prepareStatement(query);
			
			conexao.setAutoCommit(false);
			instrucao.executeUpdate();
			conexao.commit();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (instrucao != null) {
				instrucao.close();
			}
			conexao.setAutoCommit(true);
		}
	}
	
	public void inserir(String tabela, String sintaxe, String... valores) throws SQLException {
		String query = "";
		int ultimaIteracao = valores.length - 1;
		for(int i = 0; i < valores.length; i++) {
			String item = valores[i];
			try {
				int num = Integer.parseInt(item);
				query += num;
			} catch(NumberFormatException e) {
				query += "\"" + item + "\"";
			}
			if(i != ultimaIteracao) {
				query += ", ";
			}
		}
		query = "INSERT INTO " + tabela + "(" + sintaxe + ") VALUES (" + query + ");";
		System.out.println(query);
		this.efetuarConsulta(query);
	}
	
	public static void main(String[] args) throws SQLException {
		MyConnection conn = new MyConnection("pessoas_pw");
		conn.inserir("pessoas", "nome, idade", "General Kenobi", "30");
	}
}