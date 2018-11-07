import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tanpatu4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_Rapid1_1 extends Player
{
    public Player_Rapid1_1() {
        BulletSize = 7;
        BulletColor = new Color(255, 102, 51);
        
        default_MovementSpeed = 3.5;
        default_BulletPower = 3;
        default_BulletDurability = 2.5;
        default_BulletSpeed = 6;
        default_FireRate = 30;
        default_FullLife = 200;
        BulletLifetime = 100;
        setStatuses();
    }

    public Player_Rapid1_1(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        fire(0, 30, 0);
        fire(0, 20, 10);
        fire(0, 20, -10);
    } 
}
