public class Mitarbeiter extends Menschen{
    int Mitarbeiternummer;
    
    public Mitarbeiter(String vorname, String nachname, int mitarbeiternummer) {
        super(vorname, nachname);
        setMitarbeiternummer (mitarbeiternummer);
    }

    public int getMitarbeiternummer() {
        return Mitarbeiternummer;
    }

    public void setMitarbeiternummer(int mitarbeiternummer) {
        Mitarbeiternummer = mitarbeiternummer;
    }

}
