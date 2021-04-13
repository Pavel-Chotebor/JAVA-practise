package Zoo;

abstract public class Animal {

    protected String name;
    protected String breedType;

    public Animal (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public String breed();
}
