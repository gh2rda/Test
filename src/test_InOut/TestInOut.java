package test_InOut;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestInOut {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        System.out.println(File.separator);
        try {

            FileOutputStream myNewFile = new FileOutputStream("ggg.txt");
            byte[] b = {0, 1, 2, 3, 4, 5, 66};
            try {
                myNewFile.write(b);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
