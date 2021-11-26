package Heroes;

import Tone.HumanInterface;

public class TubeMan implements HumanInterface {
    private String name;

    public TubeMan(){
        name = "Тюбик";
        connect();
    }
    private void connect(){
        System.out.println(getName()+ " появляется в истории");
    }
    public boolean findsmth(){
        return true;
    }

    @Override
    public String getName() {
        return name;
    }
}
