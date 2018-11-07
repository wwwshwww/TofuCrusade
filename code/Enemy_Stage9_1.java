//spibot

import greenfoot.*;

public class Enemy_Stage9_1 extends Enemy {

    public Enemy_Stage9_1() {
        MovementSpeed = 3.0;
        BulletSpeed = 3.5;
        BulletSize = 7;
        BulletColor = new Color(0, 255, 100);
        BulletPower = 2;
        FireRate = 15;
        FullLife = 100;

    }

    public Enemy_Stage9_1(int level) {
        this();
        Level = level;
    }

    @Override
    public void shot() {
        fire(90, 0, 50);
        fire(45, 50, 50);
        fire(135, -50, 50);
    }

    @Override
    public void enemAct() {
        switch (motion) {
            case 0:
                turnTo(180);
                checkTurn(180);
                break;
            case 1:
                turnTo(0);
                checkTurn(0);
                break;
            case 2:
                motion = 0;
                break;
            default:
                break;
        }
        move(MovementSpeed);
        checkFire();
    }
}
