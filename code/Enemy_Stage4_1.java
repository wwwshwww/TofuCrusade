
import greenfoot.*;

public class Enemy_Stage4_1 extends Enemy {

    public Enemy_Stage4_1() {
        MovementSpeed = 2.0;
        BulletSpeed = 3.5;
        BulletSize = 7;
        BulletColor = new Color(0, 255, 100);
        BulletPower = 10;
        FireRate = 30;
        FullLife = 30;
        IncludeEXP = 400;
    }

    public Enemy_Stage4_1(int level) {
        this();
        Level = level;
    }

    @Override
    public void shot() {
        fire(0, 50, 0);
        fire(0, 0, 50);
        fire(0, 0, -50);
    }

    @Override
    public void enemAct() {
        if (Life <= FullLife / 2) {
            MovementSpeed = 3.0;
            getPlayer();
            turnToPlayer();
        } else {
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
        }
        move(MovementSpeed);
        checkFire();
    }

}
