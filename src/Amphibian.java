abstract public class Amphibian extends Animal {
    private boolean habitatWater;

    public Amphibian(boolean eukaryotes, boolean water) {
        super(eukaryotes);
        habitatWater=water;
    }
}
