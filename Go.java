import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Go here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Go extends Actor
{
    /**
     * Act - do whatever the Go wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // untuk merestart geme
        Greenfoot.playSound("Game over sound effect (128 kbps).mp3");
        if(Greenfoot.mousePressed(this)){
        getImage().scale((int)Math.round(getImage().getWidth()*0.9),
        (int)Math.round(getImage().getHeight()*0.9));
        }
        if(Greenfoot.mousePressed(this)){
            Greenfoot.delay(5);
            Greenfoot.setWorld(new MyWorld());
        }
        
    }
}
