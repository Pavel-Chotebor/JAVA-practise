package main.java.music;

  public class Violin extends StringedInstrument {

    public Violin(String name, int numberOfStrings) {
      super(name, numberOfStrings);
    }

    @Override
    public String sound() {
      soundType = "Screech";
      return soundType;
    }
  }
