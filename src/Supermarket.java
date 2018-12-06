import javax.swing.JOptionPane;

public class Supermarket {
	String color;
	String expiration;
	Double weightProduct;
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			String nameProduct = JOptionPane.showInputDialog("What is the name of your product?");
			if(nameProduct.equals(" ")) {
				nameProduct = "Lasagna";
			}
			String priceProduct = JOptionPane.showInputDialog("What is the unit price of your product?");
			double unitPrice = Double.parseDouble(priceProduct);
			if(unitPrice == 0) {
				unitPrice = 19.99;
			}
			String quantityProduct = JOptionPane.showInputDialog("What is the quantity of your product?");
			int quantity = Integer.parseInt(quantityProduct);
			if(quantity == 0) {
				quantity = 4;
			}
			String typeProduct = JOptionPane.showInputDialog("What type product is your product?");
			if(typeProduct.equals(" ")) {
				typeProduct = "Can";
			}
			if(typeProduct.equals("Flowers")) {
				String color = JOptionPane.showInputDialog("What is the color of the flowers?");
				if(color.equals(" ")) {
					color = "Blue";
				}
			}
			if(typeProduct.equals("Produce")) {
				String expirationDate = JOptionPane.showInputDialog("What is the expiration date of the produce?");
				if(expirationDate.equals(" ")) {
					expirationDate = "1/1/11";
				}
				String weightProduct = JOptionPane.showInputDialog("What is the weight of the produce in grams?");
				double weight = Double.parseDouble(weightProduct);
				if(weight == 0) {
					weight = 5;
				}
			}
	
			GroceryItem item = new GroceryItem(nameProduct,unitPrice,quantity,typeProduct,color,expirationDate,weight);
			
		}
	}

}
