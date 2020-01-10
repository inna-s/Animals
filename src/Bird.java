abstract public class Bird extends Animal {
    private boolean Feathered;

    public Bird(boolean eukaryotes, boolean feathered) {
        super(eukaryotes);
        Feathered = feathered;
    }

    public boolean isFeathered() {
        return Feathered;
    }

    public void setFeathered(boolean feathered) {
        Feathered = feathered;
    }

}
