package My_Components;

import extra_packs.MyPasswordField;
import extra_packs.MyTextField;
import extra_packs.Button;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;

public class PanelLogin extends javax.swing.JLayeredPane {
   
    public PanelLogin() {
        initComponents();
        initWelcome();
        initLogin();
        login.setVisible(true);
        welcome.setVisible(false);
    }
    private void initWelcome(){
        welcome.setLayout(new MigLayout("wrap", "push[center]push"));
        JLabel label = new JLabel("Library Management System");
        label.setFont(new Font("sanserif",1,30));
        label.setForeground(new Color(235, 113, 76));
        welcome.add(label);   
    }
    private void initLogin(){
        login.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));
        JLabel label = new JLabel("SIGN IN");
        label.setFont(new Font("sanserif",1,30));
        label.setForeground(new Color(235, 113, 76));
        login.add(label);
        MyTextField txtUser = new MyTextField();
        txtUser.setPrefixIcon(new ImageIcon(getClass().getResource("/My_Images/username.png")));
        txtUser.setHint("Username");
        login.add(txtUser, "w 60%");
        MyPasswordField txtPass = new MyPasswordField();
        txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/My_Images/pass.png")));
        txtPass.setHint("Password");
        login.add(txtPass, "w 60%");
        JButton cmdForget = new JButton("Contact admin if you forgot your password!");
        cmdForget.setForeground(new Color(100, 100, 100));
        cmdForget.setFont(new Font("sansserif", 1, 10));
        cmdForget.setContentAreaFilled(false);
        login.add(cmdForget);
        Button cmd = new Button();
        cmd.setBackground(new Color(235, 113, 76));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.setText("SIGN IN");
        login.add(cmd, "w 40%, h 40");
    }
    
    public void showWelcome(boolean show){
        if(show){
            welcome.setVisible(false);
            login.setVisible(true);
        } else{
            welcome.setVisible(true);
            login.setVisible(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        welcome = new javax.swing.JPanel();

        setBackground(new java.awt.Color(214, 217, 223));
        setForeground(new java.awt.Color(0, 0, 0));
        setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(login, "card3");

        welcome.setBackground(new java.awt.Color(255, 255, 255));
        welcome.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout welcomeLayout = new javax.swing.GroupLayout(welcome);
        welcome.setLayout(welcomeLayout);
        welcomeLayout.setHorizontalGroup(
            welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        welcomeLayout.setVerticalGroup(
            welcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(welcome, "card2");
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel login;
    private javax.swing.JPanel welcome;
    // End of variables declaration//GEN-END:variables
}
