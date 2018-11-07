//EXPBot

import greenfoot.*;

public class Enemy_Stage8_1 extends Enemy {

    private int KILL_COUNT;

    public Enemy_Stage8_1() {
        setImage("S0.png");
        MovementSpeed = 10.0;
        BulletSpeed = 11.0;
        BulletSize = 10;
        BulletColor = new Color(0, 255, 100);
        BulletPower = 9;
        FireRate = 20;
        FullLife = 10;
        IncludeEXP = 10000;
    }

    public Enemy_Stage8_1(int level) {
        this();
        Level = level;
    }

    @Override
    public void checkKilled() {
        if (Life <= 0) {
            world.removeObject(this);
            world.removeObject(myBar);
            world.removeObject(showLev);
        } else if (KILL_COUNT >= 8) {
            world.removeObject(this);
            world.removeObject(myBar);
            world.removeObject(showLev);
        }
    }

    @Override
    public void enemAct() {
        double mx = getX();
        double my = getY();
        switch (motion) {
            case 0:
                if (TurnFlag == true) {
                    turn(0 - getRotation());
                    turn((int) calcTurnDegrees(getX(), getY(), 100, 800));
                    KILL_COUNT++;
                    TurnFlag = false;
                }
                chackpoint(100, 800, mx, my);
                break;
            case 1:
                if (TurnFlag == true) {
                    turn(0 - getRotation());
                    turn((int) calcTurnDegrees(getX(), getY(), 1100, 100));
                    KILL_COUNT++;
                    TurnFlag = false;
                }
                chackpoint(1100, 100, mx, my);
                break;
            case 2:
                if (TurnFlag == true) {
                    turn(0 - getRotation());
                    turn((int) calcTurnDegrees(getX(), getY(), 1100, 800));
                    KILL_COUNT++;
                    TurnFlag = false;
                }
                chackpoint(1100, 800, mx, my);
                break;
            case 3:
                if (TurnFlag == true) {
                    turn(0 - getRotation());
                    turn((int) calcTurnDegrees(getX(), getY(), 100, 100));
                    KILL_COUNT++;
                    TurnFlag = false;
                }
                chackpoint(100, 100, mx, my);
                break;
            case 4:
                motion = 0;
                TurnFlag = true;
                break;
            default:
                break;
        }
        move(MovementSpeed);
        checkFire();
        checkKilled();
    }
}
