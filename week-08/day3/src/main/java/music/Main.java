package main.java.music;

public class Main {

    public static void main(String[] args) {

        ElectricGuitar electricGuitar = new ElectricGuitar("Electric guitar", 6);
        BassGuitar bassGuitar = new BassGuitar("Bass guitar", 4);
        Violin violin = new Violin("Violin", 4);

        electricGuitar.play();
        bassGuitar.play();
        violin.play();
    }
}