/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import jdbc.QueryReagente;

/**
 * @author Gustavo, Ítalo, Juliano e Silas. Descrição: Esta classe tem por
 * propósito mostrar uma janela para pesquisa de reagentes. Funções presente:
 * ViewPesquisarReagentes(); itemSelecionado(); main(); Data de criação:
 * 05/09/2015.
 */
public class ViewPesquisarReagentes extends javax.swing.JFrame {

    Object[] opcoes = {"Sim", "Não"};  //Opções a serem mostradas no JOptionPane.
    ArrayList array;

    /**
     * Creates new form ViewSubstancia
     */
    public ViewPesquisarReagentes() {
        initComponents();
        setLocationRelativeTo(null);  //Centraliza a janela na tela.
        setResizable(false);  //Evita o redimensionamento da janela.

        //Defini o icone da aplicação na barra de tarefas.
        URL url = this.getClass().getResource("icone.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        jTextFieldNome.grabFocus();  //Coloca foco no jTextField.
        jButtonPesquisarActionPerformed(null);
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
        jButtonPesquisar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabelPesquisarReagentes = new javax.swing.JLabel();
        jLabelImagem = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new verificacao.VerificarCampo("Numeros/Letras",50);
        jScrollPane = new javax.swing.JScrollPane();
        jTableNome = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar reagentes");

        jPanel.setBackground(new java.awt.Color(255, 255, 255));

        jButtonPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pesquisa.png"))); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
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

        jLabelPesquisarReagentes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPesquisarReagentes.setText("Pesquisar reagentes");

        jLabelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/substancia_menor.png"))); // NOI18N

        jLabelNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNome.setText("Nome:");

        jTextFieldNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNomeKeyPressed(evt);
            }
        });

        jTableNome.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Tipo", "Validade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableNome.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNomeMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(jTableNome);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                                    .addComponent(jLabelNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonPesquisar))
                                .addGroup(jPanelLayout.createSequentialGroup()
                                    .addComponent(jLabelImagem)
                                    .addGap(55, 55, 55)
                                    .addComponent(jLabelPesquisarReagentes)))))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButtonCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluir)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImagem)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabelPesquisarReagentes)))
                .addGap(35, 35, 35)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        int selecionada = jTableNome.getSelectedRow();

        if (selecionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para realizar essa operação.");
            return;
        }

        dispose();  //Fecha a janela atual.
        ViewEditarReagente view = new ViewEditarReagente(itemSelecionado());
        view.setVisible(true);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        QueryReagente query = new QueryReagente();

        DefaultTableModel model = (DefaultTableModel) jTableNome.getModel();
        model.setNumRows(0);

        ResultSet rs = query.mostrarReagentes(jTextFieldNome.getText());

        try {
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("id_rg"),
                    rs.getString("nome_rg"),
                    rs.getString("tipo_rg"),
                    rs.getString("validade_rg")});
            }

            query.fecharConexao();

            //verificarReagentesVencidos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro de SQL. "
                    + "\nDetalhes: " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextFieldNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeKeyPressed
        //Verifica se a tecla apertada corresponde ao Enter.
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonPesquisarActionPerformed(null);
        }
    }//GEN-LAST:event_jTextFieldNomeKeyPressed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int selecionada = jTableNome.getSelectedRow();

        if (selecionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para realizar essa operação.");
            return;
        }

        int i = JOptionPane.showOptionDialog(null,
                "Você realmente deseja excluir o reagente selecionado?", "Confirmação",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if (i == JOptionPane.YES_OPTION) {

            QueryReagente query = new QueryReagente();

            String index = (String) jTableNome.getModel().getValueAt(jTableNome.getSelectedRow(), 0);

            query.removerReagente(index);

            ((DefaultTableModel) jTableNome.getModel()).removeRow(jTableNome.getSelectedRow());
            jTableNome.repaint();
            jTableNome.revalidate();
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNomeMouseClicked
        JPopupMenu jPopupMenu = new JPopupMenu();
        JMenuItem jMenuItemAlterar = new JMenuItem();
        jMenuItemAlterar.setText("Alterar");

        jMenuItemAlterar.addActionListener(
                new java.awt.event.ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {

                        dispose();

                        ViewEditarReagente vs = new ViewEditarReagente(itemSelecionado());
                        vs.setVisible(true);

                    }
                });

        JMenuItem jMenuItemExcluir = new JMenuItem();
        jMenuItemExcluir.setText("Excluir");
        jMenuItemExcluir.addActionListener(
                new java.awt.event.ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        jButtonExcluirActionPerformed(null);
                    }
                });

        jPopupMenu.add(jMenuItemAlterar);
        jPopupMenu.add(jMenuItemExcluir);

        if (evt.getButton() == MouseEvent.BUTTON3) {
            int col = jTableNome.columnAtPoint(evt.getPoint());
            int row = jTableNome.rowAtPoint(evt.getPoint());
            if (col != -1 && row != -1) {
                jTableNome.setColumnSelectionInterval(col, col);
                jTableNome.setRowSelectionInterval(row, row);
            }
            // Exibe o popup menu na posição do mouse.
            jPopupMenu.show(jTableNome, evt.getX(), evt.getY());
        }

        //Verifica se é um duplo click e abre a janela.
        if (evt.getButton() == MouseEvent.BUTTON1 && evt.getClickCount() == 2) {
            ViewInformacoesReagente view = new ViewInformacoesReagente(itemSelecionado());
            view.setVisible(true);
        }
    }//GEN-LAST:event_jTableNomeMouseClicked

    //Retorna o índice do nome.
    public String itemSelecionado() {
        int linha = jTableNome.getSelectedRow(); //Pega a linha selecionada 
        String coluna1 = jTableNome.getModel().getValueAt(linha, 0).toString(); //Primeira coluna da linha 

        return coluna1;
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
            java.util.logging.Logger.getLogger(ViewPesquisarReagentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPesquisarReagentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPesquisarReagentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPesquisarReagentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ViewPesquisarReagentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPesquisarReagentes;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTableNome;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
