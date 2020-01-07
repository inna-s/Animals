abstract public class Mammal extends Animals {
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

    {

    }

}
