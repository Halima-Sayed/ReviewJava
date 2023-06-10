package review12;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E9ConfigFiles {
    public static void main(String[] args) {
        String path="Files/config.properties";
        FileInputStream fis=null;
        try{
             fis=new FileInputStream(path);
            Properties prop=new Properties();
            prop.load(fis);
            System.out.println(prop.getProperty("url"));
        }catch (IOException f){
            f.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
