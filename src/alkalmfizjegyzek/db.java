/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alkalmfizjegyzek;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
/**
 *
 * @author Dávid
 */
public class db {

    static TableModel resultSetToTableModel(ResultSet rs) {
        throw new UnsupportedOperationException("Nem támogatott még."); 
    }
    
    Connection conn = null;
    public static Connection java_db(){
        
        
        try{
            
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:mydatabase.sqlite");
            return conn;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
