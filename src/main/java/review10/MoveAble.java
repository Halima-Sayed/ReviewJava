package review10;

public interface MoveAble {
    void move();
}
class Dog implements MoveAble{
    @Override
    public void move(){
        System.out.println("Dog is moving");
    }
}
class Car implements MoveAble{
    @Override
    public void move(){
        System.out.println("Car is moving");
    }
}
class Humans implements MoveAble{

    @Override
    public void move() {
        System.out.println("Humans move");
    }
}