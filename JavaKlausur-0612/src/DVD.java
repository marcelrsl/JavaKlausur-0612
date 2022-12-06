public class DVD extends Medien{
    Boolean FullHD;

    public DVD(String titel, int fSK, String laenge, Boolean verleih, Boolean fullHD) {
        super(titel, fSK, laenge, verleih);
        setFullHD (fullHD);
    }

    public Boolean getFullHD() {
        return FullHD;
    }

    public void setFullHD(Boolean fullHD) {
        FullHD = fullHD;
    }

    public  void genaueDaten(){
        System.out.println(getTitel()+" "+getLaenge()+" "+getFullHD());
    }
}
