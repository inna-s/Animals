public class Parrot extends Birds implements Voice, MainFunctions, AbleToFly {
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


