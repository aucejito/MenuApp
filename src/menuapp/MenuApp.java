/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuapp;

import java.util.Locale;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author marferp2
 */
public class MenuApp extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Locale locale = Locale.getDefault();
        ResourceBundle bundle = ResourceBundle.getBundle("menuapp.base", locale);
        
        Parent root = FXMLLoader.load(getClass().getResource("MenuAppFXML.fxml"), bundle);
              
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
