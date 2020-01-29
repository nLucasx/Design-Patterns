package withIterator;

public class Main {
	public static void main(String[] args) {
		Manager admin = new Manager();
		
		admin.buyFood(new MenuIterator(admin.getMenu()));
		
		admin.addEmployee(new Employee("Lucas", "14264414499", "Cozinheiro", 45));
		admin.addEmployee(new Employee("Pedro", "14263445799", "Serviços gerais", 32));
		admin.addEmployee(new Employee("Sandro", "13254714499", "Caixa", 24));
		
		System.out.println("Padrão Iterator aplicado: ");
		admin.showInformation(new EmployeeIterator(admin.getEmployees()));
		admin.showInformation(new MenuIterator(admin.getMenu()));
	}
}
