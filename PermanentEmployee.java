package EmployeeAssignment;

public class PermanentEmployee extends Employee{
	private double basicPay;
    private double hra;
    private float experience;
    private double salary;
    
    public PermanentEmployee(int empId, String name, double basicPay, double hra, float experience) {
        super(empId, name);
        this.basicPay = basicPay;
        this.hra = hra;
        this.experience = experience;
    }
    
    public double getBasicPay() {
        return basicPay;
    }
    
    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }
    
    public double getHra() {
        return hra;
    }
    
    public void setHra(double hra) {
        this.hra = hra;
    }
    
    public float getExperience() {
        return experience;
    }
    
    public void setExperience(float experience) {
        this.experience = experience;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void calculateMonthlySalary() {
        double variableComponent = 0;
        
        if (experience <= 5) {
            variableComponent = 0.1 * basicPay;
        } else if (experience > 5 && experience <= 10) {
            variableComponent = 0.2 * basicPay;
        } else {
            variableComponent = 0.3 * basicPay;
        }
        
        salary = basicPay + hra + variableComponent;
        salary = Math.round(salary);
    }
}
