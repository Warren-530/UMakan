
package Week9;
/*
import java.util.Scanner;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.EOFException;
public class L7Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream("coursename.dat"));
            writer.writeUTF("Course Code , Course Name");
            writer.writeUTF("WXES1116 , Programming I");
            writer.writeUTF("WXES1115 , Data Structure");
            writer.writeUTF("WXES1110 , Operating System");
            writer.writeUTF("WXES1112 , Computing Mathematics I");
            writer.close();
            
        }
        catch(IOException e){
            System.out.println("Problem with file output");
        }
        System.out.println("Please enter the Course Code:");
        String code = sc.next();
        System.out.println("Name of the course is " + CourseCode(code));
    }
    public static String CourseCode(String code){
        String name = null;
        try{
            ObjectInputStream reader = new ObjectInputStream( new FileInputStream("coursename.dat"));
            reader.readUTF();
            
            while(true){
            try{
            String line = reader.readUTF();
            String [] parts = line.split(" , ");
            if (parts[0].equals(code)){
                name = parts[1];
                break;
            }
            }catch (EOFException e){
                    break;
            }
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }catch(IOException e){
            System.out.println("Problem with file input.");
        }
        
        return name;
    }
        }
    */