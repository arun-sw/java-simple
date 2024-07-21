import java.util.Scanner;

public class userdif extends Exception{
    userdif(String str){
        super(str);
    }

} class targrt {
    static void animal(int leg) throws userdif{

        if(leg<=2)
        {
            throw new ArithmeticException("it's are human");
        }
        else {
            throw new userdif("it's are not human");
        }
    }
    public static void main(String[] args) {
        try

        {
            System.out.println("Enter the legs");
            int leg=new Scanner(System.in).nextInt();
            animal(leg);
        }
        catch (ArithmeticException d){
            System.out.println(d);
        }
        catch (userdif d){
            System.out.println(d);
        }
    }
}


