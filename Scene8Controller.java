package SILCExpoProject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Scene8Controller {
    @FXML
    private TableView<ScheduleItem> scheduleTable;

    @FXML
    private TableColumn<ScheduleItem, String> periodCol;

    @FXML
    private TableColumn<ScheduleItem, String> classCol;

    @FXML
    private TableColumn<ScheduleItem, String> roomCol;

    @FXML
    private void initialize() {
        periodCol.setCellValueFactory(new PropertyValueFactory<>("period"));
        classCol.setCellValueFactory(new PropertyValueFactory<>("className"));
        roomCol.setCellValueFactory(new PropertyValueFactory<>("room"));

        scheduleTable.getItems().addAll(
                new ScheduleItem("Period 1", "Hindi", "Room x"),
                new ScheduleItem("Period 2", "Social Studies", "Room x"),
                new ScheduleItem("Period 3", "Cricket", "Room x"));
    }

    @FXML
    private void logout() {
        try {
            Stage stage = (Stage) scheduleTable.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}