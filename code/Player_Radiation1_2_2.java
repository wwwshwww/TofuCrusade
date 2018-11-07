
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class 放射回転収束型1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player_Radiation1_2_2 extends Player {

    int count = 300;
    boolean s = false;

    public Player_Radiation1_2_2() {
        default_MovementSpeed = 4.0;
        default_BulletSpeed = 4;
        default_BulletPower = 3;
        default_BulletDurability = 10;
        default_FireRate = 20;
        BulletSize = 5;
        BulletColor = new Color(255, 255, 0);
        default_FullLife = 200;
        BulletLifetime = 70;
    }

    public Player_Radiation1_2_2(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        double r = getRotation() / 2 + 50;
        fire(0 + count, r, 0);
        fire(90 + count, 0, r);
        fire(180 + count, -1 * r, 0);
        fire(-90 + count, 0, -1 * r);
        double a = r * (1 / Math.sqrt(2));
        fire(45 + count, a, a);
        fire(135 + count, -a, a);
        fire(225 + count, -a, -a);
        fire(315 + count, a, -a);
        if (count > 270) {
            s = true;
        } else if (count < 90) {
            s = false;
        } else {

        }
        if (s) {
            count -= 5;
        } else {
            count += 5;
        }
    }
}
