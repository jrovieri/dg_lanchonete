package lanchonete.lanche.impl;

import lanchonete.lanche.Lanche;

public class Sanduiche extends Lanche {
	private String[] ingredientes;
	
	public Sanduiche(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public float getPrice() {
		// O preço do sanduiche é um valor base de R$15
		// mais R$1.2 por ingrediente incluído.
		return (float) (15 + (1.2 * this.ingredientes.length));
	}

	public String[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public float getDeliveryTime() {
		return (15 + this.deliveryTime);
	}

}
