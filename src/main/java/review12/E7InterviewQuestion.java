package review12;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class E7InterviewQuestion {
    public static void main(String[] args) {
        //print the number with their count, how many times they appear in array
      /*
      MY CODE
       int[] arr = {10, 20, 10, 30, 40, 50, 20, 30, 70, 80, 70};
        Map<Integer,Integer> map=new HashMap<>();
        for(int num: arr){
            if(map.containsKey(num)){
                int count=map.get(num);
                map.put(num,count+1);
            }else{
                map.put(num,1);
            }
        }
        for(var entry:map.entrySet()){
            System.out.println("Number="+entry.getKey()+", Count="+entry.getValue());
        }

       */

        int[] arr = {10, 20, 10, 30, 40, 50, 20, 30, 70, 80, 70};

        Map<Integer,Integer>map=new TreeMap<>();

        for(int num:arr) {
            if (map.get(num) == null) {
                map.put(num, 1);
            }else {
                int count = map.get(num) + 1;
                map.put(num, count);
            }
        }
        System.out.println(map);
    }

}
