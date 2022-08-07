package homework5_1;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<EmployeeID> {
    @Override
    public int compare(EmployeeID e1, EmployeeID e2) {
        int salaryCompare = Double.compare(e2.calculatePay(), e1.calculatePay());
        if (salaryCompare != 0) {
            return salaryCompare;
        }
        return salaryCompare;
    }
}

