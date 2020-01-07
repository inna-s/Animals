public class Frog extends Amphibians implements Voice, Swimmable, MainFunctions {
    private String name;
    private String color;
    private int numOfLegs;
    private int temperature;
    private boolean tail;

    public Frog(boolean eukaryotes, boolean habitat, String name, String color, int numOfLegs, int temperature, boolean tail) {
        super(eukaryotes, habitat);
        this.name = name;
        this.color = color;
        this.numOfLegs = numOfLegs;
        this.temperature = temperature;
        this.tail = tail;
    }

    @Override
    public void Swim() {

    }

    @Override
    public String Voice() {
        return "Croak";
    }
}
