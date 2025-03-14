package bob;
import transactions.*;
import java.awt.GridBagConstraints;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.GridBagLayout;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Gungun
 */
public class Menuframe extends javax.swing.JFrame {
    GridBagLayout gridBagLayout = new GridBagLayout();
Dashboard dash;
Creditedac dep;
Withdrawlam wid;
Balanceam bal;
Update up;
Passbookam pb;
QuickTransfer df;
   String username;
   String pwd;
   String from;
   String to;
    /**
     * Creates new form Menuframe
     */
    public Menuframe() {
        initComponents(); 
       setExtendedState(MAXIMIZED_BOTH);
         ImageIcon imageIcon1 = new ImageIcon(new ImageIcon("C:/Users/Gungun/Documents/NetBeansProjects/bob/src/bob/Money Emoji [Free Download Money Face Emoji].png").getImage().getScaledInstance(jLabel3.getWidth(),jLabel3.getHeight(), Image.SCALE_DEFAULT));
       jLabel3.setIcon(imageIcon1);
    }
    public Menuframe(String username,String pwd){
          initComponents();
          this.pwd=pwd;
          this.username=username;
        dash=new Dashboard(username);
       wid=new Withdrawlam(username,pwd);
       dep=new Creditedac(username,pwd);
       bal=new Balanceam(username,pwd);
       up=new Update(username);
       pb=new Passbookam(username);
       df=new QuickTransfer(username,pwd);
      menucontent.setLayout(gridBagLayout);
       GridBagConstraints gridBagConstraints=new GridBagConstraints();
        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=0;
        menucontent.add(dash,gridBagConstraints);
        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=0;
        menucontent.add(dep,gridBagConstraints);
        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=0;
        menucontent.add(wid,gridBagConstraints);
        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=0;
        menucontent.add(bal,gridBagConstraints);
        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=0;
        menucontent.add(up,gridBagConstraints);
        
        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=0;
         menucontent.add(pb,gridBagConstraints);
         
        gridBagConstraints.gridx=0;
        gridBagConstraints.gridy=0;
        menucontent.add(df,gridBagConstraints);
        dash.setVisible(false);
        wid.setVisible(false);
        dep.setVisible(false);
        bal.setVisible(false);
          up.setVisible(false);
          pb.setVisible(false);
            df.setVisible(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        balanceshow1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Passbook = new javax.swing.JButton();
        Update1 = new javax.swing.JButton();
        directTrans = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        menucontent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 0));
        jButton2.setText("DASHBOARD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        balanceshow1.setBackground(new java.awt.Color(204, 204, 204));
        balanceshow1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        balanceshow1.setForeground(new java.awt.Color(51, 51, 0));
        balanceshow1.setText("BALANCE");
        balanceshow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceshow1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 0));
        jButton1.setText("WITHDRAWL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 51, 0));
        jButton3.setText("DEPOSIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Passbook.setBackground(new java.awt.Color(204, 204, 204));
        Passbook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Passbook.setForeground(new java.awt.Color(51, 51, 0));
        Passbook.setText("PASSBOOK");
        Passbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassbookActionPerformed(evt);
            }
        });

        Update1.setBackground(new java.awt.Color(204, 204, 204));
        Update1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Update1.setForeground(new java.awt.Color(51, 51, 0));
        Update1.setText("UPDATE");
        Update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update1ActionPerformed(evt);
            }
        });

        directTrans.setBackground(new java.awt.Color(204, 204, 204));
        directTrans.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        directTrans.setForeground(new java.awt.Color(51, 51, 0));
        directTrans.setText("QUICK  TRANSACTION");
        directTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directTransActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Update1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Passbook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(directTrans, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(balanceshow1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton2)
                .addGap(44, 44, 44)
                .addComponent(balanceshow1)
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(40, 40, 40)
                .addComponent(Update1)
                .addGap(45, 45, 45)
                .addComponent(Passbook)
                .addGap(44, 44, 44)
                .addComponent(directTrans)
                .addGap(65, 65, 65))
        );

        directTrans.getAccessibleContext().setAccessibleName("QUICK \n TRANSACTION");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME IN MONEY MAKER BANK");

        jButton5.setBackground(new java.awt.Color(0, 0, 51));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("EXIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton5)
                            .addGap(9, 9, 9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 827, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );

        menucontent.setBackground(new java.awt.Color(51, 0, 102));

        javax.swing.GroupLayout menucontentLayout = new javax.swing.GroupLayout(menucontent);
        menucontent.setLayout(menucontentLayout);
        menucontentLayout.setHorizontalGroup(
            menucontentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        menucontentLayout.setVerticalGroup(
            menucontentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menucontent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(215, Short.MAX_VALUE)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menucontent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(jDesktopPane1)
                    .addContainerGap()))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dash.setVisible(true);
        dep.setVisible(false);
        wid.setVisible(false);
        bal.setVisible(false);
          up.setVisible(false);
           pb.setVisible(false);
           df.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         dash.setVisible(false);
        dep.setVisible(true);
        wid.setVisible(false);
        bal.setVisible(false);
          up.setVisible(false);
           pb.setVisible(false);
           df.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         dash.setVisible(false);
        dep.setVisible(false);
        wid.setVisible(true);
         bal.setVisible(false);
           up.setVisible(false);
            pb.setVisible(false);
            df.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PassbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassbookActionPerformed
        // TODO add your handling code here:
         dash.setVisible(false);
        dep.setVisible(false);
        wid.setVisible(false);
        bal.setVisible(false);
        up.setVisible(false);
         pb.setVisible(true);
         df.setVisible(false);
        
    }//GEN-LAST:event_PassbookActionPerformed

    private void balanceshow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceshow1ActionPerformed
        // TODO add your handling code here:
            dash.setVisible(false);
        dep.setVisible(false);
        wid.setVisible(false);
        bal.setVisible(true);
         up.setVisible(false);
          pb.setVisible(false);
          df.setVisible(false);
    }//GEN-LAST:event_balanceshow1ActionPerformed

    private void Update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update1ActionPerformed
        // TODO add your handling code here:
           dash.setVisible(false);
        dep.setVisible(false);
        wid.setVisible(false);
        bal.setVisible(false);
         up.setVisible(true);
          pb.setVisible(false);
          df.setVisible(false);
    }//GEN-LAST:event_Update1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void directTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directTransActionPerformed
        // TODO add your handling code here:
        df.setVisible(true);
        dash.setVisible(false);
        dep.setVisible(false);
        wid.setVisible(false);
        bal.setVisible(false);
         up.setVisible(false);
          pb.setVisible(false);
    }//GEN-LAST:event_directTransActionPerformed

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
            java.util.logging.Logger.getLogger(Menuframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menuframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menuframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menuframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menuframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Passbook;
    private javax.swing.JButton Update1;
    private javax.swing.JButton balanceshow1;
    private javax.swing.JButton directTrans;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel menucontent;
    // End of variables declaration//GEN-END:variables
}
