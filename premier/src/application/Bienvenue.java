package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage; 
public class Bienvenue extends Application {



	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("JavaFX Bienvenue");
		GridPane grid = new GridPane();
		// La grille est centrée dans le panneau
		grid.setAlignment(Pos.CENTER);
		//Largeur de l'espacement horizontal entre les cellules
		grid.setHgap(10);
		//Largeur de l'espacement vertical entre les cellules
		grid.setVgap(10);
		//Marge entre la grille et la bordure de la fenêtre
		grid.setPadding(new Insets(25, 25, 25, 25));
		Text scenetitle = new Text("Bienvenue sur votre site préféré");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		//Ajout du texte scenetitle en colonne 0 et ligne 0 étalé sur 2 colonnes et 1 ligne
		grid.add(scenetitle, 0, 0, 2, 1);
		Label userName = new Label("Nom d'utilisateur:");
		//Ajout du label userName en colonne 0 et ligne 1
		grid.add(userName, 0, 1);
		TextField userTextField = new TextField();
		//Ajout du champ userTextField en colonne 1 et ligne 1
		grid.add(userTextField, 1, 1);
		Label pw = new Label("Mot de passe:");
		//Ajout du label pw en colonne 0 et ligne 2
		grid.add(pw, 0, 2);
		PasswordField pwBox = new PasswordField();
		//Ajout du champ pwBox en colonne 1 et ligne 2
		grid.add(pwBox, 1, 2);
		Button btn = new Button("Validez");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				String nom = userTextField.getText();
				String mp = pwBox.getText() ;
				Text message= new Text("N'oubliez pas de valider");	

				if (nom.length() !=1 && mp.length()!=1) {
					
					System.out.println("Nom:"+nom+" Mdp: "+mp);
				}
				else {
					message.setFill(Color.FIREBRICK);
					message.setText("N'oubliez pas de remplir les 2 champs!");
			}}
		});
		//Ajout du bouton btn en colonne 1 et ligne 4 et justifié à droite
		GridPane.setHalignment(btn, HPos.RIGHT) ;
		grid.add(btn,1, 4);
		Text message = new Text("N'oubliez pas de valider!");
		message.setFont(Font.font("Tahoma", FontWeight.NORMAL, 14));
		//Ajout du texte message en colonne 0 et ligne 10 étalé sur 2 colonnes et 1 ligne
		grid.add(message, 0, 10, 2, 1);

		//On crée le AnchorPane
		AnchorPane ancre = new AnchorPane() ;
		//On ajoute séparément la grille et le message
		ancre.getChildren().addAll(grid,message);
		//On ancre la grilxXxXXXle en haut
		AnchorPane.setTopAnchor(grid, 0.0);
		//On ancre le message en bas
		AnchorPane.setBottomAnchor(message, 10.0);
		Scene scene = new Scene(ancre);
	
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}