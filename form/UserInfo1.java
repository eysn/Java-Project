
package form;

import Windows.EmployeeInfo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.net.URL;
import javax.swing.ImageIcon;


public class UserInfo1 extends javax.swing.JPanel {
private Image backgroundImage;
private String Name, Email, Phone, Gender, Age, DateJoined , Rating, Status, TaxiID;
  
    public UserInfo1() {
        
        initComponents();
        
      setOpaque(false);
        
    }
    public void setuserinfo(String Name, String Email,String Phone, String Gender, String Age, String DateJoined ,String Rating, String Status, String TaxiID ){
        
    this.Name= Name;
    this.Email=Email;
    this.Phone=Phone;
    this.Gender=Gender;
    this.Age=Age;
    this.DateJoined=DateJoined;
    this.Rating=Rating;
    this.Status=Status;
    this.TaxiID=TaxiID;
        advanceduserinfo();
        
    }
@Override
    protected void paintComponent(Graphics grphcs){
        Graphics2D g2=(Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //g2.setColor(getBackground());
        g2.setColor(new Color(255, 255, 255, 128));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
        super.paintComponents(grphcs);
        
    }
   private void advanceduserinfo(){
       System.out.println(Name);
   Namelabel.setText(Name);
   EmailLable.setText(Email);
   PhoneLable.setText(Phone);
   GenderLable.setText(Gender);
   AgeLable.setText(Age);
   DateJoindLable.setText(DateJoined);
   RatingLable.setText(Rating);
   StatusLable.setText(Status);
   TaxiIdlable.setText(TaxiID);
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LabNam = new javax.swing.JLabel();
        LabNam1 = new javax.swing.JLabel();
        LabNam2 = new javax.swing.JLabel();
        LabNam3 = new javax.swing.JLabel();
        LabNam4 = new javax.swing.JLabel();
        LabNam5 = new javax.swing.JLabel();
        LabNam6 = new javax.swing.JLabel();
        LabNam7 = new javax.swing.JLabel();
        EmailLable = new javax.swing.JLabel();
        Namelabel = new javax.swing.JLabel();
        PhoneLable = new javax.swing.JLabel();
        RatingLable = new javax.swing.JLabel();
        StatusLable = new javax.swing.JLabel();
        AgeLable = new javax.swing.JLabel();
        DateJoindLable = new javax.swing.JLabel();
        TaxiIdlable = new javax.swing.JLabel();
        LabNam8 = new javax.swing.JLabel();
        GenderLable = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/337.png"))); // NOI18N

        LabNam.setFont(new java.awt.Font("Lato Hairline", 1, 18)); // NOI18N
        LabNam.setText("Name:");

        LabNam1.setFont(new java.awt.Font("Lato Hairline", 1, 18)); // NOI18N
        LabNam1.setText("Email:");

        LabNam2.setFont(new java.awt.Font("Lato Hairline", 1, 18)); // NOI18N
        LabNam2.setText("Phone:");

        LabNam3.setFont(new java.awt.Font("Lato Hairline", 1, 18)); // NOI18N
        LabNam3.setText("Age:");

        LabNam4.setFont(new java.awt.Font("Lato Hairline", 1, 18)); // NOI18N
        LabNam4.setText("Date Joined : ");

        LabNam5.setFont(new java.awt.Font("Lato Hairline", 1, 18)); // NOI18N
        LabNam5.setText("Rating:");

        LabNam6.setFont(new java.awt.Font("Lato Hairline", 1, 18)); // NOI18N
        LabNam6.setText("Taxi  ID: ");

        LabNam7.setFont(new java.awt.Font("Lato Hairline", 1, 18)); // NOI18N
        LabNam7.setText("Status:");

        EmailLable.setFont(new java.awt.Font("Lato Hairline", 1, 18)); // NOI18N

        Namelabel.setFont(new java.awt.Font("Lato Hairline", 1, 18)); // NOI18N

        PhoneLable.setFont(new java.awt.Font("Lato Hairline", 1, 18)); // NOI18N

        RatingLable.setFont(new java.awt.Font("Lato Hairline", 1, 18)); // NOI18N

        StatusLable.setFont(new java.awt.Font("Lato Hairline", 1, 18)); // NOI18N

        AgeLable.setFont(new java.awt.Font("Lato Hairline", 1, 18)); // NOI18N

        DateJoindLable.setFont(new java.awt.Font("Lato Hairline", 1, 18)); // NOI18N

        TaxiIdlable.setFont(new java.awt.Font("Lato Hairline", 1, 18)); // NOI18N

        LabNam8.setFont(new java.awt.Font("Lato Hairline", 1, 18)); // NOI18N
        LabNam8.setText("Gender:");

        GenderLable.setFont(new java.awt.Font("Lato Hairline", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(AgeLable, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(RatingLable, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(GenderLable, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LabNam3)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(LabNam4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(DateJoindLable, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(LabNam8))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(65, 65, 65)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(LabNam7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(StatusLable, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(LabNam5))
                                    .addGap(86, 86, 86))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LabNam6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TaxiIdlable, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(93, 93, 93)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(LabNam2)
                                .addComponent(LabNam1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LabNam, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(EmailLable, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Namelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PhoneLable, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(60, 60, 60)))
                    .addGap(73, 73, 73)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(345, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RatingLable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgeLable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(GenderLable, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(98, 98, 98)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(114, 114, 114)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LabNam)
                                .addComponent(Namelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LabNam1)
                                .addComponent(EmailLable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(LabNam2)
                                .addComponent(PhoneLable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(StatusLable, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LabNam3)
                                .addComponent(LabNam5))
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(LabNam7)
                                .addComponent(LabNam8))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LabNam4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(DateJoindLable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabNam6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TaxiIdlable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(98, 98, 98)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLable;
    private javax.swing.JLabel DateJoindLable;
    private javax.swing.JLabel EmailLable;
    private javax.swing.JLabel GenderLable;
    private javax.swing.JLabel LabNam;
    private javax.swing.JLabel LabNam1;
    private javax.swing.JLabel LabNam2;
    private javax.swing.JLabel LabNam3;
    private javax.swing.JLabel LabNam4;
    private javax.swing.JLabel LabNam5;
    private javax.swing.JLabel LabNam6;
    private javax.swing.JLabel LabNam7;
    private javax.swing.JLabel LabNam8;
    private javax.swing.JLabel Namelabel;
    private javax.swing.JLabel PhoneLable;
    private javax.swing.JLabel RatingLable;
    private javax.swing.JLabel StatusLable;
    private javax.swing.JLabel TaxiIdlable;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
