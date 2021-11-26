package Heroes;

import Tone.StepsType;

public class Other {
    private String name;
    private boolean flag;
    private StepsType type = StepsType.ICY;

    public Other(String local) {
        name = "Другие";
        flag = true;
        connect(local);
    }

    private void connect(String local) {
        System.out.println("Другие появляются в локации - " + local);
    }

    public StepsType getType() {
        return type;
    }

    public void let() {
        if (flag) {
            System.out.println("Остальные начинают опускать веревку и начинают вырубать ступеньки 'типа' " + getType());
        } else {
            System.out.println("Все остальные стоят и ничего не делают");
        }
    }
}
