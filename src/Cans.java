
public class Cans extends GroceryItem {
	public Cans(String n, double u, int q, String t, String c, String e, double w) {
		super(n, u, q, t, c, e, w);
		setPrice(u);
		setQuantity(q);
		getUnitPrice();
		getQuantity();
	}
	public static double setPrice(double u) { 
		unitPrice = u;
		double basePrice = unitPrice;
		double price = basePrice + ((15/100)*basePrice);
		return price;
	}
	public static void setQuantity(int q) {
		quantity = q;
	}
	public static double getUnitPrice() {
		return unitPrice;
	}
	public static int getQuantity() {
		return quantity;
	}
	
	
	
}
