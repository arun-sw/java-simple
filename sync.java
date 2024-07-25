class bottle{
     int countbottle=0;
    public synchronized void incrementbottle(){
         countbottle++;
     }
}
class team implements Runnable {
    bottle counter;
    team(bottle bot) {
        this.counter = bot ;
    }
       public void run(){
            for(int i=1;i<=2000;i++){
                counter.incrementbottle();}
        }}
class sync{
    public static void main(String[] args) {
        bottle counter=new bottle();
        Thread team1=new Thread(new team(counter));
        Thread team2=new Thread(new team(counter));
        team1.start();
        team2.start();

        try {
            team1.join();
            team2.join();
        }
        catch(Exception a){
            System.out.println(a);
        }
        System.out.println(counter.countbottle);

    }
}
