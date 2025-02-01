import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wizard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wizard extends Actor
{
    /**
     * Act - do whatever the Wizard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count = 0;
    public void act()
    {
        // jika si rocket terkena mu2 maka akan hilang/mati
        if(isTouching(Rocket.class)){
        removeTouching(Rocket.class);
        Mu2 c = new Mu2();
        Lvel2.skor.add(10);
        getWorld().removeObject(this);
    }
    
    count++;
        if(count>=100){
            //menembak
            shoot();
            count=0;
            Greenfoot.playSound("Ice Break Sound Effect (128 kbps).mp3");
        }
    }
    public void shoot(){
    //absyraction method shoot() untuk Hero menembakkan peluru
    //keluar peluru
    Freez2 Freez2 = new Freez2();
    getWorld().addObject(Freez2, getX()-5, getY()-10);//memposisikan ammo

    }
}
