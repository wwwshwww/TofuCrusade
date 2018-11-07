
import greenfoot.Color;
import greenfoot.Greenfoot;

public class Enemy_Stage03 extends Enemy {

    boolean turnFlg;
    public int time;

    public Enemy_Stage03() {
        MovementSpeed = 1.0;
        BulletSpeed = 2;
        BulletSize = 15;
        BulletColor = new Color(255, 255, 255);
        BulletPower = 10;
        FireRate = 250;
        FullLife = 30;
    }

    public Enemy_Stage03(int level) {
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
            fire(Greenfoot.getRandomNumber(10), 0, 0);
            fire(Greenfoot.getRandomNumber(10), 20, 0);
            fire(Greenfoot.getRandomNumber(10), 40, 0);
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
