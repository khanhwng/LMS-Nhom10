package My_Components;

import extra_packs.ButtonOutLine;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;

public class PanelCover extends javax.swing.JPanel {

    private ActionListener event;
    private MigLayout layout;
    private JLabel title;
    private JLabel description;
    private JLabel description1;
    private ButtonOutLine button;
    private boolean isLogin;
    
    public PanelCover() {
        initComponents();
        setOpaque(false);
        layout = new MigLayout("wrap, fill", "[center]", "push[]25[]10[]25[]push");
        setLayout(layout);
        init();
    }
    private void init(){
        title = new JLabel("Welcome Back!");
        title.setFont(new Font("sansserif",1,30));
        title.setForeground(new Color(245,245,245));
        add(title);
        description = new JLabel("To keep connected with us, please");
        description.setForeground(new Color(245,245,245));
        add(description);
        description1 = new JLabel("login with your personal info");
        description1.setForeground(new Color(245,245,245));
        add(description1);
        button = new ButtonOutLine();
        button.setBackground(new Color(255,255,255));
        button.setForeground(new Color(255,255,255));
        button.setText("SIGN IN");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                event.actionPerformed(ae);  
            }
        });
        add(button);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        GradientPaint gra = new GradientPaint(0, 0, new Color(215, 43, 91), 0, getHeight(), new Color(235, 113, 76));
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());        
        super.paintComponents(grphcs);        
    }
    
    public void addEvent(ActionListener event){
        this.event = event;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
