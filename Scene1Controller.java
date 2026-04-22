package SILCExpoProject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Scene1Controller implements Initializable {

    @FXML
    private ChoiceBox<String> userType;

    @FXML
    private Button confirmButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        userType.getItems().addAll("Family", "Teacher", "Student");
    }

    @FXML
    private void handleConfirm() throws IOException {
        String choice = userType.getValue();

        if (choice == null) {
            return;
        }

        Session.setCurrentRole(choice);

        String fxmlToLoad = switch (choice) {
            case "Family" -> "Scene2.fxml";
            case "Teacher" -> "Scene3.fxml";
            case "Student" -> "Scene4.fxml";
            default -> null;
        };

        if (fxmlToLoad == null)
            return;

        Stage stage = (Stage) confirmButton.getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource(fxmlToLoad));
        stage.setScene(new Scene(root));
    }
}
