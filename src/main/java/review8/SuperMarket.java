package review8;

public class SuperMarket {
    public static void main(String[] args) {
        Apple apple=new Apple("Fuji apple","Red");
        //apple.name="Fuji apple";
        apple.makeJuice(); // it is its own method
        apple.eat(); // comes from parent
        // apple.grow();// sibling classes do not share anything
        apple.getClass();//method comes from Object class -> is the parent class of all Objects in Java

    }
}
