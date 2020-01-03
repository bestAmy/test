package cn.whpu.practice02.one;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

interface Soundable{
    public void soundAble(); //发声功能
    public void soundBigOrSmall(); //调节音量大小
}

class Radio implements Soundable{
    public void soundAble(){
        System.out.println("发声的设备为Radio");
    }
    public void soundBigOrSmall(){
        System.out.println("声音调大调小");
    }
}

class Walkman implements Soundable{
    public void soundAble(){
        System.out.println("发声的设备为Walkman");
    }
    public void soundBigOrSmall(){
        System.out.println("声音调大调小");
    }
}

class Mobilephone implements Soundable{
    public void soundAble(){
        System.out.println("发声的设备为Mobilephone");
    }
    public void soundBigOrSmall(){
        System.out.println("声音调大调小");
    }
}

public class SoundableTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想听的设备(radio,walkman,mobilephone)：");
        String equipment = sc.next();
        if(equipment.equals("radio")){
            Soundable ra = new Radio();
            ra.soundAble();
            ra.soundBigOrSmall();
        }else if(equipment.equals("walkman")){
            Soundable wa = new Walkman();
            wa.soundAble();
            wa.soundBigOrSmall();
        }else if(equipment.equals("mobilephone")){
            Soundable mo = new Mobilephone();
            mo.soundAble();
            mo.soundBigOrSmall();
        }else {
            System.out.println("不存在该设备");
        }
    }
}
