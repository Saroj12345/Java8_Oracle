package series;

import java.util.Map;
import java.util.Objects;

class CustomHashMap {

    private String key;
    private String value;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomHashMap that = (CustomHashMap) o;
        return key.equals(that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
public class CustomHashMapTest {

    public static void main(String[] args) {

        CustomHashMap customHashMap = new CustomHashMap();
    }
}

