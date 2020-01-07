
abstract public class Animals implements MainFunctions, Voice {
    private boolean Eukaryotes;


    public Animals(boolean eukaryotes) {
        this.Eukaryotes = eukaryotes;
    }

    public boolean isEukaryotes() {
        return Eukaryotes;
    }

    public void setEukaryotes(boolean eukaryotes) {
        this.Eukaryotes = eukaryotes;
    }
}


