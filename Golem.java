import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Golem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
    
public class Golem extends Actor
{
    /**
     * Act - do whatever the Golem wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int x=2; 
    int rand=0;
    public void act()
    {
        setLocation(getX()-x, getY());
        if(isTouching(Rocket.class)){
        removeTouching(Rocket.class);
        Lvl3.skor.add(10);
        getWorld().removeObject(this);
        }
        else if(isTouching(Dor2.class)){
        removeTouching(Dor2.class);
        Lvl3.skor.add(10);
        getWorld().removeObject(this);
        }
        else if(isTouching(Mc3.class)){
        Lvl3.hp.add(-1);
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
