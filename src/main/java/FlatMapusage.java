

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapusage {

    public static void main(String[] args) {
        List<Customer> customerList = Arrays.asList(new Customer(1,"hari",22,Arrays.asList("India","China")),
                new Customer(4,"ram",20,Arrays.asList("Switzerland","England")),
                new Customer(5,"shyam",28,Arrays.asList("Australia","Japan")),
                new Customer(3,"gopal",24,Arrays.asList("Pakistan","Turkey")),
                new Customer(2,"nandan",28,Arrays.asList("Afganistan","Pakistan")));


        customerList.stream().map(customer -> customer.getAddress().stream())
                             .flatMap(stringStream -> stringStream.filter(address -> !address.equalsIgnoreCase("Pakistan")))
                             .forEach(System.out::println);


    }
}
class Customer {

    int id;
    String name;
    int age;
    List<String> address;

    public Customer(int id, String name, int age, List<String> address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
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
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
