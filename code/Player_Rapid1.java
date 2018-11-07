import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rensya1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_Rapid1 extends Player
{
    public Player_Rapid1(){
        BulletSize = 7;
        BulletColor = new Color(255, 255, 255);
        
        default_MovementSpeed = 4;
        default_BulletDurability = 2;
        default_BulletPower = 2.5;
        default_BulletSpeed = 6;
        default_FireRate = 14;
        default_FullLife = 150;
        BulletLifetime = 100;
        setStatuses();
    }

    public Player_Rapid1(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        fire(Greenfoot.getRandomNumber(10)-5, 20, 0);
    }
}
