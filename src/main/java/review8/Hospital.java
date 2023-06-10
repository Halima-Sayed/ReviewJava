package review8;

public class Hospital {
    public static void main(String[] args) {

     Doctor doc=new Doctor("John","Doe");
     doc.printInfo();
     Doctor doc2=new Doctor("Jane","Smith","Cardiologist");
     doc2.printInfo(); //public
        doc2.treat();// protected
        doc2.prescribeMedicine("Antibiotics");//default
        //getSalary cannot be accessed because it is private
    }
}
