package Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Champion T
 */
public class Member {
    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String gender;
    private byte[] picture;
    
    public Member(int _id, String _fname, String _lname, String _phone, String _email, String _gender, byte[] _picture)
    {
        this.id = _id;
        this.firstName = _fname;
        this.lastName = _lname;
        this.phone = _phone;
        this.email = _email;
        this.gender = _gender;
        this.picture = _picture;
    }
    
    public Member() {};

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public byte[] getPicture() {
        return picture;
    }
    
    // function
    
    // insert a new member function
    public void addMember (String _fname, String _lname, String _phone, String _email, String _gender, byte[] _pic)
    {
        String insertQuery = "INSERT INTO `members`(`firstName`, `lastName`, `phone`, `email`, `gender`, `picture`) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _phone);
            ps.setString(4, _email);
            ps.setString(5, _gender);
            ps.setBytes(6, _pic);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Member Added","add member", 1);
            }
            else
            {             
                JOptionPane.showMessageDialog(null, "Member Not Added","add member", 2);          
            }
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    
    // edit member by id function
    public void editMember(Integer _id, String _fname, String _lname, String _phone, String _email, String _gender, byte[] _pic)
    {
        String editQuery = "UPDATE `members` SET `firstName`=?,`lastName`=?,`phone`=?,`email`=?,`gender`=?,`picture`=? WHERE `id` =?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);
            
            ps.setString(1, _fname);
            ps.setString(2, _lname);
            ps.setString(3, _phone);
            ps.setString(4, _email);
            ps.setString(5, _gender);
            ps.setBytes(6, _pic);
            ps.setInt(7, _id);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Member Edited","edit member", 1);
            }
            else
            {             
                JOptionPane.showMessageDialog(null, "Member Not Edited","edit member", 2);          
            }
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    
    // remove member by id function
    public void removeMember(int _id)
    {
        String removeQuery = "DELETE FROM `member` WHERE `id` = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            ps.setInt(1, _id);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Member Deleted","remove", 1);
            }
            else
            {             
                JOptionPane.showMessageDialog(null, "Member Not Deleted","remove", 2);          
            }
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }

}