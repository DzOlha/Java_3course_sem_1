package lab_1;

import lab_1.accessories.Accessory;
import lab_1.flowers.Flower;

import java.util.Arrays;

public class Bouquet {
    private int cost;
    private Flower[] flowers;
    private Accessory[] accessories;
    public void setCost(int c){cost = c;}
    public void setFlowers(Flower[] f){flowers = f;}
    public void setAccessories(Accessory[] accessories) {this.accessories = accessories;}

    public int getCost(){return cost;}
    public Flower[] getFlowers() {return flowers;}
    public Accessory[] getAccessories() {return accessories;}

    public Bouquet(Flower[] flowers, Accessory[] accessories){
        Arrays.sort(flowers, new Flower.CompFreshRate());
        this.flowers = flowers;
        this.accessories = accessories;
        this.cost = calcBouquetCost();
    }
    public int calcBouquetCost(){
        int sum = 0;
        int j = 0;
        int sizeFl = flowers.length;
        int sizeAcc = accessories.length;
        for (int i = 0; i < sizeFl; i++){
            sum += flowers[i].getPrice();
            if(j < sizeAcc) {
                sum += accessories[j].getPrice();
                j++;
            }
        }
        return sum;
    }
}
