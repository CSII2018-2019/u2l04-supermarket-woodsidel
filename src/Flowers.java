import javax.swing.JOptionPane;

public class Flowers extends GroceryItem{
	public Flowers(String n, double u, int q, String t, String c, String e, double w, String f) {
		super(n, u, q, t, c, e, w);

		setPrice(u, f);
		setQuantity(q);
		setColor(c);
		getUnitPrice();
		getQuantity();
		getColor();
		
	}
	public static double setPrice(double u,String f) { 
		f = JOptionPane.showInputDialog("Is your order an arrangement? ");
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
