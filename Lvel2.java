import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvel2 extends World
{
    static Counter skor = new Counter("skor: ");
    static Counter hp = new Counter("hp: ");
    static GreenfootSound song = new GreenfootSound("One Piece Original Soundtrack Three Towers Movie 5 Extended HQ.mp3");
    /**
     * Constructor for objects of class Lvel2.
     * 
     */
    public Lvel2()
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
        song.setVolume(15);
        song.playLoop();}
    
    private void prepare()
    {
        Ice4 ice4 = new Ice4();
        addObject(ice4,52,478);
        Ice3 ice3 = new Ice3();
        addObject(ice3,584,246);
        Ice1 ice1 = new Ice1();
        addObject(ice1,697,244);
        Ice4 ice42 = new Ice4();
        addObject(ice42,796,475);
        Home2 home2 = new Home2();
        addObject(home2,771,406);
        Ice3 ice32 = new Ice3();
        addObject(ice32,157,427);
        Ice3 ice33 = new Ice3();
        addObject(ice33,240,351);
        Ice4 ice43 = new Ice4();
        addObject(ice43,337,342);
        ice43.setLocation(337,342);
        removeObject(ice43);

        Ice4 ice44 = new Ice4();
        addObject(ice44,348,351);
        Spike1 spike1 = new Spike1();
        addObject(spike1,281,477);
        Spike1 spike12 = new Spike1();
        addObject(spike12,458,475);
        Spike1 spike13 = new Spike1();
        addObject(spike13,642,477);
        Ice1 ice12 = new Ice1();
        addObject(ice12,825,180);
        Wizard wizard = new Wizard();
        addObject(wizard,827,96);
        Ice3 ice34 = new Ice3();
        addObject(ice34,12,176);
        Sb sb = new Sb();
        addObject(sb,37,105);
        sb.setLocation(31,106);
        Mc1 mc1 = new Mc1();
        addObject(mc1,38,388);
        Ice3 ice35 = new Ice3();
        addObject(ice35,458,301);
        //Counter counter = new ("skor:");
        addObject(skor,49,17);
        skor.setValue(0);
        //Counter counter2 = new Counter("hp:");
        addObject(hp,804,14);
        hp.setValue(5);
        //counter2.setLocation(805,12);
        //counter2.setLocation(796,15);
        Ice4 ice45 = new Ice4();
        addObject(ice45,573,368);
        ice45.setLocation(616,366);
        removeObject(ice45);
        spike13.setLocation(571,424);
        Ice3 ice36 = new Ice3();
        addObject(ice36,571,424);
        spike13.setLocation(567,415);
        removeObject(ice36);
        spike13.setLocation(639,503);
        Ice3 ice37 = new Ice3();
        addObject(ice37,549,367);
        Wizard wizard2 = new Wizard();
        addObject(wizard2,376,257);
        spike1.setLocation(226,476);
        ice32.setLocation(247,456);
        ice32.setLocation(211,455);
        removeObject(ice32);
        spike1.setLocation(219,479);
        removeObject(spike1);
        ice33.setLocation(206,354);

        addObject(spike1,276,479);
        ice33.setLocation(163,394);
        Ice3 ice38 = new Ice3();
        addObject(ice38,163,394);
        ice33.setLocation(180,375);
        ice33.setLocation(246,317);
        ice33.setLocation(249,300);
        removeObject(ice33);
        addObject(ice33,247,350);
    }

    public void stopped(){
    song.setVolume(50);
    song.pause();
    }
   public void started(){
    song.setVolume(50);
    song.pause();
    }
}
