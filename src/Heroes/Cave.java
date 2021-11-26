package Heroes;

import Tone.ThingInterface;

public class Cave implements ThingInterface {
    private String name;
    private double parametr;

    public Cave() {
        name = "Пещера";
        parametr = 100.0;

    }

    @Override
    public double getParametr() {
        return parametr;
    }
    public String getName(){
        return name;
    }


    public void connectCave() {
        System.out.println("Локация 'пещера' открыта");
    }
    public void transformation() {
        System.out.println("Пещера перешла в грот");
    }

}
