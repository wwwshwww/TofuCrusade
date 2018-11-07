import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tanpatsu1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_Sniper1_1_2 extends Player
{
    public Player_Sniper1_1_2() {
        BulletSize = 8;
        BulletColor = new Color(51, 51, 255);
        
        default_MovementSpeed = 3;
        default_BulletDurability = 75;
        default_BulletPower = 15;
        default_BulletSpeed = 15;
        default_FireRate = 60;
        default_FullLife = 400;
        setStatuses();
    }

    public Player_Sniper1_1_2(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        fire(0, 20, 0);
    }
}
