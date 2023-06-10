package review3;

public class LogicalOperators {
    public static void main(String[] args) {

        System.out.println("----Logical AND-----");

        boolean loginButtonDisplayed=true;
        boolean loginClickable=false;


        if(loginButtonDisplayed && loginClickable){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }


        System.out.println("--------LOGICAL OR-------");


        boolean pictureDisplayed=true;
        String accountName="Syntax";
        if(pictureDisplayed || accountName.equals("Syntax")){
            System.out.println("Login was successful");
        }else {
            System.out.println("User was not able to login");
        }

        System.out.println("------Logical NOT-----");

        boolean hungry=!true;
        System.out.println(hungry);

        boolean cold=false;
        System.out.println(!cold);

        String str="Hello";

        if (!str.equals("Hello")){
            System.out.println("Value of the string is NOT hello");
        }

        boolean confirmSelected=false;

        if (!confirmSelected){
            System.out.println("Lets click on confirm checkbox");
        }
        System.out.println("Click on pay button");
    }
}
