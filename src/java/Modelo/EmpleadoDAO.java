
package Modelo;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class EmpleadoDAO {
    
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    public Empleado Validar (String user ,String dni) {
        
        Empleado em=new Empleado();
        String sql="select * from empleado where User=? and Dni=?";
        
        try {
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1,user);
            ps.setString(2,dni);
            rs=ps.executeQuery();
            
            while (rs.next()) { 
                em.setId(rs.getInt("idEmpleado"));
                em.setUser(rs.getString("User"));
                em.setDni(rs.getString("Dni"));
                em.setNom(rs.getString("Nombres"));
            }
          
        } catch (Exception e) {
        }
        return em;
         
        
        
    }
    
}
