    class daily implements Runnable{
        public void run(){
            System.out.println("I'm going to clg "+ Thread.currentThread().getId());
            System.out.println("i am study "+ Thread.currentThread().getId());
            System.out.println("i am came "+ Thread.currentThread().getId());
        }
    }
    public class runnable{
        public static void main(String[] args) {
            int i;
            for (i=0;i<4;i++){
                daily d =new daily();
                Thread dol = new Thread(d);
                dol.start();
            }

        }
    }


