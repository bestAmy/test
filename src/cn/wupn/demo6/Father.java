package cn.wupn.demo6;

public class Father {
    public Father() {
        System.out.println("Father Constructor");
    }
    public void speak(){
        System.out.println("Father speak");
    }

    public static void main(String[] args) {
        Father father = new Son1();
        father.speak();
        if(father instanceof Son1) ((Son1)father).playFootball();
        father = new Son2();
        father.speak();
        if(father instanceof Son2) ((Son2)father).playPiano();
    }
}

class Son1 extends Father{
    public Son1() {
        System.out.println("Son1 Constructor");
    }
    public void speak(){
        System.out.println("Son1 speak");
    }
    public void playFootball(){
        System.out.println("Son1 can playFootball");
    }

}

class Son2 extends Father{
    public Son2() {
        System.out.println("Son2 Constructor");
    }
    public void speak(){
        System.out.println("Son2 speak");
    }
    public void playPiano(){
        System.out.println("Son2 can playPiano");
    }
}
