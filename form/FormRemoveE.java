
package form;

import Checker.EmailChecker;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;


public class FormRemoveE extends javax.swing.JPanel {
    boolean Emailfound=false;
    
     private Image backgroundImage;
    public FormRemoveE() {
        initComponents();
        //checks if the bg is there or not
    backgroundImage = new ImageIcon(getClass().getResource("/background/frutiger.jpg")).getImage();
        URL imageUrl = getClass().getResource("/background/frutiger.jpg");
    if (imageUrl != null) {
        backgroundImage = new ImageIcon(imageUrl).getImage();
        System.out.println("Image loaded successfully.");
    } else {
        System.out.println("Image not found!");
    }
        
    }
    
    @Override
protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    // For debugging: Fill the background with a color
    g.setColor(Color.BLUE);
    g.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 30);

    // Draw the image as the background
    if (backgroundImage != null) {
        g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), this);
    }}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        empEmailDelete1 = new swing.EmpEmailDelete();
        delteEmp = new javax.swing.JButton();
        Agreedelete = new javax.swing.JCheckBox();
        Emailstatus = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 242, 242));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/487.png"))); // NOI18N

        empEmailDelete1.setBackground(new java.awt.Color(204, 204, 204));
        empEmailDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empEmailDelete1ActionPerformed(evt);
            }
        });

        delteEmp.setBackground(new java.awt.Color(255, 0, 51));
        delteEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/4.png"))); // NOI18N
        delteEmp.setText("Remove");
        delteEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        delteEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delteEmpActionPerformed(evt);
            }
        });

        Agreedelete.setBackground(new java.awt.Color(255, 102, 102));
        Agreedelete.setText("By Checking The Box I Agree To Remove this Employee");
        Agreedelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgreedeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(delteEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(387, 387, 387)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Agreedelete)
                            .addComponent(empEmailDelete1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                            .addComponent(Emailstatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(empEmailDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Emailstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Agreedelete)
                        .addGap(18, 18, 18)
                        .addComponent(delteEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void empEmailDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empEmailDelete1ActionPerformed
        // Search email box
        checkEmail();
        
    }//GEN-LAST:event_empEmailDelete1ActionPerformed

    private void AgreedeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgreedeleteActionPerformed
        // checkbox
        
    }//GEN-LAST:event_AgreedeleteActionPerformed

    private void delteEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delteEmpActionPerformed
        //button 
        validateForm();
        
    }//GEN-LAST:event_delteEmpActionPerformed
    private void checkEmail() {
        String email = empEmailDelete1.getText();
        if (!isValidEmailFormat(email)) {
            Emailstatus.setText("Invalid email format");
            System.out.println("Inavalid Email number");
            Emailfound=false;
            return;
        }
        
        // this fuction calles The functon that checks if the email is open or taken
        

        if (EmailChecker.isEmailTaken(email)) {
            Emailstatus.setText("Email is found");
        Emailfound = true; 
        return;
        } 
        else {
            Emailstatus.setText("Email is not found!");
            
        }
    }
//checks if the the email is a correct form or not
    private boolean isValidEmailFormat(String email) {
        // Simple regex to check for "-@-.-" format
        String emailRegex = "^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$";
        return Pattern.matches(emailRegex, email);
    }
     
    private void validateForm() {
        checkEmail();
        //email search and check if they agree
            
            if(Agreedelete.isSelected()&&Emailfound){
            Emailstatus.setText("Form submitted successfully!");
            }else if(!Agreedelete.isSelected()){
                Emailstatus.setText("need to agree to delete ");
}else if (!Emailfound){
Emailstatus.setText("email not found boy!");
}
    } 
        
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Agreedelete;
    private javax.swing.JLabel Emailstatus;
    private javax.swing.JButton delteEmp;
    private swing.EmpEmailDelete empEmailDelete1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
