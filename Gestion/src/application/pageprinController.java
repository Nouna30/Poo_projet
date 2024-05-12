package application;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class pageprinController {
     
    @FXML
    private Button btnclient;

    @FXML
    private Button btnbien;

    @FXML
    private Button btnclientB;


    @FXML
    private Button sta;


    
    @FXML
    void ouvrefenetre5(ActionEvent event) {
        try {
            // Charger le contenu de la nouvelle fenêtre depuis le fichier FXML
            Parent root1 = FXMLLoader.load(getClass().getResource("Statistique.fxml"));
            Scene scene1 = new Scene(root1);

            // Créer une nouvelle fenêtre et définir la scène avec le contenu chargé
            Stage stage1 = new Stage();
            stage1.setScene(scene1);

            // Afficher la nouvelle fenêtre
            stage1.show();	   
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
    @FXML
    void ouvrefenetre3(ActionEvent event) {
        
        try {
            // Charger le contenu de la nouvelle fenêtre depuis le fichier FXML
            Parent root1 = FXMLLoader.load(getClass().getResource("Transaction.fxml"));
            Scene scene1 = new Scene(root1);

            // Créer une nouvelle fenêtre et définir la scène avec le contenu chargé
            Stage stage1 = new Stage();
            stage1.setScene(scene1);

            // Afficher la nouvelle fenêtre
            stage1.show();	   
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
        @FXML
        void ouvrefenetre4(ActionEvent event) {
            try {
                // Charger le contenu de la nouvelle fenêtre depuis le fichier FXML
                Parent root1 = FXMLLoader.load(getClass().getResource("Acheteur.fxml"));
                Scene scene1 = new Scene(root1);

                // Créer une nouvelle fenêtre et définir la scène avec le contenu chargé
                Stage stage1 = new Stage();
                stage1.setScene(scene1);

                // Afficher la nouvelle fenêtre
                stage1.show();	   
            } catch (Exception e) {
            	e.printStackTrace();
            }
        
    }
    @FXML
    void ouvrefenetre2(ActionEvent event) {
        try {
            // Charger le contenu de la nouvelle fenêtre depuis le fichier FXML
            Parent root1 = FXMLLoader.load(getClass().getResource("Vendeur.fxml"));
            Scene scene1 = new Scene(root1);

            // Créer une nouvelle fenêtre et définir la scène avec le contenu chargé
            Stage stage1 = new Stage();
            stage1.setScene(scene1);

            // Afficher la nouvelle fenêtre
            stage1.show();	   
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
}
