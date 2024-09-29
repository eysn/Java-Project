package components;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class Header extends javax.swing.JPanel {
     private JPopupMenu suggestionPopup;

    private JPanel resultPanel; // Panel to display search results

    public Header() {
        initComponents();
        setOpaque(false);
        initCustomComponents();
          suggestionPopup = new JPopupMenu();
        suggestionPopup.setFocusable(false);
        
          searchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                showSuggestions(searchField.getText(), searchField);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                showSuggestions(searchField.getText(), searchField);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                showSuggestions(searchField.getText(), searchField);
            }
        });
        
    }
    
    private void showSuggestions(String text, JTextField searchField) {
        // Example suggestion data
        String[] suggestions = {"Java", "Java Swing", "JavaFX", "JavaScript", "JQuery"};
        
        // Filter suggestions based on the input text
        DefaultListModel<String> filteredSuggestions = new DefaultListModel<>();
        for (String suggestion : suggestions) {
            if (suggestion.toLowerCase().contains(text.toLowerCase())) {
                filteredSuggestions.addElement(suggestion);
            }
        }

        // Create a JList to display the suggestions
        JList<String> suggestionList = new JList<>(filteredSuggestions);
        suggestionList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add a mouse listener to handle clicks on suggestions
        suggestionList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String selectedValue = suggestionList.getSelectedValue();
                searchField.setText(selectedValue);
                suggestionPopup.setVisible(false);
            }
        });

        // Update and show the popup
        suggestionPopup.removeAll();
        suggestionPopup.add(new JScrollPane(suggestionList));

        if (!filteredSuggestions.isEmpty()) {
            suggestionPopup.show(searchField, 0, searchField.getHeight());
        } else {
            suggestionPopup.setVisible(false);
        }
    }

     

    

    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Main window">//GEN-BEGIN:initComponents
    private void initComponents() {
        

        SearchLablebutton = new javax.swing.JLabel();
        searchField = new swing.SearchText();
        MenuSort = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        SearchLablebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N

        MenuSort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu.png"))); // NOI18N
        MenuSort.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(SearchLablebutton)
                .addGap(0, 0, 0)
                .addComponent(searchField, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(MenuSort))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SearchLablebutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MenuSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(searchField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }
// </editor-fold>//GEN-END:initComponents
    private void initCustomComponents() {
        // Add action listener to the search button
        SearchLablebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                performSearch();
            }
        });

        // Add action listener to the sort menu button
        MenuSort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showSortMenu(evt);
            }
        });
    }

    private void performSearch() {
        String searchText = searchField.getText().trim();

       
        if (!searchText.isEmpty()) {
            if (resultPanel != null) {
                remove(resultPanel); // Remove existing results panel if any
            }

         
    }}

    private void showSortMenu(java.awt.event.MouseEvent evt) {
        JPopupMenu sortMenu = new JPopupMenu();

        JMenuItem sortByName = new JMenuItem("Sort by Name");
        sortByName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement sorting by name logic
                JOptionPane.showMessageDialog(null, "Sorted by Name!");
            }
        });

        JMenuItem sortByDate = new JMenuItem("Sort by Date");
        sortByDate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement sorting by date logic
                JOptionPane.showMessageDialog(null, "Sorted by Date!");
            }
        });

        sortMenu.add(sortByName);
        sortMenu.add(sortByDate);

        sortMenu.show(evt.getComponent(), evt.getX(), evt.getY());
    }
    // graphics component like for roundness and stuff------------------------------------- 
    @Override
    protected void paintComponent(Graphics grphcs){
        Graphics2D g2=(Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
        g2.fillRect(0, 0, 25, getHeight());
        g2.fillRect(getWidth()-25, getHeight()-25, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }
    //end of block ----------------------------------

    // Variables declaration - do not modify                     
    private javax.swing.JLabel MenuSort;
    private javax.swing.JLabel SearchLablebutton;
    private swing.SearchText searchField;
    // End of variables declaration                   
}

