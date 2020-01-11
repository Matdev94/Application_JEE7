package application;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

class Gestionnaire implements EventHandler<MouseEvent> {
public void handle(MouseEvent event) {
System.out.println("Vous avez cliqué");
}
}