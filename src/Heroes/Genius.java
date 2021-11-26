package Heroes;

import Tone.HumanInterface;

public class Genius implements HumanInterface {
    private String name;

    public Genius() {
        name = "Знайка";
        connect();
    }

    public String getName() {
        return name;
    }

    private void connect() {
        System.out.println("Знайка вошел в чат");
    }

    public void tie() {
        System.out.println(getName() + " связал шнурки в веревку");
    }

    public void advice() {
        System.out.println("Знайка велел остальным связаться веревками aka альпинисты");
    }
}
