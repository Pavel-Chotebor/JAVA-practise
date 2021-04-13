package Sharpie;

public class Sharpie {

    private String color;
    private float width;
     float inkAmount;


    public Sharpie (String color, float width) {

        inkAmount = 100;
        this.color=color;
        this.width=width;
    }

    public void use() {
        inkAmount = inkAmount - 10;
        System.out.println("Only " + inkAmount + "left" );

    }

    @Override
    public  String toString (){
        return color + " sharpie: only " + inkAmount + " ink capacity left!";

    }

}
