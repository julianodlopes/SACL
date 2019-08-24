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
import jdbc.QueryReagente;
import operacoes.TransformarCampos;
import operacoes.VerificarData;
import operacoes.FixedLengthDocument;

/**
 * @author Gustavo, Ítalo, Juliano e Silas. Descrição: Esta classe tem por
 * propósito mostrar uma janela para inclusão de um novo reagente
 * (Líquido/Sólido). Funções presente: ViewReagente(); limparCampos(); main();
 * Data de criação: 05/09/2015.
 */
public class ViewReagente extends javax.swing.JFrame {

    String opcoes[] = {"Sim", "Não"};
    String campo;

    /**
     * Creates new form ViewEquipamento
     */
    public ViewReagente() {
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
        jLabelCadastrarEquip = new javax.swing.JLabel();
        jLabelImagem = new javax.swing.JLabel();
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldNome = new verificacao.VerificarCampo("Numeros/Letras",50);
        jLabelNome = new javax.swing.JLabel();
        jLabelEntrada = new javax.swing.JLabel();
        jLabelValidade = new javax.swing.JLabel();
        jLabelMarca = new javax.swing.JLabel();
        jTextFieldMarca = new verificacao.VerificarCampo("Numeros/Letras",50);
        jLabelApresentacao = new javax.swing.JLabel();
        jTextFieldApresentacao = new verificacao.VerificarCampo("Numeros/Letras",20);
        jLabelLote = new javax.swing.JLabel();
        jTextFieldLote = new verificacao.VerificarCampo("Numeros/Letras",20);
        jLabelQuantidade = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox();
        jTextFieldQuantidade = new verificacao.VerificarCampo("Numeros",3);
        jLabelPoliciaFederal = new javax.swing.JLabel();
        jLabelSaida = new javax.swing.JLabel();
        jComboBoxPoliciaFederal = new javax.swing.JComboBox();
        jFormattedTextFieldEntrada = new javax.swing.JFormattedTextField();
        jFormattedTextFieldValidade = new javax.swing.JFormattedTextField();
        jFormattedTextFieldSaida = new javax.swing.JFormattedTextField();
        jCheckBoxDescartado = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabelOBS = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        jTextAreaOBS = new javax.swing.JTextArea();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar reagente");

        jPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCadastrarEquip.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelCadastrarEquip.setText("Cadastrar reagente");

        jLabelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/substancia_menor.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabelNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNome.setText("Nome");

        jLabelEntrada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEntrada.setText("Entrada");

        jLabelValidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelValidade.setText("Validade");

        jLabelMarca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelMarca.setText("Marca");

        jLabelApresentacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelApresentacao.setText("Apresentação");

        jLabelLote.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelLote.setText("Lote");

        jLabelQuantidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelQuantidade.setText("Quantidade");

        jLabelTipo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTipo.setText("Tipo de reagente");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Líquido", "Sólido" }));

        jLabelPoliciaFederal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPoliciaFederal.setText("Polícia Federal");

        jLabelSaida.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSaida.setText("Saída");

        jComboBoxPoliciaFederal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não", "Sim" }));

        try {
            jFormattedTextFieldEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldEntrada.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldEntradaFocusLost(evt);
            }
        });

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

        try {
            jFormattedTextFieldSaida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jCheckBoxDescartado.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBoxDescartado.setText("Descartado");
        jCheckBoxDescartado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDescartadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelMarca)
                                .addGap(102, 102, 102)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelApresentacao)
                            .addComponent(jTextFieldApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabelEntrada))
                                    .addComponent(jLabelPoliciaFederal)
                                    .addComponent(jComboBoxPoliciaFederal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelSaida)
                            .addComponent(jLabelValidade)
                            .addComponent(jFormattedTextFieldValidade, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jCheckBoxDescartado)
                            .addComponent(jFormattedTextFieldSaida)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addGap(226, 226, 226))
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLote)
                    .addComponent(jLabelQuantidade)
                    .addComponent(jTextFieldQuantidade)
                    .addComponent(jTextFieldLote)
                    .addComponent(jComboBoxTipo, 0, 120, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMarca)
                    .addComponent(jLabelApresentacao))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldApresentacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEntrada)
                    .addComponent(jLabelValidade))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jFormattedTextFieldValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jFormattedTextFieldEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPoliciaFederal)
                    .addComponent(jLabelSaida))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPoliciaFederal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxDescartado)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelTipo)
                .addGap(48, 48, 48)
                .addComponent(jLabelLote)
                .addGap(44, 44, 44)
                .addComponent(jLabelQuantidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );

        jTabbedPane.addTab("Identificação", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabelOBS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelOBS.setText("Observações acerca do reagente");
        jPanel3.add(jLabelOBS);
        jLabelOBS.setBounds(21, 25, 197, 15);

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
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelImagem)
                .addGap(55, 55, 55)
                .addComponent(jLabelCadastrarEquip)
                .addContainerGap(236, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancelar)
                .addGap(18, 18, 18)
                .addComponent(jButtonLimpar)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalvar)
                .addGap(79, 79, 79))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImagem)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabelCadastrarEquip)))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonLimpar))
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

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        dispose();  //Fecha a janela atual.
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        VerificarData verificarData = new VerificarData();
        //Testa se o campo nome não está vazio.
        if (!jTextFieldNome.getText().trim().isEmpty()) {
            //Testa se as datas estão corretas.
            if (verificarData.verificarData(jFormattedTextFieldEntrada)
                    && verificarData.verificarData(jFormattedTextFieldValidade)
                    && verificarData.verificarData(jFormattedTextFieldSaida)) {
                QueryReagente query = new QueryReagente();
                TransformarCampos ob = new TransformarCampos();

                if (jCheckBoxDescartado.isSelected()) {
                    jFormattedTextFieldSaida.setText("00/00/0000");
                } else {
                    jFormattedTextFieldSaida.getText();
                }

                //Realiza a inserção do reagente.
                query.inserirReagente("1", jTextFieldNome.getText(),
                        jComboBoxTipo.getSelectedItem().toString(), jTextFieldMarca.getText(),
                        jTextFieldApresentacao.getText(), jTextFieldLote.getText(),
                        ob.transformarCampo(jFormattedTextFieldEntrada),
                        ob.transformarCampo(jFormattedTextFieldValidade), jTextFieldQuantidade.getText(),
                        jComboBoxPoliciaFederal.getSelectedItem().toString(),
                        ob.transformarCampo(jFormattedTextFieldSaida), jTextAreaOBS.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Os campos de entrada, "
                        + "validade ou saída foram digitados incorretamente");
                return;
            }
            int i = JOptionPane.showOptionDialog(null,
                    "Você deseja incluir mais reagentes?", "Confirmação", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

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

    private void jFormattedTextFieldEntradaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldEntradaFocusLost
        if (jFormattedTextFieldEntrada.getText().equals("  /  /    ")) {
            jFormattedTextFieldEntrada.setValue("");
        }
    }//GEN-LAST:event_jFormattedTextFieldEntradaFocusLost

    private void jFormattedTextFieldValidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldValidadeFocusLost
        if (jFormattedTextFieldValidade.getText().equals("  /  /    ")) {
            jFormattedTextFieldValidade.setValue("");
        }
    }//GEN-LAST:event_jFormattedTextFieldValidadeFocusLost

    private void jCheckBoxDescartadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDescartadoActionPerformed
        if (jCheckBoxDescartado.isSelected()) {
            jFormattedTextFieldSaida.setValue("00/00/0000");
            jFormattedTextFieldSaida.setEditable(false);
        } else {
            jFormattedTextFieldSaida.setValue("");
            jFormattedTextFieldSaida.setEditable(true);
            jFormattedTextFieldSaida.grabFocus();
        }
    }//GEN-LAST:event_jCheckBoxDescartadoActionPerformed

    //Limpa os campos da janela.
    public void limparCampos() {
        jTextFieldNome.setText("");
        jComboBoxTipo.setSelectedIndex(0);
        jTextFieldMarca.setText("");
        jTextFieldApresentacao.setText("");
        jTextFieldLote.setText("");
        jFormattedTextFieldEntrada.setValue("");
        jFormattedTextFieldValidade.setValue("");
        jTextFieldQuantidade.setText("");
        jComboBoxPoliciaFederal.setSelectedIndex(0);
        jFormattedTextFieldSaida.setText("");
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
            java.util.logging.Logger.getLogger(ViewReagente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewReagente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewReagente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewReagente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewReagente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JCheckBox jCheckBoxDescartado;
    private javax.swing.JComboBox jComboBoxPoliciaFederal;
    private javax.swing.JComboBox jComboBoxTipo;
    private javax.swing.JFormattedTextField jFormattedTextFieldEntrada;
    private javax.swing.JFormattedTextField jFormattedTextFieldSaida;
    private javax.swing.JFormattedTextField jFormattedTextFieldValidade;
    private javax.swing.JLabel jLabelApresentacao;
    private javax.swing.JLabel jLabelCadastrarEquip;
    private javax.swing.JLabel jLabelEntrada;
    private javax.swing.JLabel jLabelImagem;
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
    private javax.swing.JTextField jTextFieldLote;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldQuantidade;
    // End of variables declaration//GEN-END:variables
}
