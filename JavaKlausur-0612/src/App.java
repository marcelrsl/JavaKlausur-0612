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
        demoTest();//Aufgabe 1 
        setKunden(new ArrayList<Kunde>());
        // testWarnungen(); Aufgabe 2 (Nicht geschafft)
        erstelleDemoDaten(); 
        ueberschreibeAusleihe(false); //Aufgabe 4
        zeigeMedien(); //Aufgabe 3
        ueberschreibeAusleihe(true); //Aufgabe 4
        aendereSchallplatten(true); //Aufgabe 5
        zeigeMedien(); //Aufgabe 3
        aendereSchallplatten(false); //Aufgabe 5
    }
    
    //Aufgabe 2 konnte ich nicht mehr schaffen, weil ich fast eine Stunde an Aufgabe 1 saß und dann noch eine Fehlermeldung bei 2 hatte.. :/. Ich bin in Panik geraten weil ich eine ganze Aufgabe nicht gemacht habe, und Aufgabe 2 wirkt auf mich so wie die Hälfte. Ich bin mir bei dem Rest außer 5 durch Aufgabe 2 und der Zeit unsicher.. Ich musste die Aufgaben nämlich schnell noch hinkriegen. 
    
    public static void demoTest(){
        Kunde k1 = new Kunde("Müller", "Thomas", 123, 14, 0);
        Kunde k2 = new Kunde("Mustermann", "Alan", 127, 20, 4);
        Kunde k3 = new Kunde("Braun", "Hamma", 134, 20, 0);
        CD c1 = new CD("After Hours", 16, "1:23", true, "sp");
        DVD d1 = new DVD("Mamamia", 6, "2:30", false, true);
        BluRay b1 = new BluRay("Hallo", 0, "0:30", false, true);
        Schallplatte s1 = new Schallplatte("Bloody Vibe", 16, "3:00", true, null);

        buchungen.add(new Buchung(k1, d1));
        buchungen.add(new Buchung(k1, c1));
        buchungen.add(new Buchung(k2, b1));
        buchungen.add(new Buchung(k3, d1));

        int i = 0;
        for (Buchung buchung : buchungen) {
            if (buchung.getKunde().getAlter() < buchung.getMedien().getFSK()) {
                System.out.println("Der Vorgang kann für den Kunden nicht durchgeführt werden."); 
            }else{
            if (buchung.getKunde().getAusgelieheMedien().length > 5) {
                System.out.println("Der Vorgang kann nicht durchgeführt werden, da der Kunde zu viele Medien besitzt.");
            }else{
                System.out.println("Vorgang für die Ausleihe wurde durchgeführt.");
                }
            }
            i++;
        }
        //for (Buchung buchung : buchungen) {
           // if (buchung.getMedien().getDarfVerliehenWerden()==false) {
           //     System.out.println("Schallplatte kann nicht ausgeliehen werden.");
           // }else{
           //     System.out.println("Schallplatte kann ausgeliehen werden.");
           // }
        //} Ich hab hier eine Fehlermeldung welche ich nicht lösen konnte.. 
    }
    public static ArrayList<Medien> getMedia() {
        return media;
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

    public static void erstelleDemoDaten(){

        media.add(new DVD("Greybound", 18, "2:10", true, true));

        media.add(new CD("Last of Us", 16, "1:50", true, "sp"));

        media.add(new BluRay("Wednesday", 12, "2:30", true, false));

        media.add(new Schallplatte("30", 6, "1:50", true, true));

        schallplatten.add(new Schallplatte("Pipi Langstrumpf", 0, "3:04", true, true));
        schallplatten.add(new Schallplatte("Madagaskar", 0, "2:05", false, false));


    }   

    public static void ueberschreibeAusleihe(boolean Wert){
        for (Medien media : getMedia()) {
            media.setVerleih(Wert);
            if (media.getVerleih()==false) {
                System.out.println(media.getTitel()+" "+"nicht ausgeliehen.");
            }else{
                System.out.println(media.getTitel()+" "+"ausgeliehen.");
            }   
        }
    }

    public static void zeigeMedien(){
        int i = 1;
        for (Medien medien : getMedia()) {
            System.out.print(i + ".");
            medien.genaueDaten();
            i++;
        }
    }
    
    public static void aendereSchallplatten(boolean Wert){
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
