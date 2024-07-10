public class thse {
    public static void main(String[] args) {
        home h = new home();
        h.print(15, 'a');
        System.out.println(h.name);
        System.out.println(h.room);
    }
    }
    class home{
        int room;
        char  name;

            void print(int room,char name){
           this.room=room;
           this.name=name;
        }

    }
    class bedroom extends home {
        void bed(){
            System.out.println("bedroom");
        }
    }
    class kitchen extends home {
        void samayalkattu(){
            System.out.println("kitchen");
        }
    }

