import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End extends World

{
    GreenfootSound music = new GreenfootSound("Overwatch  Victory Animation HD.mp3");
    /**
     * Constructor for objects of class End.
     * 
     */
    public End()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(854, 480, 1); 
        prepare();
    }

    public void act(){
        music.setVolume(10);
        music.playLoop();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        st st = new st();
        addObject(st,257,403);
        st.setLocation(245,409);
        removeObject(st);
        Againt againt = new Againt();
        addObject(againt,413,352);
        showText("YOUR SCORE: "+Lvl3.skor.getValue()+" POINT's",430, 430);
    }

    public void stopped(){
    music.setVolume(50);
    music.pause();
    }
   public void started(){
    music.setVolume(50);
    music.pause();
    }
}
