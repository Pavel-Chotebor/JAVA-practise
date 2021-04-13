package main.java.music;

 public class ElectricGuitar extends StringedInstrument {


     public ElectricGuitar(String name, int numberOfStrings) {
         super(name, numberOfStrings);
     }

     @Override
     public String sound() {
         soundType = "Twang";
         return soundType;
     }
 }
