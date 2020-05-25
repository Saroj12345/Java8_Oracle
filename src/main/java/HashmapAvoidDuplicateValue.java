import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class HashmapAvoidDuplicateValue {

    public static void main(String[] args) {

        Map<String,String> dataMap = new HashMap<>();

        dataMap.put("e001","Saroj");
        dataMap.put("e002","Uday");
        dataMap.put("e003","Palai");
        dataMap.put("e004","Palai");
        dataMap.put("e005","Saroj");
        dataMap.put("e006","Uday");
        dataMap.put("e007","Palai");
        System.out.println("Before Duplicate value removal");
        System.out.println(dataMap);
        Set<String> dataSet = new HashSet<>();
        dataMap = dataMap.entrySet().stream()
                                .filter(entry -> dataSet.add(entry.getValue()))
                                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println("After Duplicate value removal");
        System.out.print(dataMap);



    }
}
