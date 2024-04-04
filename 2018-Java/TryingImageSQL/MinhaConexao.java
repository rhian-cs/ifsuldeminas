// Feito por
// Aluno: Rhian Luis Garcia Moraes
// Data: 30/10/18

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class MinhaConexao {
    // Vai armazenar a conexão com o banco de dados.
    private Connection conexao;
		
	private String bdHost = "localhost:3306";
	private String bdUser = "root";
	private String bdPass = "ifsuldeminas";
	private String bdBase = "frutas";
    
    // No construtor da classe efetua a conexão com o banco.
    public MinhaConexao() {
        conectar();
    }
   
    // Método para fazer a conexão com o banco de dados.
    private void conectar() {
        
        // Carregar a classe Driver do paco com.mysql.jdbc.Driver.
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://"+bdHost+"/"+bdBase;
            conexao = DriverManager.getConnection(url, bdUser, bdPass);
            if(conexao != null) {
                JOptionPane.showMessageDialog(null, "Sucesso ao conectar com a base de dados.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao conectar com a base de dados.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    // Retorna a conexão com o banco de dados.
    public Connection getConexao() {
        return conexao;
    }
    
	public static void main(String[] args) throws IOException {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Selecione um arquivo de imagem.");
		fileChooser.showOpenDialog(null);
		
		File rawImg = fileChooser.getSelectedFile();
		// byte[] imgBinaries = Files.readAllBytes(rawImg.toPath());
		
		try {
			Connection conn = new MinhaConexao().getConexao();
			String sqlQuery = "INSERT INTO imagens(img) VALUES (?)";
			PreparedStatement statement = conn.prepareStatement(sqlQuery);
			statement.setBlob(1, new FileInputStream(rawImg));
			
			statement.execute();
			statement.close();
			
			JOptionPane.showMessageDialog(null, "Sucesso ao inserir a imagem na base de dados.");
            
		} catch(Exception e) {
			if (e.getClass().equals("class com.mysql.jdbc.PacketTooBigException")) {
				JOptionPane.showMessageDialog(null, "Por favor permita a inserção de pacotes grandes em seu servidor SQL, alterando a variável max_allowed_packet.");
			}
			e.printStackTrace();
		}
	}
}
