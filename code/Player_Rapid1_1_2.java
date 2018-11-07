import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tanpatu3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_Rapid1_1_2 extends Player
{
    public Player_Rapid1_1_2() {
        BulletSize = 6;
        BulletColor = new Color(204, 51, 255);
        
        default_MovementSpeed = 4.5;
        default_BulletPower = 1;
        default_BulletDurability = 2;
        default_BulletSpeed = 6;
        default_FireRate = 25;
        default_FullLife = 300;
        BulletLifetime = 100;
        setStatuses();
    }

    public Player_Rapid1_1_2(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        fire(0, 40, 0);
        fire(0, 30, 10);
        fire(0, 30, -10);
        fire(0, 40, 20);
        fire(0, 40, -20);
        fire(0, 30, 30);
        fire(0, 30, -30);
        fire(0, 50, 0);
        fire(0, 40, 10);
        fire(0, 40, -10);
        fire(0, 60, 0);
        fire(0, 50, 10);
        fire(0, 50, -10);
        fire(0, 30, 0);
        fire(0, 30, 10);
        fire(0, 30, -10);
        fire(0, 20, 10);
        fire(0, 20, -10);
    }
}
