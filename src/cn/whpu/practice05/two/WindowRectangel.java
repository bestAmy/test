package cn.whpu.practice05.two;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowRectangel extends JFrame implements ActionListener {
    Rectangel rectangel;
    JTextField textA,textB,textC;
    JTextArea showArea;
    JButton controlButton;
    WindowRectangel(){
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init(){
        rectangel=new Rectangel();
        textA=new JTextField(5);
        textB=new JTextField(5);
        textC=new JTextField(5);
        showArea=new JTextArea();
        controlButton=new JButton("计算面积");
        JPanel pNorth=new JPanel();
        pNorth.add(new JLabel("上底："));
        pNorth.add(textA);
        pNorth.add(new JLabel("下底："));
        pNorth.add(textB);
        pNorth.add(new JLabel("高："));
        pNorth.add(textC);
        pNorth.add(controlButton);
        controlButton.addActionListener(this);
        add(pNorth, BorderLayout.NORTH);
        add(new JScrollPane(showArea),BorderLayout.CENTER);
    }
    public void actionPerformed(ActionEvent e){
        try{
            double a=Double.parseDouble(textA.getText().trim());
            double b=Double.parseDouble(textB.getText().trim());
            double c=Double.parseDouble(textC.getText().trim());
            rectangel.setTopSide(a);
            rectangel.setDownSide(b);
            rectangel.setHeight(c);
            double area=rectangel.getArea();
            showArea.append("上底为："+a+",下底为："+b+",高为："+"的梯形的面积："+area+"\n");
        }
        catch (Exception ex){
            showArea.append("\n"+ex+"\n");
        }
    }

}
