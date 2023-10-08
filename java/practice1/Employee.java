package java.practice1;

public class Employee {
    private String name, title;
    private int age, salary;

    public Employee(){}

    public Employee(String name, String title, int salary, int age) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.title = title;
    }

    // Setter methods
     public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

   
}
