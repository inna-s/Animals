public class Pig extends Mammal implements Voicable {
    private String name;
    private String color;
    private int numOfLegs;

    public Pig(boolean eukaryotes, boolean drinkMilk, String name, String color, int numOfLegs) {
        super(eukaryotes, drinkMilk);
        this.name = name;
        this.color = color;
        this.numOfLegs = numOfLegs;
    }


    @Override
    public String Voice() {
        return "Oink";

    }
}
