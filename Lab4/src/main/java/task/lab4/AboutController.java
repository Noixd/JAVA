package com.lab4;

import java.io.IOException;
import javafx.fxml.FXML;

public class AboutController {

    
    /** 
     * @throws IOException
     */
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}