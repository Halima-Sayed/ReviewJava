package review8_2;

import review8.Doctor;

public class AnotherHospital {
    public static void main(String[] args) {
        Doctor doc=new Doctor("Axel","Moraga","ENT");
        doc.printInfo();//public
       // doc.treat();//CE->Compiler Error: no protected
        // doc.prescribeMedicine("Antibiotics"); // CE: no default
    }
}
