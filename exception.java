public class exception {
    public static void main(String[] args) {
         int a =20;
        int b=10;
        try {
            System.out.println(a/b);
        }
        catch(ArithmeticException e) {
            System.out.println(a+b);
        }
        System.out.println("hello");
    }
}
