/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    
    Connection con;
    String url = "jdbc:mysql://localhost:8080/db_ventas";
    String user ="admin";
    String pass="admin";
    
    public Connection Conexion(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(url,user,pass);
            
        } catch (Exception e) {
        }
        return con;
    }
    
}
