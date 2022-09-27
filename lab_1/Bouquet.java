package lab_1;

import lab_1.accessories.Accessory;

public class Bouquet {
    private int countOfFlowers;
    private int cost;
    private Flower[] flowers;
    private Accessory[] accessories;
    public void setCountOfFlowers(int cof){countOfFlowers = cof;}
    public void setCost(int c){cost = c;}
    public void setFlowers(Flower[] f){flowers = f;}
    public void setAccessories(Accessory[] accessories) {this.accessories = accessories;}

    public int getCountOfFlowers(){return countOfFlowers;}
    public int getCost(){return cost;}
    public Flower[] getFlowers() {return flowers;}
    public Accessory[] getAccessories() {return accessories;}

    public Bouquet(int countOfFlowers, int cost, Flower[] flowers, Accessory[] accessories){
        this.countOfFlowers = countOfFlowers;
        this.cost = cost;
        this.flowers = flowers;
        this.accessories = accessories;
    }

}
