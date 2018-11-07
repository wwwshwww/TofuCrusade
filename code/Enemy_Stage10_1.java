
import greenfoot.Color;

public class Enemy_Stage10_1 extends Enemy {

    public Enemy_Stage10_1() {
        MovementSpeed = 10.0;
        BulletSpeed = 10;
        BulletSize = 5;
        BulletColor = new Color(255, 0, 255);
        BulletPower = 5;
        FireRate = 30;
        FullLife = 100;
        IncludeEXP = 3000;
    }

    public Enemy_Stage10_1(int level) {
        this();
        Level = level;
    }

    @Override
    public void shot() {
        players = getPlayer();
        double rad = 0;
        for (Player PlayerList : players) {
            double toX = PlayerList.getX() - getX();
            double toY = PlayerList.getY() - getY();
            rad = Math.toDegrees(Math.atan2(toY, toX)) - getRotation();
        }
        fire(rad, 0, 0);
        fire(rad, 0, 10);
        fire(rad, 0, 20);
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
                    TurnFlag = false;
                }
                chackpoint(100, 800, mx, my);
                break;
            case 1:
                if (TurnFlag == true) {
                    turn(0 - getRotation());
                    turn((int) calcTurnDegrees(getX(), getY(), 1100, 100));
                    TurnFlag = false;
                }
                chackpoint(1100, 100, mx, my);
                break;
            case 2:
                if (TurnFlag == true) {
                    turn(0 - getRotation());
                    turn((int) calcTurnDegrees(getX(), getY(), 1100, 800));
                    TurnFlag = false;
                }
                chackpoint(1100, 800, mx, my);
                break;
            case 3:
                if (TurnFlag == true) {
                    turn(0 - getRotation());
                    turn((int) calcTurnDegrees(getX(), getY(), 100, 100));
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
    }
}
