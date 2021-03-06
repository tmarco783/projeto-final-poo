/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteGrafica;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mathews
 */
public class TelaListarLivros extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaListarLivros
     */
    public TelaListarLivros() {
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
        jLabelAutor = new javax.swing.JLabel();
        jTextFieldAutor = new javax.swing.JTextField();
        jButtonListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        TelaFundo = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setLayout(null);

        jLabelAutor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelAutor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAutor.setText("Autor");
        jPanel1.add(jLabelAutor);
        jLabelAutor.setBounds(70, 20, 50, 30);
        jPanel1.add(jTextFieldAutor);
        jTextFieldAutor.setBounds(120, 20, 280, 30);

        jButtonListar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonListar.setText("Listar");
        jButtonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonListar);
        jButtonListar.setBounds(250, 60, 71, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Titulo", "Autor", "Edicão", "Editora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 110, 530, 280);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(330, 60, 59, 30);

        TelaFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/4.png"))); // NOI18N
        jPanel1.add(TelaFundo);
        TelaFundo.setBounds(0, 0, 530, 390);

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

        setBounds(0, 0, 545, 414);
    }// </editor-fold>//GEN-END:initComponents
    Biblioteca biblioteca = Biblioteca.getInstancia();
    private void jButtonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarActionPerformed

        int aux = 0;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object romData[] = new Object[5];
        
        model.setNumRows(0);
        if(jTextFieldAutor.getText().length() > 0){
            for(int i=0; i <biblioteca.getLivros().size(); i++ ){
                if(biblioteca.livros.get(i).getAutor().equalsIgnoreCase(jTextFieldAutor.getText())){
                    romData[0] = biblioteca.livros.get(i).getTitulo();
                    romData[1] = biblioteca.livros.get(i).getAutor();
                    romData[2] = biblioteca.livros.get(i).getEdicao();
                    romData[3] = biblioteca.livros.get(i).getEditora();
                    romData[4] =biblioteca.livros.get(i).getAnoLancamento();
                    model.addRow(romData); 
                    aux++;
                }
                if(aux==0){
                    mensagemWarning("NEM UM LIVRO CADASTRADO COM ESTE AUTOR!");
                }
            }
            
        }else{
            for(int i=0; i <biblioteca.getLivros().size(); i++ ){
                romData[0] = biblioteca.livros.get(i).getTitulo();
                romData[1] = biblioteca.livros.get(i).getAutor();
                romData[2] = biblioteca.livros.get(i).getEdicao();
                romData[3] = biblioteca.livros.get(i).getEditora();
                romData[4] =biblioteca.livros.get(i).getAnoLancamento();
                model.addRow(romData);              
            }
        }   
    }//GEN-LAST:event_jButtonListarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void mensagemWarning(String mensagem){
         JOptionPane.showMessageDialog(null, mensagem, "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TelaFundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonListar;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAutor;
    // End of variables declaration//GEN-END:variables
}
