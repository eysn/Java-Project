
package form;

import Checker.TaxiIDChecker;
import TaxiBackend.RemoveTaxiSQL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class FormRemoveT extends javax.swing.JPanel {
    boolean idFound= false;
    private String TaxiId;
     private Image backgroundImage;
    public FormRemoveT() {
        initComponents();
        //checks if the bg is there
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
    g.setColor(Color.GREEN);
    g.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 30);

    // Draw the image as the background
    if (backgroundImage != null) {
        g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), this);
    }}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddEmp = new javax.swing.JButton();
        AgreeDelete = new javax.swing.JCheckBox();
        taxiIDDelete1 = new swing.TaxiIDDelete();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        DeleErr = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 242, 242));

        AddEmp.setBackground(new java.awt.Color(255, 0, 51));
        AddEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/8.png"))); // NOI18N
        AddEmp.setText("Remove");
        AddEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmpActionPerformed(evt);
            }
        });

        AgreeDelete.setBackground(new java.awt.Color(255, 102, 102));
        AgreeDelete.setText("By Checking The Box I Agree To Remove this Taxi");
        AgreeDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgreeDeleteActionPerformed(evt);
            }
        });

        taxiIDDelete1.setBackground(new java.awt.Color(204, 204, 204));
        taxiIDDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxiIDDelete1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/509.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/car.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(134, 134, 134))
                    .addComponent(AgreeDelete)
                    .addComponent(taxiIDDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(352, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(taxiIDDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(AgreeDelete)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleErr, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AgreeDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgreeDeleteActionPerformed
        // check box
    }//GEN-LAST:event_AgreeDeleteActionPerformed

    private void taxiIDDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxiIDDelete1ActionPerformed
        // Id box
    }//GEN-LAST:event_taxiIDDelete1ActionPerformed

    private void AddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmpActionPerformed
        // Button
        validateForm();
    }//GEN-LAST:event_AddEmpActionPerformed
 //validation
 private void validateForm() {
     CheckTaxiID();
      //checks the conditons of deletion 
            if(AgreeDelete.isSelected()&&idFound){
                // call the dlete function
                RemoveTaxiSQL deleteTaxi = new RemoveTaxiSQL();
                
                 deleteTaxi.deleteTaxiById(TaxiId);
                 
            DeleErr.setText("Taxi Deleted successfully");
            }else if(!AgreeDelete.isSelected()){
                DeleErr.setText("need to agree to delete ");
}else if (!idFound){
DeleErr.setText("ID not found boy!");
}
        }
  private void CheckTaxiID() {
        TaxiId = taxiIDDelete1.getText();
        
        
        // this fuction calles The functon that checks if the email is open or taken
        

        if (TaxiIDChecker.isTIDTaken(TaxiId)) {
            DeleErr.setText("Taxi is found");
            idFound = true;
        return;
        } 
        else {
            DeleErr.setText("Taxi is not found!");
            
        }
    }
 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEmp;
    private javax.swing.JCheckBox AgreeDelete;
    private javax.swing.JLabel DeleErr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private swing.TaxiIDDelete taxiIDDelete1;
    // End of variables declaration//GEN-END:variables
}
