public class constroctor {    
    int regno;
    String name;
    int mark;
    constroctor(int rollno, int mark) {
        System.out.println(rollno);
        name="arunkumar";
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
        constroctor con=new constroctor(33,100);
    }
}
