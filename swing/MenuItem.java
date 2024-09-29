
package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import model.Model_Menu;


public class MenuItem extends javax.swing.JPanel {

    private boolean selected;
    private boolean over;
    
    public MenuItem(Model_Menu data) {
        initComponents();
        setOpaque(false);
        if(data.getType()==Model_Menu.MenuType.MENU){
        jbicom.setIcon(data.toIcon());
        jLabel1.setText(data.getName());
        jLabel1.setForeground(Color.WHITE);
        
        }else if(data.getType()==Model_Menu.MenuType.TITLE){
        jLabel1.setText(data.getName());
        jLabel1.setFont(new Font("sanserif", 1 ,16));
        //jLabel1.setVisible(false);
        jLabel1.setForeground(Color.WHITE);
        }else{
         jLabel1.setText(" ");
        }
        
    }

    
    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }
    
    public void setOver(boolean over){
     this.over=over;
     repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbicom = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jbicom.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Chilanka", 1, 14)); // NOI18N
        jLabel1.setText("Menu Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jbicom)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbicom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
@Override
protected void paintComponent(Graphics grphcs){
    if(selected|| over){
 Graphics2D g2=(Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (selected){
        g2.setColor(new Color (255, 255, 255, 80));
        }else{
        g2.setColor(new Color (255, 255, 255, 20));
        }
        g2.fillRoundRect(10, 0, getWidth()-20, getHeight(), 5, 5);
    }
        super.paintChildren(grphcs);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jbicom;
    // End of variables declaration//GEN-END:variables

    
    
        
        
        
        
    
}
