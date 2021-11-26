package Heroes;

import Tone.Human_Interface;

public class GlassMan implements Human_Interface {
    private String name;
    private boolean task;
    public GlassMan(){
        name = "Стекляшкин";
        task = true;
        connect();
    }
    private void connect(){
        System.out.println("Стекляшкин присоединяется к истории");
    }
    public String getName(){
        return name;
    }
    public void descent(){
        if (task) {
            System.out.println(getName()+" стал спускаться");
        }
        else {
            System.out.println(getName()+" на раслабоне");
        }
    }

}
