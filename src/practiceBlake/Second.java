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

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(2);
        intList.add(4);
        intList.add(8);
        intList.add(15);

        System.out.println();
        System.out.println("Number of Ints: " + intList.size());
        for(Integer c:intList){
            System.out.println(c);
        }

        Integer sum = 0;
        sum = intList.get(0) + intList.get(1) + intList.get(2) + intList.get(3);
        System.out.println("Sum of intList numbers: " + sum);
    }
}
