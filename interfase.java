interface animal{
    abstract void cat();
    abstract void dog();
    }
 class lotlog implements animal
 {
     public void cats(){
    System.out.println("i eat the biscat");
    }
    public void dogs(){
        System.out.println("i like the biscat");
    }

    public static void main(String[] args) {
       lotlog in = new lotlog();
        in.cat();
        in.dog();
    }
}
