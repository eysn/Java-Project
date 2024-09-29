
// this file sets the design of the cards on the dashboard


package components;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import static java.lang.Math.random;
import javax.swing.JLabel;
import model.Model_Card;


public class Card extends javax.swing.JPanel {
   // declaration -----------------------------------------------------------------------------------------------
    private Color color1;
    private Color color2;

// card component start -----------------------------------------------------------------------------------------
    public Card() {
        initComponents();
        setOpaque(false);
        color1=Color.BLACK;
        color2=Color.WHITE;
        
    }
    
//this is whre the data comes from -----------------------------------------------------------------------------    
    public void setData(Model_Card data){
        lbIcon.setIcon(data.getIcon());
        lbTitle.setText(data.getTitle());
        lbValues.setText(data.getValues());
        lbDescription.setText(data.getDescription());
    
    }
    
    //ui stuff -------------------------------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="main window">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIcon = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        lbValues = new javax.swing.JLabel();
        lbDescription = new javax.swing.JLabel();

        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bestEmployee.png"))); // NOI18N

        lbTitle.setFont(new java.awt.Font("Arimo", 1, 14)); // NOI18N
        lbTitle.setText("Title");
        lbTitle.setToolTipText("");

        lbValues.setFont(new java.awt.Font("Arimo", 1, 18)); // NOI18N
        lbValues.setText("Values");

        lbDescription.setFont(new java.awt.Font("Arimo", 0, 18)); // NOI18N
        lbDescription.setText("Discription");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDescription)
                    .addComponent(lbValues)
                    .addComponent(lbTitle)
                    .addComponent(lbIcon))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lbIcon)
                .addGap(18, 18, 18)
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbValues)
                .addGap(18, 18, 18)
                .addComponent(lbDescription)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        lbTitle.setForeground(Color.WHITE);
        lbValues.setForeground(Color.WHITE);
        lbDescription.setForeground(Color.WHITE);
    }// </editor-fold>//GEN-END:initComponents

    //gradient and coloring and corner radius-------------------------------------------------------------------
    @Override
    protected void paintComponent(Graphics grphcs) {
         Graphics2D g2=(Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g;
        g = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255,255,255,50));
        g2.fillOval(getWidth()-(getHeight()/2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth()-(getHeight()/2)-29, getHeight()/2+20, getHeight(), getHeight());
     
        super.paintComponent(grphcs); 
    }
   //end of block ---------------------------------------------------------------------------------------------
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbDescription;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbValues;
    // End of variables declaration//GEN-END:variables

    
    // setter and getter method duh - do not modify!!-----------------------------------------------------
    public Color getColor1() {
        return color1;
    }

    
    public void setColor1(Color color1) {
        this.color1 = color1;
    }

 
    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }
}
// end of setter and getter method------------------------------------------------------------------------
