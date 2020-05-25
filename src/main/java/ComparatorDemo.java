import java.util.*;
import java.util.function.ToIntFunction;

public class ComparatorDemo {
    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(new Student(1,"hari",22),
                new Student(4,"ram",20),
                new Student(5,"shyam",28),
                new Student(3,"nakul",24),
                new Student(2,"nakul",28));

       /* studentList.stream()
                .map(student -> student.getName())
                .sorted()
                .forEach(System.out::println);*/


        studentList.stream().sorted(Comparator.comparing(Student::getName).thenComparingInt(Student::getAge)).forEach(System.out::println);

        /*Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }.thenComparingInt(new ToIntFunction<Student>() {
            @Override
            public int applyAsInt(Student value) {
                return value.getAge();
            }
        }));*/
    }
}
