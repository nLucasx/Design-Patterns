package withIterator;

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
	public void buyFood(MenuIterator it)
	{
		while (it.hasNext())
		{
			it.next().addAmount(20);
		}
	}
	public Food[] getMenu()
	{
		return this.menu;
	}
	public ArrayList<Employee> getEmployees()
	{
		return this.employees;
	}
	public void addEmployee(Employee e)
	{
		this.employees.add(e);
	}
	public void showInformation(Iterator it)
	{
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
