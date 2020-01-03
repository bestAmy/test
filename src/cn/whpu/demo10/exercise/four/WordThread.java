package cn.whpu.demo10.exercise.four;

import javax.swing.*;
import java.awt.*;

public class WordThread extends Thread
{   char word;
    int k=19968;
    JLabel com;
    WordThread(JLabel com)
    {  this.com=com;
    }
    public void run()
    {  k=19968;
        while(true)
        {
            word=(char)k;
            com.setText(""+word);
            try{  sleep(6000);//调用sleep方法使得线程中断6000豪秒
            }
            catch(InterruptedException e){}
            k++;
            if(k>=29968) k=19968;
        }
    }
}

