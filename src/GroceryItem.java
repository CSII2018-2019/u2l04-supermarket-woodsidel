import javax.swing.JOptionPane;
public class GroceryItem {
	private String name;
	protected static double unitPrice;
	protected static int quantity;
	private String type;
	protected static String flower = "no";
	protected static String color;
	protected static String expiration;
	protected static double weight;
	
	public void GroceryItem(String n, double u, int q, String t, String c, String e, double w){
		setName(n);
		setType(t);
		getName();
		getType();
		if(type == "Can") {
			double price = Cans.setPrice(u);
			Cans.setQuantity(q);
			Cans.getUnitPrice();
			Cans.getQuantity();
		}
		else if(type == "Produce") {
			double price = Produce.setPrice(u);
			Produce.setQuantity(q);
			Produce.setWeight(w);
			Produce.setExpiration(e);
			Produce.getUnitPrice();
			Produce.getQuantity();
		}
		else if(type == "Flowers") {
			String typeF = JOptionPane.showInputDialog("Is your order an arrangement? ");
			double price = Flowers.setPrice(u, typeF);
			Flowers.setQuantity(q);
			Flowers.setColor(c);
			Cans.getUnitPrice();
			Cans.getQuantity();
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
