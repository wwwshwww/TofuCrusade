import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tanpatsu3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_Sniper1_2 extends Player
{
    public Player_Sniper1_2() {
        BulletSize = 10;
        BulletColor = new Color(0, 255, 153);
        
        default_MovementSpeed = 3;
        default_BulletDurability = 50;
        default_BulletPower = 10;
        default_BulletSpeed = 10;
        default_FireRate = 100;
        default_FullLife = 300;
        setStatuses();
    }

    public Player_Sniper1_2(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        fire(0.5, 20, 4);
        fire(-0.5, 20, -4);
    }
}
