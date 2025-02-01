import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pm extends Actor
{
    /**
     * Act - do whatever the Pm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count = 0;
    public void act()
    {
        // jika si rocket terkena pm maka akan hilang/mati
        if(isTouching(Rocket.class)){
        removeTouching(Rocket.class);
        MyWorld.skor.add(10);
        getWorld().removeObject(this);
    }
    count++;
        if(count>=60){
            //menembak
            shoot();
            count=0;
            Greenfoot.playSound("ammo.wav");
        }
    }
    public void shoot(){
    //absyraction method shoot() untuk Hero menembakkan peluru
    //keluar peluru
    Bullet Bullet = new Bullet();
    getWorld().addObject(Bullet, getX()-5, getY()-10);//memposisikan ammo

    }
}
