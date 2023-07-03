/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasipenjualan;

import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author Daffa fauzand
 */
public class ConnectionDb {
    static String jdbc_driver = "com.mysql.jdbc.cj.Driver";
    static String url = "jdbc:mysql://localhost:3306/penjualan";
    static String user = "root";
    static String pass = "";
    static Connection conn;
    static Statement stm;
    static ResultSet rs;
    
    public static Connection connectDatabase(){
        try{
            Class.forName(jdbc_driver);
        }catch(ClassNotFoundException cnf){
        
        }try{
            conn = (Connection)DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Koneksi database berhasil");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Koneksi database gagal");
        }catch(HeadlessException e){
            
        }
        return conn;
    }
}
