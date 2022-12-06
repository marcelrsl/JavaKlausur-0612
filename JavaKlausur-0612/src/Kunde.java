public class Kunde extends Menschen{
    int Kundennummer;
    int Alter;
    Medien[] ausgelieheMedien = new Medien[4];
    int Verwarnungen;
    
    public Kunde(String vorname, String nachname, int kundennummer, int alter, int verwarnungen) {
        super(vorname, nachname);
        setKundennummer (kundennummer);
        setAlter (alter);
        setVerwarnungen (verwarnungen);
    }
   
    public int getKundennummer() {
        return Kundennummer;
    }

    public void setKundennummer(int kundennummer) {
        Kundennummer = kundennummer;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    public int getAlter() {
        return Alter;
    }

    public void setAlter(int alter) {
        Alter = alter;
    }

    public int getVerwarnungen() {
        return Verwarnungen;
    }

    public void setVerwarnungen(int verwarnungen) {
        Verwarnungen = verwarnungen;
    }

    public Medien[] getAusgelieheMedien() {
        return ausgelieheMedien;
    }

    public void setAusgelieheMedien(Medien[] ausgelieheMedien) {
        this.ausgelieheMedien = ausgelieheMedien;
    }

}
