package org.abstracts.animals;

import java.time.LocalDate;

public class Cane extends Animale{
	private String cibo;
	private String verso;
	
	public Cane(String cibo, String verso) {
		
		setCibo(cibo);
		setVerso(verso);
	}
	
	public String getCibo() {
		return cibo;
	}
	public void setCibo(String cibo) {
		this.cibo = cibo;
	}
	//
	public String getVerso() {
		return verso;
	}
	public void setVerso(String verso) {
		this.verso = verso;
	}

	@Override
	public String dormi() {
		
		return "Zzzz";
	}

	@Override
	public String verso() {
		
		return getVerso();
	}

	@Override
	public String mangia() {
		
		return getCibo();
	}


}
