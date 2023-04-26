package review5;

public class TwoDArrayMore {
    public static void main(String[] args) {

        int[][] numbers= new int[3][4];

        //1 row
        numbers[0][0]=1;
        numbers[0][1]=2;
        numbers[0][2]=3;
        numbers[0][3]=4;

        //2 row
        numbers[1][0]=10;
        numbers[1][1]=20;
        numbers[1][2]=30;
        numbers[1][3]=40;

        //3 row
        numbers[2][0]=100;
        numbers[2][1]=200;
        numbers[2][2]=300;
        numbers[2][3]=400;

        //How to find out how many rows we have
        System.out.println(numbers.length); //3
        System.out.println(numbers[0].length); //4

        for (int i = 0; i < numbers.length ; i++) {

        }
    }
    }

