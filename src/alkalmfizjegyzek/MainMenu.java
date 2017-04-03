/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alkalmfizjegyzek;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Dávid
 */
public class MainMenu extends javax.swing.JFrame {
//kapcsolódás az adatbázishoz
    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    
    public MainMenu() {
        initComponents();
        conn=db.java_db(); //kapcsolat hozzáadása
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2); // mainMenu középre igazítása
        currentDate();//hozzá rendelem hogy megjeleneítse a panelon az adatokat
        
        alkalmazottjLabel2.setText(String.valueOf(Alkalmazott.alkalmNeve).toString());// belépve mutatja az felhasznaló nevét
   }
    
   //Ezzel állítom be a dátumot és az időt 
   public void currentDate(){
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
        datumjMenu2.setText((month +1)+"/"+day+"/"+year);
        
        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);
        
        idojMenu3.setText(hour+":"+(minute)+":"+second);
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
        alkalmazottjLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jelentes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        datumjMenu2 = new javax.swing.JMenu();
        idojMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Belépve van:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 560, 90, 15);

        alkalmazottjLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        alkalmazottjLabel2.setForeground(new java.awt.Color(255, 255, 255));
        alkalmazottjLabel2.setText("alkalmazott");
        jPanel1.add(alkalmazottjLabel2);
        alkalmazottjLabel2.setBounds(130, 560, 160, 15);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AlkalmFizJegyzek.images/Add_Employee.png"))); // NOI18N
        jButton2.setText("Alkalmazott hozzáadás");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(750, 520, 210, 60);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AlkalmFizJegyzek.images/logout.png"))); // NOI18N
        jButton1.setText("Kijelentkezés");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(829, 30, 140, 29);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AlkalmFizJegyzek.images/Update.png"))); // NOI18N
        jButton3.setText("Fizetés változtatás");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(750, 450, 210, 60);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AlkalmFizJegyzek.images/Search.png"))); // NOI18N
        jButton5.setText("Keresés");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(530, 450, 200, 60);

        jelentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AlkalmFizJegyzek.images/jelentes.png"))); // NOI18N
        jelentes.setText("Jelentés készítés");
        jelentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jelentesActionPerformed(evt);
            }
        });
        jPanel1.add(jelentes);
        jelentes.setBounds(530, 520, 200, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AlkalmFizJegyzek.images/bk2.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-10, -40, 1010, 650);

        datumjMenu2.setText("Dátum");
        jMenuBar1.add(datumjMenu2);

        idojMenu3.setText("Idő");
        jMenuBar1.add(idojMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        login x = new login(); 
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        addAlkalmazott belepes = new addAlkalmazott();
        belepes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Fizetes emeles = new Fizetes();
        emeles.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Kereses kereső = new Kereses();
        kereső.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jelentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jelentesActionPerformed
        toReport();
    }//GEN-LAST:event_jelentesActionPerformed

    // Az report meghivása 
    public void toReport(){
        try {               
            JasperReport jasperReport = null;
            InputStream path=this.getClass().getResourceAsStream("report1.jrxml");    
            JasperPrint jasperPrint = null;
            jasperReport = JasperCompileManager.compileReport(path);
            HashMap parameters = new HashMap();
            jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, conn);
            JasperViewer.viewReport(jasperPrint,false);
        } catch (JRException ex) {
            Logger.getLogger(addAlkalmazott.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alkalmazottjLabel2;
    private javax.swing.JMenu datumjMenu2;
    private javax.swing.JMenu idojMenu3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jelentes;
    // End of variables declaration//GEN-END:variables
}
