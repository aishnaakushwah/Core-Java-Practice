package Practice_Set_8_OOPsBasics;

/* Q1. Create a class Employee with the following properties and methods:
        Salary (property) (int)
        getSalary (method returning int)
        name (property) (String)
        getName (method returning String)
        setName (method changing name)                                   */

class Employee {
    String name;
    int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}

public class EmployeeImpl {
    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setName("Aishna");
        employee.setSalary(20000);

        System.out.println("NAME - " + employee.getName());
        System.out.println("SALARY - " + employee.getSalary());
    }
}