public class Buchung {
    public static Object getKunde;
    Kunde kunde;
    Medien medien;
    
    public Buchung(Kunde kunde, Medien medien) {
        setKunde (kunde);
        setMedien (medien);
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public Medien getMedien() {
        return medien;
    }

    public void setMedien(Medien medien) {
        this.medien = medien;
    }

}
