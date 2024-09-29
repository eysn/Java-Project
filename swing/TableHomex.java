
package swing;



    
import java.awt.Color;
import java.awt.Component;
    import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.StatusType;

public class TableHomex extends JTable {

    private DefaultTableModel model;

    public TableHomex() {
        setShowGrid(false); 
    
        setShowHorizontalLines(true);
    //setGridColor(new Color(255,255,255));
    setGridColor(new java.awt.Color(0, 0, 0, 0));
    setRowHeight(40);
    getTableHeader().setReorderingAllowed(false);
    setBackground(Color.WHITE);
        // Define column names
        String[] columnNames = {"Name", "Email", "Date Joined", "Rating", "Status"};
         getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
     @Override
     public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
    TableHeader header = new TableHeader(value + " ");
    
    if(column==4){
    header.setHorizontalAlignment(JLabel.CENTER);
    }
    return header;
    
     }
    });
    
    setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
        @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
    
        Component com= super.getTableCellRendererComponent(table,value, isSelected, hasFocus, row, column);
        com.setBackground(Color.WHITE);
        setBorder(noFocusBorder);
        if(isSelected){
        com.setForeground(new Color(15,89,140));
        }else{
        com.setForeground(new Color(102,102,102));
        }
        return com;
    
    
}
    });

        // Create table model with column names and no initial data
        model = new DefaultTableModel(columnNames, 0);

        // Set the model to the table
        this.setModel(model);

        // Set table properties
        this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.setRowSelectionAllowed(true);
        this.setColumnSelectionAllowed(false);
        this.getTableHeader().setReorderingAllowed(false);
    }

    // Method to add a row to the table
    public void addRow(String name, String email,String Age, String dateJoined, String rating, String status) {
        model.addRow(new Object[]{name, email, Age, dateJoined, rating, status});
    }
    
}
