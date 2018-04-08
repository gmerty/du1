package com.github.gmerty.du1.ui;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

import com.github.gmerty.du1.logika.*;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomeController implements Observer{
	
	private Hra hra;
	Random rand = new Random();
	@FXML private Label vypis;
	String otazka;

	public void inicializuj(Hra hra) {
		this.hra = hra;
		
	}

	public void update(Observable arg0, Object arg1) {
		
		
	}
	
	public void bHadej() {
		int ran = rand.nextInt(100) % 7;
		for (Integer num : hra.getSeznamSlov().keySet()) {
			if (ran == num) {
				vypis.setText(hra.getSeznamSlov().get(num).getAng());
				otazka = hra.getSeznamSlov().get(num).getCz();
			}
		}
		
	}
	
	public void bBear() {
		if (otazka.equals(hra.getSeznamSlov().get(1).getAng())) {
			
		}
		
	}
	
	public void bFox() {
		
	}
	
	public void bRabbit() {
		
	}

	public void bSquirrel() {
	
	}

	public void bWolf() {
	
	}

	public void bHedgehog() {
	
	}

}
