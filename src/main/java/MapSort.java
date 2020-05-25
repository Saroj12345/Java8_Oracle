import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapSort {
    public static void main(String[] args) {


        Map<String,Double> dataMap = new HashMap<>();
        dataMap.put("Smith",40000.00);
        dataMap.put("Warner",10000.00);
        dataMap.put("Labushen",5000.00);
        dataMap.put("Cummins",90000.00);

        //dataMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        //comparing custom object
        Map<Integer,Employee> employeeMap = new HashMap<>();

        employeeMap.put(1, new Employee("Kohli",40000.00));
        employeeMap.put(2, new Employee("Rahul",10000.00));
        employeeMap.put(3, new Employee("Rohit",60000.00));
        employeeMap.put(4, new Employee("Shami",5000.00));

        employeeMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparingDouble(Employee::getSalary)))
                .forEach(System.out::println);


    }
}
