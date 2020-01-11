package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
public class BoiteDeDialogueFichiers extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(final Stage primaryStage) {
		BorderPane root = new BorderPane();
		primaryStage.setTitle("Test boite de dialogue fichiers");
		Button buttonLoad = new Button("Ouvrir");
		buttonLoad.setMinWidth(120);
		buttonLoad.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent arg0) {
				// Création de l'objet FileChooser
				FileChooser fileChooser = new FileChooser();
				// Filtrage par l'extension du fichier recherché, ici .txt
				FileChooser.ExtensionFilter extFilter =
						new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
				fileChooser.getExtensionFilters().add(extFilter);
				// Affichage de la boite de dialogue.
				// Elle retourne le fichier sélectionné en cliquant sur Ouvrir.
				File file = fileChooser.showOpenDialog(primaryStage);
				// On affiche son nom dans la console.
				System.out.println(file.getName());
			}
		});
		root.setCenter(buttonLoad);
		primaryStage.setScene(new Scene(root, 340, 120));
		primaryStage.show();
	}
}

/*
buttonLoad.@setOnAction(( arg0) -> {
// Création de l'objet FileChooser
FileChooser fileChooser = new FileChooser();
// Filtrage de l'extension du fichier recherché, ici .txt
FileChooser.ExtensionFilter extFilter =
new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
fileChooser.getExtensionFilters().add(extFilter);
// Affichage de la boite de dialogue.
// Elle retourne le fichier sélectionné en cliquant sur Ouvrir.
//File file = fileChooser.showOpenDialog(primaryStage());
// On affiche son nom dans la console.
//System.out.println(file.getName());//
};*/