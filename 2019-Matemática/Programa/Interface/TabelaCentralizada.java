
package Interface;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;

public class TabelaCentralizada extends JTable {
	public TabelaCentralizada(Object[][] conteudo, Object[] cabecalho) {
		super(conteudo, cabecalho);
		
		// Centralizando cada elemento da Tabela
		centralizarTabela();
	}
	
	@Override
	public boolean isCellEditable(int row, int column) {
		// Fazendo com que nenhuma célula seja editável
		return false;
	}
	
	public void centralizarTabela() {
		int alignment = SwingConstants.CENTER;
		
		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment(alignment);

		TableModel tableModel = this.getModel();

		for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++) {
			this.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
		}
	}
}
