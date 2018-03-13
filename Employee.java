/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectb;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author shivam upadhyay
 */
public class Employee {
     private static Connection mysql;
public static Connection EmployeeDB() throws SQLException {
    if(mysql==null){
        try {
            String DB="jdbc:mysql://localhost:3306/projectb"; // name database
            String user="root"; // user database
            String pass="shivam"; // password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysql = (Connection) DriverManager.getConnection(DB,user,pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"FAILED CONNECTION");
        }
    }
    return mysql;
    }
}
