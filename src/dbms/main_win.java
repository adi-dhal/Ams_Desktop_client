/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adityadhall
 */
public class main_win extends javax.swing.JFrame {
    
    
    /**
     * Creates new form main_win
     */
    public main_win() {
        initComponents();
        
        initialiseMain();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddItem = new javax.swing.JButton();
        Display = new javax.swing.JButton();
        Level1Panel = new javax.swing.JPanel();
        SelectOrAddItemTypePanel = new javax.swing.JPanel();
        selectItemType_text = new javax.swing.JLabel();
        selectItemType_box = new javax.swing.JComboBox<>();
        addNewItemType_button = new javax.swing.JButton();
        addNewItemType_text = new javax.swing.JLabel();
        or_text = new javax.swing.JLabel();
        Level2Panel = new javax.swing.JPanel();
        AddItemPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addItemTable = new javax.swing.JTable();
        selectAttr_box = new javax.swing.JComboBox<>();
        attrValue = new javax.swing.JTextField();
        addAttrValue_button = new javax.swing.JButton();
        confirmAddItem_button = new javax.swing.JButton();
        selectAttr_text = new javax.swing.JLabel();
        AddNewItemTypePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        newType = new javax.swing.JTextField();
        attrName_text = new javax.swing.JLabel();
        itemType_text = new javax.swing.JLabel();
        attrName = new javax.swing.JTextField();
        addAttr_button = new javax.swing.JButton();
        confirmAddItemType_button = new javax.swing.JButton();
        DisplayItemTypePanel = new javax.swing.JPanel();
        selectItemType_text_display = new javax.swing.JLabel();
        selectItemType_box_display = new javax.swing.JComboBox<>();
        deleteSelected_button_display = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        TopMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setSize(new java.awt.Dimension(400, 400));

        AddItem.setText("Add Item");
        AddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddItemActionPerformed(evt);
            }
        });

        Display.setText("Display");
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });

        Level1Panel.setLayout(new java.awt.CardLayout());

        selectItemType_text.setText("Select Item Type");

        selectItemType_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectItemType_box.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectItemType_boxItemStateChanged(evt);
            }
        });
        selectItemType_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectItemType_boxActionPerformed(evt);
            }
        });

        addNewItemType_button.setText("Add New Item Type");
        addNewItemType_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewItemType_buttonActionPerformed(evt);
            }
        });

        addNewItemType_text.setText("Add New Item Type First");

        or_text.setText("OR");

        Level2Panel.setLayout(new java.awt.CardLayout());

        addItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        addItemTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        addItemTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(addItemTable);

        selectAttr_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectAttr_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAttr_boxActionPerformed(evt);
            }
        });

        addAttrValue_button.setText("Add");
        addAttrValue_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAttrValue_buttonActionPerformed(evt);
            }
        });

        confirmAddItem_button.setText("Confirm");
        confirmAddItem_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmAddItem_buttonActionPerformed(evt);
            }
        });

        selectAttr_text.setText("Select Attribute");

        javax.swing.GroupLayout AddItemPanelLayout = new javax.swing.GroupLayout(AddItemPanel);
        AddItemPanel.setLayout(AddItemPanelLayout);
        AddItemPanelLayout.setHorizontalGroup(
            AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddItemPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(confirmAddItem_button)
                    .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(selectAttr_text)
                        .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AddItemPanelLayout.createSequentialGroup()
                                .addComponent(selectAttr_box, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(attrValue, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addAttrValue_button)))))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        AddItemPanelLayout.setVerticalGroup(
            AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddItemPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(selectAttr_text, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectAttr_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(attrValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addAttrValue_button))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(confirmAddItem_button)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Level2Panel.add(AddItemPanel, "card3");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        newType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTypeActionPerformed(evt);
            }
        });

        attrName_text.setText("Attribute Name");

        itemType_text.setText("Item Type");

        attrName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attrNameActionPerformed(evt);
            }
        });

        addAttr_button.setText("Add Attribute");

        confirmAddItemType_button.setText("Confirm");

        javax.swing.GroupLayout AddNewItemTypePanelLayout = new javax.swing.GroupLayout(AddNewItemTypePanel);
        AddNewItemTypePanel.setLayout(AddNewItemTypePanelLayout);
        AddNewItemTypePanelLayout.setHorizontalGroup(
            AddNewItemTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddNewItemTypePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddNewItemTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddNewItemTypePanelLayout.createSequentialGroup()
                        .addGroup(AddNewItemTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemType_text)
                            .addComponent(attrName_text))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddNewItemTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddNewItemTypePanelLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(newType, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(attrName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addAttr_button)
                        .addGap(201, 201, 201))
                    .addGroup(AddNewItemTypePanelLayout.createSequentialGroup()
                        .addGroup(AddNewItemTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(confirmAddItemType_button)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        AddNewItemTypePanelLayout.setVerticalGroup(
            AddNewItemTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddNewItemTypePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(AddNewItemTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemType_text)
                    .addComponent(newType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(AddNewItemTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attrName_text)
                    .addComponent(attrName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addAttr_button))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmAddItemType_button)
                .addGap(9, 9, 9))
        );

        Level2Panel.add(AddNewItemTypePanel, "card2");

        javax.swing.GroupLayout SelectOrAddItemTypePanelLayout = new javax.swing.GroupLayout(SelectOrAddItemTypePanel);
        SelectOrAddItemTypePanel.setLayout(SelectOrAddItemTypePanelLayout);
        SelectOrAddItemTypePanelLayout.setHorizontalGroup(
            SelectOrAddItemTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelectOrAddItemTypePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SelectOrAddItemTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectItemType_text, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectItemType_box, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(or_text)
                .addGap(38, 38, 38)
                .addGroup(SelectOrAddItemTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addNewItemType_text)
                    .addComponent(addNewItemType_button))
                .addContainerGap(172, Short.MAX_VALUE))
            .addGroup(SelectOrAddItemTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SelectOrAddItemTypePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Level2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        SelectOrAddItemTypePanelLayout.setVerticalGroup(
            SelectOrAddItemTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelectOrAddItemTypePanelLayout.createSequentialGroup()
                .addGroup(SelectOrAddItemTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SelectOrAddItemTypePanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(SelectOrAddItemTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addNewItemType_text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectItemType_text))
                        .addGap(7, 7, 7)
                        .addGroup(SelectOrAddItemTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectItemType_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addNewItemType_button)))
                    .addGroup(SelectOrAddItemTypePanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(or_text, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(446, Short.MAX_VALUE))
            .addGroup(SelectOrAddItemTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SelectOrAddItemTypePanelLayout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(Level2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        Level1Panel.add(SelectOrAddItemTypePanel, "card2");

        selectItemType_text_display.setText("Select Item Type");

        selectItemType_box_display.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        deleteSelected_button_display.setText("Delete Selected");
        deleteSelected_button_display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSelected_button_displayActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable3.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout DisplayItemTypePanelLayout = new javax.swing.GroupLayout(DisplayItemTypePanel);
        DisplayItemTypePanel.setLayout(DisplayItemTypePanelLayout);
        DisplayItemTypePanelLayout.setHorizontalGroup(
            DisplayItemTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayItemTypePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DisplayItemTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(selectItemType_text_display, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DisplayItemTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane3)
                        .addGroup(DisplayItemTypePanelLayout.createSequentialGroup()
                            .addComponent(selectItemType_box_display, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(87, 87, 87)
                            .addComponent(deleteSelected_button_display))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        DisplayItemTypePanelLayout.setVerticalGroup(
            DisplayItemTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayItemTypePanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(selectItemType_text_display)
                .addGap(22, 22, 22)
                .addGroup(DisplayItemTypePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectItemType_box_display, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteSelected_button_display))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        Level1Panel.add(DisplayItemTypePanel, "card2");

        jMenu1.setText("File");
        TopMenuBar.add(jMenu1);

        jMenu2.setText("Edit");
        TopMenuBar.add(jMenu2);

        setJMenuBar(TopMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Display, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(AddItem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(Level1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Level1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Display)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initialiseMain(){
        //Initialising drop down menus
        String[] itemTypeList = {"Football", "Badminton", "Cricket bat" };
        PopulateItemTypeList( itemTypeList );
        
        //Setting table attributes as per selected item type
        SettingItemTypeListener();
        
        
    }
    
    
    private void AddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddItemActionPerformed
        // TODO add your handling code here:
        
        //remove Level1Panel
        Level1Panel.removeAll();
        Level1Panel.repaint();
        Level1Panel.revalidate();
        
        //adding SelectOrAddItemTypePanel
        Level1Panel.add(SelectOrAddItemTypePanel);
        Level1Panel.repaint();
        Level1Panel.revalidate();
    }//GEN-LAST:event_AddItemActionPerformed

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
        // TODO add your handling code here:
        
        //remove Level1Panel
        Level1Panel.removeAll();
        Level1Panel.repaint();
        Level1Panel.revalidate();
        
        //adding DisplayItemTypePanel
        Level1Panel.add(DisplayItemTypePanel);
        Level1Panel.repaint();
        Level1Panel.revalidate();
    }//GEN-LAST:event_DisplayActionPerformed

    private void deleteSelected_button_displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSelected_button_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteSelected_button_displayActionPerformed

    private void attrNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attrNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_attrNameActionPerformed

    private void newTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newTypeActionPerformed

    private void selectAttr_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAttr_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectAttr_boxActionPerformed

    private void selectItemType_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectItemType_boxActionPerformed
        Level2Panel.removeAll();
        Level2Panel.add( AddItemPanel );
        Level2Panel.repaint();
        Level2Panel.revalidate();
    }//GEN-LAST:event_selectItemType_boxActionPerformed

    private void addAttrValue_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAttrValue_buttonActionPerformed
        int colNo = selectAttr_box.getSelectedIndex();
        
        DefaultTableModel tableModel = (DefaultTableModel) addItemTable.getModel();
        tableModel.setRowCount( 1 );
        tableModel.setValueAt( attrValue.getText().toString(), 0, colNo );
        
        attrValue.setText("");
    }//GEN-LAST:event_addAttrValue_buttonActionPerformed

    private void selectItemType_boxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectItemType_boxItemStateChanged
        
    }//GEN-LAST:event_selectItemType_boxItemStateChanged

    private void confirmAddItem_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmAddItem_buttonActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) addItemTable.getModel();
        
        String titleBar = selectItemType_box.getSelectedItem().toString() + " - Item Added";
        //Use "infoMsg" to send query to add tuple to the table "selectItemType_box.getSelectedItem().toString()"
        String infoMsg = "";
        for( int i = 0; i < tableModel.getColumnCount(); i++ ){
            infoMsg += tableModel.getColumnName( i ).toString() + " = " + tableModel.getValueAt( 0, i ).toString() + "\n";
        }
        JOptionPane.showMessageDialog( null, infoMsg, titleBar, JOptionPane.INFORMATION_MESSAGE );
        tableModel.setColumnCount( 0 );
    }//GEN-LAST:event_confirmAddItem_buttonActionPerformed

    private void addNewItemType_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewItemType_buttonActionPerformed
        Level2Panel.removeAll();
        Level2Panel.repaint();
        Level2Panel.revalidate();
        
        Level2Panel.add( AddNewItemTypePanel );
        Level2Panel.repaint();
        Level2Panel.revalidate();
    }//GEN-LAST:event_addNewItemType_buttonActionPerformed
    
    
    //Handling drop down box
    private void PopulateItemTypeList( String[] itemTypeList ){ 
        selectItemType_box.setModel( new DefaultComboBoxModel( itemTypeList ) );
    }
    
    private void PopulateAttrList( String[] attrList ){ 
        selectAttr_box.setModel( new DefaultComboBoxModel( attrList ) );
    }
    
    //Initiating the columns of the table
    private void InitialiseColumns( String[] attrList ){
        DefaultTableModel tableModel = (DefaultTableModel) addItemTable.getModel();
        tableModel.setColumnCount( 0 );
        
        for( String attr: attrList ){
            tableModel.addColumn( attr );
        }
    }
    
    private void SettingItemTypeListener(){
        selectItemType_box.addActionListener( new ActionListener(){
            public void actionPerformed( ActionEvent event ){
                JComboBox box = (JComboBox) event.getSource();
                Object selected = box.getSelectedItem();
                
                //Use { selected.toString() } to send query to select the selected item type table and retrive its "attrList"
                
                //Uncomment this after database access
//                String[] attrList = { "Company Name", "Size", "Quantity" };
//                PopulateAttrList( attrList );
                
                //For testing without database access
                if( selected.toString().equals( "Football")){
                    String[] attrList = { "Company Name", "Size", "Quantity" };
                    
                    PopulateAttrList( attrList );
                    InitialiseColumns( attrList );
                }
                else{
                    String[] attrList = {"Just", "Checking"};
                    
                    PopulateAttrList( attrList );
                    InitialiseColumns( attrList );
                }
            }
        });
    }
    

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
     
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new main_win().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddItem;
    private javax.swing.JPanel AddItemPanel;
    private javax.swing.JPanel AddNewItemTypePanel;
    private javax.swing.JButton Display;
    private javax.swing.JPanel DisplayItemTypePanel;
    private javax.swing.JPanel Level1Panel;
    private javax.swing.JPanel Level2Panel;
    private javax.swing.JPanel SelectOrAddItemTypePanel;
    private javax.swing.JMenuBar TopMenuBar;
    private javax.swing.JButton addAttrValue_button;
    private javax.swing.JButton addAttr_button;
    private javax.swing.JTable addItemTable;
    private javax.swing.JButton addNewItemType_button;
    private javax.swing.JLabel addNewItemType_text;
    private javax.swing.JTextField attrName;
    private javax.swing.JLabel attrName_text;
    private javax.swing.JTextField attrValue;
    private javax.swing.JButton confirmAddItemType_button;
    private javax.swing.JButton confirmAddItem_button;
    private javax.swing.JButton deleteSelected_button_display;
    private javax.swing.JLabel itemType_text;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField newType;
    private javax.swing.JLabel or_text;
    private javax.swing.JComboBox<String> selectAttr_box;
    private javax.swing.JLabel selectAttr_text;
    private javax.swing.JComboBox<String> selectItemType_box;
    private javax.swing.JComboBox<String> selectItemType_box_display;
    private javax.swing.JLabel selectItemType_text;
    private javax.swing.JLabel selectItemType_text_display;
    // End of variables declaration//GEN-END:variables
}
