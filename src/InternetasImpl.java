import java.util.Comparator;

public class InternetasImpl implements Internetas {

    private InternetoPlanas internetoPlanas;
    private double mokestisUzTVProgramuPaketa;
    private double mokestisUzNamuInternetas;
    private double mokestisUzMobiluInterneta;

    public InternetasImpl(InternetoPlanas internetoPlanas, double mokestisUzTVProgramuPaketa, double mokestisUzNamuInternetas, double mokestisUzMobiluInterneta) {
        this.internetoPlanas = internetoPlanas;
        this.mokestisUzTVProgramuPaketa = mokestisUzTVProgramuPaketa;
        this.mokestisUzNamuInternetas = mokestisUzNamuInternetas;
        this.mokestisUzMobiluInterneta = mokestisUzMobiluInterneta;
    }


    public String toString() {
        return "InternetasImpl{" +
                "internetoPlanas= " + getInternetoPlanas() +
                ", mokestisUzTVProgramuPaketa= " + getMokestisUzTVProgramuPaketa() +
                ", mokestisUzNamuInternetas= '" + getMokestisUzNamuInternetas() + '\'' +
                ", mokestisUzMobiluInterneta= '" + getMokestisUzMobiluInterneta() + '\'' +
                '}';
    }

    public static Comparator<InternetasImpl> internetasComparator = new Comparator<InternetasImpl>() {
        @Override
        public int compare(InternetasImpl o1, InternetasImpl o2) {
            double InternetasImpl1 = o1.getMokestisUzMobiluInterneta();
            double InternetasImpl2 = o2.getMokestisUzMobiluInterneta();
            return Double.compare(InternetasImpl1,InternetasImpl2);
        }
    };

    public static Comparator<InternetasImpl> TVComparator = new Comparator<InternetasImpl>() {
        @Override
        public int compare(InternetasImpl o1, InternetasImpl o2) {
            double InternetasImpl1 = o1.getMokestisUzTVProgramuPaketa();
            double InternetasImpl2 = o2.getMokestisUzTVProgramuPaketa();
            return Double.compare(InternetasImpl2,InternetasImpl1);
        }
    };

    public InternetoPlanas getInternetoPlanas() {
        return internetoPlanas;
    }

    public void setInternetoPlanas(InternetoPlanas internetoPlanas) {
        this.internetoPlanas = internetoPlanas;
    }

    public double getMokestisUzTVProgramuPaketa() {
        return mokestisUzTVProgramuPaketa;
    }

    public void setMokestisUzTVProgramuPaketa(double mokestisUzTVProgramuPaketa) {
        this.mokestisUzTVProgramuPaketa = mokestisUzTVProgramuPaketa;
    }

    public double getMokestisUzNamuInternetas() {
        return mokestisUzNamuInternetas;
    }

    public void setMokestisUzNamuInternetas(double mokestisUzNamuInternetas) {
        this.mokestisUzNamuInternetas = mokestisUzNamuInternetas;
    }

    public double getMokestisUzMobiluInterneta() {
        return mokestisUzMobiluInterneta;
    }

    public void setMokestisUzMobiluInterneta(double mokestisUzMobiluInterneta) {
        this.mokestisUzMobiluInterneta = mokestisUzMobiluInterneta;
    }
}


