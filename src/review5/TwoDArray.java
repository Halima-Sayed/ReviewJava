package review5;

public class TwoDArray {
    public static void main(String[] args) {
        String[][] cars={
                {"Ford","Lincoln","Dodge"},
                {"BMW", "Audi","Mercedes","VE","Fiat"},
                {"Honda","Toyota","Subaru","Nissan"}
        };

        System.out.println(cars[1][1]);
        System.out.println("------------------");

        for (String[] garage : cars) { //iterates over each 1d array
            for (String car : garage) { // iterates over each element in that 1d array
                System.out.print(car+" ");
            }
            System.out.println();
        }
    }
}
