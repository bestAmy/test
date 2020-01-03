package cn.whpu.demo05.exercise.two;

class Math{
    public int div(int i ,int j) throws Exception{
        int temp=i/j;
        return temp;
    }
}

public class ThrowsDemo {
    public static void main(String args[]){
        Math m=new Math();
        try{
            System.out.println("结果是："+m.div(10,0));
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
