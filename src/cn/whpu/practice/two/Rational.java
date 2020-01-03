package cn.whpu.practice.two;

public class Rational {
    private long numerator;
    private long denominator;

    public Rational() {
        this.numerator=0;
        this.denominator=1;
    }

    public Rational(long numerator, long denominator) {
        this.numerator = numerator/gcd(numerator,denominator);
        this.denominator = denominator/gcd(numerator,denominator);
    }

    private long gcd(long n,long d){
        long a=n>d?n:d;
        long maxCommonDivisor=1;
        for(long i=1;i<=a;i++){
            if(n%i==0&&d%i==0){
                maxCommonDivisor=i;
            }
        }
        return maxCommonDivisor;
    }
    public Rational add(Rational secondRational){
        Rational thirdRational = new Rational();
        long maxCommonDivisor=gcd(this.denominator,secondRational.denominator);
        thirdRational.denominator=this.denominator*(secondRational.denominator/maxCommonDivisor);
        thirdRational.numerator=this.numerator*(secondRational.denominator/maxCommonDivisor)+secondRational.numerator*(this.denominator/maxCommonDivisor);
        return thirdRational;
    }
    public Rational subtract(Rational secondRational){
        Rational thirdRational = new Rational();
        long maxCommonDivisor=gcd(this.denominator,secondRational.denominator);
        thirdRational.denominator=this.denominator*(secondRational.denominator/maxCommonDivisor);
        thirdRational.numerator=this.numerator*(secondRational.denominator/maxCommonDivisor)-secondRational.numerator*(this.denominator/maxCommonDivisor);
        return thirdRational;
}
    public Rational multiply(Rational secondRational){
        Rational thirdRational = new Rational();
        thirdRational.denominator=this.denominator*secondRational.denominator;
        thirdRational.numerator=this.numerator*secondRational.numerator;
        long maxCommonDivisor=gcd(thirdRational.numerator,thirdRational.denominator);
        thirdRational.denominator=thirdRational.denominator/maxCommonDivisor;
        thirdRational.numerator=thirdRational.numerator/maxCommonDivisor;
        return thirdRational;
    }
    public Rational divide(Rational secondRational){
        Rational thirdRational = new Rational();
        thirdRational.denominator=this.denominator*secondRational.numerator;
        thirdRational.numerator=this.numerator*secondRational.denominator;
        long maxCommonDivisor=gcd(thirdRational.numerator,thirdRational.denominator);
        thirdRational.denominator=thirdRational.denominator/maxCommonDivisor;
        thirdRational.numerator=thirdRational.numerator/maxCommonDivisor;
        return thirdRational;
    }

    public String toString(){
        String s;
        if(this.denominator==1){
            s=this.numerator+"";
        }else {

            s=this.numerator+"/"+this.denominator;
        }
        return s;
    }

}
