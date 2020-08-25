package lanchonete.lanche;

public abstract class Lanche {
	public int deliveryTime = 0;
	public int distance = 0;
	
	public abstract float getPrice();
	public abstract float getDeliveryTime();
	
	public void setDistance(int distance) {
		this.distance = distance;
		this.deliveryTime = 10 * distance;
	}
}
