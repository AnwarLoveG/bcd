package verifica;

import java.util.Hashtable;

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
			griglia.add(lBcd, 1, 2);
			griglia.add(lRis, 0, 4);
			griglia.setHgap(15);
			griglia.setVgap(15);
			griglia.setAlignment(Pos.CENTER);
			
			Scene scena = new Scene(griglia ,500,500);
			finestra.setTitle("Algoritmo BCD");
			finestra.show();
			finestra.setScene(scena);
			
			bCalcola.setOnAction(e->calcola());
		}
		public void calcola() {
			
			String vettore[]=tNum.getText().split("");
			String bcd="";
			
			Hashtable <String,String> convertiNum= new Hashtable <String,String>();
			
			convertiNum.put("0","0000");
			
			convertiNum.put("1","0001");
			
			convertiNum.put("2","0010");
			
			convertiNum.put("3","0011");
			
			convertiNum.put("4","0100");
			
			convertiNum.put("5","0101");
			
			convertiNum.put("6","0110");
			
			convertiNum.put("7","0111");
			
			convertiNum.put("8","1000");
			
			convertiNum.put("9","1001");
			
			
			for(int i=0;i<vettore.length;i++) {
				bcd+=convertiNum.get(vettore[i]);
			}
			lRis.setText(bcd);
			
		}
		public static void main(String []args) {
			launch(args);
		}
	}
