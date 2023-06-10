package review12;

import java.util.HashMap;
import java.util.Map;

public class E8Dog {
    public static void main(String[] args) {
        /*

         */
        Dog dog1=new Dog("Jodi",10);
        Dog dog2=new Dog("Jimmi",11);
        Dog dog3=new Dog("Lucy",15);

        Map<String,Dog> dogMap=new HashMap<>();
        dogMap.put("Jodi",dog1);
        dogMap.put("Jimmi",dog2);
        dogMap.put("Lucy",dog3);
        System.out.println(dogMap);
        dogMap.forEach((k,v)->v.printInfo());
    }
}
