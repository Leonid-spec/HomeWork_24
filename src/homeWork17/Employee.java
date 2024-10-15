package homeWork17;
/*
Написать класс Employee (Работник)
У него должны быть поля имя, возраст, зарплата
Инкапсулировать класс.
Написать метод info() выводящий информацию о работнике.
 */
public class Employee {
    private String name;
    private int age;
    private double Salary;

    public Employee(String name, int age, Double salary){
        this.name = name;
        this.age = age;
        this.Salary = salary;

    }

    public Employee(double salary, int age, String name) {
        Salary = salary;
        this.age = age;
        this.name = name;
    }

    public Employee() {
    }


    public  String  toString(){
        return String.format("Employee %s, Age: %d, Salary: %s", name, age, Salary);
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return Salary;
    }
    public void setName (String name){
        this.name = name;
    }
    public void setAge (int age){
        this.age = age;
    }
    public void setSalary(double salary){
        this.Salary = salary;
    }
    public void info(){
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Salary " + Salary);

    }
   }
