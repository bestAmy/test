package cn.whpu.practice04.two;

enum Brand{
    Lenove("联想",5555),Dell("戴尔",4699),Accer("宏基",5555),ASN("ASN",5665),Apple("苹果",9999);
    private String type;
    private int price;

    Brand() {
    }

    Brand(String type, int price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String toString(){
        return "type="+type+"  price="+price;
    }
}



public class EnumTest01 {
    public static void main(String[] args) {
        Brand[] brands=Brand.values();
        for(Brand brand1:brands){
            System.out.print(brand1.name()+":");
            System.out.println(brand1);
        }
        /*
        Brand brand=Brand.Accer;
        brand.setType("hhh");
        brand.setPrice(5677);
        System.out.println(brand);*/
    }
}
