package main.java.music;

 public class BassGuitar extends StringedInstrument {


    public BassGuitar(String name, int numberOfStrings) {
        super(name, numberOfStrings);
    }

     @Override
     public String sound() {
         soundType = "Duum-duum-duum";
         return soundType;
     }
 }
