
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
public class Player_Unique1_2_2 extends Player {
    int x;
    int y;
    long count = 0;
    public Player_Unique1_2_2() {
        BulletLifetime = 3;
        default_MovementSpeed = 5.0;
        default_BulletSpeed = 4;
        default_BulletPower = 3;
        default_BulletDurability = 3.5;
        default_FireRate = 5;
        BulletSize = 4;
        BulletColor = new Color(100, 200, 150);
        default_FullLife = 290;
    }

    public Player_Unique1_2_2(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        count += 3;
        double r = 90;
        for(int i=0; i<32; i++){
            fire(i*11.25+count+90, r*Math.cos(Math.toRadians(count+i*11.25)), r*Math.sin(Math.toRadians(count+i*11.25)));
        }
    }
}

