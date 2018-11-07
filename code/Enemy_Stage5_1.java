//spinbot

import greenfoot.*;

public class Enemy_Stage5_1 extends Enemy {

    public Enemy_Stage5_1() {
        MovementSpeed = 3.0;
        BulletSpeed = 3.5;
        BulletSize = 7;
        BulletColor = new Color(0, 255, 100);
        BulletPower = 30;
        FireRate = 15;
        FullLife = 60;
        IncludeEXP = 500;
    }

    public Enemy_Stage5_1(int level) {
        this();
        Level = level;
    }

    @Override
    public void shot() {
        fire(Greenfoot.getRandomNumber(10) + 260, 0, -50);
    }

    @Override
    public void enemAct() {
 
        switch (motion) {
            case 0:
                turnTo(180);
                move(MovementSpeed);
                checkTurn(180);
                break;
            case 1:
                turnTo(0);
                move(MovementSpeed);
                checkTurn(0);
                break;
            case 2:
                motion = 0;
                break;
            default:
                break;
        }
        checkFire();
    }
}
