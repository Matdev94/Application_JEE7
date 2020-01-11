package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class BorderPaneEx12 extends Application {
@Override
public void start(Stage primaryStage) {
// Titre de la fenêtre
primaryStage.setTitle("Un exemple de BorderPane");
// Création de la racine - decors -
BorderPane root = new BorderPane() ;
//Installation du gestionnaire
root.setOnMouseClicked(new EventHandler<MouseEvent>() {
	public void handle(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("Vous avez cliqué");
		
		MouseButton b = arg0.getButton();
		System.out.println(b);
		//OU System.out.println(b.name());
		// Coordonnées relatives du clic par-rapport à la source de l'événement
		System.out.println("X : "+arg0.getX());
		System.out.println("Y : "+arg0.getY());
		// Coordonnées relatives du clic par-rapport à l'écran
		System.out.println("Dans l'écran X : "+arg0.getScreenX());
		System.out.println("Dans l'écran Y : "+arg0.getScreenY());
		// Coordonnées relatives du clic par-rapport à la scène
		System.out.println("Dans la scène X : "+arg0.getSceneX());
		System.out.println("Dans la scène Y : "+arg0.getSceneY());
		System.out.println("Nombre de clic : "+arg0.getClickCount());
		
	}
		
});
// Création de la scène, association du décors et de la scène, taille de la scène
Scene scene = new Scene(root,400,300);
// On place la scène dans la fenêtre
primaryStage.setScene(scene);
// On affiche la fenêtre
primaryStage.show();
}
public static void main(String[] args) {
launch(args);
}
}