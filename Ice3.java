import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ice3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ice3 extends Actor
{
    /**
     * Act - do whatever the Ice3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count = 0;
    public void act()
    {
        // Add your action code here.
        if(isTouching(Mc1.class)){
        count++;
        //setelah 1 detik. blast hilang
        if(count>=120){
        getWorld().removeObject(this); //bunuh diri
    }
    }
    }
}