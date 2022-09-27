package lab_1;

public class Bouquet {
    private int countOfFlowers;
    private int cost;
    private Flower[] flowers;
    public void setCountOfFlowers(int cof){countOfFlowers = cof;}
    public void setCost(int c){cost = c;}
    public void setFlowers(Flower[] f){flowers = f;}

    public int getCountOfFlowers(){return countOfFlowers;}
    public int getCost(){return cost;}
    public Flower[] getFlowers() {return flowers;}

    public Bouquet(int countOfFlowers, int cost, Flower[] flowers){
        this.countOfFlowers = countOfFlowers;
        this.cost = cost;
        this.flowers = flowers;
    }

}
