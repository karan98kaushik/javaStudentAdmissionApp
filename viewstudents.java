package gui;

import static db_files.dbconnect.updatetwelfth;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class viewstudents extends javax.swing.JFrame {

    public viewstudents() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sn = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        spdtable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        n1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        st = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        n2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        g1 = new javax.swing.JRadioButton();
        g2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        d = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        a = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        n4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        n3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        sn1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        p2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        p4 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        p5 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        p6 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        p7 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        t2 = new javax.swing.JRadioButton();
        t1 = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        p3 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        p1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("ENTER STUDENT'S NAME :");

        sn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snActionPerformed(evt);
            }
        });
        sn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                snKeyReleased(evt);
            }
        });

        spdtable.setModel(new javax.swing.table.DefaultTableModel(
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
        spdtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spdtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(spdtable);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("STUDENT'S PERSONAL DETAILS");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("STUDENT ID :");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("PROGRAM NAME :");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("STREAM :");

        st.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        st.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Science", "Commerce", "Humanities" }));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("STUDENT NAME :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("GENDER :");

        g1.setText("MALE");

        g2.setText("FEMALE");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("DOB :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("ADDRESS :");

        a.setColumns(20);
        a.setRows(5);
        jScrollPane3.setViewportView(a);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("EMAIL ID :");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("MOBILE NUMBER :");

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(101, 101, 101)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addComponent(jLabel3)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(47, 47, 47)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(g1)
                                    .addGap(18, 18, 18)
                                    .addComponent(g2))
                                .addComponent(st, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel13)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(229, 229, 229)
                            .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(101, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(484, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(n4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(n3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(207, 207, 207))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(st, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(g1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(g2, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(395, 395, 395)))
        );

        jScrollPane5.setViewportView(jPanel4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29)
                                .addComponent(sn, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, sn});

        getContentPane().add(jPanel2, "1");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("STUDENT'S ACADEMIC DETAILS");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SID", "NAME", "ROLL NUMBER", "YEAR OF PASSING", "MARKS OBTAINED", "% / CGPA", "BOARD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setColumnSelectionAllowed(true);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(table);
        table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("UPDATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setText("DELETE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        sn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sn1ActionPerformed(evt);
            }
        });
        sn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sn1KeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("CHOOSE STANDARD :");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("ENTER STUDENT'S NAME :");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel20.setText("STUDENT NAME :");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel21.setText("YEAR OF PASSING :");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setText("TOATAL MARKS OBTAINED :");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setText("% / CGPA :");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setText("BOARD :");

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setText("DONE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        t2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        t2.setText("12th STANDARD");

        t1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        t1.setText("10th STANDARD");
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel25.setText("ROLL NUMBER :");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel26.setText("SID :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(p2)
                                    .addComponent(p7, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                                    .addComponent(p6, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                                    .addComponent(p4, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                                    .addComponent(p5)
                                    .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                                    .addComponent(p1)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(t1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(t2))
                            .addComponent(sn1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1)
                    .addComponent(t2))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel14, sn1});

        getContentPane().add(jPanel3, "2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void snActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_snActionPerformed

    private void snKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_snKeyReleased
        javax.swing.table.DefaultTableModel dtm = 
                (javax.swing.table.DefaultTableModel)spdtable.getModel();
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

    private void spdtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spdtableMouseClicked
        int ri = spdtable.getSelectedRow();
        if(ri!=-1){
            int id = (Integer)spdtable.getValueAt(ri,0);
            String pname = (String)spdtable.getValueAt(ri,1);
            String stream = (String)spdtable.getValueAt(ri,2);
            String sname = (String)spdtable.getValueAt(ri,3);
            String gender = (String)spdtable.getValueAt(ri,4);
            java.util.Date dob = (java.util.Date)spdtable.getValueAt(ri, 5);
            String address = (String)spdtable.getValueAt(ri,6);
            String email = (String)spdtable.getValueAt(ri,7);
            String contact = (String)spdtable.getValueAt(ri,8);

            sid.setText(id+"");
            n1.setText(pname);
            st.setSelectedItem(stream);
            n2.setText(sname);
            if(gender.equals("MALE"))
            g1.setSelected(true);
            else
            g2.setSelected(true);
            d.setDate(dob);
            a.setText(address);
            n4.setText(email);
            n3.setText(contact);
        }
    }//GEN-LAST:event_spdtableMouseClicked

    private void sn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sn1ActionPerformed

    private void sn1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sn1KeyReleased
        if(t1.isSelected()){
            javax.swing.table.DefaultTableModel dtm = 
                    (javax.swing.table.DefaultTableModel)table.getModel();
            try{
                int rc = dtm.getRowCount();
                while(rc--!=0){
                    dtm.removeRow(0);
                }
                 String n = sn1.getText();
                 db_files.dbconnect.gettenth.setString(1,"%"+n+"%");
                 ResultSet rs = db_files.dbconnect.gettenth.executeQuery();
                 while(rs.next()){
                     java.util.Vector r = new java.util.Vector();
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
        }else if(t2.isSelected()){
            javax.swing.table.DefaultTableModel dtm = 
                    (javax.swing.table.DefaultTableModel)table.getModel();
            try{
                int rc = dtm.getRowCount();
                while(rc--!=0){
                    dtm.removeRow(0);
                }
                 String n = sn1.getText();
                 db_files.dbconnect.gettwelfth.setString(1,"%"+n+"%");
                 ResultSet rs = db_files.dbconnect.gettwelfth.executeQuery();
                 while(rs.next()){
                     java.util.Vector r = new java.util.Vector();
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
        }
    }//GEN-LAST:event_sn1KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String pname = n1.getText();
        String stream = (String)st.getSelectedItem();
        String sname = n2.getText();
        java.util.Date dt = d.getDate();
        String address = a.getText();
        String email = n4.getText();
        String contact = n3.getText();
        
        if(!pname.equals("") && !stream.equals("") && !sname.equals("") 
                && dt!=null && !address.equals("") && !email.equals("") 
                && !contact.equals("")){
        String gender="";
        if(g1.isSelected()){
                gender=g1.getText();
        }else{
                gender=g2.getText();
            }
        
        try{
            int id = Integer.parseInt(sid.getText());
            db_files.dbconnect.updatestudent.setString(1,pname);
            db_files.dbconnect.updatestudent.setString(2,stream);
            db_files.dbconnect.updatestudent.setString(3,sname);
            db_files.dbconnect.updatestudent.setString(4,gender);
            java.sql.Date dob = new java.sql.Date(dt.getTime());
            db_files.dbconnect.updatestudent.setDate(5,dob);
            db_files.dbconnect.updatestudent.setString(6,address);
            db_files.dbconnect.updatestudent.setString(7,email);
            db_files.dbconnect.updatestudent.setString(8,contact);
            db_files.dbconnect.updatestudent.setInt(9,id);
            db_files.dbconnect.updatestudent.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Updation Success.");
            
            javax.swing.table.DefaultTableModel dtm=
                    (javax.swing.table.DefaultTableModel)spdtable.getModel();
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
            
        }catch(Exception ex){
             ex.printStackTrace();
             JOptionPane.showMessageDialog(null,ex);
        }
      }else{
                    JOptionPane.showMessageDialog(null, "Plz Fill All Details.");
            } 
        sid.setText(null);
        n1.setText(null);
        n2.setText(null);
        n3.setText(null);
        n4.setText(null);
        d.setDate(null);
        a.setText(null);
        g1.setSelected(true);
        st.setSelectedItem("Science");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int rt = JOptionPane.showConfirmDialog(null,"Do You Relly Wanna Delete?",
                "Deletion Confirmation",JOptionPane.YES_NO_OPTION);
        if(rt==JOptionPane.YES_OPTION){
            try{
                int id = Integer.parseInt(sid.getText());
                db_files.dbconnect.st.executeUpdate("delete from"
                        + " student_personal_db where sid="+id);
                JOptionPane.showMessageDialog(null, "Deletion Success.");
                javax.swing.table.DefaultTableModel dtm=
                        (javax.swing.table.DefaultTableModel)spdtable.getModel();
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
            }catch(Exception ex){
                 ex.printStackTrace();
                 JOptionPane.showMessageDialog(null,ex);
            }
        }
        sid.setText(null);
        n1.setText(null);
        n2.setText(null);
        n3.setText(null);
        n4.setText(null);
        d.setDate(null);
        a.setText(null);
        g1.setSelected(true);
        st.setSelectedItem("Science");
                
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            java.awt.Container ct = getContentPane();
            java.awt.CardLayout cd = (java.awt.CardLayout)ct.getLayout();
            cd.show(ct, "2");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
       
           int ri=table.getSelectedRow();
           if(ri!=-1){
             int id = (Integer)table.getValueAt(ri,0);
             String name = (String)table.getValueAt(ri,1);
             int rn = (Integer)table.getValueAt(ri,2);
             int yop = (Integer)table.getValueAt(ri,3);
             int mo = (Integer)table.getValueAt(ri,4);
             int perc = (Integer)table.getValueAt(ri,5);
             String board = (String)table.getValueAt(ri,6);
             
             p1.setText(id+"");
             p2.setText(name);
             p3.setText(rn+"");
             p4.setText(yop+"");
             p5.setText(mo+"");
             p6.setText(perc+"");
             p7.setText(board);
           } 
        
    }//GEN-LAST:event_tableMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            String name = p2.getText();
            int rn = Integer.parseInt(p3.getText());
            int yop = Integer.parseInt(p4.getText());
            int tm = Integer.parseInt(p5.getText());
            int perc = Integer.parseInt(p6.getText());
            String board = p7.getText();
            
               if(t1.isSelected()){
                try{
                   int id  = Integer.parseInt(p1.getText());
                   db_files.dbconnect.updatetenth.setString(1,name);
                   db_files.dbconnect.updatetenth.setInt(2,rn);
                   db_files.dbconnect.updatetenth.setInt(3,yop);
                   db_files.dbconnect.updatetenth.setInt(4,tm);
                   db_files.dbconnect.updatetenth.setInt(5,perc);
                   db_files.dbconnect.updatetenth.setString(6,board);
                   db_files.dbconnect.updatetenth.setInt(7,id);
                   db_files.dbconnect.updatetenth.executeUpdate();
                   
                   JOptionPane.showMessageDialog(null, "Updation Success.");
                   
                   javax.swing.table.DefaultTableModel dtm = 
                           (javax.swing.table.DefaultTableModel)table.getModel();
            try{
                int rc = dtm.getRowCount();
                while(rc--!=0){
                    dtm.removeRow(0);
                }
                 String n = sn1.getText();
                 db_files.dbconnect.gettenth.setString(1,"%"+n+"%");
                 ResultSet rs = db_files.dbconnect.gettenth.executeQuery();
                 while(rs.next()){
                     java.util.Vector r = new java.util.Vector();
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
               } catch(Exception ex){
                  ex.printStackTrace();
                  JOptionPane.showMessageDialog(null, ex); 
               }
               }else if(t2.isSelected()){
                   try{
                   int id  = Integer.parseInt(p1.getText());
                   db_files.dbconnect.updatetwelfth.setString(1,name);
                   db_files.dbconnect.updatetwelfth.setInt(2,rn);
                   db_files.dbconnect.updatetwelfth.setInt(3,yop);
                   db_files.dbconnect.updatetwelfth.setInt(4,tm);
                   db_files.dbconnect.updatetwelfth.setInt(5,perc);
                   db_files.dbconnect.updatetwelfth.setString(6,board);
                   db_files.dbconnect.updatetwelfth.setInt(7,id);
                   db_files.dbconnect.updatetwelfth.executeUpdate();
                   
                   JOptionPane.showMessageDialog(null, "Updation Success.");
                   
                   javax.swing.table.DefaultTableModel dtm = 
                           (javax.swing.table.DefaultTableModel)table.getModel();
            try{
                int rc = dtm.getRowCount();
                while(rc--!=0){
                    dtm.removeRow(0);
                }
                 String n = sn1.getText();
                 db_files.dbconnect.gettwelfth.setString(1,"%"+n+"%");
                 ResultSet rs = db_files.dbconnect.gettwelfth.executeQuery();
                 while(rs.next()){
                     java.util.Vector r = new java.util.Vector();
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
               } catch(Exception ex){
                  ex.printStackTrace();
                  JOptionPane.showMessageDialog(null, ex); 
               }
               }
           
            p1.setText(null);
            p2.setText(null);
            p3.setText(null);
            p4.setText(null);
            p5.setText(null);
            p6.setText(null);
            p7.setText(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       int rt = JOptionPane.showConfirmDialog(null,"Do You Really Wanna Delete??",
               "Deletion Confirmation",JOptionPane.YES_NO_OPTION);
       if(rt==JOptionPane.YES_OPTION){
           try{
               int id = Integer.parseInt(p1.getText());
               db_files.dbconnect.st.executeQuery("delete from tenth_info where sid="+id);
               JOptionPane.showMessageDialog(null, "Deletion Success.");
               if(t1.isSelected()){
               javax.swing.table.DefaultTableModel dtm=
                       (javax.swing.table.DefaultTableModel)table.getModel();
               try{
                int rc = dtm.getRowCount();
                while(rc--!=0){
                    dtm.removeRow(0);
                }
                 String n = sn1.getText();
                 db_files.dbconnect.gettenth.setString(1,"%"+n+"%");
                 ResultSet rs = db_files.dbconnect.gettenth.executeQuery();
                 while(rs.next()){
                     java.util.Vector r = new java.util.Vector();
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
            }else if(t2.isSelected()){
                javax.swing.table.DefaultTableModel dtm = 
                        (javax.swing.table.DefaultTableModel)table.getModel();
            try{
                int rc = dtm.getRowCount();
                while(rc--!=0){
                    dtm.removeRow(0);
                }
                 String n = sn1.getText();
                 db_files.dbconnect.gettwelfth.setString(1,"%"+n+"%");
                 ResultSet rs = db_files.dbconnect.gettwelfth.executeQuery();
                 while(rs.next()){
                     java.util.Vector r = new java.util.Vector();
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
            }
           }catch(Exception ex){
               ex.printStackTrace();
               JOptionPane.showMessageDialog(null,ex);
           }
       }
       p1.setText(null);
       p2.setText(null);
       p3.setText(null);
       p4.setText(null);
       p5.setText(null);
       p6.setText(null);
       p7.setText(null);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JOptionPane.showMessageDialog(null,"OPERATION PERFORMED SUCCESSFULLY");
        new viewallstudents().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewstudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea a;
    private com.toedter.calendar.JDateChooser d;
    private javax.swing.JRadioButton g1;
    private javax.swing.JRadioButton g2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    private javax.swing.JTextField n3;
    private javax.swing.JTextField n4;
    private javax.swing.JTextField p1;
    private javax.swing.JTextField p2;
    private javax.swing.JTextField p3;
    private javax.swing.JTextField p4;
    private javax.swing.JTextField p5;
    private javax.swing.JTextField p6;
    private javax.swing.JTextField p7;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField sn;
    private javax.swing.JTextField sn1;
    private javax.swing.JTable spdtable;
    private javax.swing.JComboBox<String> st;
    private javax.swing.JRadioButton t1;
    private javax.swing.JRadioButton t2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
