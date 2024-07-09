public class constroctor {
    int rollno;
    String name;
    int mark;
    constroctor(int rollno, int mark) {
        System.out.println(rollno);
        name="arun";
        System.out.println(name);
        System.out.println(mark);
    }
    public void disp(String[] args) {
        System.out.println(rollno);
        System.out.println(name);
    }
}
class num{
    public static void main(String[] args)
    {
        constroctor con=new constroctor(88,100);
    }
}
