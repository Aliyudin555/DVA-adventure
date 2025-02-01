import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int x=-6;
    public void act()
    {
        // Add your action code here.
        setLocation(getX()-x, getY());
        if(getX()>=getWorld().getWidth()-6){
            getWorld().removeObject(this);
        }
    }
}
