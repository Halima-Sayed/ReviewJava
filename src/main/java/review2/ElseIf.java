package review2;

public class ElseIf {
    public static void main(String[] args) {

        // create a worldCup program
        // if year is 2022-> host country
        // if year is 2018 -> host country
        // if year is 2014 -> host country

        int worldCup = 3014;
        if (worldCup == 2022) {
            System.out.println("Host country is Qatar");
        } else if (worldCup == 2018) {
            System.out.println("Host country is Russia");
        }else if (worldCup==2014){
            System.out.println("Host country is Brazil");
        }else{
            System.out.println("Host country is unknown");
        }
    }
}