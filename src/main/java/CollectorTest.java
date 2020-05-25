import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorTest {
    public static void main(String[] args) {


        List<Student> studentList = Arrays.asList(new Student(1,"hari",22),
                new Student(4,"ram",20),
                new Student(5,"shyam",28),
                new Student(3,"gopal",24),
                new Student(2,"nandan",28));

        String x = studentList.stream()
                .limit(3)
                .map(Student::getName)
                .collect(Collectors.joining(","));

        Map<String, List<Student>> name  = studentList.stream()
                .collect(Collectors.groupingBy(Student::getName));
        System.out.println(name);
    }
}
