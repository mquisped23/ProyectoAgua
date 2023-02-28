/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexion.Conexion;
import Modelo.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDao {

    private Connection conn;
    private PreparedStatement ps;
    Cliente cliente;

    public ClienteDao() {
        conn = Conexion.openConnection();
    }
    
    
    public void saveCliente(Cliente cliente){
    
     try {
            //llamamos a la tabla login y buscamos la columna usuario y password
            String sql = "INSERT INTO clientes(nombres, Manzana, Etapa, Mes, Consumo, confirmacion) VALUES(?, ?, ?, ?, ?, ?)";

            try ( PreparedStatement ps = conn.prepareStatement(sql)) {

                ps.setString(1, cliente.getNombre());
                ps.setString(2, cliente.getManzana());
                ps.setString(3, cliente.getEtapa());
                ps.setString(4, cliente.getMes());
                ps.setString(5, Integer.toString(cliente.getConsumo1()));
                ps.setString(6, cliente.getConfirmacion());

                ps.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
