package uom.team7.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class WinnerController {

    @FXML private Button okButton;

    @FXML
    public void okButton() throws IOException {
        String url ="https://www.youtube.com/watch?v=dQw4w9WgXcQ";
        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
        Stage stage = (Stage) okButton.getScene().getWindow();
        stage.close();

    }
}
