package cn.whpu.practice05.one;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TextListener implements DocumentListener {
    JTextArea inputText,showText;
    public void setInputText(JTextArea text){
        inputText=text;
    }
    public void setShowText(JTextArea text){
        showText=text;
    }
    public void changedUpdate(DocumentEvent e){
        String str=inputText.getText();
        String numbers[]=str.split(" ");
        double avg,sum=0;
        showText.setText(null);
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+Double.parseDouble(numbers[i]);
        }
        avg=sum/numbers.length;
        showText.append(avg+"");
    }
    public void removeUpdate(DocumentEvent e){
        changedUpdate(e);
    }
    public void insertUpdate(DocumentEvent e){
        changedUpdate(e);
    }
}
