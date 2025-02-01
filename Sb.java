import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sb extends Actor
{
    /**
     * Act - do whatever the Sb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count = 0;
    public void act()
    {
        // Add your action code here.
        // jika si rocket terkena mu2 maka akan hilang/mati
        if(isTouching(Dor2.class)){
        removeTouching(Dor2.class);
        Mu2 c = new Mu2();
        Lvel2.skor.add(10);
        getWorld().removeObject(this);
    }
    
    count++;
        if(count>=100){
            //menembak
            shoot();
            count=0;
        }
    }
    public void shoot(){
    //absyraction method shoot() untuk Hero menembakkan peluru
    //keluar peluru
    freez Freez = new freez();
    getWorld().addObject(Freez, getX()-10, getY()-20);//memposisikan ammo
    }
}
