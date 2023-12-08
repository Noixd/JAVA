package com.lab4;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

     @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField AreaField;

    @FXML
    private TextField NumField;

    @FXML
    private TextField KField;

    @FXML
    private TextField PField;

    @FXML
    private TextArea OutputField;

    @FXML
    private Button EnterButton;

    @FXML
    private Button aboutButton;

    @FXML
    private Button closeButton;
 
    
    /** 
     * @param switchToSecondary(
     * @throws IOException
     */
    @FXML
    void initialize() {}

    
    /** 
     * @throws IOException
     * Метод перехода на окно с информацией об авторе
     */

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    /*
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
    
    /** 
     * @throws IOException
     */
    @FXML
    private void EnterAction() throws IOException {
        
         Audit cab = new Audit(Integer.parseInt(NumField.getText()), Double.parseDouble(AreaField.getText()));
         Lec leccab = new Lec(Integer.parseInt(KField.getText()));
         Comp compcab = new Comp(Integer.parseInt(PField.getText()));
         OutputField.setText("Info Audit\n" + cab.getInfo() +"\nInfo Lec\n" + leccab.getInfo() +"\nInfo Comp\n" + compcab.getInfo());
         initialize();
    }
}

