package proyectodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static final String URL = "jdbc:mysql://localhost:3306/only_parking";  // Asegúrate de que este sea el nombre correcto
    public static final String USER = "root"; // Usuario de la base de datos
    public static final String PASSWORD = "Cambio123*"; // Contraseña de la base de datos
    

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

