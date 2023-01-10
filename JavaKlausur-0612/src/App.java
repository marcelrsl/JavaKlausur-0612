import java.util.ArrayList;

public class App {
    static ArrayList<Medien> media;
    static ArrayList<Schallplatte> schallplatten;
    static ArrayList<Buchung> buchungen;
    static ArrayList<Kunde> kunden;
    public static void main(String[] args) throws Exception {
        setMedia(new ArrayList<Medien>());
        setSchallplatte(new ArrayList<Schallplatte>());
        setBuchung(new ArrayList<Buchung>());
        setKunden(new ArrayList<Kunde>());
        
        demoTest();//Aufgabe 1 
        testWarnungen(); //Aufgabe 2
        erstelleDemoDaten(); //Die Demodaten werden hier erstellt
        ueberschreibeAusleihe(false); //Aufgabe 4, Medien werden auf "nicht ausgeliehen" gesetzt
        zeigeMedien(); //Aufgabe 3
        ueberschreibeAusleihe(true); //Aufgabe 4, Status der Ausleihe verändert sich zu "ausgeliehen"
        aendereSchallplatten(true); //Aufgabe 5, Hier wird erlaubt Schallplatten zu verleihen
        zeigeMedien(); //Aufgabe 3
        aendereSchallplatten(false); //Aufgabe 5
    }
    
    
    public static void demoTest(){ //Ausleihe wird in die Methode ausgelagert
        Kunde k1 = new Kunde("Müller", "Thomas", 123, 14, 0);
        Kunde k2 = new Kunde("Mustermann", "Alan", 127, 20, 4);
        Kunde k3 = new Kunde("Braun", "Hamma", 134, 20, 0);
        getKunden().add(k1);
        getKunden().add(k2);
        getKunden().add(k3);  //Der ArrayList werden Kunden hinzugeführt
        CD c1 = new CD("After Hours", 16, "1:23", true, "sp");
        DVD d1 = new DVD("Mamamia", 6, "2:30", false, true);
        BluRay b1 = new BluRay("Hallo", 0, "0:30", false, true);
        Schallplatte s1 = new Schallplatte("Bloody Vibe", 16, "3:00", true, null);

        buchungen.add(new Buchung(k1, d1));
        buchungen.add(new Buchung(k1, c1));
        buchungen.add(new Buchung(k2, b1));
        buchungen.add(new Buchung(k3, d1)); //Der Klasse Buchung werden in einer ArrayList Kunden, als auch Medien zugewiesen

        int i = 0;
        for (Buchung buchung : buchungen) {
            if (buchung.getKunde().getAlter() < buchung.getMedien().getFSK()) { //In der Klasse Buchung, wird das Alter des Kunden erfragt und auch das FSK, um zu ermitteln, ob das Alter höher oder gleich, wie das FSK Alter ist. Dies geschieht durch die For Each Schleife für jede Ausleihe.
                System.out.println("Der Vorgang kann für den Kunden nicht durchgeführt werden."); 
            }else{
            if (buchung.getKunde().getAusgelieheMedien().length > 5) { //Sobald der Kunde mehr als 5 Medien ausgeliehen hat, kann der Vorgang nicht durchgeführt werden, was in der Ausgabe erwähnt wird.
                System.out.println("Der Vorgang kann nicht durchgeführt werden, da der Kunde zu viele Medien besitzt.");
            }else{
                System.out.println("Vorgang für die Ausleihe wurde durchgeführt.");
                }
            }
            i++;
        }
        for (Kunde kunde : getKunden()) {
           if (kunde.getAusgelieheMedien().length > 5) {
                System.out.println("Schallplatte kann nicht ausgeliehen werden.");
            }else{
                System.out.println("Schallplatte kann ausgeliehen werden.");
            } 
        }
    }
    public static ArrayList<Medien> getMedia() {
        return media;
    }

    public static void testWarnungen(){ //Sobald die Basiskriterien in der vorherigen Methode geprüft wurden, wird die Anzahl der Warnungen des Kunden geprüft.
        for (Kunde kunde : getKunden()) {
            if (kunde.getVerwarnungen() > 5) {
                System.out.println(kunde.getVorname()+" "+kunde.getNachname()+" "+"darf keine Medien mehr ausleihen");  
            }
        };
    }
    public static void setMedia(ArrayList<Medien> media) {
        App.media = media;
    }
    public static ArrayList<Schallplatte> getSchallplatte() {
        return schallplatten;
    }

    public static void setSchallplatte(ArrayList<Schallplatte> schallplatte) {
        App.schallplatten = schallplatte;
    }
    
    public static ArrayList<Buchung> getBuchung() {
        return buchungen;
    }

    public static void setBuchung(ArrayList<Buchung> buchung) {
        App.buchungen = buchung;
    }

    public static ArrayList<Kunde> getKunden() {
        return kunden;
    }

    public static void setKunden(ArrayList<Kunde> kunden) {
        App.kunden = kunden;
    }

    public static void erstelleDemoDaten(){ //In Dieser Methode werden Objekte erstellt und die jeweiligen Eigenschaften werden zugewiesen.

        media.add(new DVD("Greybound", 18, "2:10", true, true));

        media.add(new CD("Last of Us", 16, "1:50", true, "sp"));

        media.add(new BluRay("Wednesday", 12, "2:30", true, false));

        media.add(new Schallplatte("30", 6, "1:50", true, true));

        schallplatten.add(new Schallplatte("Pipi Langstrumpf", 0, "3:04", true, true));
        schallplatten.add(new Schallplatte("Madagaskar", 0, "2:05", false, false));


    }   

    public static void ueberschreibeAusleihe(boolean Wert){ //Der vorherige Boolean Wert der Ausleihe wird nun überschrieben.
        for (Medien media : getMedia()) {
            media.setVerleih(Wert);
            if (media.getVerleih()==false) {
                System.out.println(media.getTitel()+" "+"nicht ausgeliehen.");
            }else{
                System.out.println(media.getTitel()+" "+"ausgeliehen.");
            }   
        }
    }

    public static void zeigeMedien(){ //Diese Methode gibt alle Methoden untereinander aufgelistet aus.
        int i = 1;
        for (Medien medien : getMedia()) {
            System.out.print(i + ".");
            medien.genaueDaten();
            i++;
        }
    }
    
    public static void aendereSchallplatten(boolean Wert){ //Hier wird der Ausleih Wert für die Schallplatten überschrieben, je nach dem Wert kann es eine unterschiedliche Ausgabe geben.
        for (Schallplatte schallplatte : getSchallplatte()){
            schallplatte.setDarfVerliehenWerden(Wert);
            if (schallplatte.getDarfVerliehenWerden()==true) {
                System.out.println(schallplatte.getTitel()+" "+"die Schallplatte darf ausgeliehen werden");
            }else{
                System.out.println(schallplatte.getTitel()+" "+"die Schallplatte darf nicht ausgeliehen werden"); 
            }
        }
    }
}
