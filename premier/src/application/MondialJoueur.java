package application;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class MondialJoueur extends Application {

	public void start(Stage primaryStage) {

		primaryStage.setTitle("Selection des joueurs du mondial");


		MenuBar menubar = new MenuBar();
		//Création du menu principal Fichiers
		Menu menufichier= new Menu("Fichiers");
		//Création du sous choix Nouveau associé avec une image

		MenuItem nouveau=new MenuItem();

		nouveau.setText("Nouveau");


		//Création du sous choix Ouvrir associé avec une combinaiason de touches
		MenuItem ouvrir = new MenuItem("Ouvrir");

		//Création du sous choix Enregistrer
		MenuItem sauver = new MenuItem("Enregistrer");
		//Création du sous choix Quitter
		MenuItem quitter = new MenuItem("Quitter");
		//Ajout des sous sous choix au menu Fichier avec un séparateur
		menufichier.getItems().addAll(nouveau, ouvrir, sauver ,new SeparatorMenuItem(), quitter);

		//Création des menus principaux Vue et Alarme
		Menu menumatch = new Menu("Match");
		RadioMenuItem vue1 = new RadioMenuItem("Poule");
		RadioMenuItem vue2 = new RadioMenuItem("1/8Finale");
		RadioMenuItem vue3 = new RadioMenuItem("1/4Finale");
		RadioMenuItem vue4 = new RadioMenuItem("1/2Finale");
		RadioMenuItem vue5 = new RadioMenuItem("FINALE");
		menumatch.getItems().addAll(vue1, vue2, vue3, vue4);
		Menu menustat = new Menu("Statistiques");

		Button buttonvalider= new Button("Valider");
		Button buttonAnnuler= new Button("Annuler");
		HBox hboxviewButton= new HBox(10);
		hboxviewButton.getChildren().addAll(buttonvalider, buttonAnnuler);



		//Ajout des menus à la barre de menus
		menubar.getMenus().addAll(menufichier, menumatch, menustat);

		String nomsdesjoueurs[] = {"Lloris", "Ruffier", "Landreau", "Debuchy", "Sagna", "Koscielny",
				"Mangala", "Sakho", "Varane", "Evra", "Digne",
				"Cabaye", "Pogba", "Matuidi", "Mavuba", "Sissoko",
				"Schneiderlin", "Valbuena",
				"Benzema", "Cabella", "Giroud", "Griezmann", "Rémy"};
		ObservableList<String> lesnoms = FXCollections.observableArrayList(nomsdesjoueurs);
		
		ListView<String> listView = new ListView<String>(lesnoms);

		ListView<String> listView2 = new ListView<String>();

		ChoiceBox<String> choix = new ChoiceBox<String>() ;
		choix.setItems(FXCollections.observableArrayList("Poule","1/8 Finale","1/4 Finale","1/2 Finale","Finale"));

		choix.getSelectionModel().select(0);
		Label phase= new Label();
		phase.setText("Phase");
		phase.setAlignment(Pos.TOP_LEFT);
		
		Label contre= new Label();
		contre.setText("Contre");
		contre.setAlignment(Pos.TOP_RIGHT);

		BorderPane bordpaner =new BorderPane();
        bordpaner.setTop(menubar);
		bordpaner.setCenter(choix);
		bordpaner.setBottom(hboxviewButton);
		bordpaner.setLeft(listView);
		bordpaner.setRight(listView2);


		Scene scene = new Scene(bordpaner, 700,400);

		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}


