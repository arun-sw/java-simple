public class inga{
    public static void main(String[] args) {
        animal ani =new animal();
       dog do = new dog();
        human h = new human();
        System.out.println(h.legs);
        System.out.println(h.iam);
    }
}
class animal{
    int legs=4;
    String iam="i am a animal";
}
class dog extends animal{
    int legs=4;
    String iam="i am a dog";
}
class human extends dog{
    int legs=2;
    String iam="i am a human";
}
