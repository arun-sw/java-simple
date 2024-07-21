public class main{
    public static void main(String[] args) 
    {
        cherater a = new cherter();
        a.count();
    }
}
abstract class num{
    abstract void count();
        }
class cherater extends num{
    void count(){
        System.out.println("countless");
    }
}
