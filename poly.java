public class poly {
   void run(){
       System.out.println("i am running");
    }
    void run(int k){
        System.out.println(k);
        System.out.println("i can");
    }

    public static void main(String[] args) {
        poly p =new poly();
        p.run();
        p.run(5);
    }
}
