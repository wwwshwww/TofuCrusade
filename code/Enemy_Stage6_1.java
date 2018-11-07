//Corner
import greenfoot.*;

public class Enemy_Stage6_1 extends Enemy {

    public Enemy_Stage6_1() {
        MovementSpeed = 1.0;
        BulletSpeed = 3.5;
        BulletSize = 7;
        BulletColor = new Color(0, 255, 100);
        BulletPower = 2;
        FireRate = 20;
        FullLife = 10;
        IncludeEXP = 1000;
    }

    public Enemy_Stage6_1(int level) {
        this();
        Level = level;
    }

    @Override
    public void shot() {
        fire(0, 20, 0);
    }

    @Override
    public void enemAct() {
        switch (motion) {
            case 0:
                turnTo(90);
                checkTurn(90);
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
