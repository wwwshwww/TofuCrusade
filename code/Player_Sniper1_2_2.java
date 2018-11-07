import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tanpatsu1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_Sniper1_2_2 extends Player
{
    public Player_Sniper1_2_2() {
        BulletSize = 10;
        BulletColor = new Color(255, 255, 0);
        
        default_MovementSpeed = 4;
        default_BulletDurability = 75;
        default_BulletPower = 13;
        default_BulletSpeed = 20;
        default_FireRate = 100;
        default_FullLife = 400;
        setStatuses();
    }

    public Player_Sniper1_2_2(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        fire(1, 20, 4);
        fire(0, 30, 0);
        fire(-1, 20, -4);
    }
}
