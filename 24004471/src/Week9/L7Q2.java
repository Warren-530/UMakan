
package Week9;
/*
import java.util.Scanner;
import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;
import java.io.*;
public class L7Q2{
    public static void main(String[] args) {
        try{
            URL u = new URL("https://fsktm.um.edu.my/");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\InputAndOutput\\index.htm"));
            while(in.hasNext()){
                String line = in.nextLine();
                writer.write(line);
                writer.newLine();
            }
            in.close();
            writer.close();
        }catch(IOException e){
            System.out.println("IO Error:" + e.getMessage());
        }
    }
}
*/