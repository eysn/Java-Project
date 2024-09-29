package form;
import Checker.TaxiIDChecker;
import TaxiBackend.AddTaxi;
import TaxiBackend.AddTaxiSql;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;


public class FormAddT extends javax.swing.JPanel {
 private Image backgroundImage;
 private String TaxiID, TaxiYear, TaxiCapacity, TaxiModel;
 private boolean everything;
    
    public FormAddT() {
        initComponents();
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
    g.setColor(Color.green);
    g.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 30);

    // Draw the image as the background
    if (backgroundImage != null) {
        g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), this);
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        AddEmp = new javax.swing.JButton();
        taxIYear1 = new swing.TaxIYear();
        taxiID1 = new swing.TaxiID();
        taxiCapacity1 = new swing.TaxiCapacity();
        taxiModel1 = new swing.TaxiModel();
        jLabel1 = new javax.swing.JLabel();
        CheckTaxiid = new javax.swing.JLabel();
        Adderror = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 242, 242));
        setPreferredSize(new java.awt.Dimension(887, 599));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/508.png"))); // NOI18N

        AddEmp.setBackground(new java.awt.Color(0, 204, 0));
        AddEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/5.png"))); // NOI18N
        AddEmp.setText("Add");
        AddEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmpActionPerformed(evt);
            }
        });

        taxIYear1.setBackground(new java.awt.Color(204, 204, 204));
        taxIYear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxIYear1ActionPerformed(evt);
            }
        });

        taxiID1.setBackground(new java.awt.Color(204, 204, 204));
        taxiID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxiID1ActionPerformed(evt);
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/car.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Adderror, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 16, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(taxIYear1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(taxiCapacity1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(taxiModel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(taxiID1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(CheckTaxiid, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taxiID1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckTaxiid, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(taxiCapacity1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(taxIYear1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(taxiModel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(Adderror, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 55, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //This is the place that you are concerneeed with!!  
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Text Boxes and bottons
    private void taxiID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxiID1ActionPerformed
        // TaxiId Text Box
        checkTaxiID();
    }//GEN-LAST:event_taxiID1ActionPerformed

    private void taxiCapacity1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxiCapacity1ActionPerformed
        // Taxi Capacity Text Box
        
    }//GEN-LAST:event_taxiCapacity1ActionPerformed

    private void taxIYear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxIYear1ActionPerformed
        // Taxi Year Text box
        
    }//GEN-LAST:event_taxIYear1ActionPerformed

    private void taxiModel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxiModel1ActionPerformed
        // Taxi Model Text box 
        
    }//GEN-LAST:event_taxiModel1ActionPerformed

    private void AddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmpActionPerformed
        // Add Taxi Button
        validateForm();
    }//GEN-LAST:event_AddEmpActionPerformed
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //check id 
    private void checkTaxiID() {
        String taxiID = taxiID1.getText();
       
         // this fuction calles The functon that checks if the email is open or taken
//--------------------------------------------------------------------------------------------------------------------------------------------        
         
            if (TaxiIDChecker.isTIDTaken(TaxiID)) {
            CheckTaxiid.setText("Taxi ID is already taken");
            everything = false;
        }
        else {
            CheckTaxiid.setText("Taxi ID  is available");
            everything = true;
            TaxiID = taxiID1.getText();
        }
     
}
    private void validateForm() {
        if (taxiID1.getText().trim().isEmpty() || taxiCapacity1.getText().trim().isEmpty()||taxIYear1.getText().trim().isEmpty()||taxiModel1.getText().trim().isEmpty()) {
            Adderror.setText("Buddy I think You forgot to fillout some boxes");
        } 
         else {
        	 
            

             TaxiID=taxiID1.getText();
             TaxiCapacity=taxiCapacity1.getText();
             TaxiYear =  taxIYear1.getText();
             TaxiModel = taxiModel1.getText();
             checkTaxiID();           
             if(everything){
             TaxiBackend.AddTaxi ta = new TaxiBackend.AddTaxi();
             AddTaxiSql co = new AddTaxiSql();
             int taxicapacity = Integer.parseInt(TaxiCapacity);
             int taxiyear = Integer.parseInt(TaxiYear);
             ta.setTaxiID(TaxiID);
             ta.setCapacity(taxicapacity);
             ta.setModel(TaxiModel);
             ta.setYear(taxiyear);
             co.insertTaxiIntoDatabase(ta);
             Adderror.setText("Form submitted successfully!");
           
            
            //taxi.insertTaxiIntoDatabase();
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEmp;
    private javax.swing.JLabel Adderror;
    private javax.swing.JLabel CheckTaxiid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private swing.TaxIYear taxIYear1;
    private swing.TaxiCapacity taxiCapacity1;
    private swing.TaxiID taxiID1;
    private swing.TaxiModel taxiModel1;
    // End of variables declaration//GEN-END:variables
}
