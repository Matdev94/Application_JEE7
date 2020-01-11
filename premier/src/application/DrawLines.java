package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;



import javafx.scene.shape.StrokeLineCap;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class DrawLines extends Application {
@Override
public void start(Stage primaryStage) {
// Titre de la fenêtre
primaryStage.setTitle("Dessins de 4 lignes et d'un rectangle");
// Création du décors
Group root = new Group() ;
// On place le décors dans la scène + taille et couleur de fond de la scène
Scene scene = new Scene(root,500,300,Color.GRAY);
// On remplit le décors...
Line ligne1 = new Line(10,10,200,50);
// avec une 1ère ligne
root.getChildren().add(ligne1);
Line ligne2 = new Line(10,50,200,110);
ligne2.setStroke(Color.PINK); // couleur rose
ligne2.setStrokeWidth(10); // largeur du trait
ligne2.setStrokeLineCap(StrokeLineCap.ROUND); //extrémités arrondies
// avec une 2ème ligne
root.getChildren().add(ligne2);
Text texte = new Text(20,180,"Une ligne bleue");
root.getChildren().add(texte);
Line ligne3 = new Line(20,250,220,150);
ligne3.setStroke(Color.BLUE);
ligne3.setStrokeWidth(15);
ligne3.setStrokeLineCap(StrokeLineCap.SQUARE); //extrémités carrées
// avec une 3ème ligne
root.getChildren().add(ligne3);
Line ligne4 = new Line(250,250,450,280);
ligne4.setStroke(Color.CORAL); // couleur corail
ligne4.setStrokeWidth(5); // largeur du trait
ligne4.setStrokeLineCap(StrokeLineCap.BUTT); //extrémités carrées
ligne4.setStrokeDashOffset(10);
ligne4.getStrokeDashArray().addAll(15d,5d); // traits tiretés
// avec une 4ème ligne
root.getChildren().add(ligne4);
Rectangle rect = new Rectangle(300,10,80,40);
rect.setFill(Color.RED);
// avec un rectangle
root.getChildren().add(rect);



// On place la scène dans la fenêtre théatre
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args) {
launch(args);
}
}