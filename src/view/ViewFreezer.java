/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;
import jdbc.QueryFreezer;
import operacoes.TransformarCampos;
import operacoes.VerificarData;
import operacoes.FixedLengthDocument;

/**
 * @author Gustavo, Ítalo, Juliano e Silas. Descrição: Esta classe tem por
 * propósito mostrar uma janela para inclusão de uma nova substância no freezer.
 * Funções presente: ViewFreezer(); limparCampos(); main(); Data de criação:
 * 05/09/2015.
 */
public class ViewFreezer extends javax.swing.JFrame {

    String opcoes[] = {"Sim", "Não"};

    /**
     * Creates new form ViewEquipamento
     */
    public ViewFreezer() {
        initComponents();
        setLocationRelativeTo(null);  //Centraliza a janela na tela.
        setResizable(false);  //Evita o redimensionamento da janela.

        //Defini o icone da aplicação na barra de tarefas.
        URL url = this.getClass().getResource("icone.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        jTextFieldNome.grabFocus();  //Coloca foco no jTextField.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jLabelCadastrarFreezer = new javax.swing.JLabel();
        jLabelImagem = new javax.swing.JLabel();
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldQuantidade = new verificacao.VerificarCampo("Numeros",3);
        jTextFieldLote = new verificacao.VerificarCampo("Numeros/Letras",20);
        jTextFieldIdentificacao = new verificacao.VerificarCampo("Numeros/Letras",20);
        jLabelIdentificacao = new javax.swing.JLabel();
        jLabelLote = new javax.swing.JLabel();
        jLabelQuantidade = new javax.swing.JLabel();
        jFormattedTextFieldValidade = new javax.swing.JFormattedTextField();
        jTextFieldMarca = new verificacao.VerificarCampo("Numeros/Letras",50);
        jLabelMarca = new javax.swing.JLabel();
        jLabelValidade = new javax.swing.JLabel();
        jTextFieldNome = new verificacao.VerificarCampo("Numeros/Letras",50);
        jLabelNome = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelOBS = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        jTextAreaOBS = new javax.swing.JTextArea();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar no freezer");

        jPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCadastrarFreezer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCadastrarFreezer.setText("Cadastrar no freezer");

        jLabelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/freezer_menor.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabelIdentificacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelIdentificacao.setText("Identificação");

        jLabelLote.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelLote.setText("Lote");

        jLabelQuantidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelQuantidade.setText("Quantidade");

        try {
            jFormattedTextFieldValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldValidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldValidadeFocusLost(evt);
            }
        });

        jLabelMarca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelMarca.setText("Marca");

        jLabelValidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelValidade.setText("Validade");

        jLabelNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNome.setText("Nome");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabelNome)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelMarca)
                                .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabelIdentificacao)
                                        .addGap(49, 49, 49))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTextFieldIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldLote, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelLote))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelValidade)
                            .addComponent(jFormattedTextFieldValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelQuantidade)))
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelNome)
                .addGap(6, 6, 6)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelMarca)
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelValidade)
                        .addGap(10, 10, 10)
                        .addComponent(jFormattedTextFieldValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelIdentificacao)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelQuantidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldIdentificacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelLote))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane.addTab("Identificação", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabelOBS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelOBS.setText("Observações acerca da substância no freezer");
        jPanel3.add(jLabelOBS);
        jLabelOBS.setBounds(21, 25, 280, 15);

        jTextAreaOBS.setDocument(new FixedLengthDocument(500));
        jTextAreaOBS.setColumns(20);
        jTextAreaOBS.setRows(5);
        jScrollPane.setViewportView(jTextAreaOBS);

        jPanel3.add(jScrollPane);
        jScrollPane.setBounds(21, 58, 376, 96);

        jTabbedPane.addTab("Observações", jPanel3);

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGap(0, 56, Short.MAX_VALUE)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabelImagem)
                        .addGap(55, 55, 55)
                        .addComponent(jLabelCadastrarFreezer))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButtonCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalvar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImagem)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabelCadastrarFreezer)))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonLimpar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();  //Fecha a janela atual.
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        VerificarData verificarData = new VerificarData();
        //Testa se o campo nome não está vazio.
        if (!jTextFieldNome.getText().trim().isEmpty()) {
            //Testa se a data de validade está correta.
            if (verificarData.verificarData(jFormattedTextFieldValidade)) {
                QueryFreezer query = new QueryFreezer();
                TransformarCampos ob = new TransformarCampos();

                //Realiza a inserção da substância.
                query.inserirFreezer("1", jTextFieldNome.getText(), jTextFieldMarca.getText(),
                        ob.transformarCampo(jFormattedTextFieldValidade), jTextFieldIdentificacao.getText(),
                        jTextFieldLote.getText(), jTextFieldQuantidade.getText(), jTextAreaOBS.getText());

            } else {
                JOptionPane.showMessageDialog(null, "A data de vencimento digitada é inválida.");
                jFormattedTextFieldValidade.setValue("");
                jFormattedTextFieldValidade.grabFocus();
                return;
            }
            int i = JOptionPane.showOptionDialog(null,
                    "Você deseja incluir mais substâncias no freezer?", "Confirmação",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

            if (i == JOptionPane.YES_OPTION) {
                limparCampos();
                jTextFieldNome.requestFocus();

            } else {
                dispose();  //Fecha a janela atual.
            }
        } else {
            JOptionPane.showMessageDialog(null, "O campo nome é obrigatório.");
            jTextFieldNome.setText("");
            jTextFieldNome.grabFocus();
        }

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        limparCampos();
        jTextFieldNome.grabFocus();  //Coloca foco no jTextField.
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jFormattedTextFieldValidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldValidadeFocusLost
        if (jFormattedTextFieldValidade.getText().equals("  /  /    ")) {
            jFormattedTextFieldValidade.setValue("");
        }
    }//GEN-LAST:event_jFormattedTextFieldValidadeFocusLost

    //Limpa os campos da janela.
    public void limparCampos() {
        jTextFieldNome.setText("");
        jTextFieldMarca.setText("");
        jFormattedTextFieldValidade.setValue("");
        jTextFieldIdentificacao.setText("");
        jTextFieldLote.setText("");
        jTextFieldQuantidade.setText("");
        jTextAreaOBS.setText("");
    }

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
            java.util.logging.Logger.getLogger(ViewFreezer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFreezer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFreezer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFreezer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFreezer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextFieldValidade;
    private javax.swing.JLabel jLabelCadastrarFreezer;
    private javax.swing.JLabel jLabelIdentificacao;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JLabel jLabelLote;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelOBS;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JLabel jLabelValidade;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTextArea jTextAreaOBS;
    private javax.swing.JTextField jTextFieldIdentificacao;
    private javax.swing.JTextField jTextFieldLote;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldQuantidade;
    // End of variables declaration//GEN-END:variables
}
