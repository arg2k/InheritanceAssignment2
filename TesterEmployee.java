package EmployeeAssignment;

public class TesterEmployee {

	public static void main(String[] args) {
		PermanentEmployee pe = new PermanentEmployee(1, "Argha", 10000, 2000, 7);
		pe.calculateMonthlySalary();
		System.out.println("Monthly salary of permanent employee " + pe.getEmployeeName() + " is " + pe.getSalary());

		ContractEmployee ce = new ContractEmployee(2, "Rohit", 50, 40);
		ce.calculateSalary();
		System.out.println("Salary of contract employee " + ce.getEmployeeName() + " is " + ce.getSalary());
	}
}
