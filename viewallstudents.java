package gui;

import static db_files.dbconnect.showtwelfth;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class viewallstudents extends javax.swing.JFrame {

    public viewallstudents() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        sn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("ENTER STUDENT'S NAME:");

        sn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snActionPerformed(evt);
            }
        });
        sn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                snKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                snKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("STUDENT'S PERSONAL DETAILS :");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SID", "PROGRAM", "STREAM", "NAME", "GENDER", "DOB", "ADDRESS", "EMAIL ID", "MOBILE NO."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("STUDENT'S ACADEMIC DETAILS");

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STANDARD", "SID", "NAME", "ROLL NUMBER", "YEAR OF PASSING", "MARKS OBTAINED", "% / CGPA", "BOARD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table2.setColumnSelectionAllowed(true);
        jScrollPane4.setViewportView(table2);
        table2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(sn, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel11)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                            .addComponent(jScrollPane4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void snActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snActionPerformed

    private void snKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_snKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_snKeyPressed

    private void snKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_snKeyReleased
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)table1.getModel();
        try{
            int rc = dtm.getRowCount();
            while(rc--!=0){
                dtm.removeRow(0);
            }
            String n = sn.getText();
            db_files.dbconnect.getStudents.setString(1, "%"+n+"%");
            ResultSet rs = db_files.dbconnect.getStudents.executeQuery();
            while(rs.next()){
                java.util.Vector r = new java.util.Vector();
                r.add(rs.getInt(1));
                r.add(rs.getString(2));
                r.add(rs.getString(3));
                r.add(rs.getString(4));
                r.add(rs.getString(5));
                r.add(rs.getDate(6));
                r.add(rs.getString(7));
                r.add(rs.getString(8));
                r.add(rs.getString(9));

                dtm.addRow(r);
            }
        }catch(Exception ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_snKeyReleased

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        int ri = table1.getSelectedRow();
        if(ri!=-1){
            int tenth = 10;
            int twelfth = 12;
            int id = (Integer)table1.getValueAt(ri,0);
            String sname = (String)table1.getValueAt(ri,3);
            javax.swing.table.DefaultTableModel dtm = 
                    (javax.swing.table.DefaultTableModel)table2.getModel();
            try{
                db_files.dbconnect.showtenth.setInt(1,id);
                ResultSet rs = db_files.dbconnect.showtenth.executeQuery();
                while(rs.next()){
                    java.util.Vector r = new java.util.Vector();
                     r.add(tenth);
                     r.add(rs.getInt(1));
                     r.add(rs.getString(2));
                     r.add(rs.getInt(3));
                     r.add(rs.getInt(4));
                     r.add(rs.getInt(5));
                     r.add(rs.getInt(6));
                     r.add(rs.getString(7));
                     
                     dtm.addRow(r);
                }
            }catch(Exception ex){
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null,ex);
            }
            javax.swing.table.DefaultTableModel a = 
                    (javax.swing.table.DefaultTableModel)table2.getModel();
            try{
                db_files.dbconnect.showtwelfth.setInt(1,id);
                ResultSet rs = db_files.dbconnect.showtwelfth.executeQuery();
                while(rs.next()){
                    java.util.Vector r = new java.util.Vector();
                     r.add(twelfth);
                     r.add(rs.getInt(1));
                     r.add(rs.getString(2));
                     r.add(rs.getInt(3));
                     r.add(rs.getInt(4));
                     r.add(rs.getInt(5));
                     r.add(rs.getInt(6));
                     r.add(rs.getString(7));
                     
                     a.addRow(r);
                }
            }catch(Exception ex){
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null,ex);
            }
        }
    }//GEN-LAST:event_table1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new registernewstudent().setVisible(true);
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewallstudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField sn;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    // End of variables declaration//GEN-END:variables
}
