package lab_1;

import lab_1.accessories.Accessory;
import lab_1.flowers.Flower;

import java.util.ArrayList;
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
    public void printAllBouquetFlowers(){
        int size = flowers.length;
        for (int i = 0; i < size; i++) {
            System.out.println(flowers[i]);
        }
    }
    public void printAllBouquetAccessories(){
        int size = accessories.length;
        for (int i = 0; i < size; i++) {
            System.out.println(accessories[i]);
        }
    }
    public void printAllBouquet(){
        printAllBouquetFlowers();
        System.out.println("\n");
        printAllBouquetAccessories();
        System.out.println("\n");
        System.out.println("COST = " + cost);
    }
    public ArrayList<Flower> findFlowerByHeightRange(double a, double b){
        ArrayList<Flower> flowersFromHeightRange = new ArrayList<>();
        int size = flowers.length;
        double tmpHeight = 0;
        for (int i = 0; i < size; i++) {
            tmpHeight = flowers[i].getHeight();
            if(tmpHeight >= a && tmpHeight <= b){
                System.out.println(flowers[i]);
                flowersFromHeightRange.add(flowers[i]);
            }
        }
        return flowersFromHeightRange;
    }
}
