/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuapp;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Observable;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.Label;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author marferp2
 */
public class MenuAppFXMLController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private ToggleGroup compra;
    @FXML
    private Button amazonBut;
    @FXML
    private Button bloggerBut;
    @FXML
    private Button ebayBut;
    @FXML
    private Button facebookBut;
    @FXML
    private Button googleBut;
    @FXML
    private RadioMenuItem comprarAmazon;
    @FXML
    private RadioMenuItem comprarEbay;
    
    Optional<String> resultBlog;
    
    private ResourceBundle bundle;
    
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       //Locale.setDefault(new Locale("en", "GB"));
       bundle = rb;
        
    }    

    @FXML
    private void amazonAct(ActionEvent event) {
        if(comprarAmazon.isSelected()){
            Alert alertAmazon = new Alert(AlertType.INFORMATION);
            alertAmazon.setTitle("Confirmación");
            alertAmazon.setHeaderText("Compra realizada correctamente");
            alertAmazon.setContentText("Has comprado en Amazon");
            alertAmazon.showAndWait();
        }else{
            Alert alertAmazon = new Alert(AlertType.INFORMATION);
            alertAmazon.setTitle("Error en la selección");
            alertAmazon.setHeaderText("No puede comprar en Amazon");
            alertAmazon.setContentText("Por favor, cambie la selección actual en el menú Opciones");
            alertAmazon.showAndWait();
        }
    }

    @FXML
    private void bloggerAct(ActionEvent event) {
        List<String> choices = new ArrayList<>();
        choices.add("El blog de Athlos");
        choices.add("El blog de Porthos");
        choices.add("El blog de Aramis");
        ChoiceDialog<String> dialog = new ChoiceDialog<>("El blog de Athlos", choices);
        dialog.setTitle("Selecciona un blog");
        dialog.setHeaderText("¿Qué blog quieres visitar?");
        dialog.setContentText("Elige:");
        
        resultBlog = dialog.showAndWait();
        label.setText("Visitando " + resultBlog.get());
        
    }

    @FXML
    private void ebayAct(ActionEvent event) {
        if(comprarEbay.isSelected()){
            Alert alertEbay = new Alert(AlertType.INFORMATION);
            alertEbay.setTitle("Confirmación");
            alertEbay.setHeaderText("Compra realizada correctamente");
            alertEbay.setContentText("Has comprado en Ebay");
            alertEbay.showAndWait();
        }else{
            Alert alertEbay = new Alert(AlertType.INFORMATION);
            alertEbay.setTitle("Error en la selección");
            alertEbay.setHeaderText("No puede comprar en Ebay");
            alertEbay.setContentText("Por favor, cambie la selección actual en el menú Opciones");
            alertEbay.showAndWait();
        }
    }

    @FXML
    private void facebookAct(ActionEvent event) {
        TextInputDialog dialog = new TextInputDialog("");
        dialog.setTitle("Introduce tu nombre");
        dialog.setHeaderText("¿Con qué usuario quieres escribir en Facebook?");
        dialog.setContentText("Introduce tu nombre:");
        
        Optional<String> resultFace = dialog.showAndWait();
        label.setText("Mensaje enviado como " + resultFace.get());
    }

    @FXML
    private void googleAct(ActionEvent event) {
    }
    
    private void updateLabel(String key){
        label.setText(bundle.getString(key));
    }
}
