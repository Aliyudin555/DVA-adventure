import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mc1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mc1 extends Actor
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
        if(isTouching(Home2.class)){
        getImage().scale((int)Math.round(getImage().getWidth()*0.9),
        (int)Math.round(getImage().getHeight()*0.9));
        Greenfoot.delay(5);
        Greenfoot.setWorld(new Lvl3());
        ((Lvel2)getWorld()).song.stop();
        }
        if(isTouching(freez.class)){
        removeTouching(freez.class);
        }
        if(isTouching(Freez2.class)){
        removeTouching(Freez2.class);
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
        if(Greenfoot.isKeyDown("b"))
        {
            shoot2();
        }
    }
    public void shoot(){
    //absyraction method shoot() untuk Hero menembakkan peluru ke kanan
    //keluar peluru
    waktu++;
        while(waktu>23){
        waktu=0;
    Rocket Rocket = new Rocket();
    getWorld().addObject(Rocket, getX()-10, getY()-20);//memposisikan ammo
    Greenfoot.playSound("rocket launcher - Sound Effect _ Free sound Effect (128 kbps).mp3");
    }
    }
    public void shoot2(){
    //absyraction method shoot() untuk Hero menembakkan peluru kekiri
    //keluar peluru
    waktu++;
        while(waktu>23){
        waktu=0;
    Dor2 Dor2 = new Dor2();
    getWorld().addObject(Dor2, getX()+10, getY()+20);//memposisikan ammo
    Greenfoot.playSound("rocket launcher - Sound Effect _ Free sound Effect (128 kbps).mp3");
    }
    }
    public void loncat()
    {
        if(jatuh==false)
        {
            y=-up+8;
            bawah();
        }
    }
    
    public void bawah()
    {
        jatuh=true;
        setLocation(getX(),getY()+y);
        y=y+yspeed;
    }
    
    public boolean Ice4()
    {   jatuh=false;
        Actor papan=getOneObjectAtOffset(0,getImage().getHeight()/2-1,Ice4.class);
        return papan!=null;
    }
    public boolean Ice3()
    {   jatuh=false;
        Actor papan=getOneObjectAtOffset(0,getImage().getHeight()/2-1,Ice3.class);
        return papan!=null;
    }
    public boolean Ice1()
    {   jatuh=false;
        Actor papan=getOneObjectAtOffset(0,getImage().getHeight()/2-1,Ice1.class);
        return papan!=null;
    }
    public void cek()
    {
        if(Ice4())
        {
            y=0;
        }
        else if(Ice1())
        {
            y=0;
        }
        else if(Ice3())
        {
            y=0;
        }
        else
        {
            bawah();
        }
    }
}
