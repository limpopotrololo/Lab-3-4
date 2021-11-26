package Heroes;
import java.lang.*;
import Tone.Abstract_Things;
import Tone.Thing_Interface;

public class Tonel extends Abstract_Things implements Thing_Interface {

    private String name;
    private double parametr;
    public static double k;

    public Tonel(){
        name = "Тонель";
        parametr  = (Math.random()*45)+45;
        k = parametr * Math.random();
        connect(parametr);
    }
    public double getParametr(){
        return parametr;
    }
    public double getK(){
        return k;
    }
    private void connect(double parametr){
        System.out.println("Тонель ворвался в историю");
        if (parametr > 45 && parametr < 90){
            System.out.println("Наклон тонеля слишком наклонист: "+ getParametr()+" градусов");
        }
        else {
            System.out.println("По тонелю можно спускаться, но наклон все еще "+ getParametr() + " градусов");
        }

    }
    public void get_steps(){
        System.out.println("Ступеньки для спуска сделаны");
    }



}