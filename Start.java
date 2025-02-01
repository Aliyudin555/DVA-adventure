import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{
    GreenfootSound music = new GreenfootSound("ahisa  Dysthymia.mp3");
    /**
     * Constructor for objects of class Start.
     * 
     */
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(854, 480, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void act(){
        music.setVolume(10);
        music.playLoop();
    }
    
    private void prepare()
    {
        mv mv = new mv();
        addObject(mv,758,335);
        Mc mc = new Mc();
        addObject(mc,142,334);
        Mu mu = new Mu();
        addObject(mu,751,261);
        st st = new st();
        addObject(st,320,384);
        Pm pm = new Pm();
        addObject(pm,142,277);
        Mu2 mu2 = new Mu2();
        addObject(mu2,756,387);
        mu.setLocation(746,261);
        Grass grass = new Grass();
        addObject(grass,98,466);
        Grass grass2 = new Grass();
        addObject(grass2,757,462);
        Grass grass3 = new Grass();
        addObject(grass3,555,459);
        grass3.setLocation(607,465);
        grass3.setLocation(600,465);
        grass3.setLocation(597,465);
        grass3.setLocation(596,465);
        Grass grass4 = new Grass();
        addObject(grass4,288,468);
        Grass grass5 = new Grass();
        addObject(grass5,438,466);
        removeObject(mu);
        mc.setLocation(141,407);
        pm.setLocation(137,351);
        mu2.setLocation(752,419);
        mv.setLocation(751,359);
        mv.setLocation(757,364);
        removeObject(mv);
        Vl vl = new Vl();
        addObject(vl,63,383);
        mv mv2 = new mv();
        addObject(mv2,747,324);
        judul judul = new judul();
        addObject(judul,410,123);
        st.setLocation(424,370);
        mc.setLocation(303,408);
        pm.setLocation(284,323);
        vl.setLocation(172,376);
        mv2.setLocation(667,303);
        mu2.setLocation(721,420);
        mv2.setLocation(740,296);
        mu2.setLocation(754,424);
        mv2.setLocation(717,342);
        mv2.setLocation(728,343);
        judul.setLocation(459,133);
        judul.setLocation(435,191);
        judul.setLocation(448,194);
        judul.setLocation(464,208);
        judul.setLocation(477,191);
        mc.setLocation(261,407);
        vl.setLocation(109,373);
        pm.setLocation(222,324);
        st.setLocation(462,318);
        mv2.setLocation(699,334);
        mu2.setLocation(799,407);
        st.setLocation(413,338);
        judul.setLocation(399,147);
        judul.setLocation(412,144);
        removeObject(mv2);
        mu2.setLocation(805,411);
        removeObject(mu2);
        grass2.setLocation(756,457);
        removeObject(grass2);
        grass3.setLocation(600,459);
        removeObject(grass3);
        grass5.setLocation(446,449);
        removeObject(grass5);
        grass4.setLocation(316,460);
        removeObject(grass4);
        mc.setLocation(267,394);
        removeObject(mc);
        pm.setLocation(225,328);
        removeObject(pm);
        vl.setLocation(87,375);
        removeObject(vl);
        grass.setLocation(105,465);
        removeObject(grass);
        Hd_Mc hd_Mc = new Hd_Mc();
        addObject(hd_Mc,735,324);
        hd_Mc.setLocation(708,268);
        hd_Mc.setLocation(789,259);
        mc_hd2 mc_hd2 = new mc_hd2();
        addObject(mc_hd2,178,290);
        mc_hd2.setLocation(231,315);
        judul.setLocation(428,130);
        removeObject(judul);
        //judul judul = new judul();
        addObject(judul,419,125);
        hd_Mc.setLocation(650,333);
        hd_Mc.setLocation(650,294);
        mc_hd2.setLocation(101,303);
        hd_Mc.setLocation(784,289);
        judul.setLocation(384,166);
        removeObject(judul);
        mc_hd2.setLocation(192,293);
        removeObject(mc_hd2);
        st.setLocation(437,330);
        removeObject(st);
        mv mv3 = new mv();
        addObject(mv3,295,301);
        mv3.setLocation(236,300);
        mv3.setLocation(402,306);
        addObject(mc_hd2,402,306);
        addObject(judul,405,112);
        mv3.setLocation(414,352);
        addObject(st,414,352);
        mv3.setLocation(223,363);
        mv3.setLocation(-12,325);
        mv3.setLocation(279,252);
        mv3.setLocation(90,418);
        mv3.setLocation(242,327);
        mv3.setLocation(145,202);
        mv3.setLocation(221,346);
        mv3.setLocation(284,358);
        Guid guid = new Guid();
        addObject(guid,284,358);
        mv3.setLocation(283,369);
        removeObject(guid);
        mv3.setLocation(548,350);
        addObject(guid,548,350);
        mv3.setLocation(289,350);
        Guid guid2 = new Guid();
        addObject(guid2,289,350);
    }
    //music dan sound
    public void stopped(){
        music.setVolume(55);
        music.pause();
    }
    public void started(){
       music.setVolume(55);
       music.playLoop();
    }
}