package review8;

public class Fruit {
    String name,color;

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void eat(){
        System.out.println("We can eat "+name);
    }
}
//1 parent - 1 child = single inheritance
class Mango extends Fruit{
    int price; //initializing own instance variable

    public Mango(String name, String color,int price) {
        // we MUST make a call to the parent class constructor
        super(name, color);
        // priority is super and then our own
        this.price=price;
    }

    protected void grow(String country){
        System.out.println(name+" grows in "+country);
    }
}
// 1 parent - 2 child classes = hierarchical
class Apple extends Fruit{

    public Apple(String name, String color) {
        super(name, color);
    }

    protected void makeJuice(){
        System.out.println("We can make "+name+" juice");
    }
}
// parent -> child-> grandchild = multilevel
class BabyApple extends Apple{
    public BabyApple(String name, String color) {
        super(name, color);
    }

    void print(){
        System.out.println(name +" is very small");
    }
}

