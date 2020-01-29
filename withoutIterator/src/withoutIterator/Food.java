package withoutIterator;

public class Food {
	private String name;
	private String description;
	private double price;
	private int amount;
	
	public Food(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.amount = 0;
	}
	
	public void addAmount(int amount)
	{
		this.amount += amount;
	}
	
	public String toString()
	{
		return "Comida: " + name + "\n" +
				this.description + "\n" +
				"Preço: " + this.price + " R$\n" +
				"Quantidade em estoque: " + this.amount + "\n";
	}
}
