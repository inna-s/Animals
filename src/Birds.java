abstract public class Birds extends Animals {
    private boolean Feathered;

    public Birds(boolean eukaryotes, boolean feathered) {
        super(eukaryotes);
        Feathered = feathered;
    }

    public boolean isFeathered() {
        return Feathered;
    }

    public void setFeathered(boolean feathered) {
        Feathered = feathered;
    }

    {

    }

}
