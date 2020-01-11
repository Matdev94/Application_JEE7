package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;



import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
public class Style1 extends Application {
@Override
public void start(Stage primaryStage) {
GridPane grid = new GridPane();

Scene scene = new Scene(grid, 330, 275);
scene.getStylesheets().add("application/application.css");
grid.setAlignment(Pos.CENTER);
grid.setHgap(10);
grid.setVgap(10);
grid.setPadding(new Insets(25, 25, 25, 25));
Text scenetitle = new Text("Bienvenue");
// ID CSS «bienvenue» pour le Text scenetitle
scenetitle.setId("bienvenue");
grid.add(scenetitle, 0, 0, 2, 1);
Label userName = new Label("Nom d'utilisateur:");
grid.add(userName, 0, 1);
TextField userTextField = new TextField();
userTextField.setPromptText("Votre nom");
grid.add(userTextField, 1, 1);
Label pw = new Label("Mot de passe:");
grid.add(pw, 0, 2);
scene.getStylesheets().add("application/application.css");
PasswordField pwBox = new PasswordField();
pwBox.setPromptText("Votre mot de passe");
grid.add(pwBox, 1, 2);
Button valid = new Button("Validez");
// classe CSS « button1 » pour le bouton valid
valid.getStyleClass().add("button1");
Button annul = new Button("Annulez");
Button qubutton = new Button("Questions?");
// ID CSS « questions » pour le bouton qubutton
qubutton.setId("questions");
HBox hbBtn = new HBox(10);
hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
hbBtn.getChildren().addAll(qubutton,annul, valid);
grid.add(hbBtn, 0, 4, 2, 1);
final Text actiontarget = new Text();


actiontarget.setId("message");
grid.add(actiontarget, 1, 6);
valid.setOnAction((ev) -> {
String nom = userTextField.getText();
String pwd = pwBox.getText();
if (nom.isEmpty() || pwd.isEmpty())
actiontarget.setText("Champs incomplets");
});
annul.setOnAction((ev)-> {
userTextField.setText("");
pwBox.setText("");
actiontarget.setText("");
});
primaryStage.setTitle("Bienvenue à Java FX");
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args) {
launch(args);
}
}
