package com.example.lab4_eliz;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * Room window controller
 */

public class PrimaryController {

    @FXML
    private Button EnterButton;

    @FXML
    private TextArea OutputField;

    @FXML
    private Button aboutButton;

    @FXML
    private Button closeButton;

    @FXML
    private TextField heigthField;

    @FXML
    private Button hostelButton;

    @FXML
    private TextField lengthField;

    @FXML
    private Button officeButton;

    @FXML
    private TextField whidthField;

    @FXML
    void initialize() {}

    /**
     * Метод управления кнопкой Close
     */
    @FXML
    private void close() {
        App.Close();
    }

    
    /** 
     * @throws IOException
     * Метод управления кнопкой Enter
     */

    @FXML
    private void switchToAbout() throws IOException {
        App.setRoot("about");
    }

    @FXML
    private void switchToHostel() throws IOException {
        App.setRoot("hostelView");
    }

    @FXML
    private void switchToOffice() throws IOException {
        App.setRoot("officeView");
    }
    
    /** 
     * @throws IOException
     */
    @FXML
    private void EnterAction() throws IOException {
        
         Room cab = new Room(Double.parseDouble(lengthField.getText()), Double.parseDouble(whidthField.getText()), Double.parseDouble(heigthField.getText()));
         OutputField.setText("Info Room\n" + cab.getInfo() + "\nWall area: " + cab.calculateWallArea());
         initialize();
    }
}

