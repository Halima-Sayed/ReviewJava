package review3;

public class WhileLoop {
    public static void main(String[] args) {

        int time=9;

        while (time>7){
            System.out.println("Hi");
            time--; // the condition is 9>7 if we do time++ this will be infinite but with the time-- 9 is greater than 9
            // 8 is greater than 7 but 7 is not greater than 7,so we will only repeat hi two times
        }
    }
}
