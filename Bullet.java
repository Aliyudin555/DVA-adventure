import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int x=6;
    public void act()
    {
        // Add your action code here.
       setLocation(getX()-x, getY());
        if(getX()<=5){
            getWorld().removeObject(this);
        }
        else if(isTouching(Mc.class)){
        MyWorld.hp.add(-1);
        Greenfoot.playSound("TF2 critical hit sound effect (128 kbps).mp3");
        if(MyWorld.hp.getValue()==0){
                Go go = new Go();
                getWorld().addObject(go,getWorld().getWidth()/2,getWorld().getHeight()/2);
                Greenfoot.playSound("Game over sound effect (128 kbps).mp3");
                Greenfoot.stop();
        }
    }
    }
}
