package form;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import javax.swing.ImageIcon;
import Windows.EmployeeInfo;


public class FormVeiwE extends javax.swing.JPanel {
    private Image backgroundImage;
    private String Name, Email,Phone, Gender, Age, DateJoined, status, Rating, TaxiID;
    private int size;
    verify.ReadEmp read = new verify.ReadEmp();
    verify.EmployeeRetriever employeeRetriever = new verify.EmployeeRetriever();
    public FormVeiwE() {
        initComponents();
        // this is just an example
       // addRowToTable("John Doe", "john@example.com","09291", "Male", "30", "2024-01-15", "4.5", "dateJoined", "TX123");
        addTableValues();
        //Tables.addRow(new String[]{"Name","Email","Gender","Age","DateJoined","Ratin","Status","TaxiID"});
        
        //checks if the bg is there 
     backgroundImage = new ImageIcon(getClass().getResource("/background/frutiger.jpg")).getImage();
        URL imageUrl = getClass().getResource("/background/frutiger.jpg");
    if (imageUrl != null) {
        backgroundImage = new ImageIcon(imageUrl).getImage();
        System.out.println("Image loaded successfully.");
    } else {
        System.out.println("Image not found!");
    }
    //mouse listener if the table is clicked or not 
     Tables.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                
                //if clicked show a window
                int row = Tables.rowAtPoint(evt.getPoint());
                if (row >= 0) {
                    setuserinfo(Name, Email, Phone, Gender, Age, DateJoined , Rating, status, TaxiID);
                    handleRowClick(row);
                }
            }
        });   
    }
    
    private void handleRowClick(int row) {
        String Name = Tables.getValueAt(row, 0).toString();
        String Email = Tables.getValueAt(row, 1).toString();
        String Phone = Tables.getValueAt(row, 2).toString();
        String Gender = Tables.getValueAt(row, 3).toString();
        String Age = Tables.getValueAt(row, 4).toString();
        String DateJoined = Tables.getValueAt(row, 5).toString();
        String Rating = Tables.getValueAt(row, 6).toString();
        String status = Tables.getValueAt(row, 7).toString();
        String TaxiID = Tables.getValueAt(row, 8).toString();
        // Call a method with the row data
        System.out.println(Name);
        EmployeeInfo n = new EmployeeInfo(Name, Email, Phone, Gender, Age, DateJoined , Rating, status, TaxiID);
        
        
        
    }
    
    @Override
protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    // For debugging: Fill the background with a color
    g.setColor(Color.BLUE);
    g.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 30);

    // Draw the image as the background
    if (backgroundImage != null) {
        g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), this);
    }
} 

public void addtotable(){
    for(int i = 0; i<size;i++){
    verify.Employee add = read.getEmployeeByRowNumber(i);
        addRowToTable(add.getName(), add.getEmail(), add.getPhoneNumber(), add.getGender(), add.getAge(), add.getDateJoined(), add.getRating(), add.getStatus(), add.getTaxiId());
    }
}

//get info for the clicked window 
public void setuserinfo(String Name, String Email, String Phone, String Gender, String Age, String DateJoined ,String Rating, String Status, String TaxiID ){
    Name= this.Name;
    Email=this.Email;
    Phone = this.Phone;
    Gender=this.Gender;
    Age=this.Age;
    DateJoined=this.DateJoined;
    Rating=this.Rating;
    Status=this.status;
    TaxiID=this.TaxiID;
            
    }
//add row function -- just make a for loop for it so it will get all the data in the db
private void addRowToTable(String name, String email, String Phone, String gender, String age, String dateJoined, String rating, String status, String taxiID) {
    
    
    
    Tables.addRow(name, email, Phone, gender, age, dateJoined, rating, status, taxiID);
}

//add the whole thing 

public void addTableValues(){
    size= employeeRetriever.getEmployeeRowCount();
    for(int i = 0; i<size; i++){
 verify.UserAdd employee = employeeRetriever.getEmployeeByIndex(i);
               
   
    
    Long p = employee.getPhoneNumber();
    String phone = Long.toString(p);
    String age = Integer.toString(employee.getage());
    addRowToTable(employee.getName(), employee.getEmail(), phone, employee.getGender(), age, employee.getDateOfJoin(), employee.getRating(), employee.getStatus(), employee.getTaxiID());
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBoarder1 = new swing.PanelBoarder();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tables = new swing.TableEmp();

        setBackground(new java.awt.Color(242, 242, 242));

        panelBoarder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arimo", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Employees");
        jLabel1.setToolTipText("");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportView(Tables);

        javax.swing.GroupLayout panelBoarder1Layout = new javax.swing.GroupLayout(panelBoarder1);
        panelBoarder1.setLayout(panelBoarder1Layout);
        panelBoarder1Layout.setHorizontalGroup(
            panelBoarder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoarder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBoarder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panelBoarder1Layout.setVerticalGroup(
            panelBoarder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoarder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
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
    private swing.TableEmp Tables;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private swing.PanelBoarder panelBoarder1;
    // End of variables declaration//GEN-END:variables
}
