import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Next2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Next2 extends World
{

    /**
     * Constructor for objects of class Next2.
     * 
     */
    public Next2()
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
        clear clear = new clear();
        addObject(clear,426,220);
        NEXTROUND nEXTROUND = new NEXTROUND();
        addObject(nEXTROUND,417,421);
        nEXTROUND.setLocation(422,417);
        removeObject(nEXTROUND);
        Round3 round3 = new Round3();
        addObject(round3,418,428);
    }
}
