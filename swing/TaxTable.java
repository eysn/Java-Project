
package swing;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.*;
//import model.StatusType;
//import model.StatusType;


public class TaxTable extends JTable {
    
    public TaxTable(){
    
       setShowGrid(false); 
    
        setShowHorizontalLines(true);
    //setGridColor(new Color(255,255,255));
    setGridColor(new java.awt.Color(0, 0, 0, 0));
    setRowHeight(40);
    getTableHeader().setReorderingAllowed(false);
    setBackground(Color.WHITE);
        
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
   
    }
    public void addRow(Object[] row){
        DefaultTableModel model = (DefaultTableModel)getModel();
        model.addRow(row);
    
    }
    }
    

