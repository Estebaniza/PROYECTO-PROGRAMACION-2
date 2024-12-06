package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class PrimaryController {

    @FXML
    private TextField plateTextField;

    @FXML
    private Button submitButton;

    @FXML
    private ImageView logoImageView;  // Imagen del logo

    @FXML
    private void initialize() {
        // Convertir el texto del TextField a mayúsculas mientras se escribe
        plateTextField.setOnKeyTyped(this::convertToUpperCase);

        // Cargar la imagen del logo (traslúcida)
        Image logo = new Image(getClass().getResourceAsStream("/com/example/logo.jpg"));
        logoImageView.setImage(logo);
        logoImageView.setOpacity(0.3);  // Establecer opacidad para hacerlo traslúcido
    }

    // Método para convertir el texto a mayúsculas
    private void convertToUpperCase(KeyEvent event) {
        plateTextField.setText(plateTextField.getText().toUpperCase());
        plateTextField.positionCaret(plateTextField.getText().length());
    }

    @FXML
    private void onSubmitButtonClick() {
        String plate = plateTextField.getText();
        
        // Verificar si el campo de placa está vacío
        if (plate.isEmpty()) {
            showAlert("Error", "El campo de placa está vacío", "Ingrese una Placa Valida");
            return;
        }

        try {
            // Cargar la segunda pantalla (secondary.fxml)
            FXMLLoader loader = new FXMLLoader(getClass().getResource("secondary.fxml"));
            Scene scene = new Scene(loader.load());  // Cargar la nueva escena

            // Pasar la placa al controlador de la segunda pantalla
            SecondaryController secondaryController = loader.getController();
            secondaryController.displayMotoInfo(plate);

            // Obtener el Stage actual (la ventana principal)
            Stage stage = (Stage) submitButton.getScene().getWindow();  // Utilizamos el botón para obtener el Stage

            // Cambiar la escena de la ventana
            stage.setScene(scene);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para mostrar una alerta
    private void showAlert(String title, String header, String content) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
