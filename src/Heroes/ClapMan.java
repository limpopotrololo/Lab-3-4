package Heroes;

import Tone.HumanInterface;

public class ClapMan implements HumanInterface {
    private String name;

    public ClapMan() {
        name = "Клепа";
        connect();
    }

    @Override
    public String getName() {
        return name;
    }

    private void connect() {
        System.out.println(getName() + " в здании");
    }

    public void SlipComment() {
            System.out.println("Клепа поскользнулся, по жесткому...");
    }

}
