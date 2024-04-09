package verifica;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

	public class bcd extends Application {
		
		TextField tNum= new TextField();
		Label lRis = new Label();
		
		public void start(Stage finestra) {
			Label lNum= new Label("Inserisci num");
			Label lBcd=new Label("Numero in bcd");
			Button bCalcola=new Button("Calcola");

			GridPane griglia = new GridPane();
			griglia.add(tNum,0,0);
			griglia.add(lNum, 1, 0);
			griglia.add(bCalcola, 0, 2);
			griglia.add(lBcd, 0, 3);
			griglia.add(lRis, 0, 4);
			griglia.setHgap(10);
			griglia.setVgap(10);
			griglia.setAlignment(Pos.CENTER);
			
			Scene scena = new Scene(griglia);
			finestra.setTitle("Algoritmo BCD");
			finestra.show();
			finestra.setScene(scena);
		}
		public void main(String []args) {
			launch(args);
		}
	}

	
			
