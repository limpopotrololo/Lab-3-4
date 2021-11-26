package Heroes;

import Tone.Human_Interface;

public class Genius implements Human_Interface {
    private String name;

    public Genius(){
        name = "Знайка";
        connect();
    }
    public String getName(){
        return name;
    }
    private void connect(){
        System.out.println("Знайка вошел в чат");
    }
    public void tie(){
        System.out.println(getName() +" связал шнурки в веревку");
    }
}
