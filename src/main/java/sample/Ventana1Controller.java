package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;

public class Ventana1Controller {

	@FXML
	Button b1;

	@FXML
	private void onButtonAbrirClicked() {
		System.out.println("Botón pulsado");
	}
	@FXML
	private void onMouseEntered(){
		System.out.println("Cambia de palabra");
		b1.setText("Cambia");
	}

	@FXML
	private void onMouseExit(){
		System.out.println("Vuelve la palabra de antes");
		b1.setText("Boton");
	}

}