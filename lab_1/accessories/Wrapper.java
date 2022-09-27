package lab_1.accessories;

public class Wrapper extends Accessory{
    private int width;//in meters
    private int height;//in meters
    private int priceForOneSquareMeter;
    public void setWidth(int w){width = w;}
    public void setHeight(int h){height = h;}
    public void setPriceForOneSquareMeter(int p){priceForOneSquareMeter = p;}
    public int getWidth(){return width;}
    public int getHeight(){return height;}
    public int getPriceForOneSquareMeter(){return priceForOneSquareMeter;}

    Wrapper(String color, int width, int height, int priceForOneSquareMeter){
        super(priceForOneSquareMeter*width*height, color);
        this.priceForOneSquareMeter = priceForOneSquareMeter;
        this.width = width;
        this.height = height;
    }
}
