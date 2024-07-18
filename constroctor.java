public class constroctor
    {    
    int regno;
    String nam;
    int mark;
    constroctor(int regno, int mark)
        {
        System.out.println(regno);
        name="arun";
        System.out.println(nam);
        System.out.println(mark);
    }
    public void display(String[] args) 
    {
        System.out.println(regno);
        System.out.println(nam);
    }
}
class num{
    public static void main(String[] args)
    {
        constroctor con=new constroctor(33,100);
    }
}
