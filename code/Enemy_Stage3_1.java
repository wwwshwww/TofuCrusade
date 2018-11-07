
import greenfoot.Color;

public class Enemy_Stage3_1 extends Enemy {

    boolean turnFlg;
    public int time;

    public Enemy_Stage3_1() {
        MovementSpeed = 1.0;
        BulletSpeed = 2;
        BulletSize = 15;
        BulletColor = new Color(255, 255, 255);
        BulletPower = 10;
        FireRate = 50;
        FullLife = 30;
    }

    public Enemy_Stage3_1(int level) {
        this();
        Level = level;
    }

    @Override
    public void act() {
        players = getPlayer();
        if (!players.isEmpty()) {
            enemAct();
        }
    }

    @Override
    public void checkFire() {
        time++;
        if (time > FireRate) {
            fire(0, 30, 0);
            fire(0, 0, 30);
            fire(0, 0, -30);
            time = 0;
        }
    }

    @Override
    public void enemAct() {
        turnToPlayer();
        getPlayer();
        checkFire();

    }

}
