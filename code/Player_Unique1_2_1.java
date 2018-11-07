
import greenfoot.Color;
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
public class Player_Unique1_2_1 extends Player {
    int x;
    int y;
    long count = 0;
    public Player_Unique1_2_1() {
        BulletLifetime = 15;
        default_MovementSpeed = 4.8;
        default_BulletSpeed = 1;
        default_BulletPower = 3.5;
        default_BulletDurability = 3.5;
        default_FireRate = 6;
        BulletSize = 10;
        BulletColor = new Color(153, 0, 255);
        default_FullLife = 300;
    }

    public Player_Unique1_2_1(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        count += 10;
        double r = getRotation() / 2 + 50;
        for(int i=0; i<8; i++){
            fire(0+i*45, r*Math.sin(Math.toRadians(count+i*45)), r*Math.cos(Math.toRadians(count+i*45)));
        }
    }
}

