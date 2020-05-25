import java.util.stream.IntStream;

public class UseOfIntStream {
    public static void main(String[] args) {

        double avearge = IntStream.of(10,20)
                .average().getAsDouble();

        //System.out.println(avearge);


        IntStream.range(10,20)
                .skip(5)
                //.skip(5)
                .forEach(System.out::println);

    }
}
