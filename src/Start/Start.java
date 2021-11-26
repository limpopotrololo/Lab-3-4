package Start;
import Heroes.*;


public class Start {

    public static void main(String[] args) {
        Tonel r_tonel = new Tonel();

        Genius r_genius = new Genius();
        Other r_astronauts = new Other();

        r_genius.tie();
        Rope r_rope = new Rope();
        if (r_rope.equals(r_tonel.getK())) {
            System.out.println("Качество снаряжения однородно");
        }
        else{
            System.out.println("Качество снаряжения неоднородно");
        }
        r_astronauts.let();
        r_tonel.get_steps();
        GlassMan r_glassman = new GlassMan();
        r_glassman.descent();





    }


}
