public class constroctor {    
    int regno;
    String name;
    int mark;
    constroctor(int rollno, int mark) {
        System.out.println(regno);
        name="arun";
        System.out.println(name);
        System.out.println(mark);
    }
    public void display(String[] args) {
        System.out.println(regno);
        System.out.println(name);
    }
}
class num{
    public static void main(String[] args)
    {
        constroctor con=new constroctor(33,100);
    }
}
