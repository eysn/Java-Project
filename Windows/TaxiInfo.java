//abandoned window -_- might be back or not idk....
package Windows;


public class TaxiInfo extends javax.swing.JFrame {

    
    public TaxiInfo(String Name, String Email, String Gender, String Age, String DateJoined ,String Rating, String Status, String TaxiID ) {
        initComponents();
        setVisible(true);
        
        //userInfo11.setuserinfo(Name, Email, Gender, Age, DateJoined, Rating, Status, TaxiID);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bG1 = new swing.BG();
        userInfo11 = new form.UserInfo1();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setType(java.awt.Window.Type.POPUP);

        userInfo11.setFocusable(false);

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setText("close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bG1Layout = new javax.swing.GroupLayout(bG1);
        bG1.setLayout(bG1Layout);
        bG1Layout.setHorizontalGroup(
            bG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bG1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(userInfo11, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bG1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        bG1Layout.setVerticalGroup(
            bG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bG1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(userInfo11, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.BG bG1;
    private javax.swing.JButton jButton1;
    private form.UserInfo1 userInfo11;
    // End of variables declaration//GEN-END:variables
}
