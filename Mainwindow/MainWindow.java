
package Mainwindow;

import event.EventMenuSelected;
import form.*;
import java.awt.*;
import javax.swing.JComponent;
import swing.Scrollbar;



public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        //calles the ui render
        initComponents();
        //sets background to transparent
        setBackground(new Color(0, 0, 0, 0));
        //draggable only at the menu side scince there is no title bar 
        menu.initMoving(this);
        //list menu selection-------------------------------------------------------
        menu.addEventMenuSelected(new EventMenuSelected(){
            @Override
            public void selected(int index) {
               switch (index){
                 case 0:
                     setForm(new FormHome());
                     break;
                 case 1:
                     setForm(new FormAnalytics());
                     break;
                 case 3:
                     setForm(new FormVeiwE());
                     break; 
                 case 4:
                     setForm(new FormAddE());
                     break;
                 case 5:
                     setForm(new FormRemoveE());
                     break;
                 case 6:
                     setForm(new FormEditE());
                     break;
                 case 8:
                     setForm(new FormVeiwT());
                     break;
                 case 9:
                     setForm(new FormAddT());
                     break;
                 case 10:
                     setForm(new FormRemoveT());
                     break;
                 case 11:
                     setForm(new FormEditT());
                     break;
                 case 15:
                     //logout option
                     break;
                }
            }
        });
        //end of selection -------------------------------------------------------
        
        //sets the default screen "dashboard"
        setForm(new FormHome());
    }
    //chaging the tabs/windows
   public void setForm(JComponent com){
    Mainpanel.removeAll();
    Mainpanel.add(com);
    Mainpanel.repaint();
    Mainpanel.revalidate();
    
    }
    

   //the Ui part :)-----------------------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBoarder1 = new swing.PanelBoarder();
        menu = new components.Menu();
        header1 = new components.Header();
        Mainpanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setShape(getShape());

        panelBoarder1.setBackground(new java.awt.Color(242, 242, 242));

        Mainpanel.setOpaque(false);
        Mainpanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBoarder1Layout = new javax.swing.GroupLayout(panelBoarder1);
        panelBoarder1.setLayout(panelBoarder1Layout);
        panelBoarder1Layout.setHorizontalGroup(
            panelBoarder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBoarder1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBoarder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
                    .addComponent(Mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelBoarder1Layout.setVerticalGroup(
            panelBoarder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
            .addGroup(panelBoarder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBoarder1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBoarder1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        // some technical stuff generated by the IDE-------------------------------------------------------------------------------
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // end of technical stuff-------------------------------------------------------------------------------------------

//this is the run function        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Mainpanel;
    private components.Header header1;
    private components.Menu menu;
    private swing.PanelBoarder panelBoarder1;
    // End of variables declaration//GEN-END:variables
}
