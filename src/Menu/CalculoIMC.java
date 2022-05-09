/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menu;

import DTO.CalculoIMCDTO;

/**
 *
 * @author Sene
 */
public class CalculoIMC extends javax.swing.JFrame {

    /**
     * Creates new form CalculoIMC
     */
    public CalculoIMC() {
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

        btnCalcular = new javax.swing.JButton();
        txtPeso = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAlternaSexo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtResultadoIMC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 167, -1, -1));
        getContentPane().add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 52, 151, -1));
        getContentPane().add(txtAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 115, 151, -1));

        jLabel1.setText("Digite seu Peso");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 29, -1, -1));

        jLabel2.setText("Digita sua altura (centímetros)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 97, -1, -1));

        btnAlternaSexo.setText("Homem");
        btnAlternaSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlternaSexoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlternaSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        jLabel3.setText("Alternar clicando abaixo!");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jLabel4.setText("Caso seja do sexo oposto");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));
        getContentPane().add(txtResultadoIMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 240, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlternaSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlternaSexoActionPerformed
        if (btnAlternaSexo.getText() == "Homem") {
            btnAlternaSexo.setText("Mulher");
        } else {
            btnAlternaSexo.setText("Homem");
        }
    }//GEN-LAST:event_btnAlternaSexoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        float altura, peso, resultado;
        altura = Float.parseFloat(txtAltura.getText());
        peso = Float.parseFloat(txtPeso.getText());

        CalculoIMCDTO objcalculoimcdto = new CalculoIMCDTO();
        objcalculoimcdto.setAltura(altura);
        objcalculoimcdto.setPeso(peso);
        resultado = objcalculoimcdto.calculoIMC(peso, altura);

        
        //Resultado de inforamções sobre IMC Masculino
        if (btnAlternaSexo.getText() == "Homem") {
            if (resultado <= 18.5) {
                txtResultadoIMC.setText("seu imc é: " + resultado + " abaixo do peso");

            } else if (resultado >= 18.5 || resultado <= 24.99) {
                txtResultadoIMC.setText("seu imc é: " + resultado + " peso normal");

            } else if (resultado >= 25 || resultado <= 29.99) {
                txtResultadoIMC.setText("seu imc é: " + resultado + " Sobrepeso");

            } else if (resultado >= 30) {
                txtResultadoIMC.setText("seu imc é: " + resultado + " Obesidade!");

            }
        }
        //**** Fazer o de mulher
        else{
            
        }


    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(CalculoIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculoIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculoIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculoIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculoIMC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlternaSexo;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtResultadoIMC;
    // End of variables declaration//GEN-END:variables
}
