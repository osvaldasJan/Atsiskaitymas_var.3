import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        InternetasImpl telia1 = new InternetasImpl(InternetoPlanas.mini, 55.15,
                15.15, 9.99);
        InternetasImpl telia2 = new InternetasImpl(InternetoPlanas.mini, 6.16,
                16.16, 9.99);
        InternetasImpl telia3 = new InternetasImpl(InternetoPlanas.mini, 7.17,
                17.17, 9.99);
        InternetasImpl telia4 = new InternetasImpl(InternetoPlanas.midi, 10.10,
                20.20, 9.99);
        InternetasImpl telia5 = new InternetasImpl(InternetoPlanas.midi, 9.10,
                21.20, 9.99);
        InternetasImpl telia6 = new InternetasImpl(InternetoPlanas.midi, 12.10,
                22.20, 9.99);
        InternetasImpl telia7 = new InternetasImpl(InternetoPlanas.maxi, 17.15,
                21.20, 9.99);
        InternetasImpl telia8 = new InternetasImpl(InternetoPlanas.maxi, 16.15,
                22.20, 9.99);
        InternetasImpl telia9 = new InternetasImpl(InternetoPlanas.supermaxi, 19.15,
                29.20, 19.99);
        InternetasImpl telia10 = new InternetasImpl(InternetoPlanas.supermaxi, 18.15,
                29.20, 19.99);

        ArrayList<InternetasImpl> planai = pridetiSaskaitaYSarasa(telia1, telia2, telia3, telia4, telia5, telia6, telia7, telia8, telia9, telia10);

        System.out.println("sarasas atspausdintas naudojant enhanced for");
        //enhanced for
        atspausdintiSarasoAntraste();
        atspausdintiSarasa(planai);
        atspausdintiSarasoPoraste();


        //pasalinti objektus, kuriu interneto planas yra maxi arba supermaxi ir atspausdinti
        System.out.println("Is saraso pasalintos saskaitos, kuriu interneto planai yra maxi arba supermaxi");
        ArrayList<InternetasImpl> planai1 = planai;
        Iterator<InternetasImpl> iterator1 = planai1.iterator();
        while (iterator1.hasNext()){
            InternetasImpl planas = iterator1.next();
            if(planas.getInternetoPlanas()==InternetoPlanas.maxi||planas.getInternetoPlanas()==InternetoPlanas.supermaxi){
                iterator1.remove();
            }
        }
        atspausdintiSarasoAntraste();
        atspausdintiSarasa(planai1);
        atspausdintiSarasoPoraste();

        System.out.println("sarasas atspausdintas naudojant enhanced for");
        //enhanced for
        atspausdintiSarasoAntraste();
        atspausdintiSarasa(planai1);
        atspausdintiSarasoPoraste();

        //surusiuoti objektus pagal mokesti uz tvprogramu paketa

        System.out.println("surusiuoti objektus pagal mokesti uz tvprogramu paketa");

        Collections.sort(planai, InternetasImpl.TVComparator);

        for(InternetasImpl planas:planai){
            System.out.println(planas);
        }

        //objektas, kurio mokestis uz mobilu interneta yra didziausias ir atspausdinti


        System.out.println("objektas, kurio mokestis uz mobilu interneta yra didziausias");

    }

    public static ArrayList<InternetasImpl> pridetiSaskaitaYSarasa(InternetasImpl... saskaita) {
        ArrayList<InternetasImpl> saskaitos = new ArrayList<InternetasImpl>();
        for (int i = 0; i < saskaita.length; i++) {
            saskaitos.add(saskaita[i]);
        }
        return saskaitos;
    }

    public static double mokesciuSuma(InternetasImpl saskaita) {
        double suma = saskaita.getMokestisUzMobiluInterneta()
                 + saskaita.getMokestisUzNamuInternetas();
        return suma;
    }

    public static void atspausdintiSarasoAntraste() {
        System.out.printf("%-4s%-20s%-20s%-20s%-20s\n",
                "Nr.",
                "Interneto Planas ",
                "Mokestis uz TV ",
                "Mokestis uz LAN",
                "Mokestis uz Phone "
        );
        for (int i = 0; i < 110; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void atspausdintiSarasoPoraste() {
        for (int i = 0; i < 110; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void atspausdintiSarasa(ArrayList<InternetasImpl> planai) {
        for (int i = 0; i < planai.size(); i++) {
            System.out.printf("%-4s%-20s%-20s%-20s%-20s\n",
                    i + 1,
                    planai.get(i).getInternetoPlanas(),
                    planai.get(i).getMokestisUzTVProgramuPaketa(),
                    planai.get(i).getMokestisUzNamuInternetas(),
                    planai.get(i).getMokestisUzMobiluInterneta()
            );
        }
    }
}
