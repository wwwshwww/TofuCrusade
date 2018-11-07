
import greenfoot.Color;

public class Enemy_Stage01 extends Enemy{
    
    boolean turnFlg;
    
    public Enemy_Stage01() {
        MovementSpeed = 1;
        BulletSpeed = 3.5;
        BulletSize = 7;
        BulletColor = new Color(0, 255, 100);
        BulletPower = 20;
        FireRate = 30;
        FullLife = 50;
        team = 3;
        IncludeEXP =30;
    }
    
    //@Override
    //public void addedToWorld(World world) {
        //super.addedToWorld(world);
    //}
    
    @Override
    public void enemAct(){
        turnTo(90);
        checkFire();
        checkKilled();
    }
    
}
