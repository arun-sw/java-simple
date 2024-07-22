import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sn =new Scanner(System.in);
        System.out.println("enter the value");
               int n=sn.nextInt();
        for (int i=n;i>=1;i--){
            for (int j=1;j<=n;j++){
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
