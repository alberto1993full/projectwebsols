/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ERPKAFELComputing.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lcastaneda
 */
public class Consultas extends Conexion{
    public boolean Autenticacion(String user, String pass) throws SQLException
    {
        Statement st = con.createStatement();
        ResultSet rs = null;
        
        String Consulta = "SELECT * FROM EM_EMPLEADO";
        rs = st.executeQuery(Consulta);
        
        while(rs.next())
        {
            if (user.equals(rs.getString("EM_LOGIN"))&&pass.equals(rs.getString("EM_CLAVE"))) {
                return true;
            }
        }
        return false;
    }
}