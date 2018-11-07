
import greenfoot.Color;
import greenfoot.Greenfoot;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Player_Unique1_2 extends Player {
    int x;
    int y;
    long count = 0;
    public Player_Unique1_2() {
        BulletLifetime = 4;
        default_MovementSpeed = 4;
        default_BulletSpeed = 0;
        default_BulletPower = 2.5;
        default_BulletDurability = 3;
        default_FireRate = 5;
        BulletSize = 10;
        BulletColor = new Color(153, 204, 255);
        default_FullLife = 300;
    }

    public Player_Unique1_2(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        count += 10;
        double r = getRotation() / 2 + 50;
        for(int i=0; i<8; i++){
            fire(0+i*45, r*Math.cos(Math.toRadians(count+i*45)), r*Math.sin(Math.toRadians(count+i*45)));
        }
    }
}

