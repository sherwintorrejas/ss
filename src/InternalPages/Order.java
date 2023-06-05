/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InternalPages;

import MainPackage.OrderFrame;
import config.DBconnector;
import java.awt.Color;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Rhai
 */
public class Order extends javax.swing.JInternalFrame {

    /**
     * Creates new form Customer
     */
    public Order() {
        initComponents();
        displayData();
        
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
    }
    
    
    public void displayData(){
        try{
            DBconnector dbc = new DBconnector();
            ResultSet rs = dbc.getData("SELECT order_id, customer_id, order_date, total_amount FROM tbl_order");
            order_tbl.setModel(DbUtils.resultSetToTableModel(rs));
            DefaultTableModel model = (DefaultTableModel) order_tbl.getModel();
            String[] columnIdentifiers = {"Order ID", "Customer ID", "Order Date", "Total Amount"};
            model.setColumnIdentifiers(columnIdentifiers);
            
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        
        }
    }
    
    public void searchTable(){
       DefaultTableModel model =  (DefaultTableModel)order_tbl.getModel();
       TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
       order_tbl.setRowSorter(tr);
       tr.setRowFilter(RowFilter.regexFilter(search_inp.getText().trim()));
    }
    
    Color hovbtn = new Color(69,60,240);
    Color defbtn = new Color(126,120,240);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG_pnl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        order_tbl = new javax.swing.JTable();
        add_btn = new javax.swing.JPanel();
        add_lbl = new javax.swing.JLabel();
        edit_btn = new javax.swing.JPanel();
        edit_lbl = new javax.swing.JLabel();
        delete_btn = new javax.swing.JPanel();
        del_lbl = new javax.swing.JLabel();
        refresh_btn = new javax.swing.JPanel();
        ref_lbl = new javax.swing.JLabel();
        search_inp = new javax.swing.JTextField();
        search_btn = new javax.swing.JPanel();
        search_lbl = new javax.swing.JLabel();
        print_btn = new javax.swing.JPanel();
        print_lbl = new javax.swing.JLabel();

        BG_pnl.setBackground(new java.awt.Color(204, 202, 240));
        BG_pnl.setPreferredSize(new java.awt.Dimension(850, 500));
        BG_pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(order_tbl);

        BG_pnl.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 790, 360));

        add_btn.setBackground(new java.awt.Color(126, 120, 240));
        add_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add_btn.setPreferredSize(new java.awt.Dimension(100, 35));
        add_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_btnMouseExited(evt);
            }
        });

        add_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add_lbl.setText("ADD");

        javax.swing.GroupLayout add_btnLayout = new javax.swing.GroupLayout(add_btn);
        add_btn.setLayout(add_btnLayout);
        add_btnLayout.setHorizontalGroup(
            add_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(add_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
        );
        add_btnLayout.setVerticalGroup(
            add_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(add_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BG_pnl.add(add_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        edit_btn.setBackground(new java.awt.Color(126, 120, 240));
        edit_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        edit_btn.setPreferredSize(new java.awt.Dimension(100, 35));
        edit_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                edit_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                edit_btnMouseExited(evt);
            }
        });

        edit_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        edit_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit_lbl.setText("EDIT");

        javax.swing.GroupLayout edit_btnLayout = new javax.swing.GroupLayout(edit_btn);
        edit_btn.setLayout(edit_btnLayout);
        edit_btnLayout.setHorizontalGroup(
            edit_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(edit_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
        );
        edit_btnLayout.setVerticalGroup(
            edit_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(edit_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BG_pnl.add(edit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        delete_btn.setBackground(new java.awt.Color(126, 120, 240));
        delete_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        delete_btn.setPreferredSize(new java.awt.Dimension(100, 35));
        delete_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delete_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delete_btnMouseExited(evt);
            }
        });

        del_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        del_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        del_lbl.setText("DELETE");

        javax.swing.GroupLayout delete_btnLayout = new javax.swing.GroupLayout(delete_btn);
        delete_btn.setLayout(delete_btnLayout);
        delete_btnLayout.setHorizontalGroup(
            delete_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(del_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
        );
        delete_btnLayout.setVerticalGroup(
            delete_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(del_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BG_pnl.add(delete_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        refresh_btn.setBackground(new java.awt.Color(126, 120, 240));
        refresh_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        refresh_btn.setPreferredSize(new java.awt.Dimension(100, 35));
        refresh_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refresh_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refresh_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refresh_btnMouseExited(evt);
            }
        });

        ref_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ref_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ref_lbl.setText("REFRESH");

        javax.swing.GroupLayout refresh_btnLayout = new javax.swing.GroupLayout(refresh_btn);
        refresh_btn.setLayout(refresh_btnLayout);
        refresh_btnLayout.setHorizontalGroup(
            refresh_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ref_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
        );
        refresh_btnLayout.setVerticalGroup(
            refresh_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ref_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        BG_pnl.add(refresh_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        search_inp.setBackground(new java.awt.Color(204, 202, 240));
        search_inp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search_inp.setPreferredSize(new java.awt.Dimension(200, 35));
        BG_pnl.add(search_inp, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, -1, -1));

        search_btn.setBackground(new java.awt.Color(126, 120, 240));
        search_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search_btn.setPreferredSize(new java.awt.Dimension(35, 35));
        search_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                search_btnMouseExited(evt);
            }
        });

        search_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search_lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        search_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagePackage/search.png"))); // NOI18N

        javax.swing.GroupLayout search_btnLayout = new javax.swing.GroupLayout(search_btn);
        search_btn.setLayout(search_btnLayout);
        search_btnLayout.setHorizontalGroup(
            search_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(search_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        search_btnLayout.setVerticalGroup(
            search_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(search_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BG_pnl.add(search_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 80, -1, -1));

        print_btn.setBackground(new java.awt.Color(126, 120, 240));
        print_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        print_btn.setPreferredSize(new java.awt.Dimension(100, 35));
        print_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                print_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                print_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                print_btnMouseExited(evt);
            }
        });

        print_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        print_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        print_lbl.setText("PRINT");

        javax.swing.GroupLayout print_btnLayout = new javax.swing.GroupLayout(print_btn);
        print_btn.setLayout(print_btnLayout);
        print_btnLayout.setHorizontalGroup(
            print_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, print_btnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(print_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        print_btnLayout.setVerticalGroup(
            print_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, print_btnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(print_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BG_pnl.add(print_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BG_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BG_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void add_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_btnMouseClicked
        JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        mainFrame.dispose();
        OrderFrame order = new OrderFrame();
        order.setVisible(true);
        
        order.action = "Add";
        order.action_lbl.setText("SAVE");
    }//GEN-LAST:event_add_btnMouseClicked

    private void edit_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_btnMouseClicked
        int rowIndex = order_tbl.getSelectedRow();
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please Select an Item!");
        }else{
            TableModel model = order_tbl.getModel();
            
            OrderFrame order = new OrderFrame();
            order.orderid_inp.setText(""+model.getValueAt(rowIndex, 0));
            String oid = model.getValueAt(rowIndex, 0).toString();
            try{
            DBconnector dbc = new DBconnector();
            ResultSet rs = dbc.getData("SELECT * FROM tbl_order WHERE order_id = '"+oid+"' ");
            if(rs.next()){
            order.custidf_inp.setText(rs.getString("customer_id"));
            order.orderdate_inp.setText(rs.getString("order_date"));
            order.ordertotal_inp.setText(rs.getString("total_amount"));
            
            order.setVisible(true);
            order.action = "Update";
            order.action_lbl.setText("UPDATE");
            JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            mainFrame.dispose();
            }else{
                System.out.println("No Data Found");
            }
            }catch(SQLException w){
                System.out.println(""+w);
            }
        }
    }//GEN-LAST:event_edit_btnMouseClicked

    
    
    private void delete_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_btnMouseClicked
        int rowIndex = order_tbl.getSelectedRow();
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please select data first from the table!");
        }else{
            TableModel model = order_tbl.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
            int a = JOptionPane.showConfirmDialog(null, "Are you sure to delete ID: "+id);
            if(a == JOptionPane.YES_OPTION){
                DBconnector dbc = new DBconnector();
                int order_id = Integer.parseInt(id);
                dbc.deleteData(order_id, "tbl_order", "order_id");
                displayData();
            }
        }
    }//GEN-LAST:event_delete_btnMouseClicked

    private void refresh_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh_btnMouseClicked
        displayData();
    }//GEN-LAST:event_refresh_btnMouseClicked

    private void add_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_btnMouseEntered
        add_btn.setBackground(hovbtn);
    }//GEN-LAST:event_add_btnMouseEntered

    private void edit_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_btnMouseEntered
        edit_btn.setBackground(hovbtn);
    }//GEN-LAST:event_edit_btnMouseEntered

    private void delete_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_btnMouseEntered
        delete_btn.setBackground(hovbtn);
    }//GEN-LAST:event_delete_btnMouseEntered

    private void refresh_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh_btnMouseEntered
        refresh_btn.setBackground(hovbtn);
    }//GEN-LAST:event_refresh_btnMouseEntered

    private void add_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_btnMouseExited
        add_btn.setBackground(defbtn);
    }//GEN-LAST:event_add_btnMouseExited

    private void edit_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_btnMouseExited
        edit_btn.setBackground(defbtn);
    }//GEN-LAST:event_edit_btnMouseExited

    private void delete_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete_btnMouseExited
        delete_btn.setBackground(defbtn);
    }//GEN-LAST:event_delete_btnMouseExited

    private void refresh_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh_btnMouseExited
        refresh_btn.setBackground(defbtn);
    }//GEN-LAST:event_refresh_btnMouseExited

    private void search_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btnMouseClicked
        searchTable();
    }//GEN-LAST:event_search_btnMouseClicked

    private void search_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btnMouseEntered
        search_btn.setBackground(hovbtn);
    }//GEN-LAST:event_search_btnMouseEntered

    private void search_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btnMouseExited
        search_btn.setBackground(defbtn);
    }//GEN-LAST:event_search_btnMouseExited

    private void print_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_print_btnMouseClicked
        MessageFormat header = new MessageFormat("AppRhai's Product Management System");
        MessageFormat footer = new MessageFormat("Product Management System Output");
        try{
            order_tbl.print(JTable.PrintMode.FIT_WIDTH, header, footer);          
        }catch(PrinterException e){
            JOptionPane.showMessageDialog(null,"Cannot be Print!"+e.getMessage());
        }
    }//GEN-LAST:event_print_btnMouseClicked

    private void print_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_print_btnMouseEntered
        print_btn.setBackground(hovbtn);
    }//GEN-LAST:event_print_btnMouseEntered

    private void print_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_print_btnMouseExited
        print_btn.setBackground(defbtn);
    }//GEN-LAST:event_print_btnMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG_pnl;
    private javax.swing.JPanel add_btn;
    private javax.swing.JLabel add_lbl;
    private javax.swing.JLabel del_lbl;
    private javax.swing.JPanel delete_btn;
    private javax.swing.JPanel edit_btn;
    private javax.swing.JLabel edit_lbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable order_tbl;
    private javax.swing.JPanel print_btn;
    private javax.swing.JLabel print_lbl;
    private javax.swing.JLabel ref_lbl;
    private javax.swing.JPanel refresh_btn;
    private javax.swing.JPanel search_btn;
    private javax.swing.JTextField search_inp;
    private javax.swing.JLabel search_lbl;
    // End of variables declaration//GEN-END:variables
}
