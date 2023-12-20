package com.example.lab4_eliz;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * Hostel window controller
 */
public class HostelController {



    @FXML
    private Button aboutButton;

    @FXML
    private Button closeButton;

    @FXML
    private TextField heigthField;

    @FXML
    private TextField lenghtField;

    @FXML
    private Button officeButton;

    @FXML
    private TextField priceField;

    @FXML
    private Button roomButton;

    @FXML
    private TextField tenantsField;

    @FXML
    private TextField whidthField;

    @FXML
    private TextArea OutputField;

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
    private void switchToOffice() throws IOException {
        App.setRoot("officeView");
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
        
         HostelRoom hostel = new HostelRoom(Double.parseDouble(lenghtField.getText()), Double.parseDouble(whidthField.getText()), Double.parseDouble(heigthField.getText()), Integer.parseInt(tenantsField.getText()), Double.parseDouble(priceField.getText()));

         OutputField.setText("Info hostel\n" + hostel.getInfo() +"\nIncome per day: " + hostel.calculateIncomePerDay());
         initialize();
    }
}

