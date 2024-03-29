/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import jdbc.QueryReagente;

/**
 * @author Gustavo, Ítalo, Juliano e Silas. Descrição: Esta classe tem por
 * propósito mostrar uma janela com as informações dos reagentes. Funções
 * presente: ViewInformacoesReagente(); ViewInformacoesReagente(String item);
 * mostrarInformacoes(); main(); Data de criação: 05/09/2015.
 */
public class ViewInformacoesReagente extends javax.swing.JFrame {

    String opcoes[] = {"Sim", "Não"};
    String item;

    /**
     * Creates new form ViewEquipamento
     */
    public ViewInformacoesReagente() {
        initComponents();
        setLocationRelativeTo(null);  //Centraliza a janela na tela.
        setResizable(false);  //Evita o redimensionamento da janela.

        //Definir o icone da aplicação na barra de tarefas.
        URL url = this.getClass().getResource("icone.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        jTextFieldNome.grabFocus();  //Coloca foco no jTextField.
    }

    public ViewInformacoesReagente(String item) {
        initComponents();
        setLocationRelativeTo(null);  //Centraliza a janela na tela.
        setResizable(false);  //Evita o redimensionamento da janela.

        //Defini o icone da aplicação na barra de tarefas.
        URL url = this.getClass().getResource("icone.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.item = item;
        mostrarInformacoes();
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
        jLabelInformacoesReagente = new javax.swing.JLabel();
        jLabelImagem = new javax.swing.JLabel();
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jLabelEntrada = new javax.swing.JLabel();
        jLabelValidade = new javax.swing.JLabel();
        jLabelMarca = new javax.swing.JLabel();
        jTextFieldMarca = new javax.swing.JTextField();
        jLabelApresentacao = new javax.swing.JLabel();
        jLabelLote = new javax.swing.JLabel();
        jTextFieldLote = new javax.swing.JTextField();
        jLabelQuantidade = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabelPoliciaFederal = new javax.swing.JLabel();
        jLabelSaida = new javax.swing.JLabel();
        jTextFieldTipo = new javax.swing.JTextField();
        jTextFieldPF = new javax.swing.JTextField();
        jTextFieldApresentacao = new javax.swing.JTextField();
        jCheckBoxDescartado = new javax.swing.JCheckBox();
        jTextFieldEntrada = new javax.swing.JTextField();
        jTextFieldValidade = new javax.swing.JTextField();
        jTextFieldSaida = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabelOBS = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        jTextAreaOBS = new javax.swing.JTextArea();
        jButtonFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informações reagente");

        jPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabelInformacoesReagente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelInformacoesReagente.setText("Informações reagente");

        jLabelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/substancia_menor.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTextFieldNome.setEditable(false);

        jLabelNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNome.setText("Nome");

        jLabelEntrada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEntrada.setText("Entrada");

        jLabelValidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelValidade.setText("Validade");

        jLabelMarca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelMarca.setText("Marca");

        jTextFieldMarca.setEditable(false);

        jLabelApresentacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelApresentacao.setText("Apresentação");

        jLabelLote.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelLote.setText("Lote");

        jTextFieldLote.setEditable(false);

        jLabelQuantidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelQuantidade.setText("Quantidade");

        jLabelTipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTipo.setText("Tipo de reagente");

        jTextFieldQuantidade.setEditable(false);

        jLabelPoliciaFederal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPoliciaFederal.setText("Polícia Federal");

        jLabelSaida.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSaida.setText("Saída");

        jTextFieldTipo.setEditable(false);

        jTextFieldPF.setEditable(false);

        jTextFieldApresentacao.setEditable(false);

        jCheckBoxDescartado.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxDescartado.setText("Descartado");
        jCheckBoxDescartado.setEnabled(false);

        jTextFieldEntrada.setEditable(false);

        jTextFieldValidade.setEditable(false);

        jTextFieldSaida.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(136, 136, 136)
                            .addComponent(jCheckBoxDescartado))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jTextFieldPF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabelSaida)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jTextFieldSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldEntrada)
                                            .addComponent(jTextFieldMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelApresentacao)
                                            .addComponent(jTextFieldApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabelNome))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldTipo)
                                    .addComponent(jLabelLote)
                                    .addComponent(jTextFieldLote)
                                    .addComponent(jLabelQuantidade)
                                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelMarca)
                            .addComponent(jLabelPoliciaFederal)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelEntrada)
                                .addGap(90, 90, 90)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelValidade))))
                        .addGap(21, 21, 21))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMarca)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelLote)
                        .addComponent(jLabelApresentacao)))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEntrada)
                            .addComponent(jLabelValidade)))
                    .addComponent(jLabelQuantidade))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPoliciaFederal)
                    .addComponent(jLabelSaida))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxDescartado)
                .addContainerGap())
        );

        jTabbedPane.addTab("Identificação", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabelOBS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelOBS.setText("Observações acerca do reagente");
        jPanel3.add(jLabelOBS);
        jLabelOBS.setBounds(21, 25, 210, 15);

        jTextAreaOBS.setEditable(false);
        jTextAreaOBS.setColumns(20);
        jTextAreaOBS.setRows(5);
        jScrollPane.setViewportView(jTextAreaOBS);

        jPanel3.add(jScrollPane);
        jScrollPane.setBounds(21, 58, 376, 96);

        jTabbedPane.addTab("Observações", jPanel3);

        jButtonFechar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fechar.png"))); // NOI18N
        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabelImagem)
                        .addGap(55, 55, 55)
                        .addComponent(jLabelInformacoesReagente))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jButtonFechar))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImagem)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabelInformacoesReagente)))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonFechar)
                .addContainerGap(20, Short.MAX_VALUE))
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

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        dispose();  //Fecha a janela atual.
    }//GEN-LAST:event_jButtonFecharActionPerformed

    //Exibe as informações dos campos.
    public void mostrarInformacoes() {
        QueryReagente query = new QueryReagente();

        ResultSet rs;
        rs = query.retornarCamposReagente(item);

        try {
            while (rs.next()) {
                jTextFieldNome.setText(rs.getString("nome_rg"));
                jTextFieldTipo.setText(rs.getString("tipo_rg"));
                jTextFieldMarca.setText(rs.getString("marca_rg"));
                jTextFieldApresentacao.setText(rs.getString("apresentacao_rg"));
                jTextFieldLote.setText(rs.getString("lote_rg"));
                jTextFieldEntrada.setText(rs.getString("entrada_rg"));
                jTextFieldValidade.setText(rs.getString("validade_rg"));
                jTextFieldQuantidade.setText(rs.getString("quantidade_rg"));
                jTextFieldPF.setText(rs.getString("pf_rg"));
                jTextFieldSaida.setText(rs.getString("saida_rg"));
                jTextAreaOBS.setText(rs.getString("obs_rg"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro de SQL. "
                    + "\nDetalhes: " + ex.getMessage());
        }

        if (jTextFieldSaida.getText().equals("00/00/0000")) {
            jCheckBoxDescartado.setSelected(true);
        }
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
            java.util.logging.Logger.getLogger(ViewInformacoesReagente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewInformacoesReagente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewInformacoesReagente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewInformacoesReagente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewInformacoesReagente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JCheckBox jCheckBoxDescartado;
    private javax.swing.JLabel jLabelApresentacao;
    private javax.swing.JLabel jLabelEntrada;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JLabel jLabelInformacoesReagente;
    private javax.swing.JLabel jLabelLote;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelOBS;
    private javax.swing.JLabel jLabelPoliciaFederal;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JLabel jLabelSaida;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelValidade;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTextArea jTextAreaOBS;
    private javax.swing.JTextField jTextFieldApresentacao;
    private javax.swing.JTextField jTextFieldEntrada;
    private javax.swing.JTextField jTextFieldLote;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPF;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldSaida;
    private javax.swing.JTextField jTextFieldTipo;
    private javax.swing.JTextField jTextFieldValidade;
    // End of variables declaration//GEN-END:variables
}
