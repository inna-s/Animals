abstract public class Mammal extends Animal {
    private boolean drinkMilk;

    public Mammal(boolean eukaryotes, boolean drinkMilk) {
        super(eukaryotes);
        this.drinkMilk = drinkMilk;
    }

    public boolean isDrinkMilk() {
        return drinkMilk;
    }

    public void setDrinkMilk(boolean drinkMilk) {
        this.drinkMilk = drinkMilk;
    }



}
