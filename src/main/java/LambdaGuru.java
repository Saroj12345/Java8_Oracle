import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaGuru {
    public static void main(String[] args) {

        //List<Integer> integerList = Arrays.asList(10,20,30,11);

       /* Map<Integer,Employee> employeeMap = new HashMap<Integer, Employee>();
        employeeMap.put(11,new Employee("Raj",25000));
        employeeMap.put(01, new Employee("Sam", 10000));
        employeeMap.put(55, new Employee("Pam", 30000));*/


        //integerList.stream().filter(integer -> ).forEach(System.out::println);

       /* integerList.stream().filter(integer -> integer%2==0)
                .map(integer -> "e".concat(integer.toString()))
                .*/

        /*integerList.stream().map( integer -> {
            List<String> list = new ArrayList<>();
            if(integer%2==0) {
                list.add("e".concat(integer.toString()));
            } else {
               list.add("o".concat(integer.toString()));
            }
            return list;
        }).forEach(System.out::println);*/

        /*integerList.stream().filter(integer -> integer%2==0)
                            .map(integer -> "e".concat(integer.toString()))
                            .findAny().orElse("o".concat(integer.toString()))*/


        //System.out.println(integerList.stream().mapToInt(Integer::intValue).average());
      /*  StringBuilder builder = new StringBuilder("Hello World!");
        StringBuilder value =  Optional.of(builder)
                .filter(b -> b.length() == 0)
                .map(b -> b.append("Hi"))
                .orElse(builder.append("Hello"));
        System.out.println(value.toString());*/

       /* List<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("Hello");

        Stream<Integer> length = list.stream().map(String::length);
        length.forEach(System.out::println);*/

       List<String> countryList = Arrays.asList("India","Afganisatn","Srilanka","Aba");

       /* countryList.stream()
                .map(String::length)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);*/

       /* countryList.stream()
                .sorted((o1, o2) -> {

                    if(o1.charAt(0)>o2.charAt(0)) {
                        return 1;
                    } else if(o1.charAt(0)<o2.charAt(0)) {
                        return -1;
                    } else
                    return 0;
                }).forEach(System.out::println);*/

        countryList.stream()
                .sorted((o1, o2) -> {

                    if(o1.charAt(0)=='I')
                        return 1;
                     else
                        return -1;
                }).forEach(System.out::println);
       /* countryList.stream()
                .sorted()
                .forEach(System.out::println);*/
    }
   /* private static boolean check(Integer num,List<String> list) {
        if(num%2==0) {
            list.add(num.toString().concat("e"));
            return true;
        }
        else {
            list.add(num.toString().concat("o"));
            return true;
        }
    }*/
}
