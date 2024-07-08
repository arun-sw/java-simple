public class multilevel {
    public static void main(String[] args) {
        home h=new home();
        h.all();
        bedroom b=new bedroom();
        b.bed();
        kitchen k = new kitchen();
        k.samayalkattu();
    }
}
class home{
    void all()
    {
        System.out.println("all room");
    }
}
class bedroom extends home{
    void bed(){
        System.out.println("bedroom");
    }
}
class kitchen extends home{
    void samayalkattu(){
        System.out.println("kitchen");
    }
}