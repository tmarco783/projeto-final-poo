/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParteGrafica;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Mathews
 */
public class TelaCadastroLivro extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroLivro
     */
    public TelaCadastroLivro() {
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
        jLabelTitulo = new javax.swing.JLabel();
        jLabelAutor = new javax.swing.JLabel();
        jLabelEdicao = new javax.swing.JLabel();
        jLabelEditora = new javax.swing.JLabel();
        jLabelLancamento = new javax.swing.JLabel();
        jTextFieldEditora = new javax.swing.JTextField();
        jTextFieldTitulo = new javax.swing.JTextField();
        jTextFieldAutor = new javax.swing.JTextField();
        jTextFieldEdicao = new javax.swing.JTextField();
        jComboBoxAno = new javax.swing.JComboBox<>();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        FundoTela = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Titulo");
        jPanel1.add(jLabelTitulo);
        jLabelTitulo.setBounds(40, 50, 40, 30);

        jLabelAutor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelAutor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAutor.setText("Autor");
        jPanel1.add(jLabelAutor);
        jLabelAutor.setBounds(40, 100, 38, 30);

        jLabelEdicao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelEdicao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEdicao.setText("Edição");
        jPanel1.add(jLabelEdicao);
        jLabelEdicao.setBounds(40, 150, 47, 30);

        jLabelEditora.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelEditora.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEditora.setText("Editora");
        jPanel1.add(jLabelEditora);
        jLabelEditora.setBounds(40, 200, 50, 30);

        jLabelLancamento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelLancamento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLancamento.setText("Lançamento");
        jPanel1.add(jLabelLancamento);
        jLabelLancamento.setBounds(40, 250, 90, 30);
        jPanel1.add(jTextFieldEditora);
        jTextFieldEditora.setBounds(140, 200, 340, 30);
        jPanel1.add(jTextFieldTitulo);
        jTextFieldTitulo.setBounds(140, 50, 340, 30);
        jPanel1.add(jTextFieldAutor);
        jTextFieldAutor.setBounds(140, 100, 340, 30);
        jPanel1.add(jTextFieldEdicao);
        jTextFieldEdicao.setBounds(140, 150, 340, 30);

        jComboBoxAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017" }));
        jComboBoxAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAnoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxAno);
        jComboBoxAno.setBounds(140, 250, 70, 30);

        jButtonCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCadastrar);
        jButtonCadastrar.setBounds(301, 310, 100, 30);

        jButtonSair.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSair);
        jButtonSair.setBounds(420, 310, 60, 30);

        FundoTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/3.jpg"))); // NOI18N
        jPanel1.add(FundoTela);
        FundoTela.setBounds(0, 0, 530, 390);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        );

        setBounds(0, 0, 545, 414);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
            dispose();	
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jComboBoxAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAnoActionPerformed
    
    Biblioteca biblioteca = Biblioteca.getInstancia();
    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        // TODO add your handling code here:
        String titulo;
        String autor;
        String edicao;
        String editora;
        int anoLancamento;
        
        try{
            titulo = getTextFieldData(jTextFieldTitulo);
            autor = getTextFieldData(jTextFieldAutor);
            edicao = getTextFieldData(jTextFieldEdicao);
            editora = getTextFieldData(jTextFieldEditora);
            anoLancamento = Integer.parseInt(getComboBoxData(jComboBoxAno));
            boolean aux = biblioteca.validarCadastroLivro(titulo);
            if(aux){
                mensagemWarning("LIVRO JÁ CADASTRADO!");
                dispose();
            } 
            else {
                Livro livro = new Livro(titulo, autor, edicao, editora, anoLancamento);
                biblioteca.addLivro(livro);
                mensagemSucesso("CADASTRO REALIZADO COM SUCESSO!!!");
                biblioteca.salvarDadosLivro(titulo, autor, edicao, editora, anoLancamento);
                dispose();
            }      
        }catch(FaltamDadosException ex) {
            ex.View();
            //Logger.getLogger(TelaCadastroLivro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButtonCadastrarActionPerformed
    public String getTextFieldData(JTextField jtext) throws FaltamDadosException {
		String s = jtext.getText();
		if (s.equals(""))
			throw new FaltamDadosException("Preencha todos os campos!");
		return s;
    }
    
    public String getComboBoxData(JComboBox jbox) throws FaltamDadosException {
		if (jbox.getSelectedIndex() == -1)
			throw new FaltamDadosException("Por favor escolha um ano de Lançamento");
		String s = jbox.getItemAt(jbox.getSelectedIndex()).toString();
		return s;
    }
    
    public void mensagemWarning(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem, "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
    }
    
    public void mensagemSucesso(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem, "SUCCESS", JOptionPane.PLAIN_MESSAGE);
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FundoTela;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JComboBox<String> jComboBoxAno;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelEdicao;
    private javax.swing.JLabel jLabelEditora;
    private javax.swing.JLabel jLabelLancamento;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldEdicao;
    private javax.swing.JTextField jTextFieldEditora;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
}
