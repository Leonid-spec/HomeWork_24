package lesson_28.equals;

import lists.MyArrayList;
import lists.MyList;

public class EmployeeApp {
    public static void main(String[] args) {
        MyList<Employee> employees = new MyArrayList<>();

        Employee employee = new Employee("Carl", "Connor", "21.10.2000");
        Employee employee1 = new Employee("Sara", "Smith", "05.12.1990");
        Employee employee2 = new Employee("Sara", "Smith", "01.08.2001");
        Employee employee3 = new Employee("Sara", "Smith", "01.08.2001");

        System.out.println(employee == employee1);


        System.out.println(employee1.equals(employee3));



    }
}
