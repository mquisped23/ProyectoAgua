/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexion.Conexion;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author andro
 */
public class RegistrarDao {

    private Connection conn;
    private PreparedStatement ps;
    Usuario usuario;

    public RegistrarDao() {
        conn = Conexion.openConnection();
    }

    public void save(Usuario usuario) {

        try {
            //llamamos a la tabla login y buscamos la columna usuario y password
            String sql = "INSERT INTO login(user, password) VALUES(?, ?)";

            try ( PreparedStatement ps = conn.prepareStatement(sql)) {

                ps.setString(1, usuario.getUser());
                ps.setString(2, usuario.getPassword());

                ps.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
