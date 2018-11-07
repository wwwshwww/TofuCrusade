
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class daizu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player_Daizu extends Player {

    public Player_Daizu() {
        BulletSize = 7;
        BulletColor = new Color(255, 255, 100);

        default_MovementSpeed = 3;
        default_BulletDurability = 1;
        default_BulletPower = 2;
        default_BulletSpeed = 5;
        default_FireRate = 45;
        default_FullLife = 100;
        setStatuses();
        setImage("Daizu.png");
    }

    public Player_Daizu(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        fire(0, 20, 0);
    }
}
