package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Connection conn;

    // Metodo para abrir la conexión a la base de datos
    public static Connection openConnection() {
        if (conn != null) {
            return conn;
        }

        try {
            //Aca se ingresa el nombre de tu base de datos
            String usuario = "uzrxabpokg1wyx8o"; // el usuario
            String password = "jrw0tOvNF3FvXIM6rZdW"; // tu password
            String dataBase = "bivmcrxb8eaxnpphlalz";
            String url = "jdbc:mysql://bivmcrxb8eaxnpphlalz-mysql.services.clever-cloud.com:3306/"+ dataBase+"?autoReconnect = true & useSSL = false";

            // Establecer el Driver de conexión
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, usuario, password);

            System.out.println("Conexion establecida");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Conexion Fallida");
        }
        return conn;
    }
    // Metodo para cerrar la conexion a la Base de datos

    public static void closeConnection() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
