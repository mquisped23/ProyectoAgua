package DAO;

import Conexion.Conexion;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDao {

    private Connection conn;
    private PreparedStatement ps;
     Usuario usuario;
    public LoginDao() {
        conn = Conexion.openConnection();
    }

    public boolean findByUsername(String username, String password) {
        

        try {
            //llamamos a la tabla login y buscamos la columna usuario y password
            String sql = "SELECT * FROM login WHERE user = ? and password = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                 usuario = new Usuario(
                        rs.getInt("id"),
                        rs.getString("user"),
                        rs.getString("password"));
                      
                return true;
            }
            ps.close();
            rs.close();
            return false;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }

    }

}
