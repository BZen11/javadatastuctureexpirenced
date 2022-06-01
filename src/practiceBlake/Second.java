package practiceBlake;

import lists.classes.Employee;

import java.util.ArrayList;
import java.util.List;

public class Second {
    public static void main(String args[]){
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Blake", "Zenere", 1));
        employeeList.add(new Employee("Mary", "Jones", 2));

        System.out.println("Number of Employees: " + employeeList.size());
        for(Employee a:employeeList){
            System.out.println(a);
        }

        List<String> stringList = new ArrayList<String>();
        stringList.add("Apple");
        stringList.add("Pear");
        stringList.add("Peach");

        System.out.println();
        System.out.println("Number of Strings: " + stringList.size());
        for(String b:stringList){
            System.out.println(b);
        }
    }
}
