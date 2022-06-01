package practiceBlake;

import lists.classes.Employee;

import java.util.ArrayList;
import java.util.List;

public class Second {
    public static void main(String args[]){
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("Blake", "Zenere", 1));
        employeeList.add(new Employee("Mary", "Jones", 2));
        employeeList.add(new Employee("John", "Smith", 3));

        System.out.println("Number of Employees: " + employeeList.size());
        for(Employee a:employeeList){
            System.out.println(a);
        }

        System.out.println(employeeList.contains((new Employee("Blake", "Zenere", 1))));
        System.out.println(employeeList.contains((new Employee("Mary", "Smith", 22))));
        System.out.println("Index of Blake: " + employeeList.indexOf((new Employee("Blake", "Zenere", 1))));


        employeeList.remove(2);

        employeeList.forEach(test -> {System.out.println(test);});

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
