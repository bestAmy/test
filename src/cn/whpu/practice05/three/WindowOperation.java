package cn.whpu.practice05.three;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowOperation extends JFrame implements ActionListener {
    Operation operation;
    JTextField textA,textB,textC;
    JButton addButton,subtractButton,multiplyButton,divideButton;
    JMenuItem m1,m2,m3,m4,m5;
    WindowOperation(){
        this.setSize(250, 300);
        JMenuBar mb=new JMenuBar();//菜单栏
        JMenu jm=new JMenu("Operation");//菜单
        m1=new JMenuItem("Add");//创建菜单项
        m3=new JMenuItem("Subtract");//创建菜单项
        m4=new JMenuItem("Multiply");//创建菜单项
        m5=new JMenuItem("Divide");//创建菜单项
        jm.add(m1);
        jm.add(m3);jm.add(m4);jm.add(m5);
        JMenu jm2=new JMenu("Exit");
        m2=new JMenuItem("Close");//创建菜单项
        jm2.add(m2);
//		jm.remove(mil2);//删除指定的菜单项
        mb.add(jm);
        mb.add(jm2);
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);
        m5.addActionListener(this);
        this.setJMenuBar(mb);//设置菜单栏
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init(){
        operation=new Operation();
        textA=new JTextField(10);
        textB=new JTextField(10);
        textC=new JTextField(10);
        addButton=new JButton("Add");
        subtractButton=new JButton("Subtract");
        multiplyButton=new JButton("Multiply");
        divideButton=new JButton("Divide");
        JPanel pNorth=new JPanel();
        JPanel pSouth=new JPanel();
        pNorth.add(new JLabel("Number1"));
        pNorth.add(textA);
        pNorth.add(new JLabel("Number2"));
        pNorth.add(textB);
        pNorth.add(new JLabel("Result"));
        pNorth.add(textC);
        pSouth.add(addButton);
        addButton.addActionListener(this);
        pSouth.add(subtractButton);
        subtractButton.addActionListener(this);
        pSouth.add(multiplyButton);
        multiplyButton.addActionListener(this);
        pSouth.add(divideButton);
        divideButton.addActionListener(this);
        add(pNorth, BorderLayout.NORTH);
        add(pSouth,BorderLayout.SOUTH);
    }
    public void actionPerformed(ActionEvent e){
        try{
            double a=Double.parseDouble(textA.getText().trim());
            double b=Double.parseDouble(textB.getText().trim());
            Double result= (double) 0;
            operation.setNumber1(a);
            operation.setNumber2(b);
            if(e.getSource()==m2){
                System.exit(0);
            }else{
                if(e.getSource()==m1||e.getSource()==addButton){
                    result=a+b;
                }
                else if(e.getSource()==m3||e.getSource()==subtractButton){
                    result=a-b;
                }
                else if(e.getSource()==m4||e.getSource()==multiplyButton){
                    result=a*b;
                }
                else if(e.getSource()==m5||e.getSource()==divideButton){
                    result=a/b;
                }
                textC.setText(new Double(result).toString());
            }

        }
        catch(Exception ex){

        }
    }

}
