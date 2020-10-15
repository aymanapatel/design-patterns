package structural.adapter.custom.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterMain {

    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();

        List<Employee> employeesList = client.getEmployeeList();

        employeesList.forEach(System.out::println);
    }
}
