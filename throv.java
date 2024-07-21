import java.io.FileNotFoundException;
import java.util.Scanner;
public class throv {
    static void animal(int leg){
        if(leg==2)
        {
            throw new ArithmeticException("it's are human");
        }
    }
    public static void main(String[] args) {
        int num=new Scanner(System.in).nextInt();
        System.out.println(num);
        try

          {
              animal(2);
           }
          catch (ArithmeticException d){
              System.out.println(d.getMessage());
          }
    }
}
