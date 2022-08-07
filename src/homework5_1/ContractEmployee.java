package homework5_1;

public class ContractEmployee extends EmployeeID {
    private String federalTaxIdMember;
    private int hours;
    private double rate;

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public ContractEmployee(String employeeId, String name, String federalTaxIdMember, int hours, double rate) {
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double calculatePay() {
        return hours*rate;
    }

    @Override
    public String toString() {
        return "ContractEmployee: Name: " + getName() + ", " +
                "Federal Tax Id Member number: " + federalTaxIdMember + ", " +
                "Employee ID: " + getEmployeeId()+ ", " +
                "salary: " + calculatePay();
    }
}
