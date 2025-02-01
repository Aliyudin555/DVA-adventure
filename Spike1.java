import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spike1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spike1 extends Actor
{
    /**
     * Act - do whatever the Spike1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(isTouching(Mc1.class)){
        removeTouching(Mc1.class);
        Go go = new Go();
                getWorld().addObject(go,getWorld().getWidth()/2,getWorld().getHeight()/2);
        getWorld().removeObject(this);
        Greenfoot.playSound("Game over sound effect (128 kbps).mp3");
        Greenfoot.stop();
        }
    }
}