/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author 393144069
 */
public class cadastroProdutos extends javax.swing.JFrame {

    /**
     * Creates new form cadastroProdutos
     */
    public cadastroProdutos() {
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
        painelTop = new javax.swing.JPanel();
        tituloPage = new javax.swing.JLabel();
        tituloDescricao = new javax.swing.JLabel();
        verProdutos = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        tituloProduto = new javax.swing.JLabel();
        lote = new javax.swing.JTextField();
        produto = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        setor = new javax.swing.JTextField();
        img1 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        tituloSetor = new javax.swing.JLabel();
        carregarImagem = new javax.swing.JPanel();
        tituloCarregarImagem = new javax.swing.JLabel();
        tituloLote = new javax.swing.JLabel();
        enviarCadastro = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        painelTop.setBackground(new java.awt.Color(105, 85, 251));
        painelTop.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        painelTop.setForeground(new java.awt.Color(204, 204, 204));

        tituloPage.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 36)); // NOI18N
        tituloPage.setForeground(new java.awt.Color(255, 255, 255));
        tituloPage.setText("Cadastrar produtos");

        javax.swing.GroupLayout painelTopLayout = new javax.swing.GroupLayout(painelTop);
        painelTop.setLayout(painelTopLayout);
        painelTopLayout.setHorizontalGroup(
            painelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTopLayout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addComponent(tituloPage, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(242, 242, 242))
        );
        painelTopLayout.setVerticalGroup(
            painelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTopLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(tituloPage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        getContentPane().add(painelTop);
        painelTop.setBounds(0, 0, 800, 100);

        tituloDescricao.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        tituloDescricao.setForeground(new java.awt.Color(255, 255, 255));
        tituloDescricao.setText("Descrição");
        getContentPane().add(tituloDescricao);
        tituloDescricao.setBounds(190, 260, 120, 30);

        verProdutos.setBackground(new java.awt.Color(105, 85, 251));
        verProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verProdutosMouseClicked(evt);
            }
        });
        verProdutos.setLayout(null);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Visualizar produtos cadastrados");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        verProdutos.add(jLabel11);
        jLabel11.setBounds(50, 0, 350, 40);

        getContentPane().add(verProdutos);
        verProdutos.setBounds(210, 460, 430, 40);

        descricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(105, 85, 251)));
        descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoActionPerformed(evt);
            }
        });
        getContentPane().add(descricao);
        descricao.setBounds(190, 290, 220, 100);

        jPanel13.setBackground(new java.awt.Color(105, 85, 251));
        jPanel13.setMaximumSize(new java.awt.Dimension(4, 4));
        jPanel13.setMinimumSize(new java.awt.Dimension(270, 4));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel13);
        jPanel13.setBounds(410, 290, 10, 100);

        tituloProduto.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        tituloProduto.setForeground(new java.awt.Color(255, 255, 255));
        tituloProduto.setText("Produto:");
        getContentPane().add(tituloProduto);
        tituloProduto.setBounds(190, 120, 90, 30);

        lote.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(105, 85, 251)));
        lote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loteActionPerformed(evt);
            }
        });
        getContentPane().add(lote);
        lote.setBounds(310, 230, 100, 30);

        produto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(105, 85, 251)));
        produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoActionPerformed(evt);
            }
        });
        getContentPane().add(produto);
        produto.setBounds(190, 160, 220, 30);

        jPanel11.setBackground(new java.awt.Color(105, 85, 251));
        jPanel11.setMaximumSize(new java.awt.Dimension(4, 4));
        jPanel11.setMinimumSize(new java.awt.Dimension(270, 4));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel11);
        jPanel11.setBounds(410, 230, 10, 30);

        jPanel10.setBackground(new java.awt.Color(105, 85, 251));
        jPanel10.setMaximumSize(new java.awt.Dimension(4, 4));
        jPanel10.setMinimumSize(new java.awt.Dimension(270, 4));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel10);
        jPanel10.setBounds(410, 160, 10, 30);

        setor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(105, 85, 251)));
        setor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setorActionPerformed(evt);
            }
        });
        getContentPane().add(setor);
        setor.setBounds(190, 230, 100, 30);

        img1.setBackground(new java.awt.Color(255, 255, 255));
        img1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 110, 175), 2));

        jPanel14.setBackground(new java.awt.Color(105, 85, 251));
        jPanel14.setMaximumSize(new java.awt.Dimension(4, 4));
        jPanel14.setMinimumSize(new java.awt.Dimension(270, 4));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 226, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout img1Layout = new javax.swing.GroupLayout(img1);
        img1.setLayout(img1Layout);
        img1Layout.setHorizontalGroup(
            img1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, img1Layout.createSequentialGroup()
                .addGap(0, 206, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        img1Layout.setVerticalGroup(
            img1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(img1);
        img1.setBounds(440, 160, 220, 230);

        jPanel9.setBackground(new java.awt.Color(105, 85, 251));
        jPanel9.setMaximumSize(new java.awt.Dimension(4, 4));
        jPanel9.setMinimumSize(new java.awt.Dimension(270, 4));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel9);
        jPanel9.setBounds(290, 230, 10, 30);

        tituloSetor.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        tituloSetor.setForeground(new java.awt.Color(255, 255, 255));
        tituloSetor.setText("Setor:");
        getContentPane().add(tituloSetor);
        tituloSetor.setBounds(190, 200, 70, 30);

        carregarImagem.setBackground(new java.awt.Color(105, 85, 251));
        carregarImagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carregarImagemMouseClicked(evt);
            }
        });
        carregarImagem.setLayout(null);

        tituloCarregarImagem.setBackground(new java.awt.Color(255, 255, 255));
        tituloCarregarImagem.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tituloCarregarImagem.setForeground(new java.awt.Color(255, 255, 255));
        tituloCarregarImagem.setText("Carregar uma Imagem");
        tituloCarregarImagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tituloCarregarImagemMouseClicked(evt);
            }
        });
        carregarImagem.add(tituloCarregarImagem);
        tituloCarregarImagem.setBounds(10, 10, 200, 20);

        getContentPane().add(carregarImagem);
        carregarImagem.setBounds(440, 400, 220, 40);

        tituloLote.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 24)); // NOI18N
        tituloLote.setForeground(new java.awt.Color(255, 255, 255));
        tituloLote.setText("Lote:");
        getContentPane().add(tituloLote);
        tituloLote.setBounds(310, 200, 90, 30);

        enviarCadastro.setBackground(new java.awt.Color(105, 85, 251));
        enviarCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviarCadastroMouseClicked(evt);
            }
        });
        enviarCadastro.setLayout(null);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cadastrar");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        enviarCadastro.add(jLabel12);
        jLabel12.setBounds(30, 0, 110, 40);

        getContentPane().add(enviarCadastro);
        enviarCadastro.setBounds(220, 400, 160, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bk.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 100, 800, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void verProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verProdutosMouseClicked
        visualizarProdutos tl = new visualizarProdutos();
        tl.setVisible(true);
        dispose();

    }//GEN-LAST:event_verProdutosMouseClicked

    private void descricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descricaoActionPerformed

    private void loteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loteActionPerformed

    private void produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produtoActionPerformed

    private void setorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setorActionPerformed

    private void tituloCarregarImagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloCarregarImagemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloCarregarImagemMouseClicked

    private void carregarImagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carregarImagemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_carregarImagemMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void enviarCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarCadastroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_enviarCadastroMouseClicked

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
            java.util.logging.Logger.getLogger(cadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel carregarImagem;
    private javax.swing.JTextField descricao;
    private javax.swing.JPanel enviarCadastro;
    private javax.swing.JPanel img1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField lote;
    private javax.swing.JPanel painelTop;
    private javax.swing.JTextField produto;
    private javax.swing.JTextField setor;
    private javax.swing.JLabel tituloCarregarImagem;
    private javax.swing.JLabel tituloDescricao;
    private javax.swing.JLabel tituloLote;
    private javax.swing.JLabel tituloPage;
    private javax.swing.JLabel tituloProduto;
    private javax.swing.JLabel tituloSetor;
    private javax.swing.JPanel verProdutos;
    // End of variables declaration//GEN-END:variables
}
