package withoutIterator;
import java.util.ArrayList;
public class Manager {
	private Food[] menu;
	private ArrayList<Employee> employees;
	
	public Manager() {
		this.employees = new ArrayList<Employee>();
		this.menu = new Food[4];
		
		this.menu[0] = new Food("Lasanha", "Lasanha à Bolonhesa", 10.0);
		this.menu[1] = new Food("Pizza", "Pizza vários sabores", 20.0);
		this.menu[2] = new Food("Carpaccio", "Carpaccio de carne", 15.9);
		this.menu[3] = new Food("Espaguete", "Espaguete ao molho branco", 29.90);
	}
	public void buyFood()
	{
		for (Food f : menu)
		{
			f.addAmount(20);
		}
	}
	public void addEmployee(Employee e)
	{
		this.employees.add(e);
	}
	public void showEmployee()
	{
		for (Employee e : employees)
		{
			System.out.println(e);
		}
	}
	public void showMenu()
	{
		for (Food f : menu)
		{
			System.out.println(f);
		}
	}
}
