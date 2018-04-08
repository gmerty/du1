package com.github.gmerty.du1.ui;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

import com.github.gmerty.du1.logika.*;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class HomeController implements Observer{
	
	private Hra hra;
	Random rand = new Random();
	@FXML private Label vypis;
	@FXML private Button bear;
	@FXML private Button fox;
	@FXML private Button hedgehog;
	@FXML private Button rabbit;
	@FXML private Button squirrel;
	@FXML private Button wolf;
	String otazka;
	Integer ot;

	public void inicializuj(Hra hra) {
		this.hra = hra;
		setBNonActive();
		
	}

	public void update(Observable arg0, Object arg1) {
		setBNonActive();		
	}
	
	public void bHadej() {
		Integer ran = rand.nextInt(100) % 7;
		setBActive();
		for (Integer num : hra.getSeznamSlov().keySet()) {
			if (ran == num) {
				vypis.setText(hra.getSeznamSlov().get(num).getAng());
				ot=num;
			}
		}
		
	}
	
	public void setBNonActive() {
		bear.setDisable(true);
		fox.setDisable(true);
		hedgehog.setDisable(true);
		rabbit.setDisable(true);
		squirrel.setDisable(true);
		wolf.setDisable(true);
	}
	
	public void setBActive() {
		bear.setDisable(false);
		fox.setDisable(false);
		hedgehog.setDisable(false);
		rabbit.setDisable(false);
		squirrel.setDisable(false);
		wolf.setDisable(false);
	}
	
	@FXML
	public void ukazAlert(String str) {
		Alert al = new Alert(AlertType.INFORMATION);
		al.setTitle("Upozornění");
		al.setHeaderText(null);
		al.setContentText(str+"\nSpravnych: "+hra.getspravnaOdpoved()+"\nSpatnych: "+hra.getspatnaOdpoved());
		al.showAndWait();
	}
	
	public void bBear() {
		if (ot==1) {
			hra.spravnaOdpoved();
			setBNonActive();
			ukazAlert("Spravne!");
		} else {
			hra.spatnaOdpoved();
			setBNonActive(); 
			ukazAlert("Spatne!");
		}
		
	}
	
	public void bFox() {
		if (ot==2) {
			hra.spravnaOdpoved();
			setBNonActive();
			ukazAlert("Spravne!");
		} else {
			hra.spatnaOdpoved();
			setBNonActive();
			ukazAlert("Spatne!");
		}
	}
	
	public void bRabbit() {
		if (ot==4) {
			hra.spravnaOdpoved();
			setBNonActive();
			ukazAlert("Spravne!");
		} else {
			hra.spatnaOdpoved();
			setBNonActive();
			ukazAlert("Spatne!");
		}
	}

	public void bSquirrel() {
		if (ot==5) {
			hra.spravnaOdpoved();
			setBNonActive();
			ukazAlert("Spravne!");
		} else {
			hra.spatnaOdpoved();
			setBNonActive();
			ukazAlert("Spatne!");
		}
	}

	public void bWolf() {
		if (ot==6) {
			hra.spravnaOdpoved();
			setBNonActive();
			ukazAlert("Spravne!");
		} else {
			hra.spatnaOdpoved();
			setBNonActive();
			ukazAlert("Spatne!");
		}
	}

	public void bHedgehog() {
		if (ot==3) {
			hra.spravnaOdpoved();
			setBNonActive();
			ukazAlert("Spravne!");
		} else {
			hra.spatnaOdpoved();
			setBNonActive();
			ukazAlert("Spatne!");
		}
	}

}
