import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        Stream<String>  fileStream = Files.lines(Paths.get("C:\\Users\\ADMIN\\IdeaProjects\\Java8\\src\\main\\resources\\names"));

        //fileStream.filter(name -> !name.equalsIgnoreCase("manoj")).forEach(System.out::println);
        //fileStream.forEach(System.out::println);

        Map<String,Integer> dataMap = fileStream
                .map(x -> x.split(","))
                .filter(x -> Integer.parseInt(x[1])>21)
                .collect(Collectors.toMap(
                        x -> x[0] ,
                        x -> Integer.parseInt(x[1])
                ));

        dataMap.entrySet().stream().forEach(System.out::println);
    }
}
