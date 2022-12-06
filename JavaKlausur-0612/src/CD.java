public class CD extends Medien{
    String SpLp;

    public CD(String titel, int fSK, String laenge, Boolean verleih, String spLp) {
        super(titel, fSK, laenge, verleih);
        setSpLp (spLp);
    }

    public String getSpLp() {
        return SpLp;
    }

    public void setSpLp(String spLp) {
        SpLp = spLp;
    }
    public  void genaueDaten(){
        System.out.println(getTitel()+" "+getLaenge()+" "+getSpLp());
    }
}
