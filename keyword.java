public class keyword {
    public static void main(String[] args) {
        forests f=new forests();
        f.dog();


        lion l=new lion();
        l.dog();



    }
}
    class forests{
    int neme=4;
    char how='f';
        static   void allanimals(){
            System.out.println("All animals");
        }
        void dog(){
            System.out.println("i am muturl");
        }

    }
    class lions extends forest {
         int lionhave=4;
        void tiger() {
            System.out.println("keep");
        }
           void dog(){
               System.out.println("i am");
                super.dog();
            }


    }
