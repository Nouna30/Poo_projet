package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControlleurLog implements Initializable{
	 @FXML
	    private AnchorPane log;

	    @FXML
	    private AnchorPane pagechoix;

	    @FXML
	    private Label txterr;

	    @FXML
	    private TextField txtmdps;

	    @FXML
	    private TextField txtnom;

	    
	    
	    @FXML
	    void Statistique(ActionEvent event) {
	    	 try {
		            FXMLLoader loader = new FXMLLoader(getClass().getResource("Statistique.fxml"));
		            Parent root = (Parent) loader.load();
		                Stage stage = new Stage();
		                Scene scene = new Scene(root);
		                stage.setScene(scene);
		                stage.show();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
	    }
	    
	    @FXML
	    void Gestiobvendeur(ActionEvent event) {
	    	 try {
		            FXMLLoader loader = new FXMLLoader(getClass().getResource("Vendeur.fxml"));
		            Parent root = (Parent) loader.load();
		                Stage stage = new Stage();
		                Scene scene = new Scene(root);
		                stage.setScene(scene);
		                stage.show();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
	    }

	    @FXML
	    void Gestionbailleur(ActionEvent event) {
	    	 try {
		            FXMLLoader loader = new FXMLLoader(getClass().getResource("Bailleur.fxml"));
		            Parent root = (Parent) loader.load();
		                Stage stage = new Stage();
		                Scene scene = new Scene(root);
		                stage.setScene(scene);
		                stage.show();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
	    }

	    @FXML
	    void Gestionbien(ActionEvent event) {
	    	 try {
		            FXMLLoader loader = new FXMLLoader(getClass().getResource("Bien.fxml"));
		            Parent root = (Parent) loader.load();
		                Stage stage = new Stage();
		                Scene scene = new Scene(root);
		                stage.setScene(scene);
		                stage.show();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
	    }

	    @FXML
	    void Gestionlocataire(ActionEvent event) {
	    	 try {
		            FXMLLoader loader = new FXMLLoader(getClass().getResource("Locataire.fxml"));
		            Parent root = (Parent) loader.load();
		                Stage stage = new Stage();
		                Scene scene = new Scene(root);
		                stage.setScene(scene);
		                stage.show();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
	    }

	    @FXML
	    void Gestiontransaction(ActionEvent event) {
	    	 try {
		            FXMLLoader loader = new FXMLLoader(getClass().getResource("Transaction.fxml"));
		            Parent root = (Parent) loader.load();
		                Stage stage = new Stage();
		                Scene scene = new Scene(root);
		                stage.setScene(scene);
		                stage.show();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
	    }

	    @FXML
	    void Gestionvisite(ActionEvent event) {
	    	 try {
		            FXMLLoader loader = new FXMLLoader(getClass().getResource("Visite.fxml"));
		            Parent root = (Parent) loader.load();
		                Stage stage = new Stage();
		                Scene scene = new Scene(root);
		                stage.setScene(scene);
		                stage.show();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
	    }

	    @FXML
	    void gestionacheteur(ActionEvent event) {
	    	 try {
		            FXMLLoader loader = new FXMLLoader(getClass().getResource("Acheteur.fxml"));
		            Parent root = (Parent) loader.load();
		                Stage stage = new Stage();
		                Scene scene = new Scene(root);
		                stage.setScene(scene);
		                stage.show();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
	    }
    @FXML
    void login(ActionEvent event) {
       /*  for (Agent a : Main.Agents)
         {
        	 if (txtnom.getText().equals(a.getId()))
        	 {
        		 
        	 }
         }*/
    }

   
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		pagechoix.setVisible(true);
		
	}

}
