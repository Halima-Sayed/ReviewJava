package review3;

public class SwitchStatements {
    public static void main(String[] args) {

        /* Intellij is case-sensitive for example if the value is Green and the case is green
        it won't accept. So if we want
        If we want the switch statements to go through with the code even when we have upper cases or lower cases
        we can use switch (color.toUpperCase()){} or switch (color.toLowerCase()){}
        */
        String color="GREEN"; //Green, grEEn. GrEeN
        System.out.println(color.toLowerCase());

        switch (color.toLowerCase()){
            case "red":
                System.out.println("Stop");
                break;
            case "orange":
                System.out.println("Yield");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Unknown color, action is unknown");
        }
    }
}
