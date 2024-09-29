package swing;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import model.StatusType;


public class TableStatus extends JLabel{
    
    public TableStatus(){
        setForeground(Color.WHITE);
    }
    
    private StatusType type;
    public void setType(StatusType type){
    this.type=type;
    setText(type.toString());
    repaint();
    } 

    @Override
    protected void paintComponent(Graphics grphcs) {
        if (type!=null){
         Graphics2D g2=(Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g;
        if( null==type){
            g = new GradientPaint(0, 0, Color.decode("#00d493"), 0, getHeight(), Color.decode("#69e882"));
        }else switch (type) {
                case PENDING:
                    g = new GradientPaint(0, 0, Color.decode("#007498"), 0, getHeight(), Color.decode("#008ba0"));
                    break;
                case RESERVED:
                    g = new GradientPaint(0, 0, Color.decode("#ff4f4f"), 0, getHeight(), Color.decode("#ff6741"));
                    break;
                default:
                    g = new GradientPaint(0, 0, Color.decode("#00d493"), 0, getHeight(), Color.decode("#69e882"));
                    break;
            }
        
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255,255,255,50));
        g2.fillOval(getWidth()-(getHeight()/2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth()-(getHeight()/2)-29, getHeight()/2+20, getHeight(), getHeight());
    }
        
        
        super.paintComponent(grphcs); 
    }
    public StatusType getType() {
        return type;
    }
    
}
