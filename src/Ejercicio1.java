
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Ejercicio1 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio1
     */
    public Ejercicio1() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPersonaUno = new javax.swing.JTextField();
        txtPersonaDos = new javax.swing.JTextField();
        txtPersonaTres = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPorPersonaUno = new javax.swing.JTextField();
        txtPorPersonaDos = new javax.swing.JTextField();
        txtPorPersonaTres = new javax.swing.JTextField();
        cmdBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Andalus", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Negocio Entre 3 Personas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 11, 210, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 51));
        jLabel2.setText("Dinero Invertido Peronsa 1");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 51));
        jLabel3.setText("Dinero Invertido Persona 2");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 0));
        jLabel4.setText("Dinero Invertido Persona 3");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 144, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 51));
        jLabel5.setText("Dinero Invercion Total");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 30));

        txtPersonaUno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPersonaUnoKeyTyped(evt);
            }
        });
        jPanel1.add(txtPersonaUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 300, -1));

        txtPersonaDos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPersonaDosKeyTyped(evt);
            }
        });
        jPanel1.add(txtPersonaDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 300, -1));

        txtPersonaTres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPersonaTresKeyTyped(evt);
            }
        });
        jPanel1.add(txtPersonaTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 300, -1));

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 310, -1));

        cmdCalcular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdCalcular.setForeground(new java.awt.Color(51, 51, 51));
        cmdCalcular.setText("CALCULAR");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 210, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 0));
        jLabel6.setText("Porcentaje Persona 1");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 150, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 0));
        jLabel7.setText("Porcentaje Persona 2");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 255, 51));
        jLabel8.setText("Porcentaje Persona 3");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));
        jPanel1.add(txtPorPersonaUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 120, -1));
        jPanel1.add(txtPorPersonaDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 120, -1));
        jPanel1.add(txtPorPersonaTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 120, -1));

        cmdBorrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmdBorrar.setForeground(new java.awt.Color(0, 51, 51));
        cmdBorrar.setText("BORRAR");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
    String cantidad, resultado1, resultado2, resultado3;
    double p1, p2, p3, resultado=0, ope1=0, ope2=0, ope3=0;
    
    if (txtPersonaUno.getText().trim().isEmpty()){
    JOptionPane.showMessageDialog(this, "Digite Valor De La Persona Uno", "Error", JOptionPane.ERROR_MESSAGE);
    txtPersonaUno.requestFocusInWindow();
    }
    else if (txtPersonaDos.getText().trim().isEmpty()){
    JOptionPane.showMessageDialog(this, "Digite Valor De La Persona Dos", "Error", JOptionPane.ERROR_MESSAGE);
    txtPersonaDos.requestFocusInWindow();
    }
    else if (txtPersonaTres.getText().trim().isEmpty()){
    JOptionPane.showMessageDialog(this, "Digite Valor De La Persona Tres");
    }
    else {
    p1= Double.parseDouble(txtPersonaUno.getText());
    p2= Double.parseDouble(txtPersonaDos.getText());
    p3= Double.parseDouble(txtPersonaTres.getText());
    
    if(p2 == p1){ 
    JOptionPane.showMessageDialog(this, "Digite Un Valor Diferente en la casilla", "Error", JOptionPane.ERROR_MESSAGE);
    txtPersonaUno.requestFocusInWindow();
    }
    else if(p3 == p2){
    JOptionPane.showMessageDialog(this,"Digite un valor diferente en la casilla", "Error", JOptionPane.ERROR_MESSAGE);
    txtPersonaDos.requestFocusInWindow();
    }
    else if(p3 == p1){
    JOptionPane.showMessageDialog(this, "digite un valor diferente en la casilla", "Error", JOptionPane.ERROR_MESSAGE);
    txtPersonaTres.requestFocusInWindow();
    }
    else {
     
    }
    resultado= p1+p2+p3;
    ope1= (p1*100)/resultado;
    ope2= (p2*100)/resultado;
    ope3= (p3*100)/resultado;
    }
    cantidad= String.valueOf(resultado);
    txtTotal.setText(cantidad);
    resultado1= String.valueOf(ope1);
    txtPorPersonaUno.setText(resultado1);
    resultado2= String.valueOf(ope2);
    txtPorPersonaDos.setText(resultado2);
    resultado3= String.valueOf(ope3);
    txtPorPersonaTres.setText(resultado3);
    
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
    txtPersonaUno.setText("");
    txtPersonaDos.setText("");
    txtPersonaTres.setText("");
    txtTotal.setText("");
    txtPorPersonaUno.setText("");
    txtPorPersonaDos.setText("");
    txtPorPersonaTres.setText("");
    
    txtPersonaUno.requestFocusInWindow();
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void txtPersonaUnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonaUnoKeyTyped
    char c=evt.getKeyChar();
    
    if(!Character.isDigit(c)){
    getToolkit().beep();
    evt.consume();
    }
    }//GEN-LAST:event_txtPersonaUnoKeyTyped

    private void txtPersonaDosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonaDosKeyTyped
    char c=evt.getKeyChar();
    
    if(!Character.isDigit(c)){
    getToolkit().beep();
    evt.consume();
    }
    }//GEN-LAST:event_txtPersonaDosKeyTyped

    private void txtPersonaTresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersonaTresKeyTyped
    char c=evt.getKeyChar();
    
    if(!Character.isDigit(c)){
    getToolkit().beep();
    evt.consume();
    }
    }//GEN-LAST:event_txtPersonaTresKeyTyped

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
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtPersonaDos;
    private javax.swing.JTextField txtPersonaTres;
    private javax.swing.JTextField txtPersonaUno;
    private javax.swing.JTextField txtPorPersonaDos;
    private javax.swing.JTextField txtPorPersonaTres;
    private javax.swing.JTextField txtPorPersonaUno;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
