package Homework3_2;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    static int totalSum = 0;
    // name getter
    public String getName() {
        return name;
    }
    // hours getter
    public int getRate() {
        return rate;
    }
    // hours getter
    public int getHours() {
        return hours;
    }

    // name setter
    public void setName(String name) {
        this.name = name;
    }
    // rate setter
    public void setRate(int rate) {
        this.rate = rate;
    }
    // hours setter
    public void setHours(int hours) {
        this.hours = hours;
    }
    // constructor
    public Employee() {


    }
    // constructor
    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }
    // constructor
    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }
    // get salary method
    public int getSalary(int rate, int hours){
        int salary = rate*hours;
        //totalSum += salary;
        return salary;

    }
    // change rate method
    public void changeRate(int rate){
        this.rate = rate;
    }
    // calculation of the 10% bonus
    public double getBonuses(int getSalary){
        return getSalary(rate,hours)*0.1;

    }
    // employee's info output
    @Override
    public String toString() {
        return "Employee's info: \n" +
                "name: " + name +
                ", rate: " + rate +
                ", hours: " + hours +
                ", salary: " + getSalary(rate,hours) +
                ", bonus: " + getBonuses(getSalary(rate,hours));
    }

}
