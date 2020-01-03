package exercise.InnerClass;

public class Body {
    private String name="zqy";
    int num=30;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public class Heart{
        int num=20;
        public void beat(){
            int num=10;
            System.out.println("蹦蹦蹦");
            System.out.println("我的名字叫："+name);
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Body.this.num);
        }
    }
    public void methodBody(){
        System.out.println("这是外部类方法");
        Heart heart=new Heart();
        heart.beat();
    }
}
