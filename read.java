import  java.util.Scanner;
import java.io.File;
public class read {
    public static void main(String[] args) {
        try {
            File n= new  File("C:\\Users\\Lenovo\\OneDrive\\Documents\\personal.txt");
            Scanner reader=new Scanner(n);
        while (reader.hasNextLine()){
            System.out.println(reader.nextLine());
        }
        reader.close();
        }
        catch(Exception h){
            System.out.println(h);
        }
    }
}