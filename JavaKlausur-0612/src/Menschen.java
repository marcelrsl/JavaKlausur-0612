public class Menschen{
    String Vorname;
    String Nachname;

    public Menschen(String vorname, String nachname) {
        setVorname (vorname);
        setNachname (nachname);
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

}
