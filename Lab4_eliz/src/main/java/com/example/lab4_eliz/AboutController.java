package com.example.lab4_eliz;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 * About window controller
 */

public class AboutController {

    
    /** 
     * @throws IOException
     */
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}