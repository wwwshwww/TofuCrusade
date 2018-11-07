import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_Unique1 extends Player
{
        public Player_Unique1() {
        BulletLifetime = 350;
        default_MovementSpeed = 4;
        default_BulletSpeed = 0.1;
        default_BulletPower = 10;
        default_BulletDurability = 5;
        default_FireRate = 20;
        BulletSize = 20;
        BulletColor = new Color(10, 10, 10);
        default_FullLife = 300;
    }

    public Player_Unique1(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        fire(Greenfoot.getRandomNumber(360),0,0);
    }    
}

