import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    static Counter skor = new Counter("skor: ");
    static Counter hp = new Counter("hp: ");
    static GreenfootSound song = new GreenfootSound("Muse DashCytus IIBOFU2017 Blackest Luxury Car  Chicala Lpis  .mp3");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
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
        song.playLoop();
    }
    
    private void prepare()
    {
        Grass grass = new Grass();
        addObject(grass,83,468);
        grass.setLocation(82,470);
        Grass grass2 = new Grass();
        addObject(grass2,266,472);
        Grass grass3 = new Grass();
        addObject(grass3,457,474);
        Grass grass4 = new Grass();
        addObject(grass4,643,471);
        Grass grass5 = new Grass();
        addObject(grass5,779,474);
        Grass grass6 = new Grass();
        addObject(grass6,101,173);
        Grass grass7 = new Grass();
        addObject(grass7,357,322);
        Grass grass8 = new Grass();
        addObject(grass8,543,324);
        Grass grass9 = new Grass();
        addObject(grass9,756,242);
        Grass grass10 = new Grass();
        addObject(grass10,444,136);
        Grass grass11 = new Grass();
        addObject(grass11,757,93);
        House house = new House();
        addObject(house,794,41);
        Pm pm = new Pm();
        addObject(pm,679,54);
        Mc mc = new Mc();
        addObject(mc,56,410);
        Mu mu = new Mu();
        addObject(mu,815,180);
        Mu2 mu2 = new Mu2();
        addObject(mu2,820,424);
        //Counter counter = new Counter("skor:");
        addObject(skor,48,18);
        skor.setValue(0);
        //Counter counter2 = new Counter("hp:");
        addObject(hp,48,57);
        hp.setValue(5);
        grass7.setLocation(382,332);
        grass8.setLocation(467,346);
        removeObject(grass8);
        grass7.setLocation(371,321);
        removeObject(grass7);
        addObject(grass7,329,353);
        Grass grass12 = new Grass();
        addObject(grass12,516,355);
        Grass2 grass22 = new Grass2();
        addObject(grass22,416,291);
        Grass2 grass23 = new Grass2();
        addObject(grass23,578,247);
        removeObject(grass22);
        grass23.setLocation(565,239);
        removeObject(grass23);
        Grass2 grass24 = new Grass2();
        addObject(grass24,321,237);
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
