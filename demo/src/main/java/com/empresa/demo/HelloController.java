package com.empresa.demo;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private TextField emailField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private PasswordField confirmPasswordField;
    @FXML
    private DatePicker registerDateField;
    @FXML
    private CheckBox privacyCheckBox;
    @FXML
    private CheckBox termsCheckBox;

    @FXML
    protected void onRegisterButtonClick() {
        confirmPasswordField.setVisible(true);
        registerDateField.setVisible(true);
        privacyCheckBox.setVisible(true);
        termsCheckBox.setVisible(true);

        if (!passwordField.getText().equals(confirmPasswordField.getText())) {
            showAlert("Las contraseñas no coinciden");
            return;
        }

        if (!privacyCheckBox.isSelected()) {
            showAlert("Debe aceptar la privacidad");
            return;
        }

        if (!termsCheckBox.isSelected()) {
            showAlert("Debe aceptar los términos y condiciones");
            return;
        }

        showAlert("Usuario registrado");
    }

    @FXML
    protected void onLoginButtonClick() {
        confirmPasswordField.setVisible(false);
        registerDateField.setVisible(false);
        privacyCheckBox.setVisible(false);
        termsCheckBox.setVisible(false);

        if (emailField.getText().equals("admin@gmail.com") && passwordField.getText().equals("123")) {
            showAlert("Inicio correcto");
        } else {
            showAlert("Correo o contraseña incorrectos");
        }
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}