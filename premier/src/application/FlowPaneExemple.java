package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneExemple extends Application {
@Override
public void start(Stage primaryStage) {
//Espace horizontal et vertial de 10 entre les composants
FlowPane flow = new FlowPane(10,10) ;
//Marge de 10 entre le FlowPane et le cadre de la fenêtre
flow.setPadding(new Insets(10));
Label label = new Label("Vérifier votre classe:");
TextField nom = new TextField("2TSIRIS");
Button b1 = new Button("Validez");
Button b2 = new Button("Annulez");
flow.getChildren().addAll(label,nom,b1,b2);
Scene scene = new Scene(flow);
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args) {
launch(args);
}
}