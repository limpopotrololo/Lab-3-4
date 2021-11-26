package Heroes;

import Tone.Abstract_Things;
import Tone.Thing_Interface;

public class Rope extends Abstract_Things implements Thing_Interface {
    private String name;
    private double parametr;
    public double k;
    static boolean flag = false;

    public Rope(){
        name = "Веревка";
        parametr = 230.0;
        k = (parametr * Math.random());
        connect(parametr);
    }

    @Override
    public double getParametr() {
        return parametr;
    }
    public String toString(){
        return name;
    }

    public void connect(double len){
        System.out.println( toString() + " появилась в истории");
        if (parametr > 15.0){
            System.out.println("Получилась длинная веревка");
            flag = true;
        }
        else{
            System.out.println("Веревка слишком коротка для использования!");
        }
    }

    public boolean equals(Tonel k){
            return this.k == Tonel.k;


        }
}
