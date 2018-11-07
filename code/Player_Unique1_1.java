
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
public class Player_Unique1_1 extends Player{
            public Player_Unique1_1() {
        BulletLifetime = 400;
        default_MovementSpeed = 4;
        default_BulletSpeed = 0.1;
        default_BulletPower = 15;
        default_BulletDurability = 20;
        default_FireRate = 20;
        BulletSize = 30;
        BulletColor = new Color(10, 10, 10);
        default_FullLife = 450;
    }

    public Player_Unique1_1(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        fire(Greenfoot.getRandomNumber(360),0,0);
    }    
}
