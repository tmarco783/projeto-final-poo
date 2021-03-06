/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteGrafica;

/**
 *
 * @author Mathews
 */
public class TelaInicialFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicialFuncionario
     */
    public TelaInicialFuncionario() {
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

        FundoTela = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuItemFechar = new javax.swing.JMenuItem();
        jMenuLivro = new javax.swing.JMenu();
        jMenuItemLCadastrar = new javax.swing.JMenuItem();
        jMenuItemLExcluir = new javax.swing.JMenuItem();
        jMenuItemLListar = new javax.swing.JMenuItem();
        jMenuItemLAlterar = new javax.swing.JMenuItem();
        jMenuCliente = new javax.swing.JMenu();
        jMenuItemCCadastrar = new javax.swing.JMenuItem();
        jMenuItemCExcluir = new javax.swing.JMenuItem();
        jMenuItemCListar = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        FundoTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/2.jpg"))); // NOI18N
        getContentPane().add(FundoTela);
        FundoTela.setBounds(0, 0, 710, 530);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.black));
        jMenuBar1.setToolTipText("");
        jMenuBar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jMenuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteDeIcones/page.png"))); // NOI18N
        jMenuArquivo.setText("Arquivo");
        jMenuArquivo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteDeIcones/door_out.png"))); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemSair);

        jMenuItemFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteDeIcones/cross.png"))); // NOI18N
        jMenuItemFechar.setText("Fechar");
        jMenuItemFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFecharActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemFechar);

        jMenuBar1.add(jMenuArquivo);

        jMenuLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteDeIcones/book.png"))); // NOI18N
        jMenuLivro.setText("Livros");
        jMenuLivro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jMenuItemLCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteDeIcones/book_add.png"))); // NOI18N
        jMenuItemLCadastrar.setText("Cadastrar");
        jMenuItemLCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLCadastrarActionPerformed(evt);
            }
        });
        jMenuLivro.add(jMenuItemLCadastrar);

        jMenuItemLExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteDeIcones/book_delete.png"))); // NOI18N
        jMenuItemLExcluir.setText("Excluir");
        jMenuItemLExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLExcluirActionPerformed(evt);
            }
        });
        jMenuLivro.add(jMenuItemLExcluir);

        jMenuItemLListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteDeIcones/book_open.png"))); // NOI18N
        jMenuItemLListar.setText("Listar");
        jMenuItemLListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLListarActionPerformed(evt);
            }
        });
        jMenuLivro.add(jMenuItemLListar);

        jMenuItemLAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteDeIcones/book_edit.png"))); // NOI18N
        jMenuItemLAlterar.setText("Alterar");
        jMenuItemLAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLAlterarActionPerformed(evt);
            }
        });
        jMenuLivro.add(jMenuItemLAlterar);

        jMenuBar1.add(jMenuLivro);

        jMenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteDeIcones/group.png"))); // NOI18N
        jMenuCliente.setText("Clientes");
        jMenuCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jMenuItemCCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteDeIcones/user_add.png"))); // NOI18N
        jMenuItemCCadastrar.setText("Cadastrar");
        jMenuItemCCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCCadastrarActionPerformed(evt);
            }
        });
        jMenuCliente.add(jMenuItemCCadastrar);

        jMenuItemCExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteDeIcones/user_delete.png"))); // NOI18N
        jMenuItemCExcluir.setText("Excluir");
        jMenuItemCExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCExcluirActionPerformed(evt);
            }
        });
        jMenuCliente.add(jMenuItemCExcluir);

        jMenuItemCListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteDeIcones/user_go.png"))); // NOI18N
        jMenuItemCListar.setText("Listar");
        jMenuItemCListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCListarActionPerformed(evt);
            }
        });
        jMenuCliente.add(jMenuItemCListar);

        jMenuBar1.add(jMenuCliente);

        jMenuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PacoteDeIcones/information.png"))); // NOI18N
        jMenuSobre.setText("Sobre");
        jMenuSobre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuBar1.add(jMenuSobre);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(713, 574));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        // TODO add your handling code here:
        TelaLogin telaLogin = new TelaLogin();
        telaLogin.setLocationRelativeTo(null);
        telaLogin.setVisible(true);
        telaLogin.setResizable(false);   
        this.dispose();
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemCExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCExcluirActionPerformed
        // TODO add your handling code here:
        TelaExcluirCliente telaExcluirCliente = new TelaExcluirCliente();
        FundoTela.add(telaExcluirCliente);
        telaExcluirCliente.show(true);
    }//GEN-LAST:event_jMenuItemCExcluirActionPerformed

    private void jMenuItemLExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLExcluirActionPerformed
        // TODO add your handling code here:
        TelaExcluirLivro telaExcluirLivro = new TelaExcluirLivro();
        FundoTela.add(telaExcluirLivro);
        telaExcluirLivro.show(true);
    }//GEN-LAST:event_jMenuItemLExcluirActionPerformed

    private void jMenuItemFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFecharActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItemFecharActionPerformed

    private void jMenuItemLAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLAlterarActionPerformed
        // TODO add your handling code here:
        TelaAlterarLivro telaAlterarLivro = new TelaAlterarLivro();
        FundoTela.add(telaAlterarLivro);
        telaAlterarLivro.show(true);
    }//GEN-LAST:event_jMenuItemLAlterarActionPerformed

    private void jMenuItemLListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLListarActionPerformed
        // TODO add your handling code here:
        TelaListarLivros telaListarLivros = new TelaListarLivros();
        FundoTela.add(telaListarLivros);
        telaListarLivros.show(true);
    }//GEN-LAST:event_jMenuItemLListarActionPerformed

    private void jMenuItemLCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLCadastrarActionPerformed
        // TODO add your handling code here:
        
        TelaCadastroLivro telaCadUser = new TelaCadastroLivro();
        FundoTela.add(telaCadUser);
        telaCadUser.show(true);
    }//GEN-LAST:event_jMenuItemLCadastrarActionPerformed

    private void jMenuItemCCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCCadastrarActionPerformed
        // TODO add your handling code here:
        TelaCadastroCliente telaCadastroCliente = new TelaCadastroCliente();
        FundoTela.add(telaCadastroCliente);
        telaCadastroCliente.show(true);
    }//GEN-LAST:event_jMenuItemCCadastrarActionPerformed

    private void jMenuItemCListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCListarActionPerformed
        // TODO add your handling code here:
        TelaListarCliente telaListarCliente = new TelaListarCliente();
        FundoTela.add(telaListarCliente);
        telaListarCliente.show(true);
    }//GEN-LAST:event_jMenuItemCListarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicialFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicialFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicialFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicialFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicialFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FundoTela;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCliente;
    private javax.swing.JMenuItem jMenuItemCCadastrar;
    private javax.swing.JMenuItem jMenuItemCExcluir;
    private javax.swing.JMenuItem jMenuItemCListar;
    private javax.swing.JMenuItem jMenuItemFechar;
    private javax.swing.JMenuItem jMenuItemLAlterar;
    private javax.swing.JMenuItem jMenuItemLCadastrar;
    private javax.swing.JMenuItem jMenuItemLExcluir;
    private javax.swing.JMenuItem jMenuItemLListar;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuLivro;
    private javax.swing.JMenu jMenuSobre;
    // End of variables declaration//GEN-END:variables
}
