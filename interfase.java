interface animal{
    abstract void cat();
    abstract void dog();
    }
 class lotlog implements animal
 {public void cat(){
        System.out.println("i eat the biscat");
    }
    public void dog(){
        System.out.println("i love the biscat");
    }

    public static void main(String[] args) {
       lotlog in =new lotlog();
        in.cat();
        in.dog();
    }
}
