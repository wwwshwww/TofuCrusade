//walls
import greenfoot.*;

public class Enemy_Stage5_2 extends Enemy {

    public Enemy_Stage5_2() {
        MovementSpeed = 3.0;
        BulletSpeed = 3.5;
        BulletSize = 7;
        BulletColor = new Color(0, 255, 100);
        BulletPower = 30;
        FireRate = 15;
        FullLife = 100;
        IncludeEXP = 700;
    }

    public Enemy_Stage5_2(int level) {
        this();
        Level = level;
    }

    @Override
    public void shot() {
        fire(Greenfoot.getRandomNumber(10) + 260, 0, -50);
    }

    @Override
    public void enemAct() {
        double mx = getX();
        double my = getY();
        switch (motion) {
            case 0:
                if (TurnFlag == true) {
                    turn(0 - getRotation());
                    turn((int) calcTurnDegrees(getX(), getY(), 50, 850));
                    TurnFlag = false;
                }
                chackpoint(50, 850, mx, my);
                break;
            case 1:
                if (TurnFlag == true) {
                    turn(0 - getRotation());
                    turn((int) calcTurnDegrees(getX(), getY(), 1150, 850));
                    TurnFlag = false;
                }
                chackpoint(1150, 850, mx, my);
                break;
            case 2:
                if (TurnFlag == true) {
                    turn(0 - getRotation());
                    turn((int) calcTurnDegrees(getX(), getY(), 1150, 50));
                    TurnFlag = false;
                }
                chackpoint(1150, 50, mx, my);
                break;
            case 3:
                if (TurnFlag == true) {
                    turn(0 - getRotation());
                    turn((int) calcTurnDegrees(getX(), getY(), 50, 50));
                    TurnFlag = false;
                }
                chackpoint(50, 50, mx, my);
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
    }
}
