public class exception {
    public static void main(String[] args) {
         int a =3;
        int b=6;
        try {
            System.out.println(a/b);
        }
        catch(ArithmeticException e) {
            System.out.println(a+5);
        }
        System.out.println("hello");
    }
}
