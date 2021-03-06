
public class Produce extends GroceryItem{
	
	public Produce(String n, double u, int q, String t, String c, String e, double w) {
		super(n, u, q, t, c, e, w);
		setPrice(u);
		setQuantity(q);
		getUnitPrice();
		getQuantity();
		
	}
	public static double setPrice(double u) { 
		unitPrice = u;
		double basePrice = unitPrice*weight;
		double price = basePrice + ((15/100)*basePrice);
		return price;
	}
	public static void setQuantity(int q) {
		quantity = q;
	}
	public static void setExpiration(String e) {
		expiration = e;
	}
	public static void setWeight(double w) {
		weight = w;
	}
	public static double getUnitPrice() {
		return unitPrice;
	}
	public static int getQuantity() {
		return quantity;
	}
	public static String getExpiration(String e) {
		return expiration;
	}
	public static double getWeight(String w) {
		return weight;
	}
}
