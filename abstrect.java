public class main{
    public static void main(String[] args) 
    {
        cherater l = new cherter();
        l.count();
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
