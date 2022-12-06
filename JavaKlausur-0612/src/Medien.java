public abstract class Medien {
    String Titel;
    int FSK;
    String Laenge;
    Boolean Verleih;
    
    public Medien(String titel, int fSK, String laenge, Boolean verleih) {
        setTitel (titel);
        setFSK (fSK);
        setLaenge (laenge);
        setVerleih (verleih);
    }

    public String getTitel() {
        return Titel;
    }

    public void setTitel(String titel) {
        Titel = titel;
    }

    public int getFSK() {
        return FSK;
    }

    public void setFSK(int fSK) {
        FSK = fSK;
    }

    public String getLaenge() {
        return Laenge;
    }

    public void setLaenge(String laenge) {
        Laenge = laenge;
    }

    public Boolean getVerleih() {
        return Verleih;
    }

    public void setVerleih(Boolean verleih) {
        Verleih = verleih;
    }
    
    public abstract void genaueDaten();
}
