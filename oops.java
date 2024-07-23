public class oops {
    String name;
    int rollno;

    public  void display() {
        System.out.println(name);
        System.out.println(rollno);
    }
}
class main{
    public static void main(String[] args) {
        oops out = new oops();
        out.name="arunkumar";
        out.rollno = 1234;
        out.display();
    }
}
