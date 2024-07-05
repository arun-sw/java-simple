public class inharitance {
    int whool=5;

    public void collar(){
        System.out.println("red");
    }
    public void prise(){
        System.out.println("600");
    }
}
class puma extends inharitance{
    String shoes="puma";
}
class call{
    public static void main(String[] args) {
//        inharitance in =new inharitance();
        puma in=new puma();
        System.out.println(in.whool);
        System.out.println(in.shoes);
        in.collar();
        in.prise();
    }
}