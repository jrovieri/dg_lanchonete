package lanchonete.lanche.impl;

import lanchonete.lanche.Lanche;

public class Bolo extends Lanche {
	
	private String massa;
	private String recheio;
	private String cobertura;
	
	public Bolo(String massa, String recheio, String cobertura) {
		super();
		this.massa = massa;
		this.recheio = recheio;
		this.cobertura = cobertura;
	}

	@Override
	public float getPrice() {
		return (float) ((this.massa.length() 
				+ this.recheio.length() 
				+ this.cobertura.length()) / 2);
	}

	@Override
	public float getDeliveryTime() {
		return (10 + this.deliveryTime);
	}

}
