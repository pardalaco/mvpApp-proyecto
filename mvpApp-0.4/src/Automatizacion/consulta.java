/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Automatizacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author daniel
 */
public class consulta {
    
    public static String consultaProducto(String consulta) throws SQLException{
        conexion conecta = new conexion();
        Connection con = conecta.getConexion();
        
                
        java.sql.Statement stmt = con.createStatement();    
        ResultSet rs = stmt.executeQuery(consulta);

        
        rs.next();
  
        return rs.getString(1);
    }
            
    
}
