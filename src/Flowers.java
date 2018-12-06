
public class Flowers extends GroceryItem{
	public void Flowers(double u, int q, String f, String c){
		
		setPrice(u, f);
		setQuantity(q);
		setColor(c);
		getUnitPrice();
		getQuantity();
		getColor();
		
	}
	public static double setPrice(double u,String f) { 
		unitPrice = u;
		double basePrice = unitPrice;
		double price = basePrice + ((15/100)*basePrice);
		if(f == "yes") {
			price += 5.00;
		}
		return price;
		
	}
	public static void setQuantity(int q) {
		quantity = q;
	}
	public static void setColor(String c) {
		color = c;
	}
	
	public static double getUnitPrice() {
		return unitPrice;
	}
	public static int getQuantity() {
		return quantity;
	}
	public static String getColor() {
		return color;
	}
}
