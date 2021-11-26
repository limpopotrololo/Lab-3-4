package Heroes;

import java.lang.*;

import Tone.AbstractThings;
import Tone.ThingInterface;

public class Tonel extends AbstractThings implements ThingInterface {

    private String name;
    private double parametr;
    public static double k;

    public Tonel() {
        name = "Тонель";
        parametr = (Math.random() * 45) + 45;
        k = parametr * Math.random();
        connect(parametr);
    }

    public double getParametr() {
        return parametr;
    }

    public double getK() {
        return k;
    }

    private void connect(double parametr) {
        System.out.println("Тонель ворвался в историю");
    }

    public static class Koef {


    public void PrKof() {
        if ( (Math.random() * 45) + 45 > 45 && (Math.random() * 45) + 45 < 90) {
            System.out.println("Наклон тонеля слишком наклонист: " + (Math.random() * 45) + 45 + " градусов");
        } else {
            System.out.println("По тонелю можно спускаться, но наклон все еще " +(Math.random() * 45) + 45 + " градусов");
        }

    }

}
    public void get_steps() {
        System.out.println("Ступеньки для спуска сделаны");
    }

    public void icing(boolean mark) {
        if (mark) {
            System.out.println("Спуск обледенел");
        } else {
            System.out.println("Характеристики спуска неизвестны");
        }
    }


}