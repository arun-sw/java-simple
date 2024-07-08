class main{
    public static void main(String[] args) {
        letter l = new letter();
        l.count();
    }}
abstract class number{
    abstract void count();
        }
class letter extends number{
    void count(){
        System.out.println("countless");
    }
}
