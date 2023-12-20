package com.example.lab4_eliz;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * Office window controller
 */

public class OfficeController {

    @FXML
    private Button EnterButton;

    @FXML
    private TextArea OutputField;

    @FXML
    private Button aboutButton;

    @FXML
    private Button closeButton;

    @FXML
    private TextField corridorareaField;

    @FXML
    private TextField heigthField;

    @FXML
    private Button hostelButton;

    @FXML
    private TextField lengthField;

    @FXML
    private TextField numroomsField;

    @FXML
    private TextField paintusageField;

    @FXML
    private Button roomButton;

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
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    /** 
     * @throws IOException
     */
    @FXML
    private void EnterAction() throws IOException {

        OfficeRoom office = new OfficeRoom(Double.parseDouble(lengthField.getText()), Double.parseDouble(whidthField.getText()), Double.parseDouble(heigthField.getText()), Integer.parseInt(numroomsField.getText()), Double.parseDouble(corridorareaField.getText()), Double.parseDouble(paintusageField.getText()));
        OutputField.setText("Info office\n" + office.getInfo() + "\nPaint usage: " + office.calculateCeilingPaintUsage());
        initialize();
    }
}

