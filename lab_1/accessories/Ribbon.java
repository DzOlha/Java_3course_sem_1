package lab_1.accessories;

public class Ribbon extends Accessory{
    private int length;
    public void setLength(int len){length = len;}
    public int getLength(){return length;}
    Ribbon(int price, String color, int length){
        super(price, color);
        this.length = length;
    }
}
