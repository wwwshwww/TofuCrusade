import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tanpatsu1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_Sniper1 extends Player
{
    public Player_Sniper1() {
        BulletSize = 10;
        BulletColor = new Color(0, 255, 255);
        
        default_MovementSpeed = 3;
        default_BulletDurability = 50;
        default_BulletPower = 10;
        default_BulletSpeed = 10;
        default_FireRate = 100;
        default_FullLife = 300;
        setStatuses();
    }

    public Player_Sniper1(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        fire(0, 20, 0);
    }
}
