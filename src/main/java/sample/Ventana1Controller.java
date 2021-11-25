package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.w3c.dom.Text;

import java.awt.*;
import java.util.ArrayList;

public class Ventana1Controller {

	@FXML
	Button b1;
	@FXML
	Label lTexto;
	@FXML
	TextArea tArea;
	String textoOriginal = null;
	ArrayList<String> l = new ArrayList<>();
	int element=0;
	@FXML
	public void initialize(){
		 l.add("uno");
		 l.add("dos");
		 l.add("tres");
		 l.add("cuatro");
		 l.add("cinco");
	}

	@FXML
	private void onButtonAbrirClicked() {
		System.out.println("Botón pulsado");
		b1.setStyle("-fx-background-color: blue;");
		if (element < l.size()){
			lTexto.setText(l.get(element));
			element++;
		}else{
			lTexto.setText(tArea.getText());
		}
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