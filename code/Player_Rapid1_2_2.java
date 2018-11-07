import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rensya10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_Rapid1_2_2 extends Player
{
    public Player_Rapid1_2_2() {
        BulletSize = 10;
        BulletColor = new Color(255, 102, 0);
        
        default_MovementSpeed = 4.5;
        default_BulletPower = 3;
        default_BulletDurability = 2;
        default_BulletSpeed = 7;
        default_FireRate = 25;
        default_FullLife = 300;
        BulletLifetime = 100;
        setStatuses();
    }

    public Player_Rapid1_2_2(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        fire(0, 30, 0);
        fire(0, 20, 10);
        fire(0, 20, -10);
        fire(20, 0, 40);
        fire(-20, 0, -40);
    }
}
