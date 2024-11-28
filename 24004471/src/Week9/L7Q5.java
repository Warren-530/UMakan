package Week9;
/*
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
    public class L7Q5{
        private String name;
        private int age;
        private char gender;
        public L7Q5(String name, int age, char gender){
            this.name = name;
            this.age = age;
            this.gender = gender;
        }
        
  
        public static void main(String[] args) {
            try{
                ObjectInputStream reader = new ObjectInputStream(new FileInputStream("D:\\InputAndOutput\\person.dat"));
                int numberRecord = reader.readInt();
                ArrayList<L7Q5> people = new ArrayList<>();
                
                for(int i = 0 ; i<numberRecord ; i++){
                    String name = reader.readUTF();
                    int age = reader.readInt();
                    char gender = reader.readChar();
                    L7Q5 person = new L7Q5(name,age,gender);
                    people.add(person);
                }
                reader.close();
                
                System.out.println("Arrangement before sorting:");
                printPeople(people);
                sortPeople(people);
                
                System.out.println();
                
                System.out.println("Arrangement after sorting:");
                printPeople(people);
                
                }catch(IOException e){
                System.out.println("Error file input");
            }
        }
        
        public static void sortPeople(ArrayList<L7Q5> people){
            for (int i = 0; i < people.size(); i++){
            for(int j = 0; j < people.size() - i - 1; j++){
                if(people.get(j).name.compareTo(people.get(j+1).name) > 0){
                    Collections.swap(people, j, j+1);
                }
            }
        }
        }
        public static void printPeople(ArrayList<L7Q5> people){
            for(L7Q5 person : people){
            System.out.println(person.name + " " );
            System.out.println(person.age + " ");
            System.out.println(person.gender);
        }
        }
}
*/
/*
import java.util.ArrayList;
import java.io.*;
import java.util.Collections;
public class L7Q5{
    public static void main(String[] args) {
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\InputAndOutput\\person.dat"));
            int numRecord = in.readInt();
            ArrayList<info> person = new ArrayList<>();
            for(int i = 0 ;i<numRecord; i++){
                String name = in.readUTF();
                int age = in.readInt();
                char gender = in.readChar();
                info people = new info(name, age, gender);
                person.add(people);
            }
            in.close();
            System.out.println("Arrangement before sorting");
            print(person);
            sort(person);
            System.out.println("Arrangement after sorting");
            print(person);
        }catch(FileNotFoundException e){
            System.out.println("The file cannot be found");
        }catch(IOException e){
            System.out.println("Error when reading the file");
        }
    }
    static class info{
        private String name;
        private int age;
        private char gender;
        public info(String name, int age, char gender){
            this.name = name;
            this.age = age;
            this.gender = gender;
        }
        public String toString(){
            return "Name:" + name + "\nAge :" + age + "\nGender:" + gender;
        }
    }
    public static void print(ArrayList <info> person){
        for (info people :person){
            System.out.println(people.toString());
        }
        
    }
    public static void sort(ArrayList <info> person){
        for(int i=0 ; i<person.size() ; i++){
            for(int j=0 ; j<person.size()-i-1 ; j++){
                if(person.get(j).name.compareTo(person.get(j+1).name) >0){
                    info temp = person.get(j+1);
                    person.set(j+1, person.get(j));
                    person.set(j, temp);
                }
            }
        }
    }
}*/