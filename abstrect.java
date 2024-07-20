public class main{
    public static void main(String[] args) {
        letter l = new letter();
        l.count();
    }
}
abstract class num{
    abstract void count();
        }
class letter extends num{
    void count(){
        System.out.println("countless");
    }
}
