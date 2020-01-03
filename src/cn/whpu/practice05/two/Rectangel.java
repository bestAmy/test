package cn.whpu.practice05.two;

public class Rectangel {
    double topSide,downSide,height,area;
    public double getArea(){
        area=(topSide+downSide)*height/2;
        return area;
    }
    public void setTopSide(double topSide){
        this.topSide=topSide;
    }
    public void setDownSide(double downSide){
        this.downSide=downSide;
    }
    public void setHeight(double height){
        this.height=height;
    }
}
