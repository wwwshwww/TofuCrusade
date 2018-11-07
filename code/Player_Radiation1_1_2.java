import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class 放射結界型1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_Radiation1_1_2 extends Player
{
    int count = 157;
    public Player_Radiation1_1_2() {
        default_MovementSpeed = 4;
        default_BulletSpeed = 4;
        default_BulletPower = 3;
        default_BulletDurability = 10;
        default_FireRate = 20;
        BulletSize = 5;
        BulletColor = new Color(0, 153, 255);
        default_FullLife = 200;
        BulletLifetime = 70;
    }

    public Player_Radiation1_1_2(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        
        double r = getRotation() / 2 + 50;
        fire(0+count, r, 0);
        fire(90+count, 0, r);
        fire(180+count, -1 * r, 0);
        fire(-90+count, 0, -1 * r);
        double a = r * (1 / Math.sqrt(2));
        fire(45+count, a, a);
        fire(135+count, -a, a);
        fire(225+count, -a, -a);
        fire(315+count, a, -a);
    }
}
