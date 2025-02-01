import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dor3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dor3 extends Actor
{
    /**
     * Act - do whatever the Dor3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY()-4);
        //jika nyangkut, maka peluru harus hilang
        //jika Y mendekati 0,maka peluru hilang
        if(getY()<=5){
            getWorld().removeObject(this); //bunuh diri
        }
    }
}   
