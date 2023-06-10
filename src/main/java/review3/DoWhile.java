package review3;

public class DoWhile {
    public static void main(String[] args) {

        int a=4;

        do {
            System.out.println("Bye"); // with while(a>6) a being 5 it will only print out once why? because java
            // executes top to bottom so the first command we have given is do sout "BYE" so it will have to print that
            // and stop at while (a>6);
            a--;
        } while (a>6);

        System.out.println("------------");

        int b=4;

        while(b>6){
            System.out.println("Bye");
        }
    }
}
