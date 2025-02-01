import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl3 extends World
{
    static Counter skor = new Counter("skor: ");
    static Counter hp = new Counter("hp: ");
    private SimpleTimer timer = new SimpleTimer();
    static Counter waktu = new Counter("waktu: ");
    static GreenfootSound sg = new GreenfootSound("One Piece Soundtrack  I Will Beat You.mp3");
    /**
     * Constructor for objects of class Lvl3.
     * 
     */
    int rand=0;
    public Lvl3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(854, 480, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Vl vl = new Vl();
        addObject(vl,70,413);
        vl.setLocation(55,441);
        vl.setLocation(65,419);
        vl.setLocation(65,418);
        Mc3 mc3 = new Mc3();
        addObject(mc3,136,449);
        mc3.setLocation(455,453);
        Grass2 grass2 = new Grass2();
        addObject(grass2,353,291);
        Grass2 grass22 = new Grass2();
        addObject(grass22,253,227);
        Grass2 grass23 = new Grass2();
        addObject(grass23,573,184);
        Grass2 grass24 = new Grass2();
        addObject(grass24,83,228);
        Grass2 grass25 = new Grass2();
        addObject(grass25,725,349);
        vl.setLocation(95,463);
        Grass grass = new Grass();
        addObject(grass,95,463);
        vl.setLocation(320,342);
        vl.setLocation(79,150);
        Grass grass3 = new Grass();
        addObject(grass3,294,464);
        Grass grass4 = new Grass();
        addObject(grass4,755,453);
        Grass grass5 = new Grass();
        addObject(grass5,547,467);
        grass4.setLocation(724,463);
        grass4.setLocation(812,456);
        grass5.setLocation(609,485);
        grass5.setLocation(594,460);
        grass5.setLocation(598,459);
        grass5.setLocation(598,459);
        grass4.setLocation(745,480);
        grass4.setLocation(745,464);
        grass4.setLocation(851,483);
        grass5.setLocation(598,485);
        grass3.setLocation(210,472);
        grass5.setLocation(459,468);
        grass5.setLocation(478,475);
        mc3.setLocation(430,464);
        mc3.setLocation(416,469);
        grass5.setLocation(341,473);
        mc3.setLocation(438,457);
        grass4.setLocation(614,473);
        grass4.setLocation(460,465);
        grass4.setLocation(547,477);
        grass4.setLocation(572,472);
        grass4.setLocation(518,457);
        grass4.setLocation(506,461);
        grass4.setLocation(543,472);
        grass4.setLocation(554,473);
        Grass grass6 = new Grass();
        addObject(grass6,698,476);
        grass6.setLocation(778,479);
        Grass grass7 = new Grass();
        addObject(grass7,778,479);
        grass4.setLocation(549,476);
        grass6.setLocation(678,474);
        grass5.setLocation(427,468);
        mc3.setLocation(345,473);
        grass5.setLocation(312,473);
        mc3.setLocation(410,465);
        grass5.setLocation(406,465);
        grass5.setLocation(402,456);
        mc3.setLocation(79,391);
        grass5.setLocation(359,476);
        mc3.setLocation(77,439);
        mc3.setLocation(96,401);
        Alien alien = new Alien();
        addObject(alien,321,19);
        Alien alien2 = new Alien();
        addObject(alien2,384,77);
        Alien alien3 = new Alien();
        addObject(alien3,487,40);
        Alien alien4 = new Alien();
        addObject(alien4,611,34);
        Golem golem = new Golem();
        addObject(golem,432,409);
        Monster monster = new Monster();
        addObject(monster,34,407);
        grass25.setLocation(764,343);
        Bos bos = new Bos();
        addObject(bos,764,343);
        //Counter counter = new Counter("skor:");
        addObject(skor,51,17);
        skor.setValue(0);
        //Counter counter2 = new Counter("hp:");
        addObject(hp,801,19);
        hp.setValue(10);
        golem.setLocation(434,414);
        removeObject(golem);
        bos.setLocation(755,396);
        //Golem golem = new Golem();
        addObject(golem,755,396);
        Counter counter3 = new Counter("waktu:");
        addObject(counter3,172,18);
        removeObject(mc3);
        addObject(mc3,374,431);
        Pm pm = new Pm();
        addObject(pm,254,169);
        Pm pm2 = new Pm();
        addObject(pm2,576,128);
        Vl vl2 = new Vl();
        addObject(vl2,363,198);
        counter3.setLocation(191,16);
        removeObject(counter3);
    }

    public void act()
    {
        Golem Golem = new Golem();
        rand = Greenfoot.getRandomNumber(100);
        sg.setVolume(75);
        sg.playLoop();
        if (rand == 0)
        {
            addObject(Golem, 840,414);
        }
        else if(Lvl3.skor.getValue()>=100){
            Greenfoot.delay(40);
            Greenfoot.setWorld(new End());
            stopped();
        }
    }
    public void stopped(){
    sg.setVolume(50);
    sg.pause();
    }
   public void started(){
    sg.setVolume(50);
    sg.pause();
    }
}