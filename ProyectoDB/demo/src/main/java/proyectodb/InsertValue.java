package proyectodb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertValue {

    public static void Insert(ParkingSpace parkingSpace) {
        String query = "INSERT INTO parking_spaces (id, placa, tipo_vehiculo, estado, color, espacio) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

                preparedStatement.setInt(1, parkingSpace.getId());  // ID del vehículo
                preparedStatement.setString(2, parkingSpace.getPlaca());  // Placa del vehículo
                preparedStatement.setString(3, parkingSpace.getTipoVehiculo());  // Tipo de vehículo
                preparedStatement.setString(4, parkingSpace.getEstado());  // Estado del vehículo
                preparedStatement.setString(5, parkingSpace.getColor());  // Color del vehículo
                preparedStatement.setInt(6, parkingSpace.getEspacio());  // Espacio de estacionamiento
                

            int rowsInserted = preparedStatement.executeUpdate();

            System.out.println("Vehicle inserted successfully! Rows inserted: " + rowsInserted);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ParkingSpace parkingSpace = new ParkingSpace(1, "ABC123", "Bicicleta", "Estacionado", "Rojo", 5);
        
        Insert(parkingSpace);
    }
}
