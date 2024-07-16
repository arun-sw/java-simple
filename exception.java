public class exception {
    public static void main(String[] args) {
        int a =3;
        int b=0;

        try {
            System.out.println(a/b);
        }
        catch(ArithmeticException e) {
            System.out.println(a);
        }
        System.out.println("hello");
    }
}
