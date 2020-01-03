package exercise.InnerClass;

public class test {
    public static void main(String[] args) {
        Body body=new Body();
        body.methodBody();
        System.out.println("========");
        Body.Heart heart=new Body().new Heart();
        heart.beat();
        System.out.println("========");
        Body.Heart heart1=body.new Heart();
        heart1.beat();
    }
}
