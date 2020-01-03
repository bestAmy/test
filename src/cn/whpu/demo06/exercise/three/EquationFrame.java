package cn.whpu.demo06.exercise.three;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EquationFrame extends Frame implements ActionListener
{  SquareEquation equation;
    JTextField textA,textB,textC;
    JTextArea showRoots;
    JButton controlButton;
    public EquationFrame()
    {  equation=new SquareEquation();
        textA=new JTextField(8);
        textB=new JTextField(8);
        textC=new JTextField(8);
        showRoots=new JTextArea();
        controlButton=new JButton("确定");
        Panel pNorth=new Panel();
        pNorth.add(new JLabel("二次项系数:"));
        pNorth.add(textA);
        pNorth.add(new JLabel("一次项系数:"));
        pNorth.add(textB);
        pNorth.add(new JLabel("常数项系数:"));
        pNorth.add(textC);
        pNorth.add(controlButton);
        controlButton.addActionListener(this);//当前窗口作为controlButton的ActionEvent事件的监视器
        add(pNorth,BorderLayout.NORTH);
        add(showRoots,BorderLayout.CENTER);
        setBounds(100,100,630,160);
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
    {  try{
        double a=Double.parseDouble(textA.getText());   //textA调用方法获取其中的文本
        double b=Double.parseDouble(textB.getText()); //textB调用方法获取其中的文本
        double c=Double.parseDouble(textC.getText());  // textC调用方法获取其中的文本
        equation.setA(a);
        equation.setB(b);
        equation.setC(c);
        textA.setText(""+a);
        textB.setText(""+b);
        textC.setText(""+c);
        showRoots.append("\n 根："+equation.getRootOne());
        showRoots.append("   根："+equation.getRootTwo());
    }
    catch(Exception ex)
    {  showRoots.append("\n"+ex+"\n");
    }
    }
}

