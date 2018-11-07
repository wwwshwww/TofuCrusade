//Corner

import greenfoot.*;

public class Enemy_Stage7_4 extends Enemy {

    public Enemy_Stage7_4() {
        MovementSpeed = 1.0;
        BulletSpeed = 3.5;
        BulletSize = 10;
        BulletColor = new Color(0, 255, 100);
        BulletPower = 2;
        FireRate = 20;
        FullLife = 40;
        IncludeEXP = 1000;
    }

    public Enemy_Stage7_4(int level) {
        this();
        Level = level;
    }

    @Override
    public void shot() {
        fire(0, 40, 0);
        fire(0, 30, 30);
        fire(0, 30, -30);
    }

    @Override
    public void enemAct() {
        switch (motion) {
            case 0:
                turnTo(179);
                checkTurn(179);
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
        checkFire();
    }
}
