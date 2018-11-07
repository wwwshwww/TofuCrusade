import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tanpatu4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_Rapid1_2 extends Player
{
    public Player_Rapid1_2() {
        BulletSize = 7;
        BulletColor = new Color(102, 255, 51);
        
        default_MovementSpeed = 3.5;
        default_BulletPower = 3;
        default_BulletDurability = 2.5;
        default_BulletSpeed = 6;
        default_FireRate = 25;
        default_FullLife = 200;
        BulletLifetime = 100;
        setStatuses();
    }

    public Player_Rapid1_2(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        fire(Greenfoot.getRandomNumber(6)-3, 10, 0);
        fire(Greenfoot.getRandomNumber(6)-3, -10, 0);
    } 
}
