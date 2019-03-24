package Starbucks;

import java.io.*;

public class InputTest {
    public static void main(String[] args)throws IOException {
        int c;
        try {
            System.out.println(new File(".").getAbsolutePath());
            InputStream in  = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("./src/Starbucks/test.txt")));
            while ((c=in.read())>=0){
                System.out.print((char)c);
            }
            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
