
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
public class Player_Unique1_1_1 extends Player{
            public Player_Unique1_1_1() {
        BulletLifetime = 400;
        default_MovementSpeed = 4.5;
        default_BulletSpeed = 0.1;
        default_BulletPower = 20;
        default_BulletDurability = 30;
        default_FireRate = 20;
        BulletSize = 45;
        BulletColor = new Color(10, 10, 10);
        default_FullLife = 600;
    }

    public Player_Unique1_1_1(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        fire(Greenfoot.getRandomNumber(360),0,0);
    }    
}
