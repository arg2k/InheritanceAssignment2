package EmployeeAssignment;

public class ContractEmployee extends Employee {
	private double wage;
	private float hoursWorked;
	private double salary;

	public ContractEmployee(int empId, String name, double wage, float hoursWorked) {
		super(empId, name);
		this.wage = wage;
		this.hoursWorked = hoursWorked;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public float getHoursWorked() {
		return hoursWorked;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void calculateSalary() {
		salary = hoursWorked * wage;
	}
}
