import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Actor
{
    /**
     * Act - do whatever the Alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY()+1);
        if(isAtEdge())
        setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),0);
        //jika y lebih dari tingi layar,lokasi kembalikan ke atas
        if(getY()>=495){
            setLocation(getX(),0);
        }
        //if (getX()>260){
          //  setLocation(50,getY()+1);
       // }
        if(isTouching(Dor3.class)){
        removeTouching(Dor3.class);
        Alien c = new Alien();
        Greenfoot.playSound("1stKill.mp3");
        getWorld().addObject(c, Greenfoot.getRandomNumber(380), 0);
        getWorld().removeObject(this);
        Counter skor = new Counter();
        Lvl3.skor.add(5);
        }
        else if(isTouching(Dor2.class)){
        removeTouching(Dor2.class);
        Alien c = new Alien();
        getWorld().addObject(c, Greenfoot.getRandomNumber(380), 0);
        getWorld().removeObject(this);
        Counter skor = new Counter();
        Lvl3.skor.add(5);
        }
        else if(isTouching(Rocket.class)){
        removeTouching(Rocket.class);
        Alien c = new Alien();
        getWorld().addObject(c, Greenfoot.getRandomNumber(380), 0);
        getWorld().removeObject(this);
        Counter skor = new Counter();
        Lvl3.skor.add(5);
        }
        else if(isTouching(Mc3.class)){
        Lvl3.hp.add(-1);
        if(Lvl3.hp.getValue()==0){
                Go go = new Go();
                getWorld().addObject(go,getWorld().getWidth()/2,getWorld().getHeight()/2);
                Greenfoot.stop();
        }
        getWorld().addObject(new Alien(), Greenfoot.getRandomNumber(300), 0);
        getWorld().removeObject(this);
        }
    }
}
