package withIterator;
import java.util.ArrayList;
public class EmployeeIterator implements Iterator<Employee> {
	private ArrayList<Employee> employees;
	int index;
	public EmployeeIterator(ArrayList<Employee> employees) {
		this.employees = employees;
		this.index = 0;
	}
	@Override
	public boolean hasNext() {
		if (index >= this.employees.size()) return false;
		return true;
	}
	@Override
	public Employee next() {
		if (hasNext())
		{
			Employee employee = this.employees.get(index);
			this.index++;
			return employee;
			
		}
		return null;
	}
}
