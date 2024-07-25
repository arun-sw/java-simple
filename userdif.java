import java.util.Scanner;
public class userdif extends Exception{
    userdif(String str){
        super(str);
    }
} class target {
    static void animal(int leg) throws userdif{
        if(leg<=2)
        {
            throw new ArithmeticException("it's is human");
        }
        else {
            throw new userdif("it's are not human");
        }
    }
    public static void main(String[] args) {
        try
        {
            System.out.println("Enter the leggs");
            int leg=new Scanner(System.in).nextInt();
            animal(leg);
        }
        catch (ArithmeticException d){
            System.out.println(d.getmassage);
        }
        catch (userdif d){
            System.out.println(d.getmassage);
        }
    }
}
