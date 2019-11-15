/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grothagar;

import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Tipu
 */
public class SearchMb extends javax.swing.JFrame {

    /**
     * Creates new form SearchMb
     */
    public SearchMb() {
        initComponents();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lib_logo = new javax.swing.JLabel();
        lib_heading = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        srckey = new javax.swing.JTextField();
        opt = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        home_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        alltable = new javax.swing.JTable();
        searchbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search Option");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        lib_logo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lib_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/liicon.png"))); // NOI18N
        lib_logo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lib_heading.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lib_heading.setForeground(new java.awt.Color(102, 102, 255));
        lib_heading.setText("Library Management ");
        lib_heading.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lib_logo)
                .addGap(18, 18, 18)
                .addComponent(lib_heading)
                .addGap(367, 367, 367))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lib_logo)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lib_heading, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Search key: ");

        srckey.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        opt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        opt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Book", "Member" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Choose Option:");

        home_btn.setBackground(new java.awt.Color(255, 204, 255));
        home_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hom.png"))); // NOI18N
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });

        alltable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(alltable);

        searchbtn.setBackground(new java.awt.Color(255, 204, 255));
        searchbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/src2.png"))); // NOI18N
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(home_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(srckey, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(opt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 948, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(srckey, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(opt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(home_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1006, 663));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Home ob=new Home();
        ob.setVisible(true);
    }//GEN-LAST:event_home_btnActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
        //Search option
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        String key = srckey.getText();
        String option = opt.getSelectedItem().toString();
        if("".equals(key)){
            JOptionPane.showMessageDialog(null,"Field must not be empty","Warning",JOptionPane.WARNING_MESSAGE);
        }else{
            try{
            con = Db.getConnection();
            if(option == "Book"){
                 String sql= "SELECT * FROM books WHERE Book_ID LIKE ? OR Book_Name LIKE ? order by Book_ID";
                 pst = con.prepareStatement(sql);
                 pst.setString(1,"%"+key+"%");
                 pst.setString(2,"%"+key+"%");
                 rs = pst.executeQuery();
                 alltable.setModel(DbUtils.resultSetToTableModel(rs));

                alltable.setAutoResizeMode(alltable.AUTO_RESIZE_LAST_COLUMN);
                alltable.setRowHeight(30);
                alltable.getColumnModel().getColumn(0).setMaxWidth(50);
                alltable.getColumnModel().getColumn(2).setMinWidth(160);
                alltable.getColumnModel().getColumn(3).setMinWidth(100);
                alltable.getColumnModel().getColumn(4).setMinWidth(120);
                alltable.getColumnModel().getColumn(5).setMinWidth(130);
                 
            }else{
                String sql= "SELECT * FROM member WHERE Student_ID LIKE ? OR Name LIKE ? order by Student_ID";
                 pst = con.prepareStatement(sql);
                 pst.setString(1,"%"+key+"%");
                 pst.setString(2,"%"+key+"%");
                 rs = pst.executeQuery();
                 alltable.setModel(DbUtils.resultSetToTableModel(rs));
                 alltable.setAutoResizeMode(alltable.AUTO_RESIZE_LAST_COLUMN);
                 alltable.setRowHeight(30);
                 alltable.getColumnModel().getColumn(3).setMinWidth(160);
                
            }
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }finally{
                try{
                    pst.close();
                    rs.close();
                    con.close();
                }catch(Exception ee){
                    JOptionPane.showMessageDialog(null,"Connection error","Warning",JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_searchbtnActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable alltable;
    private javax.swing.JButton home_btn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lib_heading;
    private javax.swing.JLabel lib_logo;
    private javax.swing.JComboBox<String> opt;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField srckey;
    // End of variables declaration//GEN-END:variables
}