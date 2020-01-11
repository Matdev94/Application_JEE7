package application;

import javafx.application.Application;
import javafx.stage.Stage;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
public class DatePickerSample extends Application {
private Stage stage;
String valeur = null ;
private DatePicker checkInDatePicker;



public static void main(String[] args) {
Locale.setDefault(Locale.FRANCE);
launch(args);
}
@Override
public void start(Stage stage) {
this.stage = stage;
stage.setTitle("DatePickerSample ");
initUI();
stage.show();
}
private void initUI() {
VBox vbox = new VBox(20);
vbox.setStyle("-fx-padding: 10;");
Scene scene = new Scene(vbox, 400, 300);
stage.setScene(scene);
checkInDatePicker = new DatePicker();
// On affiche la date d'aujourd'hui par défaut
checkInDatePicker.setValue(LocalDate.now());
GridPane gridPane = new GridPane();
gridPane.setHgap(10);
gridPane.setVgap(10);
Label checkInlabel = new Label("Date:");
gridPane.add(checkInlabel, 0, 0);
GridPane.setHalignment(checkInlabel, HPos.LEFT);
gridPane.add(checkInDatePicker, 1, 0);
Button ok = new Button("OK");
ok.setPrefWidth(100);
gridPane.add(ok, 5, 0);
// On récupère la date sélectionnée en cliquant sur OK
ok.setOnAction((arg)-> {
// La date lue est de type LocalDate, on la formate au modèle dd-MM-yyyy
valeur = checkInDatePicker.getValue().format(
DateTimeFormatter.ofPattern("dd-MM-yyyy"));
System.out.println(valeur);
});
vbox.getChildren().add(gridPane);
}
}