public class Parrot extends Bird implements Voice, CanFly {
    private String name;
    private String color;


    public Parrot(boolean eukaryotes, boolean feathered, String name, String color) {
        super(eukaryotes, feathered);
        this.name = name;
        this.color = color;

    }


    @Override
    public String Voice() {
        return "Chirp";
    }

    @Override
    public void Fly() {

    }
}


