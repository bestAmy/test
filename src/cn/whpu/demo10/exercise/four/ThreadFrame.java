package cn.whpu.demo10.exercise.four;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ThreadFrame extends Frame implements ActionListener
{
    JLabel wordLabel;
    JButton button;
    JTextField inputText,scoreText;
   WordThread giveWord;//用WordThread声明一个giveWord对象
    int score=0;
    ThreadFrame()
    { wordLabel=new JLabel(" ",JLabel.CENTER);
        wordLabel.setFont(new Font("",Font.BOLD,72));
        button=new JButton("开始");
        inputText=new JTextField(3);
        scoreText=new JTextField(5);
        scoreText.setEditable(false);
        giveWord=new WordThread(wordLabel);//创建giveWord，将wordLabel传递给WordThread构造方法的参数
        button.addActionListener(this);
        inputText.addActionListener(this);
        add(button,BorderLayout.NORTH);
        add(wordLabel,BorderLayout.CENTER);
        Panel southP=new Panel();
        southP.add(new JLabel("输入标签所显示的汉字后回车:"));
        southP.add(inputText);
        southP.add(scoreText);
        add(southP,BorderLayout.SOUTH);
        setBounds(100,100,350,180);
        setVisible(true);
        validate();
        addWindowListener(new WindowAdapter()
                          { public void windowClosing(WindowEvent e)
                          { System.exit(0);
                          }
                          }
        );
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {  if(!(giveWord.isAlive()))     //giveWord调用方法isAlive()
            {    giveWord=new WordThread(wordLabel);
            }
            try
            {    giveWord.start();//giveWord调用方法start()
            }
            catch(Exception exe){}
        }
        else if(e.getSource()==inputText)
        {  if(inputText.getText().equals(wordLabel.getText()))
        {  score++;
        }
            scoreText.setText("得分:"+score);
            inputText.setText(null);
        }
    }
}
