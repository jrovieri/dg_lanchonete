package lanchonete.lanche.impl;

import lanchonete.lanche.Lanche;

public class Massa extends Lanche {
	private String molho;
	private TipoDeMassa tipoDeMassa;
	
	public Massa(String molho, TipoDeMassa tipoDeMassa) {
		this.molho = molho;
		this.tipoDeMassa = tipoDeMassa;
	}

	@Override
	public float getPrice() {
		// O preço da massa é um valor base do tipo de massa
		// mais R$0.8 pela quantidade de caracteres do molho
		return (float) (this.tipoDeMassa.getBasePrice() + (0.8 * this.molho.length()));
	}

	@Override
	public float getDeliveryTime() {
		return (30 + this.deliveryTime);
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public TipoDeMassa getTipoDeMassa() {
		return tipoDeMassa;
	}

	public void setTipoDeMassa(TipoDeMassa tipoDeMassa) {
		this.tipoDeMassa = tipoDeMassa;
	}

}
