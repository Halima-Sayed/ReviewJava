package review8;

public class ConstructorExample {
    /*how to implement/create a constructor?
    1. must have same name as the class
    2. no return type, not even void
     */
    //If we want to create our own constructor we can create 1. non argument constructor. 2. parameterized constructor.
    ConstructorExample(){
        System.out.println("I created this constructor");
    }
    ConstructorExample(String str){
        System.out.println("I am a parameterized constructor");
    }
    public static void main(String[] args) {
       new ConstructorExample(); // calling a constructor of ConstructorExample class
        // when we do not create -> compiler create a default constructor
        // why-constructor is used to initialize the state of the object

        ConstructorExample obj=new ConstructorExample("hello");
    }
}
