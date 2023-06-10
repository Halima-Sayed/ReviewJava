package review8;

public class Doctor {
    public String firstName, lastName;
   protected String speciality;
    int yearsOfExperience;
 private double salary;

    public static boolean degree;

     Doctor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
     /*   this.speciality = speciality;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;

      */
    }
    //To have more than 1 constructor we need to change the number of the parameters or type of the parameters
   /* public Doctor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    */
   public Doctor(String firstName,String lastName,String speciality){ //public now is accessible inside different package
        this(firstName,lastName); // this()-> calling a current class constructor
        this.speciality=speciality; // this. referring to current class instance variable
    }
    public void printInfo(){
        System.out.println("Doctors name is "+firstName+" "+lastName+". And speciality is "+speciality);
    }
    protected void treat(){
        System.out.println("Doctors treat patients");
    }
    void prescribeMedicine(String medicine){
        System.out.println("Doctors prescribed "+medicine);
    }

   private double getSalary(){
        return  salary;
   }
}
