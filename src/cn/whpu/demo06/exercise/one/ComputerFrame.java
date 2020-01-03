package cn.whpu.demo06.exercise.one;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ComputerFrame extends Frame implements ActionListener
{
    JTextField textOne,textTwo,textResult;
    JButton getProblem, giveAnswer;
    JLabel operatorLabel,message;
    Teacher teacher;
    ComputerFrame(String s)
    { super(s);
        teacher=new Teacher();
        setLayout(new FlowLayout());
        textOne=new JTextField(10);     //创建textOne,其可见字符长是10
        textTwo=new JTextField(10);     //创建textTwo,其可见字符长是10
        textResult=new JTextField(10);  //创建textResult,其可见字符长是10
        operatorLabel=new JLabel("+");
        message=new JLabel("你还没有回答呢");
        getProblem=new JButton("获取题目");
        giveAnswer =new JButton("确认答案");
        add(getProblem);
        add(textOne);
        add(operatorLabel);
        add(textTwo);
        add(new Label("="));
        add(textResult);
        add(giveAnswer);
        add(message);
        textResult.requestFocus();
        textOne.setEditable(false);
        textTwo.setEditable(false);
        getProblem.addActionListener(this);//将当前窗口注册为getProblem的ActionEvent事件监视器
        giveAnswer.addActionListener(this);//将当前窗口注册为giveAnswer的ActionEvent事件监视器
        textResult.addActionListener(this);//将当前窗口注册为textResult的ActionEvent事件监视器
        setBounds(100,100,450,100);
        setVisible(true);
        validate();
        addWindowListener(new WindowAdapter()
                          {  public void windowClosing(WindowEvent e)
                          {  System.exit(0);
                          }
                          }
        );
    }
    public void actionPerformed(ActionEvent e)
    { if(e.getSource()==getProblem) //判断事件源是否是getProblem
        { int number1=teacher.giveNumberOne(100);
            int number2=teacher.giveNumberTwo(100);
            String operator=teacher.giveOperator();
            textOne.setText(""+number1);
            textTwo.setText(""+number2);
            operatorLabel.setText(operator);
            message.setText("请回答");
            textResult.setText(null);
        }
        if(e.getSource()==giveAnswer) //判断事件源是否是giveAnswer
        {  String answer=textResult.getText();
            try{
                int result=Integer.parseInt(answer);
                if(teacher.getRight(result))
                {  message.setText("你回答正确");
                }
                else
                { message.setText("你回答错误");
                }
            }
            catch(NumberFormatException ex)
            {  message.setText("请输入数字字符");
            }
        }
        textResult.requestFocus();
        validate();
    }
}

