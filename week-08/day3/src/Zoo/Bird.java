package Zoo;

public class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    @Override
    public String breed() {
        breedType = "breeding by laying eggs.";
        return breedType;
    }
}

