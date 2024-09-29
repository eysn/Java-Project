package components;
import event.EventMenuSelected;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import model.Model_Menu;
        

public class Menu extends javax.swing.JPanel {

    
    private EventMenuSelected event;
    
    public void addEventMenuSelected(EventMenuSelected event){
    this.event=event;
    listMenu1.addEventMenuSelected(event);
    }
    public Menu() {
        initComponents();
        setOpaque(false);
        init();
        listMenu1.setOpaque(false);
        
    }
    
    private void init(){
        listMenu1.addItem(new Model_Menu("1002", "Dashboard", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("1003", "Analytics", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu(" ", " ", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("2", "Employee", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("1", "Add", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("4", "Remove", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("3", "Edit", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu(" ", " ", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu("6", "Taxis", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("5", "Add", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("8", "Remove", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("7", "Edit", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu(" ", " ", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu(" ", " ", Model_Menu.MenuType.EMPTY));
        listMenu1.addItem(new Model_Menu(" ", " ", Model_Menu.MenuType.EMPTY));
        
        listMenu1.addItem(new Model_Menu("1001", "Logout", Model_Menu.MenuType.MENU));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Main window">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMoving = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listMenu1 = new swing.ListMenu<>();

        panelMoving.setOpaque(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo.png"))); // NOI18N
        jLabel1.setText("Taxi Aid");

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelMovingLayout.setVerticalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(listMenu1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
   @Override
    protected void paintChildren(Graphics grphcs){
        Graphics2D g2=(Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g;
        g = new GradientPaint(0, 0, Color.decode("#292f56"), 0, getHeight(), Color.decode("#008ba0"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth()-20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
        
    }
    private int x;
    private int y;
    
// animations on hover
    public void initMoving(JFrame frame){
        panelMoving.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent me){
                x=me.getX();
                y=me.getY();
                
            }
    });
        
        //dragging on the menu side of the window 
        panelMoving.addMouseMotionListener(new MouseMotionAdapter(){
        @Override
        public void mouseDragged(MouseEvent me){
            frame.setLocation(me.getXOnScreen()-x,me.getYOnScreen()-y);
        }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private swing.ListMenu<String> listMenu1;
    private javax.swing.JPanel panelMoving;
    // End of variables declaration//GEN-END:variables
}
