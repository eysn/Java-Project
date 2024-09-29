
package form;

import Checker.EmailChecker;
import Checker.PhoneNumberChecker;
import Employee.EmployeeSQL;
import verify.UserAdd;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import java.util.HashSet;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import verify.EditEmpp;


public class FormEditE extends javax.swing.JPanel {
private Image backgroundImage;
private String Name, Email, Adress, Phone, Dob, gender, NEmail;
public boolean everythingemail= false;
private boolean everythingphone= false;
 
    public FormEditE() {
       
        initComponents();
         EditEmp.disable();
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

        jDialog1 = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        empEmailSearch1 = new swing.EmpEmailSearch();
        empAdressEdit1 = new swing.EmpAdressEdit();
        empNameEdit1 = new swing.EmpNameEdit();
        empEmailEdit1 = new swing.EmpEmailEdit();
        empDOBEdit1 = new swing.EmpDOBEdit();
        SelectGend = new javax.swing.JComboBox<>();
        EditEmp = new javax.swing.JButton();
        empPhoneEdit1 = new swing.EmpPhoneEdit();
        EmailStatus = new javax.swing.JLabel();
        NewEmailStatus = new javax.swing.JLabel();
        PhoneStatus = new javax.swing.JLabel();
        EditErrr = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(242, 242, 242));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/191.png"))); // NOI18N

        empEmailSearch1.setBackground(new java.awt.Color(204, 204, 204));
        empEmailSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empEmailSearch1ActionPerformed(evt);
            }
        });

        empAdressEdit1.setBackground(new java.awt.Color(204, 204, 204));
        empAdressEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empAdressEdit1ActionPerformed(evt);
            }
        });

        empNameEdit1.setBackground(new java.awt.Color(204, 204, 204));
        empNameEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empNameEdit1ActionPerformed(evt);
            }
        });

        empEmailEdit1.setBackground(new java.awt.Color(204, 204, 204));
        empEmailEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empEmailEdit1ActionPerformed(evt);
            }
        });

        empDOBEdit1.setBackground(new java.awt.Color(204, 204, 204));
        empDOBEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empDOBEdit1ActionPerformed(evt);
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

        EditEmp.setBackground(new java.awt.Color(51, 102, 255));
        EditEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/3.png"))); // NOI18N
        EditEmp.setText("Edit");
        EditEmp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EditEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditEmpActionPerformed(evt);
            }
        });

        empPhoneEdit1.setBackground(new java.awt.Color(204, 204, 204));
        empPhoneEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empPhoneEdit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(empPhoneEdit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(empDOBEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(46, 46, 46)
                            .addComponent(SelectGend, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(empEmailEdit1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                            .addComponent(empEmailSearch1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(empAdressEdit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(empNameEdit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EditEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EditErrr, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EmailStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NewEmailStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(PhoneStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empEmailSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(empNameEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PhoneStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(empPhoneEdit1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(empEmailEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewEmailStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(empAdressEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(empDOBEdit1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SelectGend, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EditEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(EditErrr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void empEmailSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empEmailSearch1ActionPerformed
        // find Email option
        checkEmail();
    }//GEN-LAST:event_empEmailSearch1ActionPerformed

    private void empNameEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empNameEdit1ActionPerformed
        // name textbox
        
    }//GEN-LAST:event_empNameEdit1ActionPerformed

    private void empEmailEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empEmailEdit1ActionPerformed
        // Email box
        
    }//GEN-LAST:event_empEmailEdit1ActionPerformed

    private void empPhoneEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empPhoneEdit1ActionPerformed
        // phone number
        
    }//GEN-LAST:event_empPhoneEdit1ActionPerformed

    private void empAdressEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empAdressEdit1ActionPerformed
        // Adress box
        
    }//GEN-LAST:event_empAdressEdit1ActionPerformed

    private void empDOBEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empDOBEdit1ActionPerformed
        // DOb textbox 
        
    }//GEN-LAST:event_empDOBEdit1ActionPerformed

    private void SelectGendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectGendActionPerformed
        // Gender combobox
         
        int index = SelectGend.getSelectedIndex();
        if (index==0){
           EditEmp.disable();
        
        }else{
        gender = SelectGend.getSelectedItem().toString();
        }
    }//GEN-LAST:event_SelectGendActionPerformed

    private void EditEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditEmpActionPerformed
        // Edit Employee button
        validateForm();
    }//GEN-LAST:event_EditEmpActionPerformed

/////////////////////////////////////////////////////////////////////////////////////////////////////////
// check/search email function
    private void checkEmail() {
        String email = empEmailSearch1.getText().trim();
        if (!isValidEmailFormat(email)) {
            EmailStatus.setText("Invalid email format");
            System.out.println("Inavalid Email number");
            return;
        }
        
        // this fuction calles The functon that checks if the email is open or taken
//--------------------------------------------------------------------------------------------------------------------------------        

  if (EmailChecker.isEmailTaken(email)) {
         
            NewEmailStatus.setText("Email is already taken");
            everythingemail= false;
        }
        else {
            EmailStatus.setText("Email is not found!");
            
        }
    }
    
     private boolean isValidEmailFormat(String email) {
        // Simple regex to check for "-@-.-" format
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return Pattern.matches(emailRegex, email);
    }
     
  ///////////////////////////////////////////////////////////////////////////////////////////////////////
     // check new email function
     public void checkNewEmail() {
    	    String email = empEmailEdit1.getText().trim();
    	    if (!isValidEmailFormat(email)) {
    	        NewEmailStatus.setText("Invalid email format");
    	        System.out.println("Invalid Email format");
    	        everythingemail = false; // Update the flag to indicate email format is invalid
    	    } else {
    	        everythingemail = true; // Update the flag to indicate email format is valid
    	    }
    	
        
        // this fuction calles The functon that checks if the email is open or taken
        
//---------------------------------------------------------------------------------------------------------------------
     if (EmailChecker.isEmailTaken(email)) {
         
            NewEmailStatus.setText("Email is already taken");
            everythingemail= false;
        }
        else {
            NewEmailStatus.setText("Email is available");
            Email= empEmailEdit1.getText();
            everythingemail=true;
            return;
        }
    }

   private boolean isValidNewEmailFormat(String email) {
        // Simple regex to check for "-@-.-" format
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    return Pattern.matches(emailRegex, email);
    }
   /////////////////////////////////////////////////////////////////////////////////////////////////////////
   // check phone number
   private void checkPhoneNumber() {
        String phoneNumber = empPhoneEdit1.getText();
        if (!isValidPhoneNumberFormat(phoneNumber)) {
            PhoneStatus.setText("Invalid phone number format");
            System.out.println("Inavalid phone number");
            return;
        }
        
       // this fuction calles The functon that checks if the email is open or taken
       
//-------------------------------------------------------------------------------------------------------------------------------------------
      if (PhoneNumberChecker.isPhoneNumberTaken(phoneNumber)) {
            PhoneStatus.setText("Phone number is already taken");
            everythingphone=false;
        } 
        
        else {
            PhoneStatus.setText("Phone number is available");
            Phone = empPhoneEdit1.getText();
            everythingphone=true;
        }

    }
   
   
    private boolean isValidPhoneNumberFormat(String phoneNumber) {
        // Check if the phone number is exactly 10 digits
        String phoneRegex = "^\\d{10}$";
        return Pattern.matches(phoneRegex, phoneNumber);
    }
    verify.EditEmpp var = new verify.EditEmpp();
     private void validateForm() {
	    boolean userExists = var.isUserExists(Email);

	    if (!userExists) {
	        EditErrr.setText("User with the provided email does not exist.");
	        return;
	    }

	    if (empEmailEdit1.getText().trim().isEmpty() || empPhoneEdit1.getText().trim().isEmpty() ||
	        empAdressEdit1.getText().trim().isEmpty() || empDOBEdit1.getText().trim().isEmpty()) {
	        EditErrr.setText("Buddy I think You forgot to fill out some boxes");
	    } else if (SelectGend.getSelectedIndex() == 0) {
	        EditErrr.setText("Yeah not checking gender, the gender is tough in 2024");
	    } else {
	        String newEmail = empEmailEdit1.getText();
	        Adress = empAdressEdit1.getText();
	        Name = empNameEdit1.getText();
	        Dob = empDOBEdit1.getText();
	        Phone = empPhoneEdit1.getText();
                
	        checkEmail();
	        boolean isValidEmailFormat = isValidEmailFormat(newEmail);
	        checkNewEmail();
	        checkPhoneNumber();
	        
	        Long phone = null;
	        try {
	            phone = Long.parseLong(Phone);
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid phone number format: " + Phone);
	        }

	        if (phone != null && everythingphone && everythingemail) {
	            EditErrr.setText("Form submitted successfully!");
                    EditEmpp employeeService = new EditEmpp();
                    UserAdd newEmployee = new UserAdd(Name,newEmail,Adress,phone,Dob,gender);
                    
	            
	        }
	    }
	}
    

     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditEmp;
    private javax.swing.JLabel EditErrr;
    private javax.swing.JLabel EmailStatus;
    private javax.swing.JLabel NewEmailStatus;
    private javax.swing.JLabel PhoneStatus;
    private javax.swing.JComboBox<String> SelectGend;
    private swing.EmpAdressEdit empAdressEdit1;
    private swing.EmpDOBEdit empDOBEdit1;
    private swing.EmpEmailEdit empEmailEdit1;
    private swing.EmpEmailSearch empEmailSearch1;
    private swing.EmpNameEdit empNameEdit1;
    private swing.EmpPhoneEdit empPhoneEdit1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
