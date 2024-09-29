
package form;

import Checker.TaxiIDChecker;
import TaxiBackend.AddTaxi;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;


public class FormEditT extends javax.swing.JPanel {
private String TaxiID, TaxiYear, TaxiCapacity, TaxiModel, oldTaxiID;
 private boolean everything;
private Image backgroundImage;
   
    public FormEditT() {
        
        initComponents();
        //check if bg is there or not
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
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        EditEmp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        taxIYearEdi1 = new swing.TaxIYearEdi();
        taxiIDEdit1 = new swing.TaxiIDEdit();
        taxiCapacity1 = new swing.TaxiCapacity();
        taxiModel1 = new swing.TaxiModel();
        taxiIDSearch1 = new swing.TaxiIDSearch();
        EditError = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(242, 242, 242));

        EditEmp.setBackground(new java.awt.Color(51, 204, 0));
        EditEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/7.png"))); // NOI18N
        EditEmp.setText("Edit");
        EditEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EditEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditEmpActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/153.png"))); // NOI18N

        taxIYearEdi1.setBackground(new java.awt.Color(204, 204, 204));
        taxIYearEdi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxIYearEdi1ActionPerformed(evt);
            }
        });

        taxiIDEdit1.setBackground(new java.awt.Color(204, 204, 204));
        taxiIDEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxiIDEdit1ActionPerformed(evt);
            }
        });

        taxiCapacity1.setBackground(new java.awt.Color(204, 204, 204));
        taxiCapacity1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxiCapacity1ActionPerformed(evt);
            }
        });

        taxiModel1.setBackground(new java.awt.Color(204, 204, 204));
        taxiModel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxiModel1ActionPerformed(evt);
            }
        });

        taxiIDSearch1.setBackground(new java.awt.Color(204, 204, 204));
        taxiIDSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxiIDSearch1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EditEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EditError, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(taxIYearEdi1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 347, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(taxiIDSearch1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                            .addComponent(taxiModel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(taxiCapacity1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(taxiIDEdit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(taxiIDSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(taxiIDEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(taxiCapacity1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(taxiModel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(taxIYearEdi1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(EditError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EditEmp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void taxiIDSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxiIDSearch1ActionPerformed
        // search taxi id
    }//GEN-LAST:event_taxiIDSearch1ActionPerformed

    private void taxiIDEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxiIDEdit1ActionPerformed
        // taxi id
    }//GEN-LAST:event_taxiIDEdit1ActionPerformed

    private void taxiCapacity1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxiCapacity1ActionPerformed
        // taxi capacity
    }//GEN-LAST:event_taxiCapacity1ActionPerformed

    private void taxiModel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxiModel1ActionPerformed
        // taxi model
    }//GEN-LAST:event_taxiModel1ActionPerformed

    private void taxIYearEdi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxIYearEdi1ActionPerformed
        // Ttaxi year
    }//GEN-LAST:event_taxIYearEdi1ActionPerformed

    private void EditEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditEmpActionPerformed
        // edit taxi
        validateForm();
    }//GEN-LAST:event_EditEmpActionPerformed
    //validation form foe the button pressed 
    private void validateForm() {
        //checks if any of the boxes are empty
        if (taxiIDEdit1.getText().trim().isEmpty() || taxiCapacity1.getText().trim().isEmpty()||taxIYearEdi1.getText().trim().isEmpty()||taxiModel1.getText().trim().isEmpty()) {
            EditError.setText("Buddy I think You forgot to fillout some boxes");
        } 
         else {
            oldTaxiID = taxiIDSearch1.getText();
            TaxiID=taxiIDEdit1.getText();
            TaxiCapacity=taxiCapacity1.getText();
            TaxiYear =  taxIYearEdi1.getText();
            TaxiModel = taxiModel1.getText();
            int number = Integer.parseInt(TaxiCapacity);
            int year= Integer.parseInt(TaxiYear);
            AddTaxi newTaxi = new AddTaxi(TaxiID, number, TaxiModel, year);
            CheckTaxiID();
            if(everything){
                TaxiBackend.UpdateTaxi taxiService = new TaxiBackend.UpdateTaxi();
                taxiService.updateTaxi(oldTaxiID, newTaxi);
            EditError.setText("Form submitted successfully!");
            }
        }
    }
    // checks if there is taxi id or not
     private void CheckTaxiID() {
        String TaxiId = taxiIDSearch1.getText();
        
        
        // this fuction calles The functon that checks if the email is open or taken
//-------------------------------------------------------------------------------------------------------------------------        

   if (TaxiIDChecker.isTIDTaken(TaxiId)) {
       
            EditError.setText("Taxi ID is already taken");
            everything = true;
        }
        else {
            EditError.setText("Taxi ID  is available");
            everything = false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditEmp;
    private javax.swing.JLabel EditError;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel2;
    private swing.TaxIYearEdi taxIYearEdi1;
    private swing.TaxiCapacity taxiCapacity1;
    private swing.TaxiIDEdit taxiIDEdit1;
    private swing.TaxiIDSearch taxiIDSearch1;
    private swing.TaxiModel taxiModel1;
    // End of variables declaration//GEN-END:variables
}
