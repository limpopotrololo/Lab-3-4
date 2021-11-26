package Start;

import Heroes.*;


public class Start {

    public static void main(String[] args) {
        Cave rCave = new Cave();
        rCave.connectCave();
        Other rAstronauts = new Other(rCave.getName());
        rCave.transformation();
        Cave r1Cave = new Cave() {
            public void transformation() {
                System.out.println("Вся пещера осасулена");
            }
        };

        r1Cave.transformation();
        //place for sosulka and another type of classes
        TubeMan rTubeMan = new TubeMan();
        Ponchik rPonchik = new Ponchik();
        rPonchik.takesmth(rTubeMan.findsmth());
        Tonel rTonel = new Tonel();
        rTonel.icing(rTubeMan.findsmth());
        Genius rGenius = new Genius();
        rGenius.advice();
        ClapMan rClapMan = new ClapMan();
        rClapMan.SlipComment();
        Rope rRope = new Rope();
        rRope.qlty();
        rRope.tension();
        Tonel.Koef prm = new Tonel.Koef() ;
        prm.PrKof();
        rGenius.tie();
        if (rRope.equals(rTonel.getK())) {
            System.out.println("Качество снаряжения однородно");
        } else {
            System.out.println("Качество снаряжения неоднородно");
        }
        rAstronauts.let();
        rTonel.get_steps();
        GlassMan rGlassman = new GlassMan();
        rGlassman.descent();
        rGlassman.feel();


    }


}
