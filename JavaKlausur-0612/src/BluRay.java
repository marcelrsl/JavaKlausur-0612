public class BluRay extends Medien{
    Boolean Film3D;

    public BluRay(String titel, int fSK, String laenge, Boolean verleih, Boolean film3d) {
        super(titel, fSK, laenge, verleih);
        setFilm3D (film3d);
    }

    public Boolean getFilm3D() {
        return Film3D;
    }

    public void setFilm3D(Boolean film3d) {
        Film3D = film3d;
    }
    public  void genaueDaten(){
        System.out.println(getTitel()+" "+getLaenge()+" "+getFilm3D());
    }
}
