import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet2 extends Actor
{
    /**
     * Act - do whatever the Bullet2 wants to do. This method is called whenever
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
        else if(isTouching(Dor2.class)){
        removeTouching(Dor2.class);
        getWorld().removeObject(this);
        }
        else if(isTouching(Mc3.class)){
        Lvl3.hp.add(-1);
        Greenfoot.playSound("TF2 critical hit sound effect (128 kbps).mp3");
        if(Lvl3.hp.getValue()==0){
                Go go = new Go();
                getWorld().addObject(go,getWorld().getWidth()/2,getWorld().getHeight()/2);
                Greenfoot.playSound("Game over sound effect (128 kbps).mp3");
                Greenfoot.stop();
        }
        getWorld().addObject(new Alien(), Greenfoot.getRandomNumber(300), 0);
        getWorld().removeObject(this);
        }
        }
}