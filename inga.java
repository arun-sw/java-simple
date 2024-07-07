public class inga{
    public static void main(String[] args) {
//        animal ani =new animal();
//       dog do = new dog();
        human hum = new human();
        System.out.println(hum.legs);
        System.out.println(hum.iam);
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