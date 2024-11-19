package com.onlyparking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BD {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/onlyparking";
    private static final String USER = "root";
    private static final String PASSWORD = "V@le0523";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conectado a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos.");
            e.printStackTrace();
        }
        return connection;
    }

    public static void guardar(String id, String informacion) {
        String query = "INSERT INTO historial (id, informacion) VALUES (?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {

            stmt.setString(1, id);
            stmt.setString(2, informacion);
            

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Los datos fueron guardados con éxito en la base de datos.");
            } else {
                System.out.println("No se pudo guardar en la base de datos.");
            }
        } catch (SQLException e) {
            System.out.println("Error al guardar los datos en la base de datos.");
            e.printStackTrace();
        }
    }
}

