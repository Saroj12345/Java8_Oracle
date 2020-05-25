import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        /*Employee emp1 = new Employee("Saroj", 10000);
        Employee emp2 = new Employee("Manoj", 40000);
        Employee emp3 = new Employee("Akshya", 70000);
        Employee emp4 = new Employee("Akshya", 70000);
        List<Employee> employees = Arrays.asList(emp1, emp2, emp3,emp4);*/

        //Comparator<Employee> employeeComparatorByName = Comparator.comparing(Employee::getName);
        //Comparator<Employee> employeeComparatorBySalary = Comparator.comparingInt(Employee::getSalary);

        //Comparator<Employee> employeeCompratorByNameAndSal = employeeComparatorByName.thenComparing(employeeComparatorBySalary);

        //employeeCompratorByNameAndSal.

        //System.out.println(employeeCompratorByNameAndSal);

        /*employees.stream().filter(emp -> emp.getSalary() >= 15000)
                .map(Employee::getName)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);*/
       /* employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(4)
                .map(Employee::getName)
                .forEach(System.out::println);*/
    }
}

class Employee {
    private String name;
    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
