import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class Tanpatu4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_Rapid1_2_1 extends Player{
    
    Random r1 = new Random();
    Random r2 = new Random();
    
    public Player_Rapid1_2_1() {
        BulletSize = 10;
        BulletColor = new Color(153, 255, 255);
        
        default_MovementSpeed = 4.5;
        default_BulletPower = 1;
        default_BulletDurability = 2;
        default_BulletSpeed = 7;
        default_FireRate = 5;
        default_FullLife = 300;
        BulletLifetime = 100;
        setStatuses();
    }

    public Player_Rapid1_2_1(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        fire(r1.nextInt(5)-10, 30, 0);
        fire(r2.nextInt(5)-10, 15, 0);
    } 
}
