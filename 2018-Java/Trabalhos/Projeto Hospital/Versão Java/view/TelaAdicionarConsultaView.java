/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.TelaAdicionarConsultaController;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author 14171000102
 */
public class TelaAdicionarConsultaView extends javax.swing.JFrame {
    
    private JFileChooser fc;
    
    /**
     * Creates new form TelaAdicionarConsultaView
     */
    public TelaAdicionarConsultaView() {
        fc = new JFileChooser();
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDoenca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldData = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextFieldSintomas = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldIdPac = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldIdMed = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldIdAten = new javax.swing.JTextField();
        botaoAdicionar = new javax.swing.JButton();
        botaoApagar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        botaoAdicionarArquivo = new javax.swing.JButton();
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
        setTitle("Médico  - Tela de Adicionar Consulta");
        setMinimumSize(new java.awt.Dimension(1200, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(157, 246, 219));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 176));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addHistorico.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Adicionar Consulta");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo_transparente_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(520, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 369, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addComponent(jLabel2)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Doença");

        jTextFieldDoenca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDoencaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("Data");

        try {
            jTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setText("Sintomas");

        jTextFieldSintomas.setColumns(20);
        jTextFieldSintomas.setRows(5);
        jScrollPane1.setViewportView(jTextFieldSintomas);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setText("ID do Paciente");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setText("ID do Médico");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel8.setText("ID da Atendente");

        botaoAdicionar.setBackground(new java.awt.Color(102, 255, 102));
        botaoAdicionar.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        botaoAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        botaoAdicionar.setText("Adicionar");
        botaoAdicionar.setMaximumSize(new java.awt.Dimension(105, 27));
        botaoAdicionar.setMinimumSize(new java.awt.Dimension(105, 27));
        botaoAdicionar.setPreferredSize(new java.awt.Dimension(105, 27));
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });

        botaoApagar.setBackground(new java.awt.Color(255, 51, 51));
        botaoApagar.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        botaoApagar.setForeground(new java.awt.Color(255, 255, 255));
        botaoApagar.setText("Apagar");
        botaoApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoApagarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel11.setText("Anexo do arquivo de exame (caso exista)");

        botaoAdicionarArquivo.setBackground(new java.awt.Color(0, 102, 102));
        botaoAdicionarArquivo.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        botaoAdicionarArquivo.setForeground(new java.awt.Color(255, 255, 255));
        botaoAdicionarArquivo.setText("Adicionar Arquivo");
        botaoAdicionarArquivo.setMaximumSize(new java.awt.Dimension(105, 27));
        botaoAdicionarArquivo.setMinimumSize(new java.awt.Dimension(105, 27));
        botaoAdicionarArquivo.setPreferredSize(new java.awt.Dimension(105, 27));
        botaoAdicionarArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarArquivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldIdAten, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jTextFieldData)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                        .addComponent(jTextFieldDoenca)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel11)
                                .addComponent(jLabel7)
                                .addComponent(jTextFieldIdMed)
                                .addComponent(botaoAdicionarArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE))
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldIdPac, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldIdMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldIdPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoAdicionarArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldIdAten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
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

    private void jTextFieldDoencaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDoencaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDoencaActionPerformed

    private void botaoApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoApagarActionPerformed
        //Apaga o conteúdo dos campos
        jTextFieldDoenca.setText("");
        jTextFieldData.setText("");
        jTextFieldSintomas.setText("");
        jTextFieldIdPac.setText("");
        jTextFieldIdAten.setText("");
        jTextFieldIdMed.setText("");
    }//GEN-LAST:event_botaoApagarActionPerformed

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed
        File examePdf = fc.getSelectedFile();
		
        boolean confirmacaoExame = false;
	
        //Caso nenhum arquivo seja selecionado, é pedido para confirmar se não deseja adicionar
        if (examePdf == null) {
            String[] opcoes = {"Tenho certeza", "Adicionar o arquivo de exame"};
            int opcaoSelecionada = JOptionPane.showOptionDialog(this, "Você tem certeza de que não quer anexar um arquivo de exame?", "Confirmação de Envio de Arquivo", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes, 0);
            switch(opcaoSelecionada) {
                case 0:
                        //Caso a pessoa não queira adiocionar
                        confirmacaoExame = true;
                        break;
                case 1:
                        //Caso a pessoa queira adicionar
                        confirmacaoExame = true;
                        botaoAdicionarArquivo.doClick();
                        break;
                default:
                        // Não fazer nada
            }
        } else {
                confirmacaoExame = true;
        }
        
        //Depois de verificar o exame, é verificado se todos os dados estão preenchidos e conclui o cadastro
        if(confirmacaoExame) {
                String resultado = TelaAdicionarConsultaController.botaoAdicionarAcao(
                    jTextFieldDoenca.getText().trim(), 
                    jTextFieldData.getText().trim(),
                    jTextFieldSintomas.getText().trim(),
                    jTextFieldIdPac.getText().trim(), 
                    jTextFieldIdAten.getText().trim(), 
                    jTextFieldIdMed.getText().trim(), 
                    examePdf);
            if (!resultado.isEmpty()) {
                    JOptionPane.showMessageDialog(this, resultado, "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                    JOptionPane.showMessageDialog(this, "Sucesso ao adicionar a consulta!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    botaoApagar.doClick();
            }
    }
    }//GEN-LAST:event_botaoAdicionarActionPerformed

    private void botaoAdicionarArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarArquivoActionPerformed
        fc.showOpenDialog(this);
    }//GEN-LAST:event_botaoAdicionarArquivoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdicionarConsultaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarConsultaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarConsultaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarConsultaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdicionarConsultaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoAdicionarArquivo;
    private javax.swing.JButton botaoApagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldDoenca;
    private javax.swing.JTextField jTextFieldIdAten;
    private javax.swing.JTextField jTextFieldIdMed;
    private javax.swing.JTextField jTextFieldIdPac;
    private javax.swing.JTextArea jTextFieldSintomas;
    // End of variables declaration//GEN-END:variables
}
