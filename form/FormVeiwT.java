
package form;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class FormVeiwT extends javax.swing.JPanel {
private Image backgroundImage;
private String  TaxiID, Capacity, Model, Year;
   
    public FormVeiwT() {
        initComponents();
         TaxiBackend.TaxiView taxiService = new TaxiBackend.TaxiView();
         int size = taxiService.getTaxiRowCount();
         for(int i=0; i<size; i++){
         TaxiBackend.AddTaxi taxi = taxiService.getTaxiByIndex(i);
         AddItem(taxi.getTaxiID(),taxi.getCapacity(), taxi.getModel(), taxi.getYear());
         }
         
         
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
    
    //graphics components
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
//sets data for the show window
public void setData(String  TaxiID, String Capacity,String Model,String Year){
	this.TaxiID = TaxiID;
    this.Capacity = Capacity;
    this.Model = Model;
    this.Year = Year;
}
public void AddItem(String TaxiID, int Capacity, String Model, int Year) {
    DefaultTableModel model = (DefaultTableModel) taxTable2.getModel();
    model.addRow(new Object[]{TaxiID, Capacity, Model, Year});
    // Update the table view after adding data
    ((DefaultTableModel) taxTable2.getModel()).fireTableDataChanged();
}
//add row function -- just make a for loop for it so it will get all the data in the db
public void AddItem(){
        taxTable2.addRow(new Object[]{TaxiID, Capacity, Model, Year});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBoarder1 = new swing.PanelBoarder();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taxTable2 = new swing.TaxTable();

        setBackground(new java.awt.Color(242, 242, 242));

        jLabel1.setFont(new java.awt.Font("Arimo", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Taxis");

        jScrollPane2.setBorder(null);

        taxTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TaxiID", "Capacity", "Model", "Year"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(taxTable2);

        javax.swing.GroupLayout panelBoarder1Layout = new javax.swing.GroupLayout(panelBoarder1);
        panelBoarder1.setLayout(panelBoarder1Layout);
        panelBoarder1Layout.setHorizontalGroup(
            panelBoarder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoarder1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelBoarder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panelBoarder1Layout.setVerticalGroup(
            panelBoarder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoarder1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBoarder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBoarder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private swing.PanelBoarder panelBoarder1;
    public swing.TaxTable taxTable2;
    // End of variables declaration//GEN-END:variables
}
