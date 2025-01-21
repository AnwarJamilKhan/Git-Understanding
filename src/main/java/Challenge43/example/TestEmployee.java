package Challenge43.example;

public class TestEmployee {

    public static void main(String[] args) {
        Employee emp = new Employee("Anand ",34 , 2300.89);
        System.out.println(emp.getEmployeeDetails());
        System.out.println(emp.getEmployeeDetails());
        emp.setName("David");
        System.out.println(emp.getEmployeeDetails());
        emp.setAge(45);
        System.out.println(emp.getEmployeeDetails());
    }
}
