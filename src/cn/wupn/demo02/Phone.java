package cn.wupn.demo02;

public class Phone {
    private String brand; //品牌
    private double price; //价格
    private String color; //颜色

    public void call(String who){
        System.out.println("给"+who+"打电话");
    }
    public void sendMessage(){
        System.out.println("Send message!");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Phone() {
    }

    public Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
}


