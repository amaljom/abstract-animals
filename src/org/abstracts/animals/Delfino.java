package org.abstracts.animals;

public class Delfino extends Animale implements INuotante{
	private String cibo;
	private String verso;
	
	public Delfino(String cibo, String verso) {
		super();
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
	
	@Override
	public void nuota() {
		
		System.out.println("sto nuotando");
	}

	
}
