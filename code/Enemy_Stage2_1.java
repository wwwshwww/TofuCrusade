//100,100
import greenfoot.*;

public class Enemy_Stage2_1 extends Enemy {

    boolean flags = true;

    public Enemy_Stage2_1() {
        MovementSpeed = 3.0;
        BulletSpeed = 3.5;
        BulletSize = 7;
        BulletColor = new Color(0, 255, 100);
        BulletPower = 3;
        FireRate = 35;
        FullLife = 50;
        IncludeEXP = 250;
    }

    public Enemy_Stage2_1(int level) {
        this();
        Level = level;
    }

    private void FirstMotion(boolean flag) {
        if (flag == true) {
            turn(90);
            flags = false;
        }

    }

    @Override
    public void shot() {
        fire(Greenfoot.getRandomNumber(10) + 260, 0, -50);
    }

    @Override
    public void enemAct() {
        FirstMotion(flags);
        double mx = getX();
        double my = getY();
        switch (motion) {
            case 0:
                move(MovementSpeed);
                chackpoint(100, 800, mx, my);
                break;
            case 1:
                move(-MovementSpeed);
                chackpoint(100, 100, mx, my);
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
