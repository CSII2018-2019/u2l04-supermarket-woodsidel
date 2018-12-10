import javax.swing.JOptionPane;
public class GroceryItem{
	protected static String name;
	protected static double unitPrice;
	protected static int quantity;
	protected String type;
	protected static String flower = "no";
	protected static String color;
	protected static String expiration;
	protected static double weight;
	public GroceryItem(String n, double u, int q, String t, String c, String e, double w){
		setName(n);
		setType(t);
		getName();
		getType();
		if(t == "Can") {
			double price = Cans.setPrice(u);
			Cans.setQuantity(q);
			Cans.getUnitPrice();
			Cans.getQuantity();
		}
		else if(t == "Produce") {
			double price = Produce.setPrice(u);
			Produce.setQuantity(q);
			Produce.setWeight(w);
			Produce.setExpiration(e);
			Produce.getUnitPrice();
			Produce.getQuantity();
		}
		else if(t == "Flowers") {
			String typeF = null;
			double price = Flowers.setPrice(u, typeF);
			Flowers.setQuantity(q);
			Flowers.setColor(c);
			Flowers.getUnitPrice();
			Flowers.getQuantity();
			Flowers.getColor();
       }
	}
	
	public void setName(String n) {
		name = n;
	}
	public void setType(String t) {
		type = t;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	
}
