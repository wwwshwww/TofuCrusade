
import greenfoot.Color;
import greenfoot.Greenfoot;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Player_Unique1_1_2 extends Player{
            public Player_Unique1_1_2() {
        BulletLifetime = 400;
        default_MovementSpeed = 4.5;
        default_BulletSpeed = 0.1;
        default_BulletPower = 6;
        default_BulletDurability = 20;
        default_FireRate = 20;
        BulletSize = 8;
        BulletColor = new Color(10, 50, 50);
        default_FullLife = 450;
    }

    public Player_Unique1_1_2(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        double r = 40;
        for(int i=0; i<6; i++){
            fire(Greenfoot.getRandomNumber(360),r*Math.cos(Math.toRadians(i*60)),r*Math.sin(Math.toRadians(i*60)));
        }
    }    
}
