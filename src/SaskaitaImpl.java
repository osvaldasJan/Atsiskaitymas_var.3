public class SaskaitaImpl implements Saskaita{

    private String saskaitosNumeris;
    private String laikotarpis;
    private String tiekejas;
    private double suma;

    public String getSaskaitosNumeris() {
        return saskaitosNumeris;
    }

    public void setSaskaitosNumeris(String saskaitosNumeris) {
        this.saskaitosNumeris = saskaitosNumeris;
    }

    public String getLaikotarpis() {
        return laikotarpis;
    }

    public void setLaikotarpis(String laikotarpis) {
        this.laikotarpis = laikotarpis;
    }

    public String getTiekejas() {
        return tiekejas;
    }

    public void setTiekejas(String tiekejas) {
        this.tiekejas = tiekejas;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }
}
