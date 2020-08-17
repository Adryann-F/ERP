package view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.bean.Produto;
import modelo.dao.ProdutoDAO;

public final class CadP extends javax.swing.JFrame {
    public CadP() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTableProdutos.getModel();
        jTableProdutos.setRowSorter(new TableRowSorter(modelo));
        readJTable();
    }
    //passar os dados para a tabela
    public void readJTable(){
        DefaultTableModel modelo = (DefaultTableModel) jTableProdutos.getModel();
        modelo.setNumRows(0);
        ProdutoDAO pdao = new ProdutoDAO();
        for(Produto p:pdao.listar()){
        
            modelo.addRow(new Object[]{
                p.getId(),
                p.getValorC(),
                p.getValorV(),
                p.getQtd(),
                p.getCdb(),
                p.getDescricao()  
            });
        }
    }public void readJTablebusca(String desc){
        DefaultTableModel modelo = (DefaultTableModel) jTableProdutos.getModel();
        modelo.setNumRows(0);
        ProdutoDAO pdao = new ProdutoDAO();
        for(Produto p:pdao.buscar(desc)){
        
            modelo.addRow(new Object[]{
                p.getId(),
                p.getValorC(),
                p.getValorV(),
                p.getQtd(),
                p.getCdb(),
                p.getDescricao()  
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldValorC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldValorV = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCodB = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldDesc = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonBusca = new javax.swing.JButton();
        jTextFieldBusca = new javax.swing.JTextField();
        jButtonVoltar = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setText("Produto ID:");

        jTextFieldProduto.setEditable(false);
        jTextFieldProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProdutoActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantidade:");

        jTextFieldQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantidadeActionPerformed(evt);
            }
        });

        jLabel3.setText("Valor de compra:");

        jLabel4.setText("Valor de venda:");

        jLabel5.setText("Código de Barras:");

        jLabel6.setText("Descrição:");

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto ID", "ValorC", "ValorV", "Qtd", "CodB", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutosMouseClicked(evt);
            }
        });
        jTableProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableProdutosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableProdutos);

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonBusca.setText("Buscar");
        jButtonBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaActionPerformed(evt);
            }
        });

        jTextFieldBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldBuscaKeyPressed(evt);
            }
        });

        jButtonVoltar.setBackground(new java.awt.Color(153, 153, 153));
        jButtonVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/arrow_undo.png"))); // NOI18N
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBusca)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addComponent(jTextFieldCodB))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldValorV, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldValorC, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldValorC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValorV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCodB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtualizar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonBusca)
                    .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        // Criar os produtos e puxar os dados da tela
    if(!"".equals(jTextFieldDesc.getText()) || !"".equals(jTextFieldCodB.getText()) ||!"".equals(jTextFieldValorC.getText()) 
               || !"".equals(jTextFieldValorV.getText()) ||!"".equals(jTextFieldQuantidade.getText())){
    
        Produto p = new Produto();
        ProdutoDAO dao = new ProdutoDAO();
        p.setDescricao(jTextFieldDesc.getText());
        p.setCdb(Integer.parseInt( jTextFieldCodB.getText()));
       // p.setId(Integer.parseInt(jTextFieldProduto.getText()));
        p.setValorC(Double.parseDouble(jTextFieldValorC.getText()));
        p.setValorV(Double.parseDouble(jTextFieldValorV.getText()));
        p.setQtd(Integer.parseInt(jTextFieldQuantidade.getText()));
        dao.crud(p);
        
        limpar();
        
        readJTable();
                    }else{
                   JOptionPane.showMessageDialog(null, "Dados incompletos"); 
                    }
        
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // Excluir
        if(jTableProdutos.getSelectedRow() != -1){
            Produto p = new Produto();
            ProdutoDAO dao = new ProdutoDAO();
        
            p.setId((int)jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 0));
            dao.deletar(p);
            limpar();
            readJTable();
    
        
            
        }else{
            JOptionPane.showMessageDialog(null, "Selecioneo produto a ser excluido");
        }
        
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutosMouseClicked
       // Pegar dados da tabela
        if(jTableProdutos.getSelectedRow() != -1){
            jTextFieldProduto.setText(jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 0).toString());
            jTextFieldValorC.setText(jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 1).toString());
            jTextFieldValorV.setText(jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 2).toString());
            jTextFieldQuantidade.setText(jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 3).toString());
            jTextFieldCodB.setText(jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 4).toString());
            jTextFieldDesc.setText(jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 5).toString());
            
        }
       
       
    }//GEN-LAST:event_jTableProdutosMouseClicked

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        // Atualizar dados
        if(jTableProdutos.getSelectedRow() != -1){
            if(jTextFieldProduto.getText() == null ? jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 0).toString() != null : !jTextFieldProduto.getText().equals(jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 0).toString())){
            JOptionPane.showMessageDialog(null, "ID não pode ser auterado!");
            }else{
            Produto p = new Produto();
            ProdutoDAO dao = new ProdutoDAO();
            
            p.setDescricao(jTextFieldDesc.getText());
            p.setCdb(Integer.parseInt( jTextFieldCodB.getText()));
            p.setId((int)jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 0));
            p.setValorC(Double.parseDouble(jTextFieldValorC.getText()));
            p.setValorV(Double.parseDouble(jTextFieldValorV.getText()));
            p.setQtd(Integer.parseInt(jTextFieldQuantidade.getText()));
            dao.atualizar(p);
            limpar();
            readJTable();
            }
        }else{
         JOptionPane.showMessageDialog(null, "Selecioneo produto a ser atualizado");
        }
        
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jTableProdutosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableProdutosKeyReleased
        //Abrir produtos passando com o teclado (mesma função do jTableProdutosMouseClicked)
         if(jTableProdutos.getSelectedRow() != -1){
            jTextFieldProduto.setText(jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 0).toString());
            jTextFieldValorC.setText(jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 1).toString());
            jTextFieldValorV.setText(jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 2).toString());
            jTextFieldQuantidade.setText(jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 3).toString());
            jTextFieldCodB.setText(jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 4).toString());
            jTextFieldDesc.setText(jTableProdutos.getValueAt(jTableProdutos.getSelectedRow(), 5).toString());
            
        }
        
    }//GEN-LAST:event_jTableProdutosKeyReleased

    private void jTextFieldProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProdutoActionPerformed

    private void jTextFieldQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldQuantidadeActionPerformed

    private void jButtonBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaActionPerformed
        // buscador de produtos
        readJTablebusca(jTextFieldBusca.getText());
    }//GEN-LAST:event_jButtonBuscaActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        //Voltar para o menu
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jTextFieldBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscaKeyPressed
        // 
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        readJTablebusca(jTextFieldBusca.getText());
        }
    }//GEN-LAST:event_jTextFieldBuscaKeyPressed
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadP().setVisible(true);
            }
        });
    }
    //limpar os campos 
    public void limpar(){
    jTextFieldCodB.setText("");
    jTextFieldDesc.setText("");
    jTextFieldProduto.setText("");
    jTextFieldQuantidade.setText("");
    jTextFieldValorC.setText("");
    jTextFieldValorV.setText("");
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonBusca;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JTextField jTextFieldBusca;
    private javax.swing.JTextField jTextFieldCodB;
    private javax.swing.JTextField jTextFieldDesc;
    private javax.swing.JTextField jTextFieldProduto;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldValorC;
    private javax.swing.JTextField jTextFieldValorV;
    // End of variables declaration//GEN-END:variables
}
