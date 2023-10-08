package java.practice1;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Melisa");
        emp.setAge(21);
        emp.setSalary(0);
        emp.setTitle("Computer Engineer");
        System.out.println(emp.toString());

        Employee emp2 = new Employee("Melike", "Architecture", 0, 22);
        System.out.println(emp2.toString());
    }
}
