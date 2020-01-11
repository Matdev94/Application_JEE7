package vue;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;


import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import application.DaoInvites;
import model.Invite;

public class Controleur {
private DaoInvites daoinvites ;
public Controleur() {
daoinvites = new DaoInvites();
}
@FXML
private TextField nom ;
@FXML
private TextField prenom ;
@FXML
private ListView<Invite> invites ;
private ObservableList<Invite> listeinvites = FXCollections.observableArrayList();
@FXML
private void initialize() {
invites.setItems(listeinvites);
}
@FXML
private void ajouterInvite() {
String Nom = nom.getText() ;
String Prenom = prenom.getText();
Invite i = new Invite(Nom,Prenom);
daoinvites.stocker(i);
nom.setText("");
prenom.setText("");
}
@FXML
private void annuler() {
nom.setText("");
prenom.setText("");
}
@FXML
private void voirtouslesinvites() {
listeinvites.clear();
List<Invite> lesinvites = daoinvites.voirlesinvites();
for (Invite i : lesinvites)
listeinvites.add(i);
}
@FXML
private void supprimerinvite(){
Invite sel = invites.getSelectionModel().getSelectedItem();
daoinvites.supprimer(sel);
voirtouslesinvites();
}
}