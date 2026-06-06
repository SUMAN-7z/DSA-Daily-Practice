package Arrays;
import java.util.*;

public class MapQues {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(111, "suman");
        map.put(110, "Rakhi");
        map.put(119,"fff");

        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}