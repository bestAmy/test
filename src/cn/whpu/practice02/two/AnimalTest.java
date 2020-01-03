package cn.whpu.practice02.two;

abstract class Animal{
    protected String name;
    protected String color;
    protected String type;//类别（哺乳类、非哺乳类）

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public abstract void eating();
    public abstract void sound();
}
abstract interface Swimmable{
    public abstract void swimming();
}

class Rebit extends Animal{
    public Rebit(String name, String color, String type) {
        super(name, color, type);
    }
    public void eating(){
        System.out.println("兔子吃草");
    }
    public void sound(){
        System.out.println("吱吱吱");
    }
}
class Qingwa extends Animal implements Swimmable{
    public Qingwa(String name, String color, String type) {
        super(name, color, type);
    }
    public void eating(){
        System.out.println("青蛙吃虫子");
    }
    public void sound(){
        System.out.println("呱呱呱");
    }
    public void swimming(){
        System.out.println("青蛙会游泳");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal rebit = new Rebit("兔子","白色","哺乳类");
        Animal qingwa1 = new Qingwa("青蛙","绿色","非哺乳类");
        Swimmable qingwa2 = new Qingwa("青蛙","绿色","非哺乳类");
        rebit.eating();
        rebit.sound();
        qingwa1.eating();
        qingwa1.sound();
        qingwa2.swimming();
    }

}
