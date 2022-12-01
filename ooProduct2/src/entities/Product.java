package entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}
	
	// Sobrecarga
	public Product(String name, double price) {

		this.name = name;
		this.price = price;

	}
	
	
	public Product() {
		
	}
	
	
	// Getters e Setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

    // Método removido para proteger o objeto produto de alterações inconsistentes - só altera através do add e remove
	//public void setQuantity(int quantity) {
	//	this.quantity = quantity;
	//}

	public double totalValueInStock() {
		
	return price * quantity;
	
	}
	
	public void addProducts(int qtd) {
		
		this.quantity += qtd;
				
	}
	
	public void removeProducts(int qtd) {
		
		this.quantity -= qtd;
		
	}
	
	public String toString() {
		
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units. Total: $ "
				+ String.format("%.2f", totalValueInStock());
		
	}

}
