package SILCExpoProject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Scene6Controller implements Initializable {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private ChoiceBox<String> roleChoice;

    @FXML
    private Label messageLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        roleChoice.getItems().addAll("Family", "Teacher", "Student");
    }

    @FXML

    private void attemptSignUp() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String role = roleChoice.getValue();

        if (role == null) {
            messageLabel.setText("Please select a role.");
            return;
        }

        boolean ok = AccountManager.signUp(username, password, role);

        if (ok) {
            messageLabel.setText("Sign up successful! Please log in.");
        } else {
            messageLabel.setText("Username already exists. Please choose another.");
        }
    }

    @FXML
    private void goToLogin() {
        try {
            Stage stage = (Stage) usernameField.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Scene5.fxml"));
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}