package homework5_1;

public class SalariedEmployee extends EmployeeID {

    private String socialSecurityNumber;
    private double salary;

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double salary) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee: Name: " + getName() + ", " +
                "SSN: " + socialSecurityNumber + ", " +
                "Employee ID: " + getEmployeeId() + ", " +
                "salary: " + calculatePay();
    }
}
