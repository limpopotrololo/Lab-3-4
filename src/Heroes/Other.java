package Heroes;

import Tone.Human_Interface;
import Tone.StepsType;

public class Other  {

    private String name;
    private boolean flag;
    private StepsType type = StepsType.ICY;
    public Other(){
        name = "Другие";
        flag = true;
        connect();
    }
    private void connect(){
        System.out.println("Другие появляются");
    }

    public StepsType getType(){
        return type;
    }
    public void let(){
        if (flag){
            System.out.println("Остальные начинают опускать веревку и начинают вырубать ступеньки 'типа' " + getType());
        }
        else {
            System.out.println("Все остальные стояит и ничего не делают");
        }
    }
}
