
package form;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import model.Model_Card;
import swing.Scrollbar;



public class FormHome extends javax.swing.JPanel {
     private Image backgroundImage;
     private String Name, Email, Age, DateJoined , Rating, Status;
     verify.EmployeeRetriever employeeRetriever = new verify.EmployeeRetriever();
      verify.Cards.card1 x = new verify.Cards.card1();
      verify.Cards.card2 y = new verify.Cards.card2();
      verify.Cards.card3 z = new verify.Cards.card3();
    //this is where the home cards are kept/ edited
    public FormHome() {
        initComponents();
         
        //this is the cards that are on the top of the dashboard 
        
        
       x.fetchEmployeeWithHighestRating();
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/bestEmployee.png")), "Best Driver", x.getHighestRatedEmployeeName(), "Rating"+ x.getHighestRatedEmployeeRating()));
        y.fetchLatestJoiningEmployee();
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/Newegg.png")), "New Recruit", y.getLatestEmployeeName(), "Date of Join"+ y.getLatestEmployeeDateOfJoin()));
        z.fetchLatestTaxi();
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/icon/Newmodel.png")), "New Model", z.getLatestTaxiModel(), "ID:"+ z.getLatestTaxiID()));
//Add rows
       
        sp1.getVerticalScrollBar().setUI(new Scrollbar());
        sp1.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        //p.setBackground(Color.WHITE);
        sp1.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
         backgroundImage = new ImageIcon(getClass().getResource("/background/hello.jpg")).getImage();
        URL imageUrl = getClass().getResource("/background/hello.jpg");
        addTableValues();
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
        // method to set the user info that is from the database
     public void getuserinfo(String Name, String Email, String Age, String DateJoined ,String Rating, String Status ){
    Name= this.Name;
    Email=this.Email;
    Age=this.Age;
    DateJoined=this.DateJoined;
    Rating=this.Rating;
    Status=this.Status;
    
            
    }
     public void addTableValues(){
         
    for(int i = 0; i<8; i++){
 verify.UserAdd employee = employeeRetriever.getEmployeeByIndex(i);
               
   
    
    Long p = employee.getPhoneNumber();
    String phone = Long.toString(p);
    String age = Integer.toString(employee.getage());
    AddItem(employee.getName(), employee.getEmail(), age, employee.getDateOfJoin(), employee.getRating(), employee.getStatus());
    }
}
     
     // add rows intp table 
     public void AddItem(String Name, String Email, String Age, String DateJoined ,String Rating, String Status ){
    Tables.addRow(Name,Email,Age,DateJoined,Rating,Status);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JLayeredPane();
        card1 = new components.Card();
        card2 = new components.Card();
        card3 = new components.Card();
        panelBoarder1 = new swing.PanelBoarder();
        jLabel1 = new javax.swing.JLabel();
        sp1 = new javax.swing.JScrollPane();
        Tables = new swing.TableHomex();

        setBackground(new java.awt.Color(242, 242, 242));

        Panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card1.setColor1(new java.awt.Color(64, 41, 86));
        card1.setColor2(new java.awt.Color(210, 93, 110));
        Panel.add(card1);

        card2.setColor1(new java.awt.Color(2, 8, 115));
        card2.setColor2(new java.awt.Color(150, 237, 137));
        Panel.add(card2);

        card3.setColor1(new java.awt.Color(255, 204, 51));
        card3.setColor2(new java.awt.Color(204, 204, 0));
        Panel.add(card3);

        panelBoarder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arimo", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Employees");
        jLabel1.setToolTipText("");

        sp1.setBorder(null);
        sp1.setViewportView(Tables);

        javax.swing.GroupLayout panelBoarder1Layout = new javax.swing.GroupLayout(panelBoarder1);
        panelBoarder1.setLayout(panelBoarder1Layout);
        panelBoarder1Layout.setHorizontalGroup(
            panelBoarder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoarder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBoarder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(sp1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBoarder1Layout.setVerticalGroup(
            panelBoarder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoarder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
                    .addComponent(panelBoarder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelBoarder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane Panel;
    private swing.TableHomex Tables;
    private components.Card card1;
    private components.Card card2;
    private components.Card card3;
    private javax.swing.JLabel jLabel1;
    private swing.PanelBoarder panelBoarder1;
    private javax.swing.JScrollPane sp1;
    // End of variables declaration//GEN-END:variables
}
