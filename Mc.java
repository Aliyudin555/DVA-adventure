import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mc extends Actor
{
    private boolean jatuh;
    private int y=3;
    private int yspeed=1;
    private int up=18;
    int waktu = 0;
    /**
     * Act - do whatever the Mc wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move();
        cek();
        if(isTouching(House.class)){
        getImage().scale((int)Math.round(getImage().getWidth()*0.9),
        (int)Math.round(getImage().getHeight()*0.9));
        Greenfoot.delay(30);
        Greenfoot.setWorld(new Next());
        ((MyWorld)getWorld()).song.stop();
        }
        if(isTouching(Bullet.class)){
        removeTouching(Bullet.class);
        }
    }
    public void move()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-4, getY());
            setImage("pngegg_2.png");
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+4, getY());
            setImage("pngegg.png");
        }
        if(Greenfoot.isKeyDown("space"))
        {
            loncat();
        }
        if(Greenfoot.isKeyDown("x"))
        {
            shoot();
        }    
    }
    public void shoot(){
    //absyraction method shoot() untuk Hero menembakkan peluru
    //keluar peluru
    waktu++;
        while(waktu>23){
        waktu=0;
    Rocket Rocket = new Rocket();
    getWorld().addObject(Rocket, getX()-10, getY()-20);//memposisikan ammo
    Greenfoot.playSound("rocket launcher - Sound Effect _ Free sound Effect (128 kbps).mp3");
    }
    }
    public void loncat()
    {
        if(jatuh==false)
        {
            y=-up+5;
            bawah();
        }
    }
    
    public void bawah()
    {
        jatuh=true;
        setLocation(getX(),getY()+y);
        y=y+yspeed;
    }
    
    public boolean Grass()
    {
        jatuh=false;
        Actor papan=getOneObjectAtOffset(0,getImage().getHeight()/2-1,Grass.class);
        return papan!=null;
    }
    
    public boolean Grass2()
    {   jatuh=false;
        Actor papan=getOneObjectAtOffset(0,getImage().getHeight()/2-1,Grass2.class);
        return papan!=null;
    }
    public void cek()
    {
        if(Grass())
        {
            y=0;
        }
        else if(Grass2())
        {
            y=0;
        }
        else
        {
            bawah();
        }
    }
}