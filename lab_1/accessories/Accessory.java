package lab_1.accessories;

public class Accessory {
    private int price;
    private String color;
    public void setPrice(int p){price = p;}
    public void setColor(String c){color = c;}
    public int getPrice(){return price;}
    public String getColor(){return color;}

    Accessory(int price, String color){
        this.price = price;
        this.color = color;
    }
}

