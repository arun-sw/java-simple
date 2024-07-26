public class stati {
    public static void main(String[] args) {
        lion l=new lion();
        l.tiger();
        l.dog();
      forest.allanimals();
        System.out.println(lion.lionhave);
    }
}
class forest{
   static   void allanimals(){
         System.out.println("All animals");
     }
    void dog(){
         System.out.println("ieat");
    }

}
class lion extends forest{
   static int lionhave=4;
    void tiger(){
        System.out.println("keep");
    }
}
