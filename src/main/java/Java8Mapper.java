import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Mapper {
    public static void main(String[] args) {


        List<Student> studentList = Arrays.asList(new Student(1,"hari",22),
                new Student(4,"ram",20),
                new Student(5,"shyam",28),
                new Student(3,"gopal",24),
                new Student(2,"nandan",28));

       /* studentList.stream()
                .filter(student -> !student.getName().equalsIgnoreCase("ram"))
                .map(student -> new Student(student.getId(),student.getName(),student.getAge()))
                .forEach(System.out::println);*/

        //Add the ages
        studentList.stream()
                .filter(student -> !student.getName().equalsIgnoreCase("ram"))
                .map(Student::getName)
                .distinct()
                .limit(2)
                .skip(1)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}

class Student {

    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
