package Heroes;

import Tone.HumanInterface;

public class Ponchik implements HumanInterface {
    private String name;

    public Ponchik() {
        name = "Пончик";
        connect();
    }

    public String getName() {
        return name;
    }

    private void connect() {
        System.out.println("Пончик на месте");
    }

    public void takesmth(Boolean mark) {
        if (mark) {
            System.out.println("Пончику нашли ботики");
        } else {
            System.out.println("Пончик умер от расгермитизации костюма");
        }
    }
}
