import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class 放射回転発散型1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_Radiation1_2_1 extends Player
{
    int count = 0;
    int a = 10;
  boolean s = false;
    public Player_Radiation1_2_1() {
        default_MovementSpeed = 4;
        default_BulletSpeed = 5;
        default_BulletPower = 3;
        default_BulletDurability = 10;
        default_FireRate = 20;
        BulletSize = 5;
        BulletColor = new Color(0, 255, 102);
        default_FullLife = 250;
        BulletLifetime = 70;
    }

    public Player_Radiation1_2_1(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        for(int i = 0;i < a; i++){
            fire(count,0,0);
            count+=360/a;
        }
        if(count > 90){
        s = true;        
    }else if(count < -90){
        s = false;
    }else{
        
    }
   if(s){
       count-=5;
}else{
    count+=5;
}
    }
}
