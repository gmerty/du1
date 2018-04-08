package com.github.gmerty.du1.logika;

import java.util.HashMap;
import java.util.Observable;

public class Hra extends Observable{
	
	private HashMap<Integer, Slovo> seznamSlov;
	private int spravnaOdpoved;
	private int spatnaOdpoved;
	
	public Hra() {
		
		seznamSlov = new HashMap<>();
		spravnaOdpoved = 0;
		spatnaOdpoved = 0;
		Slovo raz = new Slovo("bear","medved");
		Slovo dva = new Slovo("fox","liska");
		Slovo tri = new Slovo("hedgehog","jezek");
		Slovo ctr = new Slovo("rabbit","kralik");
		Slovo pet = new Slovo("squirrel","veverka");
		Slovo sest = new Slovo("wolf","vlk");
		seznamSlov.put(1, raz);
		seznamSlov.put(2, dva);
		seznamSlov.put(3, tri);
		seznamSlov.put(4, ctr);
		seznamSlov.put(5, pet);
		seznamSlov.put(6, sest);
		
	}
	
	public void spravnaOdpoved() {
		spravnaOdpoved++;
		this.setChanged();
        this.notifyObservers();
	}
	
	public void spatnaOdpoved() {
		spatnaOdpoved++;
		this.setChanged();
        this.notifyObservers();
	}
	
	public int getspravnaOdpoved() {
		return spravnaOdpoved;
	}
	
	public int getspatnaOdpoved() {
		return spatnaOdpoved;
	}
	
	public HashMap<Integer, Slovo> getSeznamSlov() {
		return seznamSlov;
	}

}
