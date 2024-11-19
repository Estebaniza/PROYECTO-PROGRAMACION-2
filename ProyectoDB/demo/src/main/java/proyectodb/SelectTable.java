package proyectodb;

import java.sql.*;

public class SelectTable {

    public static void Show() {
        String query = "SELECT * FROM parking_spaces";
        
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            System.out.println("\n***** Vehículos Estacionados *****");
            System.out.println("-------------------------------------------------------------");
            System.out.printf("%-5s %-10s %-15s %-15s %-10s %-8s\n", "ID", "Placa", "Tipo", "Estado", "Color", "Espacio");
            System.out.println("-------------------------------------------------------------");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String placa = resultSet.getString("placa");
                String tipo_vehiculo = resultSet.getString("tipo_vehiculo");
                String estado = resultSet.getString("estado");
                String color = resultSet.getString("color");
                int espacio = resultSet.getInt("espacio");

                ParkingSpace parkingSpace = new ParkingSpace(id, placa, tipo_vehiculo, estado, color, espacio);
                // Aquí se llamará automáticamente al método toString() de ParkingSpace
                System.out.println(parkingSpace);
            }
            System.out.println("-------------------------------------------------------------");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Show();
    }
}
