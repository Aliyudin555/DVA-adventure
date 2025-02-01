import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Actor
{
    /**
     * Act - do whatever the Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count = 0;
    public void act()
    {
        // Add your action code here.
    if(isTouching(Mc3.class)){
        Lvl3.hp.add(-1);
    }
    count++;
        if(count>=100){
            //menembak
            shoot();
            count=0;
            Greenfoot.playSound("ammo.wav");
        }
    }
    public void shoot(){
    //absyraction method shoot() untuk Hero menembakkan peluru
    //keluar peluru
    Bullet2 Bullet2 = new Bullet2();
    getWorld().addObject(Bullet2, getX()-10, getY()-20);//memposisikan ammo
    }
}