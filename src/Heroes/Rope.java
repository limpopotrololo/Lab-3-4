package Heroes;

import Tone.AbstractThings;
import Tone.ThingInterface;

public class Rope extends AbstractThings implements ThingInterface {
    private String name;
    private double parametr;
    public double k;
    static boolean flag = false;

    public Rope() {
        name = "Веревка";
        parametr = 230.0;
        k = (parametr * Math.random());
        connect(parametr);
    }

    private class cotton {
        private String condition = "отличное";

        public void cdt() {
            System.out.println("Качество веревки - " + condition);
        }

    }

    public void qlty() {
        cotton line = new cotton();
        line.cdt();
    }

    @Override
    public double getParametr() {
        return parametr;
    }

    public String toString() {
        return name;
    }

    public void connect(double len) {
        System.out.println(toString() + " появилась в истории");
        if (parametr > 15.0) {
            System.out.println("Получилась длинная веревка");
            flag = true;
        } else {
            System.out.println("Веревка слишком коротка для использования!");
        }
    }

    public void tension() {
        System.out.println("Веревка натянулась");
    }

    public int hashCode() {
        return (int) (31 * k);
    }


    public boolean equals(Tonel k) {
        return this.k == Tonel.k;
    }

}
