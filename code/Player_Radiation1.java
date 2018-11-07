import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class 放射基本型 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_Radiation1 extends Player
{
    int count = 0;
    public Player_Radiation1() {
        default_MovementSpeed = 3.5;
        default_BulletSpeed = 4;
        default_BulletPower = 3;
        default_BulletDurability = 3;
        default_FireRate = 30;
        BulletSize = 10;
        BulletColor = new Color(255, 255, 255);
        default_FullLife = 150;
        BulletLifetime = 70;
    }

    public Player_Radiation1(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        
        double r = getRotation() / 2 + 50;
        double a = r * (1 / Math.sqrt(2));
        fire(45+count, a, a);
        fire(135+count, -a, a);
        fire(225+count, -a, -a);
        fire(315+count, a, -a);
    }
}
