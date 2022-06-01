package practiceBlake;

import lists.classes.Employee;

import java.util.ArrayList;
import java.util.List;

public class Second {
    public static void main(String args[]){
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Blake", "Zenere", 1));
        employeeList.add(new Employee("Mary", "Jones", 2));

        System.out.println(employeeList);
    }
}
