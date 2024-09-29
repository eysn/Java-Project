
package form;

import Checker.EmailChecker;
import Checker.PhoneNumberChecker;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;




public class FormAddE extends javax.swing.JPanel {
 private Image backgroundImage;
 private String Name, Email, Adress, Phone, Dob, gender;
 private boolean everythingemail= false, everythingphone= false;
    
    public FormAddE() {
        initComponents();
        //checks if bg image is there or not
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
    g.setColor(Color.BLUE);
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
        empName1 = new swing.EmpName();
        empAdress1 = new swing.EmpAdress();
        empDOB2 = new swing.EmpDOB();
        empEmail1 = new swing.EmpEmail();
        AddEmp = new javax.swing.JButton();
        SelectGend = new javax.swing.JComboBox<>();
        empPhone1 = new swing.EmpPhone();
        emailstatus = new javax.swing.JLabel();
        Phonestatus = new javax.swing.JLabel();
        AddError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 242, 242));
        setPreferredSize(new java.awt.Dimension(887, 599));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/075.png"))); // NOI18N

        empName1.setBackground(new java.awt.Color(204, 204, 204));
        empName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empName1ActionPerformed(evt);
            }
        });

        empAdress1.setBackground(new java.awt.Color(204, 204, 204));
        empAdress1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empAdress1ActionPerformed(evt);
            }
        });

        empDOB2.setBackground(new java.awt.Color(204, 204, 204));
        empDOB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empDOB2ActionPerformed(evt);
            }
        });

        empEmail1.setBackground(new java.awt.Color(204, 204, 204));
        empEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empEmail1ActionPerformed(evt);
            }
        });

        AddEmp.setBackground(new java.awt.Color(51, 102, 255));
        AddEmp.setFont(new java.awt.Font("Dyuthi", 2, 12)); // NOI18N
        AddEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/1.png"))); // NOI18N
        AddEmp.setText("Add");
        AddEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmpActionPerformed(evt);
            }
        });

        SelectGend.setBackground(new java.awt.Color(0, 51, 255));
        SelectGend.setForeground(new java.awt.Color(255, 255, 255));
        SelectGend.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select Gender--", "Male", "Female" }));
        SelectGend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectGendActionPerformed(evt);
            }
        });

        empPhone1.setBackground(new java.awt.Color(204, 204, 204));
        empPhone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empPhone1ActionPerformed(evt);
            }
        });

        Phonestatus.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(empPhone1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddError, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(empDOB2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(SelectGend, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(empAdress1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(empEmail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(empName1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Phonestatus, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(empName1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(empPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(empEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(empAdress1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(empDOB2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SelectGend, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AddEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                    .addComponent(AddError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                .addGap(19, 19, 19))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Phonestatus, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //Text boxes and buttones
    private void empName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empName1ActionPerformed
        ////name text box
        
    }//GEN-LAST:event_empName1ActionPerformed

    private void empAdress1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empAdress1ActionPerformed
        //adress text box
        
    }//GEN-LAST:event_empAdress1ActionPerformed

    private void AddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmpActionPerformed
        //Add button Action
        validateForm();
        
    }//GEN-LAST:event_AddEmpActionPerformed

    private void empPhone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empPhone1ActionPerformed
        //phone text box
        
        
        
    }//GEN-LAST:event_empPhone1ActionPerformed

    private void empEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empEmail1ActionPerformed
        //Email textbox
        
    }//GEN-LAST:event_empEmail1ActionPerformed

    private void empDOB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empDOB2ActionPerformed
        // DOB textbox
        
    }//GEN-LAST:event_empDOB2ActionPerformed

    private void SelectGendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectGendActionPerformed
        // gender combobox
        
        int index = SelectGend.getSelectedIndex();
        if (index==0){
           AddEmp.disable();
        
        }else{
        gender = SelectGend.getSelectedItem().toString();
        }
    }//GEN-LAST:event_SelectGendActionPerformed
 
   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   // Email checking
    
    
    
    private void checkEmail() {
        String email = empEmail1.getText();
        if (!isValidEmailFormat(email)) {
            emailstatus.setText("Invalid email format");
            System.out.println("Inavalid Email number");
            everythingemail= false;
            return;
        }
        
        // this fuction calles The functon that checks if the email is open or taken
//----------------------------------------------------------------------------------------------------------------------------------
        
if (EmailChecker.isEmailTaken(email)) {
         
            emailstatus.setText("Email is already taken");
            everythingemail= false;
        }
        else {
            emailstatus.setText("Email is available");
            everythingemail=true;
            Email= empEmail1.getText();
            return;
        }
    }

   private boolean isValidEmailFormat(String email) {
        // Simple regex to check for "-@-.-" format
        String emailRegex = "^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$";
        return Pattern.matches(emailRegex, email);
    }
   
   //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   // Phone Checking 
    
 private void checkPhoneNumber() {
        String phoneNumber = empPhone1.getText();
        if (!isValidPhoneNumberFormat(phoneNumber)) {
            Phonestatus.setText("Invalid phone number format");
            System.out.println("Inavalid phone number");
            everythingphone=false;
            
            return;
        }
        
       // this fuction calles The functon that checks if the email is open or taken

     if (PhoneNumberChecker.isPhoneNumberTaken(phoneNumber)) {
            Phonestatus.setText("Phone number is already taken");
            everythingphone=false;
        } 
        
        else {
            everythingphone=true;
            Phonestatus.setText("Phone number is available");
            Phone = empPhone1.getText();
            
        }

    }


    private boolean isValidPhoneNumberFormat(String phoneNumber) {
        // Check if the phone number is exactly 10 digits
        String phoneRegex = "^\\d{10}$";
        return Pattern.matches(phoneRegex, phoneNumber);
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //add button verification
    private void validateForm() {
        if (empEmail1.getText().trim().isEmpty() || empPhone1.getText().trim().isEmpty()||empAdress1.getText().trim().isEmpty()||empDOB2.getText().trim().isEmpty()) {
            AddError.setText("Buddy I think You forgot to fillout some boxes");
        } else if (SelectGend.getSelectedIndex() == 0) {
            AddError.setText("Yeah not checking gender the gender is tough in 2024");
        } else {
            
            Adress=empAdress1.getText();
            Name=empName1.getText();
            Dob =  empDOB2.getText();
            Phone = empPhone1.getText();
            System.out.print(Phone);
            checkEmail();
            checkPhoneNumber();
            if(everythingphone&&everythingemail){
            AddError.setText("Form submitted successfully!");
            }
        }
    }
    
    

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEmp;
    private javax.swing.JLabel AddError;
    private javax.swing.JLabel Phonestatus;
    private javax.swing.JComboBox<String> SelectGend;
    private javax.swing.JLabel emailstatus;
    private swing.EmpAdress empAdress1;
    private swing.EmpDOB empDOB2;
    private swing.EmpEmail empEmail1;
    private swing.EmpName empName1;
    private swing.EmpPhone empPhone1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
