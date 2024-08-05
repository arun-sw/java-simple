
 class dailyrotine extends Thread
{
public void run(){
    System.out.println("I'm going to clg "+dailyrotine.currentThread().getId());
  System.out.println("i am study "+dailyrotine.currentThread().getId());
    System.out.println("i am came "+dailyrotine.currentThread().getId());
    System.out.println("i am running "+dailyrotine.currentThread().getId());
}
}
public class thered {
    public static void main(String[] args) {
        int i;
        for (i=0;i<4;i++){
            dailyrotine dol = new dailyrotine();
            dol.start();
            try {
                if(i==1){
                    dol.sleep(2000);
                }
            }
            catch(Exception n){

            }
        }


    }
}
