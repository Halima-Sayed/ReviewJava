package review12;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class E11ConfigWrite {
    public static void main(String[] args) throws IOException {

        String path = "Files/Test.properties";
        FileInputStream fis=new FileInputStream(path);
        //to write data we use OUT
        Properties prop=new Properties();
        prop.load(fis);
        prop.setProperty("Name","Vlad");
        FileOutputStream fos=new FileOutputStream(path);
        prop.store(fos,"adding a name");
    }
}