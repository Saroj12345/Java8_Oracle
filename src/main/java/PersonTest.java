import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class PersonTest {


    public static void main(String[] args) {

        Person person1  = new Person("Saroj",29,new Address("560037"), Arrays.asList(new MobileNumber("9856712345")));
        Person person2  = new Person("jayesh",27,new Address("560025"), Arrays.asList(new MobileNumber("9856712986")));
        Person person3  = new Person("Mithilesh",25,new Address("560011"), Arrays.asList(new MobileNumber("985678751")));
        Person person4  = new Person("Naga",27,new Address("560023"), Arrays.asList(new MobileNumber("9856823123")));

        List<Person> personList = Arrays.asList(person1,person2,person3,person4);

        System.out.println(personList
                .stream()
                .map(Person::getAddress)
                .map(Address::getZipCode)
                .filter(zipCode -> zipCode.equalsIgnoreCase("560037"))
                .collect(Collectors.toList()));
    }
}

class Person {
    private String name;
    private int age;
    private Address address;
    private List<MobileNumber> mobileNumberList;

    public Person(String name, int age, Address address, List<MobileNumber> mobileNumberList) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumberList = mobileNumberList;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<MobileNumber> getMobileNumberList() {
        return mobileNumberList;
    }

    public void setMobileNumberList(List<MobileNumber> mobileNumberList) {
        this.mobileNumberList = mobileNumberList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", mobileNumberList=" + mobileNumberList +
                '}';
    }
}

class Address {

    private String zipCode;

    public Address(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}

class MobileNumber {
    private String number;

    public MobileNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
