package structural.adapter.custom.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
        employees.add(employeeFromDB);
        System.out.println("Employees DB: "+ employeeFromDB);

        EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));
        System.out.println("Employees LDAP: "+ employees.get(1));

        EmployeeCsv employeeFromCsv = new EmployeeCsv("69, Raval, Siraj, siraj@raval.com");
        employees.add(new EmployeeAdapterCsv(employeeFromCsv));
        System.out.println("Employees CSV: "+ employees.get(2));

        System.out.println(Arrays.toString(employees.toArray()));
        //System.out.println("Employees"+ employees);
        return employees;

    }


}
