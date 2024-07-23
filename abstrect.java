public class main{
    public static void main(String[] args) 
    {
        cherater a = new cherter();
        a.count();
    }
}
abstract class number{
    abstract void count();
        }
class cherater extends number{
    void count(){
        System.out.println("countless");
    }
}
