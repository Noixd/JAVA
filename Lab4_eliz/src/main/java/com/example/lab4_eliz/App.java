package com.example.lab4_eliz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;


    
    /** 
     * @param stage
     * @throws IOException
     */
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 650, 650);
        stage.setScene(scene);
        stage.show();
        stage.setTitle("Lab4");
    }

    
    /** 
     * @param fxml
     * @throws IOException
     */
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    
    /** 
     * @param fxml
     * @return Parent
     * @throws IOException
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
    
    /**
     * Control for close button
     */
    static void Close() {
        System.exit(0);
    }

    /**
     * Main - launch
     * @param args
     */
    public static void main(String[] args) {
        launch();
    }


}