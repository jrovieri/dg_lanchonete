package lanchonete.lanche.impl;

public enum TipoDeMassa {
	MACARRAO(10.0f),
	PIZZA(12.0f),
	LASANHA(15.0f);
	
	private float basePrice;
	
	TipoDeMassa(float basePrice) {
		this.basePrice = basePrice;
	}

	public float getBasePrice() {
		return basePrice;
	}
}
