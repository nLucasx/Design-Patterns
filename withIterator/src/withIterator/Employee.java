package withIterator;

public class Employee {
	private String name;
	private String ssn;
	private String occupation;
	private int age;
	
	public Employee(String name, String ssn, String occupation, int age) {
		this.name = name;
		this.ssn = ssn;
		this.occupation = occupation;
		this.age = age;
		
	}
	
	public String toString()
	{
		return "Nome: " + this.name + "\n" +
			   "CPF: " + this.ssn + "\n" +
				"Idade: " + this.age + "\n" +
			   "Área de atuação: " + this.occupation + "\n";
	}
}
