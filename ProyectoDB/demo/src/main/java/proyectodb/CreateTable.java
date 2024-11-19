package proyectodb;

import java.sql.*;

// Creación de la tabla para el sistema de monitoreo de estacionamiento
public class CreateTable {
    public static void Create() {
        String query = """
            CREATE TABLE IF NOT EXISTS parking_spaces (
                id INT PRIMARY KEY AUTO_INCREMENT,
                placa VARCHAR(20) NOT NULL,
                tipo_vehiculo VARCHAR(50) NOT NULL,
                estado VARCHAR(20) NOT NULL,
                color VARCHAR(30) NOT NULL,
                espacio INT NOT NULL
);
            """;

        try (Connection connection = DatabaseConnection.getConnection();
             Statement stmt = connection.createStatement()) {
            
            // Ejecutar la consulta para crear la tabla
            boolean result = stmt.execute(query);
            System.out.println("Table 'ParkingSpaces' created successfully!");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Create();
    }
}
