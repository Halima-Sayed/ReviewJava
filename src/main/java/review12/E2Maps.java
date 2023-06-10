package review12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class E2Maps {
    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap<>();
        map.put("Apple",3);
        map.put("Kiwi",2);
        map.put("Orange",4);
        map.put("Mango",3);
        map.put("Banana",30);
        System.out.println(map);
        map.remove("Orange");
        System.out.println(map);
        //there is no removeIf method directly available in the map class
        //we have to extract the keys
        Set<String> keys=map.keySet();
        //now use remove if
        keys.removeIf(x->x.contains("a") || x.contains("A"));
        System.out.println(map);


    }
}
