import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class 放射直線型1 here.d
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_Radiation1_1 extends Player
{
   int count = 0;
   int a = 8;
    public Player_Radiation1_1() {
        default_MovementSpeed = 3.5;
        default_BulletSpeed = 5;
        default_BulletPower = 5;
        default_BulletDurability = 10;
        default_FireRate = 25;
        BulletSize = 5;
        BulletColor = new Color(102, 0, 255);
        default_FullLife = 200;
        BulletLifetime = 70;
    }

    public Player_Radiation1_1(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        for(int i = 0;i < a; i++){
            fire(count,0,0);
            count+=360/a;
        }
    }
}
