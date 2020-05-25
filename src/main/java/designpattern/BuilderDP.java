package designpattern;

public class BuilderDP {

    public static void main(String[] args) {


        Customer customer = new Customer.CustomerBuilder().id(100).build();

        System.out.println(customer);

    }


}
