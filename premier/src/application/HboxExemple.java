package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class HboxExemple extends Application {
@Override
public void start(Stage primaryStage) {
primaryStage.setTitle("HBox avec rectangles");
//VBox avec un espace de 27 pixels entre les composants
VBox vbox = new VBox(27) ;
//Marge de 2 pixels entre la VBox et la bordure de la fenêtre
vbox.setPadding(new Insets(2));
Rectangle r1 = new Rectangle(50,50) ;
Rectangle r2 = new Rectangle(100,100) ;
Rectangle r3 = new Rectangle(25,100) ;
Rectangle r4 = new Rectangle(100,25) ;
//Marge supplémentaire de 10 pixels entre le 1er rectangle et les autres éléments
vbox.setMargin(r1, new Insets(10,10,10,10));
vbox.getChildren().addAll(r1,r2,r3,r4);
Scene scene = new Scene(vbox);
primaryStage.setScene(scene);
primaryStage.show();
}
/*
//HBox avec un espace de 10 pixels entre les composants contenus
HBox hbox = new HBox(10) ;
//Marge de 5 pixels entre la HBox et la bordure de la fenêtre
hbox.setPadding(new Insets(5));
Rectangle r1 = new Rectangle(50,50) ;
Rectangle r2 = new Rectangle(100,100) ;
Rectangle r3 = new Rectangle(25,100) ;
Rectangle r4 = new Rectangle(100,25) ;
// Marge supplémentaire de 10 pixels entre le 1er rectangle et les autres éléments
HBox.setMargin(r1, new Insets(10,10,10,10));
hbox.getChildren().addAll(r1,r2,r3,r4);
Scene scene = new Scene(hbox);
primaryStage.setScene(scene);
primaryStage.show();
}
*/
public static void main(String[] args) {
launch(args);
}
}
