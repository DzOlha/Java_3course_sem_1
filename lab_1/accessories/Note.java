package lab_1.accessories;

public class Note extends Accessory{
    private String message;
    public void setMessage(String mes){message = mes;}
    public String getMessage(){return message;}

    Note(int price, String color, String message) {
        super(price, color);
        this.message = message;
    }
}
