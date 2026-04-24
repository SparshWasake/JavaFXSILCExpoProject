package SILCExpoProject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class Scene9Controller {

    @FXML
    private ListView<String> studentList;

    @FXML
    private void initialize() {
        studentList.getItems().addAll(
                "Sparsh Wasake",
                "Aryan Sorrot",
                "Aarin Mahajan",
                "Aahan Patel",
                "Agastya Pande");
    }

    @FXML
    private void logout() {
        try {
            Stage stage = (Stage) studentList.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
            stage.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
