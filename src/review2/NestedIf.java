package review2;

public class NestedIf {
    public static void main(String[] args) {
        /*
        Declare 2 variables for DL and a Car
        if uou have a DL then I will check if you have a car
         */

        boolean driverLicense=false;
        boolean car=true;

        if (driverLicense){
            System.out.println("Lets check if you have a car");

            if (car){
                System.out.println("You can drive to work");
            }else{
                System.out.println("You will need to take a bus or uber");
            }
        }else {
            System.out.println("You should get a DL");
        }

    }
}
