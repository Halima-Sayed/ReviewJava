package review12;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class E1Maps {
    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap<>();
        //add method will not work because it is not a part of the collection framework
        map.put("Apple",3);
        map.put("Kiwi",2);
        map.put("Orange",4);
        map.put("Mango",3);
        map.put("Apple",30);
        System.out.println(map);

    }
}
