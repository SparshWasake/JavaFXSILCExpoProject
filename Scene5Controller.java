package SILCExpoProject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Scene5Controller {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label messageLabel;

    @FXML
    private void attemptLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String role = Session.getCurrentRole();

        boolean ok = AccountManager.login(username, password, role);

        if (ok) {
            goToScene7();
        } else {
            messageLabel.setText("Invalid credentials for " + role);
            messageLabel.setStyle("-fx-text-fill: red;");
        }
    }

    private void goToScene7() {
        try {
            Stage stage = (Stage) usernameField.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Scene7.fxml"));
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
