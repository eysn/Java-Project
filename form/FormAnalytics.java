
package form;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class FormAnalytics extends javax.swing.JPanel {
     private Image backgroundImage;
 
    public FormAnalytics() {
        initComponents();
        backgroundImage = new ImageIcon(getClass().getResource("/background/hello.jpg")).getImage();
        URL imageUrl = getClass().getResource("/background/hello.jpg");
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
    g.setColor(Color.BLACK);
    g.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 30);

    // Draw the image as the background
    if (backgroundImage != null) {
        g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), this);
    }
} 
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 242, 242));

        jLabel1.setFont(new java.awt.Font("Arimo", 1, 36)); // NOI18N
        jLabel1.setText("Comming Soon!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addContainerGap(182, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
