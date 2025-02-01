import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dor2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dor2 extends Actor
{
    /**
     * Act - do whatever the Dor2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int x = 6;
    public void act()
    {
        // Add your action code here.
        setLocation(getX()-x, getY());
        if(getX()<=5){
            getWorld().removeObject(this);
    }
    else if(isTouching(Bullet2.class)){
        removeTouching(Bullet2.class);
        removeTouching(Dor2.class);
        getWorld().removeObject(this);
        }
    }
}