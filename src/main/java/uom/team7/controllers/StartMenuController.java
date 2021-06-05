package uom.team7.controllers;

import java.io.IOException;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import uom.team7.App;

public class StartMenuController {

    @FXML
    private ToggleGroup NumPlayers;

    @FXML
    private void startGameButton() {
        ToggleButton selectedButton = (ToggleButton) NumPlayers.getSelectedToggle();
        if(selectedButton != null) {
            App.startGame(Integer.parseInt(selectedButton.getText()));
        }
    }

    @FXML
    private void ExitButton() {
        Platform.exit();
    }

    @FXML
    private void HowToPLayButton() throws IOException{
        String url_open ="https://docs.google.com/document/d/1acLcNAga5Q8TIbLqt7DTHUS2DIkE6y_vnBmF61aNWYc/edit?usp=sharing";
        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
    }

}
