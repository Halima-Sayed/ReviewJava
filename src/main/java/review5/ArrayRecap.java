package review5;

public class ArrayRecap {
    public static void main(String[] args) {
        String[] languages={"English","Russian","Turkish","French","Spanish","German"};

        for (String language : languages) { // enhanced loop can only go one direction start to end
            System.out.print(language+" ");

        }
        //Print elements in reverse order
        System.out.println();
        System.out.println("--------------------REVERSE------------------");
        for (int i = languages.length-1; i >=0 ; i--) {
            System.out.print(languages[i]+" ");
        }
    }
}

