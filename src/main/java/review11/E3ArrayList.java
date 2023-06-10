package review11;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Adam");
        arrayList.add("Sarah");
        arrayList.add("Halima");
        arrayList.add("Abdul");
        arrayList.add("Semir");
        arrayList.add("Semir");
        System.out.println(arrayList);
        //   System.out.println(arrayList.contains("Abdul"));
        for (String s : arrayList) {
            if(s.contains("a")){
                System.out.println(s);

            }
        }
    }
        }
