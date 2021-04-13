package Zoo;

public class Mammal extends Animal{

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String breed() {
        breedType = "pushing miniature versions out.";
        return breedType;

    }
}
