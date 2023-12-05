package Classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author Champion T
 */
public class Func_Class {
    // create a function to display the image in jlabel
    public void displayImage(int width, int height, String imagePath, JLabel label)
    {
        // get the image
        ImageIcon imgIco = new ImageIcon(getClass().getResource(imagePath));
        
        // make the image fit the jlabel
        Image image = imgIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        
        // set the image into the jlabel
        label.setIcon(new ImageIcon(image));
    }
    
    // create a function to customize the jtable
    public void customTable(JTable table)
    {
        table.setSelectionBackground(new Color(249, 105, 14));
        table.setSelectionForeground(Color.white);
        table.setRowHeight(35);
        table.setShowGrid(false);
        table.setBackground(new Color(248, 248, 248));
        table.setShowHorizontalLines(true);
        table.setGridColor(Color.gray);
    }
    
    // create a function to customize the jtable Header
    public void customTableHeader(JTable table, Color back_Color, Integer fontsize)
    {
        table.getTableHeader().setBackground(back_Color);
        table.getTableHeader().setForeground(Color.white);
        table.getTableHeader().setFont(new Font("Verdana", Font.BOLD, fontsize));
        table.getTableHeader().setOpaque(false);
    }
    
    // create a function to return a resultSet
    // we will use this function to reduce the code when populating the arraylist
    public ResultSet getData(String query)
    {
        PreparedStatement ps;
        ResultSet rs = null;
        
        try {
            ps = DB.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            
        } catch (SQLException ex) {
            Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
