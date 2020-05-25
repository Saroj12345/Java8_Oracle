package designpattern;

public class Customer {

    //mandatory
    private int id;
    //mandatory
    private String name;
    //optional
    private String address1;
    //optional
    private String address2;

    //mandatry
    private boolean isActive;


    private Customer(CustomerBuilder customerBuilder) {
        this.id = customerBuilder.id;
        this.name = customerBuilder.name;
        this.address1 = customerBuilder.address1;
        this.address2 = customerBuilder.address2;
        this.isActive = customerBuilder.isActive;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public boolean isActive() {
        return isActive;
    }

    static class CustomerBuilder {


        //mandatory
        private int id;
        //mandatory
        private String name;
        //optional
        private String address1;
        //optional
        private String address2;

        //mandatry
        private boolean isActive;


       public CustomerBuilder id(int id) {
           this.id=id;
           return this;
       }

        public CustomerBuilder name(String name) {
            this.name=name;
            return this;
        }

        public CustomerBuilder address1(String address1) {
            this.address1=address1;
            return this;
        }

        public CustomerBuilder address2(String address2) {
            this.address2=address2;
            return this;
        }
        public CustomerBuilder isActive(boolean isActive) {
            this.isActive=isActive;
            return this;
        }

        public Customer build() {
           return  new Customer(this);
        }



    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", isActive=" + isActive +
                '}';
    }
}
