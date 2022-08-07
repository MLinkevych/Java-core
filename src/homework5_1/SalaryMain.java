package homework5_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SalaryMain {
    public static void main(String[] args) {
        List<EmployeeID> list = new ArrayList<>();
        list.add(new ContractEmployee("EE334455", "Peter", "T123456789" ,123, 136));
        list.add(new SalariedEmployee("DE678950", "Inna", "982761541",14567));
        list.add(new ContractEmployee("EE378965", "Mark", "T123886789",167, 134.43));
        list.add(new SalariedEmployee("DE777890", "Anya", "045677708", 19890));

        Collections.sort(list, new EmployeeComparator());
        for (EmployeeID emp : list) {
            System.out.println(emp);
        }




    }

}

