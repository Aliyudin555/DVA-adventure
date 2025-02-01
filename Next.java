import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Next here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Next extends World
{

    /**
     * Constructor for objects of class Next.
     * 
     */
    public Next()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(854,480, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        clear clear = new clear();
        addObject(clear,409,198);
        NEXTROUND nEXTROUND = new NEXTROUND();
        addObject(nEXTROUND,401,406);
    }
}
