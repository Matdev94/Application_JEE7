package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class StackPaneExemple extends Application {
@Override
public void start(Stage primaryStage) {
StackPane stack = new StackPane();
Rectangle helpIcon = new Rectangle(30.0, 25.0);
helpIcon.setFill(new LinearGradient(0,0,0,1, true, CycleMethod.NO_CYCLE,
new Stop[]{
new Stop(0,Color.web("#4977A3")),
new Stop(0.5, Color.web("#B0C6DA")),
new Stop(1,Color.web("#9CB6CF")),}));
Text helpText = new Text("?");
helpText.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
//Définit la couleur de l'intérieur de la forme
helpText.setFill(Color.WHITE);
//Définit la couleur du trait qui entoure (marque) la forme
helpText.setStroke(Color.web("#7080A0"));
stack.getChildren().addAll(helpIcon, helpText);
stack.setAlignment(Pos.CENTER_RIGHT); // Right-justify nodes in stack
StackPane.setMargin(helpText, new Insets(0, 10, 0, 0)); // Center "?"
Scene scene = new Scene(stack);
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args) {
launch(args);
}
}