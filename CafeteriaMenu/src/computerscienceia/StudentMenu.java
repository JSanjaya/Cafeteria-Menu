/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computerscienceia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author 42752
 */
public class StudentMenu extends javax.swing.JFrame {

    /**
     * Creates new form StudentMenu
     */
    public StudentMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        suTableMonday.setRowHeight(40);
        suTableTuesday.setRowHeight(40);
        suTableWednesday.setRowHeight(40);
        suTableThursday.setRowHeight(40);
        suTableFriday.setRowHeight(40);
        showDataOnTableMonday();
        showDataOnTableTuesday();
        showDataOnTableWednesday();
        showDataOnTableThursday();
        showDataOnTableFriday();

    }
    
private ArrayList<FoodItem> Monday() {
        ArrayList<FoodItem> mondayItems = new ArrayList<>();
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            String url = "jdbc:derby://localhost:1527/ComputerScienceIA;databaseName=COMPUTERSCIENCEIA ";
            Connection conn = DriverManager.getConnection(url);
            String query = "SELECT * FROM APP.MONDAY order by CUISINE asc";
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            FoodItem mon;
            while (rs.next()) {
                mon = new FoodItem(rs.getInt("FOOD_ID"), rs.getString("Cuisine"), rs.getString("Fooditem"),
                        rs.getString("Description"), rs.getDouble("Price"));
                mondayItems.add(mon);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return mondayItems;
    }

    public ArrayList<FoodItem> Tuesday() {
        ArrayList<FoodItem> tuesdayItems = new ArrayList<>();
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            String url = "jdbc:derby://localhost:1527/ComputerScienceIA;databaseName=COMPUTERSCIENCEIA";
            Connection conn = DriverManager.getConnection(url);
            String query = "SELECT * FROM APP.TUESDAY order by CUISINE asc";
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            FoodItem tue;
            while (rs.next()) {
                tue = new FoodItem(rs.getInt("FOOD_ID"), rs.getString("Cuisine"), rs.getString("Fooditem"), rs.getString("Description"),
                        rs.getDouble("Price"));
                tuesdayItems.add(tue);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return tuesdayItems;
    }

    public ArrayList<FoodItem> Wednesday() {
        ArrayList<FoodItem> wednesdayItems = new ArrayList<>();
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            String url = "jdbc:derby://localhost:1527/ComputerScienceIA;databaseName=COMPUTERSCIENCEIA ";
            Connection conn = DriverManager.getConnection(url);
            String query = "SELECT * FROM APP.WEDNESDAY order by CUISINE asc";
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            FoodItem wed;
            while (rs.next()) {
                wed = new FoodItem(rs.getInt("FOOD_ID"), rs.getString("Cuisine"), rs.getString("Fooditem"), rs.getString("Description"),
                        rs.getDouble("Price"));
                wednesdayItems.add(wed);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return wednesdayItems;
    }

    public ArrayList<FoodItem> Thursday() {
        ArrayList<FoodItem> thursdayItems = new ArrayList<>();
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            String url = "jdbc:derby://localhost:1527/ComputerScienceIA;databaseName=COMPUTERSCIENCEIA ";
            Connection conn = DriverManager.getConnection(url);
            String query = "SELECT * FROM APP.THURSDAY order by CUISINE asc";
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            FoodItem thu;
            while (rs.next()) {
               thu = new FoodItem(rs.getInt("FOOD_ID"), rs.getString("Cuisine"), rs.getString("Fooditem"), rs.getString("Description"),
                        rs.getDouble("Price"));
                thursdayItems.add(thu);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return thursdayItems;
    }

    public ArrayList<FoodItem> Friday() {
        ArrayList<FoodItem> fridayItems = new ArrayList<>();
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            String url = "jdbc:derby://localhost:1527/ComputerScienceIA;databaseName=COMPUTERSCIENCEIA ";
            Connection conn = DriverManager.getConnection(url);
            String query = "SELECT * FROM APP.FRIDAY order by CUISINE asc";
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            FoodItem fri;
            while (rs.next()) {
               fri = new FoodItem(rs.getInt("FOOD_ID"), rs.getString("Cuisine"), rs.getString("Fooditem"), rs.getString("Description"),
                        rs.getDouble("Price"));
                fridayItems.add(fri);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return fridayItems;
    }
    public void showDataOnTableFriday() {
        ArrayList<FoodItem> fridayList = Friday();
        DefaultTableModel model = (DefaultTableModel) suTableFriday.getModel();
       
        
        Object[] row = new Object[5];
        for (int i = 0; i < fridayList.size(); i++) {
            row[0] = fridayList.get(i).getFoodID();
            row[1] = fridayList.get(i).getCuisine();
            row[2] = fridayList.get(i).getName();
            row[3] = fridayList.get(i).getDescription();
            row[4] = fridayList.get(i).getPrice();
            model.addRow(row);
           
        }
        
    }
    public void showDataOnTableThursday() {
        ArrayList<FoodItem> thursdayList = Thursday();
        DefaultTableModel model = (DefaultTableModel) suTableThursday.getModel();
       
        
        Object[] row = new Object[5];
        for (int i = 0; i < thursdayList.size(); i++) {
            row[0] = thursdayList.get(i).getFoodID();
            row[1] = thursdayList.get(i).getCuisine();
            row[2] = thursdayList.get(i).getName();
            row[3] = thursdayList.get(i).getDescription();
            row[4] = thursdayList.get(i).getPrice();
            model.addRow(row);
           
        }
        
    }
    public void showDataOnTableWednesday() {
        ArrayList<FoodItem> wednesdayList = Wednesday();
        DefaultTableModel model = (DefaultTableModel) suTableWednesday.getModel();
       
        
        Object[] row = new Object[5];
        for (int i = 0; i < wednesdayList.size(); i++) {
            row[0] = wednesdayList.get(i).getFoodID();
            row[1] = wednesdayList.get(i).getCuisine();
            row[2] = wednesdayList.get(i).getName();
            row[3] = wednesdayList.get(i).getDescription();
            row[4] = wednesdayList.get(i).getPrice();
            model.addRow(row);
           
        }
        
    }
    public void showDataOnTableTuesday() {
        ArrayList<FoodItem> tuesdayList = Tuesday();
        DefaultTableModel model = (DefaultTableModel) suTableTuesday.getModel();
       
        
        Object[] row = new Object[5];
        for (int i = 0; i < tuesdayList.size(); i++) {
            row[0] = tuesdayList.get(i).getFoodID();
            row[1] = tuesdayList.get(i).getCuisine();
            row[2] = tuesdayList.get(i).getName();
            row[3] = tuesdayList.get(i).getDescription();
            row[4] = tuesdayList.get(i).getPrice();
            model.addRow(row);
           
        }
        
    }
    
    public void showDataOnTableMonday() {
        ArrayList<FoodItem> mondayList = Monday();
        DefaultTableModel model = (DefaultTableModel) suTableMonday.getModel();
       
        
        Object[] row = new Object[5];
        for (int i = 0; i < mondayList.size(); i++) {
            row[0] = mondayList.get(i).getFoodID();
            row[1] = mondayList.get(i).getCuisine();
            row[2] = mondayList.get(i).getName();
            row[3] = mondayList.get(i).getDescription();
            row[4] = mondayList.get(i).getPrice();
            model.addRow(row);
           
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        suTabbedPane = new javax.swing.JTabbedPane();
        suPanelMonday = new javax.swing.JPanel();
        suScrollMonday = new javax.swing.JScrollPane();
        suTableMonday = new javax.swing.JTable();
        btnBackStudent1 = new javax.swing.JButton();
        lblDescription1 = new javax.swing.JLabel();
        suPanelTuesday = new javax.swing.JPanel();
        suScrollTuesday = new javax.swing.JScrollPane();
        suTableTuesday = new javax.swing.JTable();
        lblDescription2 = new javax.swing.JLabel();
        btnBackStudent2 = new javax.swing.JButton();
        suPanelWednesday = new javax.swing.JPanel();
        suScrollWednesday = new javax.swing.JScrollPane();
        suTableWednesday = new javax.swing.JTable();
        lblDescription3 = new javax.swing.JLabel();
        btnBackStudent3 = new javax.swing.JButton();
        suPanelThursday = new javax.swing.JPanel();
        suScrollThursday = new javax.swing.JScrollPane();
        suTableThursday = new javax.swing.JTable();
        lblDescription4 = new javax.swing.JLabel();
        btnBackStudent4 = new javax.swing.JButton();
        suPanelFriday = new javax.swing.JPanel();
        suScrollFriday = new javax.swing.JScrollPane();
        suTableFriday = new javax.swing.JTable();
        lblDescription5 = new javax.swing.JLabel();
        btnBackStudent5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        suTableMonday.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food ID", "Cuisine", "Food Item", "Description", "Price (IDR)"
            }
        ));
        suTableMonday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suTableMondayMouseClicked(evt);
            }
        });
        suScrollMonday.setViewportView(suTableMonday);

        btnBackStudent1.setText("Back");
        btnBackStudent1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackStudent1ActionPerformed(evt);
            }
        });

        lblDescription1.setBackground(new java.awt.Color(255, 255, 255));
        lblDescription1.setOpaque(true);

        javax.swing.GroupLayout suPanelMondayLayout = new javax.swing.GroupLayout(suPanelMonday);
        suPanelMonday.setLayout(suPanelMondayLayout);
        suPanelMondayLayout.setHorizontalGroup(
            suPanelMondayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(suPanelMondayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBackStudent1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDescription1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(suScrollMonday)
        );
        suPanelMondayLayout.setVerticalGroup(
            suPanelMondayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suPanelMondayLayout.createSequentialGroup()
                .addComponent(suScrollMonday, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(suPanelMondayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescription1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBackStudent1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)))
        );

        suTabbedPane.addTab("Monday", suPanelMonday);

        suTableTuesday.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food ID", "Cuisine", "Food Item", "Description", "Price (IDR)"
            }
        ));
        suTableTuesday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suTableTuesdayMouseClicked(evt);
            }
        });
        suScrollTuesday.setViewportView(suTableTuesday);

        lblDescription2.setBackground(new java.awt.Color(255, 255, 255));
        lblDescription2.setOpaque(true);

        btnBackStudent2.setText("Back");
        btnBackStudent2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackStudent2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout suPanelTuesdayLayout = new javax.swing.GroupLayout(suPanelTuesday);
        suPanelTuesday.setLayout(suPanelTuesdayLayout);
        suPanelTuesdayLayout.setHorizontalGroup(
            suPanelTuesdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(suScrollTuesday, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
            .addGroup(suPanelTuesdayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBackStudent2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescription2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        suPanelTuesdayLayout.setVerticalGroup(
            suPanelTuesdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suPanelTuesdayLayout.createSequentialGroup()
                .addComponent(suScrollTuesday, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(suPanelTuesdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescription2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBackStudent2, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)))
        );

        suTabbedPane.addTab("Tuesday", suPanelTuesday);

        suTableWednesday.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food ID", "Cuisine", "Food Item", "Description", "Price (IDR)"
            }
        ));
        suTableWednesday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suTableWednesdayMouseClicked(evt);
            }
        });
        suScrollWednesday.setViewportView(suTableWednesday);

        lblDescription3.setBackground(new java.awt.Color(255, 255, 255));
        lblDescription3.setOpaque(true);

        btnBackStudent3.setText("Back");
        btnBackStudent3.setLocation(new java.awt.Point(-32766, -32450));
        btnBackStudent3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackStudent3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout suPanelWednesdayLayout = new javax.swing.GroupLayout(suPanelWednesday);
        suPanelWednesday.setLayout(suPanelWednesdayLayout);
        suPanelWednesdayLayout.setHorizontalGroup(
            suPanelWednesdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(suScrollWednesday, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
            .addGroup(suPanelWednesdayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBackStudent3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescription3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        suPanelWednesdayLayout.setVerticalGroup(
            suPanelWednesdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suPanelWednesdayLayout.createSequentialGroup()
                .addComponent(suScrollWednesday, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(suPanelWednesdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBackStudent3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(lblDescription3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        suTabbedPane.addTab("Wednesday", suPanelWednesday);

        suTableThursday.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food ID", "Cuisine", "Food Item", "Description", "Price (IDR)"
            }
        ));
        suTableThursday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suTableThursdayMouseClicked(evt);
            }
        });
        suScrollThursday.setViewportView(suTableThursday);

        lblDescription4.setBackground(new java.awt.Color(255, 255, 255));
        lblDescription4.setOpaque(true);

        btnBackStudent4.setText("Back");
        btnBackStudent4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackStudent4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout suPanelThursdayLayout = new javax.swing.GroupLayout(suPanelThursday);
        suPanelThursday.setLayout(suPanelThursdayLayout);
        suPanelThursdayLayout.setHorizontalGroup(
            suPanelThursdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(suScrollThursday)
            .addGroup(suPanelThursdayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBackStudent4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescription4, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        suPanelThursdayLayout.setVerticalGroup(
            suPanelThursdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suPanelThursdayLayout.createSequentialGroup()
                .addComponent(suScrollThursday, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(suPanelThursdayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescription4, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(btnBackStudent4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        suTabbedPane.addTab("Thursday", suPanelThursday);

        suTableFriday.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food ID", "Cuisine", "Food Item", "Description", "Price (IDR)"
            }
        ));
        suTableFriday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suTableFridayMouseClicked(evt);
            }
        });
        suScrollFriday.setViewportView(suTableFriday);

        lblDescription5.setBackground(new java.awt.Color(255, 255, 255));
        lblDescription5.setOpaque(true);

        btnBackStudent5.setText("Back");
        btnBackStudent5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackStudent5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout suPanelFridayLayout = new javax.swing.GroupLayout(suPanelFriday);
        suPanelFriday.setLayout(suPanelFridayLayout);
        suPanelFridayLayout.setHorizontalGroup(
            suPanelFridayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(suScrollFriday, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
            .addGroup(suPanelFridayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBackStudent5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescription5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        suPanelFridayLayout.setVerticalGroup(
            suPanelFridayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suPanelFridayLayout.createSequentialGroup()
                .addComponent(suScrollFriday, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(suPanelFridayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBackStudent5, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(lblDescription5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        suTabbedPane.addTab("Friday", suPanelFriday);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(suTabbedPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(suTabbedPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackStudent1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackStudent1ActionPerformed
        // TODO add your handling code here:
       this.setVisible(false);
        WelcomePage we = new WelcomePage();
        we.setVisible(true);
    }//GEN-LAST:event_btnBackStudent1ActionPerformed

    private void suTableMondayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suTableMondayMouseClicked
        // TODO add your handling code here:     
         String tip = null;
                java.awt.Point p = evt.getPoint();
                int rowIndex = suTableMonday.rowAtPoint(p);
                int colIndex = suTableMonday.columnAtPoint(p);

               
                    tip = suTableMonday.getValueAt(rowIndex, colIndex).toString();
               
                lblDescription1.setText(tip);
    }//GEN-LAST:event_suTableMondayMouseClicked

    private void suTableTuesdayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suTableTuesdayMouseClicked
        // TODO add your handling code here:
         String tip = null;
                java.awt.Point p = evt.getPoint();
                int rowIndex = suTableTuesday.rowAtPoint(p);
                int colIndex = suTableTuesday.columnAtPoint(p);

                    tip = suTableTuesday.getValueAt(rowIndex, colIndex).toString();
                lblDescription2.setText(tip);
    }//GEN-LAST:event_suTableTuesdayMouseClicked

    private void suTableWednesdayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suTableWednesdayMouseClicked
        // TODO add your handling code here:
         String tip = null;
                java.awt.Point p = evt.getPoint();
                int rowIndex = suTableWednesday.rowAtPoint(p);
                int colIndex = suTableWednesday.columnAtPoint(p);

               
                    tip = suTableWednesday.getValueAt(rowIndex, colIndex).toString();
               
                lblDescription3.setText(tip);
    }//GEN-LAST:event_suTableWednesdayMouseClicked

    private void suTableThursdayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suTableThursdayMouseClicked
        // TODO add your handling code here:
         String tip = null;
                java.awt.Point p = evt.getPoint();
                int rowIndex = suTableThursday.rowAtPoint(p);
                int colIndex = suTableThursday.columnAtPoint(p);

               
                    tip = suTableThursday.getValueAt(rowIndex, colIndex).toString();
                
                lblDescription4.setText(tip);
    }//GEN-LAST:event_suTableThursdayMouseClicked

    private void suTableFridayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suTableFridayMouseClicked
        // TODO add your handling code here:
         String tip = null;
                java.awt.Point p = evt.getPoint();
                int rowIndex = suTableFriday.rowAtPoint(p);
                int colIndex = suTableFriday.columnAtPoint(p);

               
                    tip = suTableFriday.getValueAt(rowIndex, colIndex).toString();
                
                lblDescription5.setText(tip);
    }//GEN-LAST:event_suTableFridayMouseClicked

    private void btnBackStudent2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackStudent2ActionPerformed
        // TODO add your handling code here:
          this.setVisible(false);
        WelcomePage we = new WelcomePage();
        we.setVisible(true);
    }//GEN-LAST:event_btnBackStudent2ActionPerformed

    private void btnBackStudent3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackStudent3ActionPerformed
        // TODO add your handling code here:
          this.setVisible(false);
        WelcomePage we = new WelcomePage();
        we.setVisible(true);
    }//GEN-LAST:event_btnBackStudent3ActionPerformed

    private void btnBackStudent5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackStudent5ActionPerformed
        // TODO add your handling code here:
          this.setVisible(false);
        WelcomePage we = new WelcomePage();
        we.setVisible(true);
    }//GEN-LAST:event_btnBackStudent5ActionPerformed

    private void btnBackStudent4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackStudent4ActionPerformed
        // TODO add your handling code here:
          this.setVisible(false);
        WelcomePage we = new WelcomePage();
        we.setVisible(true);
    }//GEN-LAST:event_btnBackStudent4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackStudent1;
    private javax.swing.JButton btnBackStudent2;
    private javax.swing.JButton btnBackStudent3;
    private javax.swing.JButton btnBackStudent4;
    private javax.swing.JButton btnBackStudent5;
    private javax.swing.JLabel lblDescription1;
    private javax.swing.JLabel lblDescription2;
    private javax.swing.JLabel lblDescription3;
    private javax.swing.JLabel lblDescription4;
    private javax.swing.JLabel lblDescription5;
    private javax.swing.JPanel suPanelFriday;
    private javax.swing.JPanel suPanelMonday;
    private javax.swing.JPanel suPanelThursday;
    private javax.swing.JPanel suPanelTuesday;
    private javax.swing.JPanel suPanelWednesday;
    private javax.swing.JScrollPane suScrollFriday;
    private javax.swing.JScrollPane suScrollMonday;
    private javax.swing.JScrollPane suScrollThursday;
    private javax.swing.JScrollPane suScrollTuesday;
    private javax.swing.JScrollPane suScrollWednesday;
    private javax.swing.JTabbedPane suTabbedPane;
    private javax.swing.JTable suTableFriday;
    private javax.swing.JTable suTableMonday;
    private javax.swing.JTable suTableThursday;
    private javax.swing.JTable suTableTuesday;
    private javax.swing.JTable suTableWednesday;
    // End of variables declaration//GEN-END:variables
}
