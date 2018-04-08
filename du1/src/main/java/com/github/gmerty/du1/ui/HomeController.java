package com.github.gmerty.du1.ui;

import java.util.Observable;
import java.util.Observer;

import com.github.gmerty.du1.logika.*;

public class HomeController implements Observer{
	
	private Hra hra;

	public void inicializuj(Hra hra) {
		this.hra = hra;
		
	}

	public void update(Observable arg0, Object arg1) {
		
		
	}

}
