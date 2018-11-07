
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Ayataka here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player_Ayataka extends Player {

    public Player_Ayataka() {
        BulletSize = 10;
        BulletColor = new Color(0, 0, 255);
        
        default_MovementSpeed = 4.5;
        default_BulletPower = 1;
        default_BulletDurability = 1;
        default_BulletSpeed = 1;
        default_FireRate = 20;
        default_FullLife = 500;
        setStatuses();
    }

    public Player_Ayataka(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        Random rand = new Random();
        int ran = rand.nextInt(10)-5;
        double r = getRotation() / 2 + 50;
        fire(0+ran, r, 0);
        fire(90+ran, 0, r);
        fire(180+ran, -1 * r, 0);
        fire(-90+ran, 0, -1 * r);
        double a = r * (1 / Math.sqrt(2));
        fire(45+ran, a, a);
        fire(135+ran, -a, a);
        fire(225+ran, -a, -a);
        fire(315+ran, a, -a);
    }
    
}
