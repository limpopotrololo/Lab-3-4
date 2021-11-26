package Heroes;

import Tone.HumanInterface;

public class GlassMan implements HumanInterface {
    private String name;
    private boolean task;

    public GlassMan() {
        name = "Стекляшкин";
        task = true;
        connect();
    }

    private void connect() {
        System.out.println("Стекляшкин присоединяется к истории");
    }

    public String getName() {
        return name;
    }

    public void descent() {
        if (task) {
            System.out.println(getName() + " стал спускаться");
        } else {
            System.out.println(getName() + " на раслабоне");
        }
    }
    public void feel(){
        System.out.println("Стекляшкин нервничает и ведет себя как пупс");
    }
}
