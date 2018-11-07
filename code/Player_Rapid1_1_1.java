import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rensya2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player_Rapid1_1_1 extends Player
{
    double y[] = {0, 7, 13, 18, 13, 7};
    int i;
    public Player_Rapid1_1_1(){
        BulletSize = 7;
        BulletColor = new Color(255, 0, 0);
        
        default_MovementSpeed = 4.5;
        default_BulletPower = 1;
        default_BulletDurability = 2;
        default_BulletSpeed = 6;
        default_FireRate = 9;
        default_FullLife = 300;
        BulletLifetime = 100;
        setStatuses();
    }

    public Player_Rapid1_1_1(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        if(i >= 6){
          i = 0;
        }
        fire(0, 20, y[i]);
        fire(0, 20, -y[i]);
        i++;
    }
}
