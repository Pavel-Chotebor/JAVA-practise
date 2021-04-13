package main.java.music;

abstract public class StringedInstrument extends Instrument {

    int numberOfStrings;

    public StringedInstrument(String name, int numberOfStrings) {
        super(name);
        this.numberOfStrings = numberOfStrings;
    }

    abstract public String sound ();

    public void play() {
        System.out.println(this.name + ", a " + this.numberOfStrings + "- stringed instrument that goes " + this.sound() + "."  );

    }
}
