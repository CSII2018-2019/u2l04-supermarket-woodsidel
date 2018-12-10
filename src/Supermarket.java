import javax.swing.JOptionPane;

public class Supermarket {
	public static void main(String[] args) {
		double totalCost = 0;
		String typeOfProduct = JOptionPane.showInputDialog("At the supermarket, we have Lasagna, Celery. Hibiscus, Oranges, and Soup/nWhat do you want?");
		String numProduct = JOptionPane.showInputDialog("How many would you like?");
		String quantityFinal = null;
		GroceryItem lasagna = new GroceryItem("Lasagna", 19.99, 5,"Can","Red","1/11/11",10);
		GroceryItem celery = new GroceryItem("Celery", 3.24, 10,"Produce","Green","1/11/11",3);
		GroceryItem hibiscus = new GroceryItem("Hibiscus", 19.99, 5,"Flowers","Pink","1/11/11",10);
		GroceryItem oranges = new GroceryItem("Oranges", 5.32, 5,"Produce","Orange","1/11/11",10);
		GroceryItem soup = new GroceryItem("Soup", 7.39, 5,"Can","Red","1/11/11",10);
		int num = Integer.parseInt(numProduct);
		if (typeOfProduct.equals("Lasagna")) {
			int newQuantity = Cans.getQuantity() - num;
			Cans.setQuantity(newQuantity);
			quantityFinal = String.valueOf(newQuantity);
			
			totalCost = totalCost + num * Cans.getUnitPrice();
		}
		else if (typeOfProduct.equals("Celery")) {
			int newQuantity = Produce.getQuantity() - num;
			Produce.setQuantity(newQuantity);
			quantityFinal = String.valueOf(newQuantity);
			
			totalCost = totalCost + num * Produce.getUnitPrice();
		}
		else if (typeOfProduct.equals("Hibiscus")) {
			int newQuantity = Flowers.getQuantity() - num;
			Flowers.setQuantity(newQuantity);
			quantityFinal = String.valueOf(newQuantity);
			
			totalCost = totalCost + num * Flowers.getUnitPrice();
		}
		else if (typeOfProduct.equals("Oranges")) {
			int newQuantity = Produce.getQuantity() - num;
			Produce.setQuantity(newQuantity);
			quantityFinal = String.valueOf(newQuantity);
			
			totalCost = totalCost + num * Produce.getUnitPrice();
		}
		else if (typeOfProduct.equals("Soup")) {
			int newQuantity = Cans.getQuantity() - num;
			Cans.setQuantity(newQuantity);
			quantityFinal = String.valueOf(newQuantity);
			
			totalCost = totalCost + num * Cans.getUnitPrice();
		}
		JOptionPane.showMessageDialog(null, "Total price: $"+totalCost);
		JOptionPane.showMessageDialog(null, "Total quantity for "+typeOfProduct+": "+quantityFinal);
	}



	}


