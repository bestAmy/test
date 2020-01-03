package cn.whpu.practice05.three;

public class Operation {
    double number1;
    double number2;
    double result;
    String operation="";
    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    public String getOperation(){
        return operation;
    }
    public void setOperation(String operation){
        this.operation=operation;
    }
    public double getResult() {
        if(operation.equals("+"))
            result=number1+number2;
        else if(operation.equals("-"))
            result=number1-number2;
        else if(operation.equals("*"))
            result=number1*number2;
        else if(operation.equals("/"))
            result=number1/number2;
        return result;
    }
}
