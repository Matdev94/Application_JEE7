package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;

public class ListViewExemple extends Application {
	
public void start(Stage primaryStage) {
	
primaryStage.setTitle("List View Exemple");
StackPane root = new StackPane();
//Création de l'ObservableList
ObservableList<String> names = FXCollections.observableArrayList("Adam",

"Alex", "Alfred", "Albert",
"Brenda", "Connie", "Derek", "Donny",

"Lynne", "Myrtle", "Rose", "Rudolph",
"Tony", "Trudy", "Williams", "Zach"
);




//Création de la ListView
ListView<String> listView = new ListView<String>(names);
listView.setEditable(true);
root.getChildren().add(listView);
primaryStage.setScene(new Scene(root, 300,280));
primaryStage.show();
}
public static void main(String[] args) {
launch(args);
}
}