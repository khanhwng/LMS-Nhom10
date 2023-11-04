package My_Forms;

import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;

public class Dashboard extends javax.swing.JFrame {
    public Dashboard() {
        initComponents();
        setSize(1274,630);
        //Center the form
        this.setLocationRelativeTo(null);
        displayImage();
        //Border for "Library" box
        Border panelHeaderBorder = BorderFactory.createMatteBorder(0,0,1,0,Color.white);
        jPanel_Header.setBorder(panelHeaderBorder);
        //Border for 3 boxes
        Border panelHeader_1_Border = BorderFactory.createMatteBorder(0,0,3,0,new Color(235,125,22));
        jPanel_1_header.setBorder(panelHeader_1_Border);
        Border panelHeader_2_Border = BorderFactory.createMatteBorder(0,0,3,0,new Color(26,138,32));
        jPanel_2_header.setBorder(panelHeader_2_Border);
        Border panelHeader_3_Border = BorderFactory.createMatteBorder(0,0,3,0,new Color(115,40,125));
        jPanel_3_header.setBorder(panelHeader_3_Border);
        Border panelHeader_4_Border = BorderFactory.createMatteBorder(0,0,3,0,new Color(244,82,110));
        jPanel_4_header.setBorder(panelHeader_4_Border);
    }
    
    public void displayImage(){
        //get the image
        ImageIcon imgIco = new ImageIcon(getClass().getResource("/My_Images/dashboard_logo.png"));
        //make the image fit the jlabel
        Image image = imgIco.getImage().getScaledInstance(jLabel_Dashboard_Logo.getWidth(),jLabel_Dashboard_Logo.getHeight(),Image.SCALE_SMOOTH);
        jLabel_Dashboard_Logo.setIcon(new ImageIcon(image));
    }
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel_Header = new javax.swing.JPanel();
        jLabel_Dashboard_Logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_1 = new javax.swing.JPanel();
        jPanel_1_header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel_2 = new javax.swing.JPanel();
        jPanel_2_header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel_3 = new javax.swing.JPanel();
        jPanel_3_header = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel_4 = new javax.swing.JPanel();
        jPanel_4_header = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1086, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(1237, 650));

        jPanel2.setBackground(new java.awt.Color(36, 37, 42));

        jPanel_Header.setBackground(new java.awt.Color(1, 50, 67));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Library");

        javax.swing.GroupLayout jPanel_HeaderLayout = new javax.swing.GroupLayout(jPanel_Header);
        jPanel_Header.setLayout(jPanel_HeaderLayout);
        jPanel_HeaderLayout.setHorizontalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Dashboard_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel_HeaderLayout.setVerticalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel_Dashboard_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel_1.setBackground(new java.awt.Color(255, 178, 41));
        jPanel_1.setPreferredSize(new java.awt.Dimension(345, 220));

        jPanel_1_header.setBackground(new java.awt.Color(246, 145, 16));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Books");

        javax.swing.GroupLayout jPanel_1_headerLayout = new javax.swing.GroupLayout(jPanel_1_header);
        jPanel_1_header.setLayout(jPanel_1_headerLayout);
        jPanel_1_headerLayout.setHorizontalGroup(
            jPanel_1_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1_headerLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_1_headerLayout.setVerticalGroup(
            jPanel_1_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1_headerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("10000");

        javax.swing.GroupLayout jPanel_1Layout = new javax.swing.GroupLayout(jPanel_1);
        jPanel_1.setLayout(jPanel_1Layout);
        jPanel_1Layout.setHorizontalGroup(
            jPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_1_header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel6)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel_1Layout.setVerticalGroup(
            jPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1Layout.createSequentialGroup()
                .addComponent(jPanel_1_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(0, 62, Short.MAX_VALUE))
        );

        jPanel_2.setBackground(new java.awt.Color(75, 192, 18));
        jPanel_2.setPreferredSize(new java.awt.Dimension(345, 220));

        jPanel_2_header.setBackground(new java.awt.Color(65, 160, 10));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Members");

        javax.swing.GroupLayout jPanel_2_headerLayout = new javax.swing.GroupLayout(jPanel_2_header);
        jPanel_2_header.setLayout(jPanel_2_headerLayout);
        jPanel_2_headerLayout.setHorizontalGroup(
            jPanel_2_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_2_headerLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_2_headerLayout.setVerticalGroup(
            jPanel_2_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_2_headerLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(21, 21, 21))
        );

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("10000");

        javax.swing.GroupLayout jPanel_2Layout = new javax.swing.GroupLayout(jPanel_2);
        jPanel_2.setLayout(jPanel_2Layout);
        jPanel_2Layout.setHorizontalGroup(
            jPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_2_header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_2Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(43, 43, 43))
        );
        jPanel_2Layout.setVerticalGroup(
            jPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_2Layout.createSequentialGroup()
                .addComponent(jPanel_2_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(0, 62, Short.MAX_VALUE))
        );

        jPanel_3.setBackground(new java.awt.Color(155, 89, 182));
        jPanel_3.setPreferredSize(new java.awt.Dimension(345, 220));

        jPanel_3_header.setBackground(new java.awt.Color(125, 60, 155));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Authors");

        javax.swing.GroupLayout jPanel_3_headerLayout = new javax.swing.GroupLayout(jPanel_3_header);
        jPanel_3_header.setLayout(jPanel_3_headerLayout);
        jPanel_3_headerLayout.setHorizontalGroup(
            jPanel_3_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_3_headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(75, 75, 75))
        );
        jPanel_3_headerLayout.setVerticalGroup(
            jPanel_3_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3_headerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("10000");

        javax.swing.GroupLayout jPanel_3Layout = new javax.swing.GroupLayout(jPanel_3);
        jPanel_3.setLayout(jPanel_3Layout);
        jPanel_3Layout.setHorizontalGroup(
            jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_3_header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel11)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel_3Layout.setVerticalGroup(
            jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3Layout.createSequentialGroup()
                .addComponent(jPanel_3_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(0, 62, Short.MAX_VALUE))
        );

        jPanel_4.setBackground(new java.awt.Color(255, 153, 153));
        jPanel_4.setPreferredSize(new java.awt.Dimension(345, 220));

        jPanel_4_header.setBackground(new java.awt.Color(255, 102, 102));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Genres");

        javax.swing.GroupLayout jPanel_4_headerLayout = new javax.swing.GroupLayout(jPanel_4_header);
        jPanel_4_header.setLayout(jPanel_4_headerLayout);
        jPanel_4_headerLayout.setHorizontalGroup(
            jPanel_4_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_4_headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(80, 80, 80))
        );
        jPanel_4_headerLayout.setVerticalGroup(
            jPanel_4_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_4_headerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("10000");

        javax.swing.GroupLayout jPanel_4Layout = new javax.swing.GroupLayout(jPanel_4);
        jPanel_4.setLayout(jPanel_4Layout);
        jPanel_4Layout.setHorizontalGroup(
            jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_4_header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel12)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel_4Layout.setVerticalGroup(
            jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_4Layout.createSequentialGroup()
                .addComponent(jPanel_4_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(0, 62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(359, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1243, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Dashboard_Logo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_1;
    private javax.swing.JPanel jPanel_1_header;
    private javax.swing.JPanel jPanel_2;
    private javax.swing.JPanel jPanel_2_header;
    private javax.swing.JPanel jPanel_3;
    private javax.swing.JPanel jPanel_3_header;
    private javax.swing.JPanel jPanel_4;
    private javax.swing.JPanel jPanel_4_header;
    private javax.swing.JPanel jPanel_Header;
    // End of variables declaration//GEN-END:variables
}
