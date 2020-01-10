
abstract public class Animal implements Voice {
    private boolean Eukaryotes;


    public Animal(boolean eukaryotes) {
        this.Eukaryotes = eukaryotes;
    }

    public boolean isEukaryotes() {
        return Eukaryotes;
    }

    public void setEukaryotes(boolean eukaryotes) {
        this.Eukaryotes = eukaryotes;
    }
}


