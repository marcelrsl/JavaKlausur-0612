public class Schallplatte extends Medien{
    Boolean DarfVerliehenWerden;

    public Schallplatte(String titel, int fSK, String laenge, Boolean verleih, Boolean darfVerliehenWerden) {
        super(titel, fSK, laenge, verleih);
        setDarfVerliehenWerden (darfVerliehenWerden);
    }

    public Boolean getDarfVerliehenWerden() {
        return DarfVerliehenWerden;
    }

    public void setDarfVerliehenWerden(Boolean darfVerliehenWerden) {
        DarfVerliehenWerden = darfVerliehenWerden;
    }
    
    public  void genaueDaten(){
        System.out.println(getTitel()+" "+getLaenge()+" "+getVerleih());
    }}
