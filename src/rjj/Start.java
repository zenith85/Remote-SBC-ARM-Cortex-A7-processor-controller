/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rjj;

import com.sun.jdi.connect.Connector;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static rjj.AES.decrypt;
import static rjj.AES.encrypt;

/**
 *
 * @author ibrah
 */
public class Start extends javax.swing.JFrame {

    /**
     * Creates new form Start
     */
    static String dycpasscode;
    static String encpasscode;
    public Start() {
        initComponents();
        //System.out.print(decrypt(encrypt("admin","i_am_the_one"),"i_am_the_one") );
        //System.out.print(encrypt("admin","NOC_just_in_case_1985"));
        File indestbeff_IP = new File(".\\Globalworkpath\\plainfile.txt");
        try ( Scanner finn = new Scanner(indestbeff_IP)) {
            while (finn.hasNext()) {
                encpasscode=finn.nextLine();
                
                //fall back measurement incase password loss, P. S. remove before build the project
                System.out.println(decrypt(encpasscode,"NOC_just_in_case_1985"));
                
                dycpasscode=decrypt(encpasscode,"NOC_just_in_case_1985");
                //System.out.print(encpasscode);
            }
            finn.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SignIN_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Psword_field = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SignIN_btn.setText("Login");
        SignIN_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignIN_btnActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter The Passcode!");

        Psword_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Psword_fieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Psword_field, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SignIN_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Psword_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SignIN_btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignIN_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignIN_btnActionPerformed
        
       // if ("admin".equals(Psword_field.getText()))
        //if (dycpasscode.equals(Psword_field.getText())) //deprecated
        if (dycpasscode.equals(String.valueOf(Psword_field.getPassword())))
  //if(true)
        {
            main frame_2=new main();
            frame_2.setLocationRelativeTo(null);
            frame_2.setVisible(true);
            this.setVisible(false);
        }else{
            
            System.exit(1);
            
        }
    }//GEN-LAST:event_SignIN_btnActionPerformed

    private void Psword_fieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Psword_fieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
           // if (dycpasscode.equals(Psword_field.getText())) {//deprecated
           
            if (dycpasscode.equals(String.valueOf(Psword_field.getPassword()))) {
                main frame_2 = new main();
                frame_2.setLocationRelativeTo(null);
                frame_2.setVisible(true);
                this.setVisible(false);
            } else {
                System.exit(1);
            }
        }
    }//GEN-LAST:event_Psword_fieldKeyPressed

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
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Psword_field;
    private javax.swing.JButton SignIN_btn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
