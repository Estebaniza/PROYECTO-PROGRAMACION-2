package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;
import java.net.URL;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SecondaryController {

    @FXML
    private Label plateLabel;

    @FXML
    private Label entryTimeLabel;

    @FXML
    private Label exitTimeLabel;

    @FXML
    private ImageView motoImageView;

    @FXML
    private ImageView logoImageView; // Imagen de fondo del logo

    private final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    @FXML
    private void initialize() {
        // Cargar la imagen del logo traslúcido
        URL logoUrl = getClass().getResource("/com/example/logo.jpg");
        if (logoUrl != null) {
            Image logo = new Image(logoUrl.toString());
            logoImageView.setImage(logo);
            logoImageView.setOpacity(0.3); // Hacer el logo traslúcido
        } else {
            System.err.println("La imagen del logo no se encontró.");
        }
    }

    // Método para mostrar la información de la moto
    public void displayMotoInfo(String plate) {
        plateLabel.setText("Placa: " + plate);

        // Establecer la hora de entrada actual
        LocalTime entryTime = LocalTime.now();
        entryTimeLabel.setText("Hora de entrada: " + entryTime.format(timeFormatter));

        // Configurar una hora de salida aproximada (por ejemplo, +2 horas)
        LocalTime exitTime = entryTime.plusHours(2);
        exitTimeLabel.setText("Hora de salida: " + exitTime.format(timeFormatter));

        // Cargar la imagen de la moto
        URL motoImageUrl = getClass().getResource("/com/example/moto.jpg");
        if (motoImageUrl != null) {
            Image motoImage = new Image(motoImageUrl.toString());
            motoImageView.setImage(motoImage);
        } else {
            System.err.println("La imagen moto.jpg no se encontró.");
        }
    }

    // Método que se llama cuando se hace clic en el botón "Volver a consultar"
    @FXML
    private void onBackButtonClick() {
        try {
            // Cargar la pantalla principal
            FXMLLoader loader = new FXMLLoader(getClass().getResource("primary.fxml"));
            Scene scene = new Scene(loader.load());

            // Obtener la ventana actual y establecer la nueva escena
            Stage stage = (Stage) plateLabel.getScene().getWindow(); // Suponiendo que plateLabel es un elemento visible en esta pantalla
            stage.setScene(scene);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
