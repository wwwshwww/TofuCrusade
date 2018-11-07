
import greenfoot.Color;

public class Enemy_Stage04_Boss extends Enemy {

    boolean turnFlg;
    public int time;

    public Enemy_Stage04_Boss() {
        setImage("S0.png");
        MovementSpeed = 1.0;
        BulletSpeed = 2;
        BulletSize = 50;
        BulletColor = new Color(255, 0, 0);
        BulletPower = 100;
        FireRate = 200;
        FullLife = 200;

    }

    public Enemy_Stage04_Boss(int level) {
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
    public void enemAct() {
        move(1.0);
        turnToPlayer();
        getAngleToPlayer();
        getPlayer();
        checkFire();
    }

    @Override
    public void checkFire() {
        time++;
        if (time > FireRate) {
            fire(0, 0, 0);
            fire(-20, 0, -40);
            fire(20, 0, 40);
            time = 0;
        }
    }
}
