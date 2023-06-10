package review11;

public class E1 {
    public static void main(String[] args) {

//for practical things when we don't know the size arrays are not good. To solve this problem Java developers developed an advanced version of arrays it is called ArrayList
        //arrays are fixed in size which is a problem and the second problem is that there are no build in methods for arrays. We have to write custom logic in order to get something.
        String[] names = new String[3]; //<- if we don't provide size it will give error
        names[0] = "Leandro";
        names[1]="Wael";
        names[2]="Axel";
        for (String name : names) {
            if(name.equals("Axel")){
                System.out.println("found");
            }

        }
    }
}