/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.AtendenteDAO;
import DAO.HistoricoDAO;
import DAO.MedicoDAO;
import DAO.PacienteDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VANESSA
 */
public class TelaVerHistoricoIndividualMView extends javax.swing.JFrame {

    private PacienteDAO paciente;
    
    public TelaVerHistoricoIndividualMView(PacienteDAO pacienteSelecionado) {
        this.paciente = pacienteSelecionado;
        initComponents();
    }
    
    //Método que gera uma tabela com os dados do histórico do paciente
    public Object[][] gerarTabela() {
        //ArrayList para guardar os dados
        ArrayList<String[]> camposArrayList = new ArrayList();
        String[] linhaAtual;
        
        //Pega as informações do Banco de Dados
        ResultSet result = new HistoricoDAO().selecionar(paciente.getId());
        
        try {
            while(result.next()) {
                //As Strings recebem os dados separadamente
                String doenca = result.getString("doenca");
                String data = result.getString("dataConsulta");
                String sintomas = result.getString("sintomas");
                
                String nomePaciente = PacienteDAO.getPacientePorId(result.getString("idPaciente")).getNome();
                String nomeAtendente = AtendenteDAO.getAtendentePorId(result.getString("idAtendente")).getNome();
                String nomeMedico = MedicoDAO.getMedicoPorId(result.getString("idMedico")).getNome();
                
                String temExame = "Não";
                if(!result.getString("examePdf").equals("null")) {
                    temExame = "Sim";
                }
                
                //É formado um vetor com as strings dos dados separados
                linhaAtual = new String[] {doenca, data, sintomas, nomePaciente, nomeAtendente, nomeMedico, temExame};
                //O vetor é adicionado no ArrayList
                camposArrayList.add(linhaAtual);
            }
            //É criado um objeto com 7 colunas e o números de linhas referente a quantidade de históricos
            Object[][] campos = new Object[camposArrayList.size()][7];
            //Convertendo o ArrayList de arrays para uma matriz
            for (int i = 0; i < camposArrayList.size(); i++) {
                campos[i] = camposArrayList.get(i);
            }
            //Retorna a matriz para formar a tabela
            return campos;
        } catch (SQLException ex) {
            System.out.println("Erro ao selecionar o histórico.");
            Logger.getLogger(TelaVerHistoricoIndividualAView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        painelDeRolagem = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuPrincipal = new javax.swing.JMenu();
        jMenuItemHome = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuAtendente = new javax.swing.JMenu();
        jMenuItemListarAten = new javax.swing.JMenuItem();
        jMenuMedico = new javax.swing.JMenu();
        jMenuItemListarMed = new javax.swing.JMenuItem();
        jMenuPaciente = new javax.swing.JMenu();
        jMenuItemListarPac = new javax.swing.JMenuItem();
        jMenuItemHisPac = new javax.swing.JMenuItem();
        jMenuItemAddCon = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Médico - Visualizar Histórico Individual de Paciente");
        setMinimumSize(new java.awt.Dimension(1200, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel32.setBackground(new java.awt.Color(157, 246, 219));
        jPanel32.setPreferredSize(new java.awt.Dimension(1200, 191));

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo_transparente_1.png"))); // NOI18N

        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/historico.jpg"))); // NOI18N

        jLabel93.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setText("Hitórico de Pacientes");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addGap(0, 480, Short.MAX_VALUE)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 379, Short.MAX_VALUE)
                .addComponent(jLabel91))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addContainerGap(27, Short.MAX_VALUE)
                        .addComponent(jLabel92))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel93)
                .addGap(33, 33, 33))
        );

        painelDeRolagem.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new DefaultTableModel(
            gerarTabela(),
            new String [] {
                "Doença", "Data", "Sintomas", "Paciente", "Atendente", "Médico", "Exame?"
            }
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        painelDeRolagem.setViewportView(jTable1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelDeRolagem)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDeRolagem, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setBorder(null);
        jMenuBar1.setPreferredSize(new java.awt.Dimension(56, 40));

        jMenuPrincipal.setBackground(new java.awt.Color(0, 0, 153));
        jMenuPrincipal.setForeground(new java.awt.Color(0, 204, 0));
        jMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/folder.png"))); // NOI18N
        jMenuPrincipal.setText("Principal");
        jMenuPrincipal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jMenuItemHome.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/chat-home.png"))); // NOI18N
        jMenuItemHome.setText("Home");
        jMenuItemHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHomeActionPerformed(evt);
            }
        });
        jMenuPrincipal.add(jMenuItemHome);

        jMenuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair-menu-2.png"))); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuPrincipal.add(jMenuItemSair);

        jMenuBar1.add(jMenuPrincipal);

        jMenuAtendente.setBackground(new java.awt.Color(0, 0, 153));
        jMenuAtendente.setForeground(new java.awt.Color(0, 204, 0));
        jMenuAtendente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_red.png"))); // NOI18N
        jMenuAtendente.setText("Atendente");
        jMenuAtendente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuAtendente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenuAtendente.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        jMenuItemListarAten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/report_user.png"))); // NOI18N
        jMenuItemListarAten.setText("Listar");
        jMenuItemListarAten.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemListarAten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarAtenActionPerformed(evt);
            }
        });
        jMenuAtendente.add(jMenuItemListarAten);

        jMenuBar1.add(jMenuAtendente);

        jMenuMedico.setBackground(new java.awt.Color(0, 0, 153));
        jMenuMedico.setForeground(new java.awt.Color(0, 204, 0));
        jMenuMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_gray.png"))); // NOI18N
        jMenuMedico.setText("Médico");
        jMenuMedico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jMenuItemListarMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/report_user.png"))); // NOI18N
        jMenuItemListarMed.setText("Listar");
        jMenuItemListarMed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemListarMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarMedActionPerformed(evt);
            }
        });
        jMenuMedico.add(jMenuItemListarMed);

        jMenuBar1.add(jMenuMedico);

        jMenuPaciente.setBackground(new java.awt.Color(0, 0, 153));
        jMenuPaciente.setForeground(new java.awt.Color(0, 204, 0));
        jMenuPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user.png"))); // NOI18N
        jMenuPaciente.setText("Paciente");
        jMenuPaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jMenuItemListarPac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/report_user.png"))); // NOI18N
        jMenuItemListarPac.setText("Listar");
        jMenuItemListarPac.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemListarPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarPacActionPerformed(evt);
            }
        });
        jMenuPaciente.add(jMenuItemListarPac);

        jMenuItemHisPac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/page_white_magnify.png"))); // NOI18N
        jMenuItemHisPac.setText("Histórico");
        jMenuItemHisPac.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItemHisPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHisPacActionPerformed(evt);
            }
        });
        jMenuPaciente.add(jMenuItemHisPac);

        jMenuItemAddCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/page_white_add.png"))); // NOI18N
        jMenuItemAddCon.setText("Adicionar Consulta");
        jMenuItemAddCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddConActionPerformed(evt);
            }
        });
        jMenuPaciente.add(jMenuItemAddCon);

        jMenuBar1.add(jMenuPaciente);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHomeActionPerformed
        //Cria uma janela
        TelaPrincipalMedicoView aux = new TelaPrincipalMedicoView();
        //Deixa ela visível
        aux.setVisible(true);
        //Fecha a janela atual sem acabar com a aplicação
        this.dispose();
    }//GEN-LAST:event_jMenuItemHomeActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        //Cria uma janela de login
        TelaLoginView login = new TelaLoginView();
        //Deixa ela visível
        login.setVisible(true);
        //Fecha a janela atual sem acabar com a aplicação
        this.dispose();
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemListarAtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarAtenActionPerformed
        //Cria uma janela
        TelaListarAtendenteMView aux = new TelaListarAtendenteMView();
        //Deixa ela visível
        aux.setVisible(true);
        //Fecha a janela atual sem acabar com a aplicação
        this.dispose();
    }//GEN-LAST:event_jMenuItemListarAtenActionPerformed

    private void jMenuItemListarMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarMedActionPerformed
        //Cria uma janela
        TelaListarMedicoMView aux = new TelaListarMedicoMView();
        //Deixa ela visível
        aux.setVisible(true);
        //Fecha a janela atual sem acabar com a aplicação
        this.dispose();
    }//GEN-LAST:event_jMenuItemListarMedActionPerformed

    private void jMenuItemListarPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarPacActionPerformed
        //Cria uma janela
        TelaListarPAcienteMView aux = new TelaListarPAcienteMView();
        //Deixa ela visível
        aux.setVisible(true);
        //Fecha a janela atual sem acabar com a aplicação
        this.dispose();
    }//GEN-LAST:event_jMenuItemListarPacActionPerformed

    private void jMenuItemHisPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHisPacActionPerformed
        //Cria uma janela
        TelaVerHistoricoMView aux = new TelaVerHistoricoMView();
        //Deixa ela visível
        aux.setVisible(true);
        //Fecha a janela atual sem acabar com a aplicação
        this.dispose();
    }//GEN-LAST:event_jMenuItemHisPacActionPerformed

    private void jMenuItemAddConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddConActionPerformed
        //Cria uma janela
        TelaAdicionarConsultaView aux = new TelaAdicionarConsultaView();
        //Deixa ela visível
        aux.setVisible(true);
        //Fecha a janela atual sem acabar com a aplicação
        this.dispose();
    }//GEN-LAST:event_jMenuItemAddConActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaVerHistoricoIndividualMView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVerHistoricoIndividualMView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVerHistoricoIndividualMView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVerHistoricoIndividualMView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new TelaVerHistoricoIndividualAView().setVisible(true);
                throw new java.lang.NullPointerException("Esta janela não deve ser chamada diretamente, por favor acesse-a por uma TelaVerHistoricoAView");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JList<String> jList2;
    private javax.swing.JMenu jMenuAtendente;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAddCon;
    private javax.swing.JMenuItem jMenuItemHisPac;
    private javax.swing.JMenuItem jMenuItemHome;
    private javax.swing.JMenuItem jMenuItemListarAten;
    private javax.swing.JMenuItem jMenuItemListarMed;
    private javax.swing.JMenuItem jMenuItemListarPac;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuMedico;
    private javax.swing.JMenu jMenuPaciente;
    private javax.swing.JMenu jMenuPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane painelDeRolagem;
    // End of variables declaration//GEN-END:variables
}
