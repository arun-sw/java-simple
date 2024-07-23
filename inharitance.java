public class inharitance {
    int whool=40;

    public void collar(){
        System.out.println("block");
    }
    public void prise(){
        System.out.println("500");
    }
}
class puma extends inharitance{
    String shoes="puma shoes";
}
class call{
    public static void main(String[] args) {
        puma in=new puma();
        System.out.println(in.whool);
        System.out.println(in.shoes);
        in.collar();
        in.prise();
    }
}
