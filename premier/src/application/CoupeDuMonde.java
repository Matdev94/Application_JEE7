package application;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CoupeDuMonde extends Application {

	@Override
	public void start(Stage primaryStage) {
			primaryStage.setTitle("Sélection des joueurs du mondial");
			BorderPane root = new BorderPane();
			MenuBar menubar = new MenuBar();
			
			Menu menufichier= new Menu("Fichier");
			MenuItem nouveau = new MenuItem("Nouveau", new ImageView("newdoc.png"));
			MenuItem ouvrir = new MenuItem("Ouvrir");
			ouvrir.setAccelerator(KeyCombination.keyCombination("Ctrl+O"));
		//	ouvrir.setAccelerator(new KeyCodeCombination(KeyCode.O,KeyCombination.SHORTCUT_DOWN));
		ouvrir.setOnAction((ActionEvent t) -> {
				System.out.println("Choix Ouvrir");
				});
			//MenuItem sauver = new MenuItem("Enregistrer");
			Menu sauver = new Menu("Enregistrer");
			MenuItem quitter = new MenuItem("Quitter");
			menufichier.getItems().addAll(nouveau,ouvrir,sauver,new SeparatorMenuItem(),quitter);
			
			MenuItem annule = new MenuItem("Annuler");
			MenuItem ou = new MenuItem("Ou");
			MenuItem enregistre = new MenuItem("Enregistrer");
			sauver.getItems().addAll(ou,annule,enregistre);
			
			Menu menuphase = new Menu("Match");
			CheckMenuItem vue1 = new CheckMenuItem("Poules");
			CheckMenuItem vue2 = new CheckMenuItem("Quart de finale");
			CheckMenuItem vue3 = new CheckMenuItem("Demi Finale");
			CheckMenuItem vue4 = new CheckMenuItem("Finale");
			
			vue1.setSelected(true);
			
			menuphase.getItems().addAll(vue1, vue2, vue3, vue4);
			
			Menu menustat = new Menu("Statistiques");
			ToggleGroup etat = new ToggleGroup() ;
			RadioMenuItem active = new RadioMenuItem("Activée");
			RadioMenuItem desactive = new RadioMenuItem("Désactivée");
			active.setToggleGroup(etat);
			desactive.setToggleGroup(etat);
			desactive.setSelected(true);
			menustat.getItems().addAll(active,desactive);
			
			menubar.getMenus().addAll(menufichier,menuphase,menustat);
			
			root.setTop(menubar);
			
			GridPane grille = new GridPane() ;
			
			//Largeur de l'espacement horizontal entre les cellules 
			grille.setHgap(10);
			//Largeur de l'espacement vertical entre les cellules 
			grille.setVgap(10);
			//Marge entre la grille et la bordure de la fenêtre
			grille.setPadding(new Insets(10, 10, 20, 30));

			ChoiceBox<String> choix = new ChoiceBox<String>() ;
			choix.setItems(FXCollections.observableArrayList("Poule","1/8 Finale","1/4 Finale","1/2 Finale","Finale"));
			Text type = new Text() ;
			type.setText("Match du mondial");
			type.setFont(Font.font("Tahoma", FontWeight.NORMAL, 25));
			grille.add(type, 1, 0);
			GridPane.setHalignment(type, HPos.RIGHT);
			
			Text phase = new Text() ;
			phase.setText("Phase :");
			phase.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			grille.add(phase, 0, 1);
			GridPane.setHalignment(phase, HPos.RIGHT);
			
			choix.getSelectionModel().select(0);
			grille.add(choix, 1, 1);
			GridPane.setHalignment(choix, HPos.CENTER);
			
			Label contre = new Label() ;
			contre.setText("Contre :");
			contre.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			grille.add(contre, 2, 1);
			GridPane.setHalignment(contre, HPos.CENTER);
			
			TextField adversaire = new TextField() ;
			adversaire.setPromptText("Entrer l'adversaire");
			grille.add(adversaire, 3, 1,2,1);
			
			Text joueurs = new Text() ;
			joueurs.setText("Les joueurs");
			joueurs.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			grille.add(joueurs, 0, 4);
			GridPane.setHalignment(joueurs, HPos.CENTER);
			
			String [] nomsjoueurs = {"Lloris", "Ruffier", "Landreau",
					"Debuchy", "Sagna", "Koscielny", "Mangala", "Sakho", "Varane", "Evra", "Digne",
					 "Cabaye", "Pogba", "Matuidi", "Mavuba", "Sissoko", "Schneiderlin", "Valbuena",
					 "Benzema", "Cabella", "Giroud", "Griezmann", "Rémy"};
			
			ObservableList<String> lesnoms = FXCollections.observableArrayList(nomsjoueurs);
	            
	        
	        ListView<String> listView = new ListView<String>(lesnoms);
	        grille.add(listView, 0, 5,1,10);
	        
	        Button b1 = new Button(" > ");
	       
	        Button b2 = new Button(" < ");
	       
	        grille.add(b1, 1, 7);
	        grille.add(b2, 1, 10);
	        GridPane.setHalignment(b1, HPos.CENTER);
	        GridPane.setHalignment(b2, HPos.CENTER);
	        
	        b1.setFont(javafx.scene.text.Font.font("Tahoma", FontWeight.BOLD, 14));
	        b2.setFont(javafx.scene.text.Font.font("Tahoma", FontWeight.BOLD, 14));
	        
	        Text Equipe = new Text() ;
	        Equipe.setText("L'équipe");
	        Equipe.setFont(javafx.scene.text.Font.font("Tahoma", FontWeight.NORMAL, 20));
			grille.add(Equipe, 3, 4);
			GridPane.setHalignment(Equipe, HPos.CENTER);
	        
	        ObservableList<String> equipe = FXCollections.observableArrayList();
	        ListView<String> vueequipe = new ListView<String>(equipe);
	        grille.add(vueequipe,2, 5,3,10);
	        
	        Button annuler = new Button("Annuler") ;
	        annuler.setPrefWidth(100);
	        Button valider = new Button ("Valider") ;
	        ////////////////////////////////////////////////
	        valider.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent event) {
					String typematch = choix.getValue();
					
					String contre = adversaire.getText();
					String selection="" ;
					for (int i=0; i<equipe.size();i++)
						selection = selection+equipe.get(i)+",";
					
					String maselection = typematch+" contre "+contre+"; Sélection:"+selection;
					System.out.println(maselection);
					
				}
 	        });
	        ////////////////////////////////////////////
	        annuler.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent event) {
					// TODO Auto-generated method stub
					equipe.clear();
					lesnoms.setAll(nomsjoueurs);
					choix.getSelectionModel().select(0);
					adversaire.clear();
					
				}
	        });
	        ///////////////////////////////////////////
	        b1.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent event) {
					// TODO Auto-generated method stub
					String joueur = listView.getSelectionModel().getSelectedItem();
					if (joueur !=null) {
						System.out.println("Joueur sélectionné:"+joueur);
						equipe.add(joueur);
						lesnoms.remove(joueur);
					}
				}
	        });
	        ///////////////////////////////////////////////////
	        b2.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent event) {
					// TODO Auto-generated method stub
					String joueur = vueequipe.getSelectionModel().getSelectedItem();
					if (joueur !=null) {
						System.out.println("Joueur sélectionné:"+joueur);
						lesnoms.add(joueur);
						equipe.remove(joueur);
					}
				}
	        });
	        ///////////////////////////////////////////////////
	        valider.setPrefWidth(100);
	        HBox hbox = new HBox() ;
	        HBox.setMargin(annuler, new Insets(10,10,20,420));
	        HBox.setMargin(valider, new Insets( 10,0,0,50));
	        
	        hbox.getChildren().addAll(annuler,valider);
	        
	        root.setBottom(hbox);
	        
	        root.setCenter(grille);
			Scene scene = new Scene(root, 750,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		}		


	public static void main(String[] args) {
		launch(args);
	}
}