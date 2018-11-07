import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tanpatsu1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_Sniper1_2_1 extends Player
{
    public Player_Sniper1_2_1() {
        BulletSize = 12;
        BulletColor = new Color(102, 204, 255);
        
        default_MovementSpeed = 4;
        default_BulletDurability = 75;
        default_BulletPower = 20;
        default_BulletSpeed = 13;
        default_FireRate = 100;
        default_FullLife = 400;
        setStatuses();
    }

    public Player_Sniper1_2_1(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        fire(0.5, 20, 10);
        fire(-0.5, 20, -10);
    }
}