package application;

import javafx.scene.Group;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
public class LabelSample extends Application {
Label label3 = new Label("Un label qui nécessite plusieurs lignes");

@Override
public void start(Stage stage) {
Scene scene = new Scene(new Group());
stage.setTitle("Que de labels!");
stage.setWidth(520);
stage.setHeight(180);
HBox hbox = new HBox();
Image image = new Image(getClass().getResourceAsStream("giphy.gif"));
Label label1 = new Label("Recherche");
label1.setGraphic(new ImageView(image));
label1.setFont(new Font("Arial", 30));
label1.setTextFill(Color.web("#0076a3"));
label1.setTextAlignment(TextAlignment.JUSTIFY);
Label label2 = new Label ("Valeurs");
label2.setFont(Font.font("Cambria", 32));
label2.setRotate(270);
label2.setTranslateY(50);
label3.setWrapText(true);
label3.setTranslateY(50);
label3.setPrefWidth(100);
hbox.setSpacing(10);
hbox.getChildren().add((label1));
hbox.getChildren().add(label2);
hbox.getChildren().add(label3);
((Group)scene.getRoot()).getChildren().add(hbox);
stage.setScene(scene);


stage.show();
}
public static void main(String[] args) {
launch(args);
}
}
