
import greenfoot.Color;

public class Enemy_Stage9_2 extends Enemy {

    public Enemy_Stage9_2() {
        MovementSpeed = 1.0;
        BulletSpeed = 20;
        BulletSize = 10;
        BulletColor = new Color(255, 0, 0);
        BulletPower = 70;
        FireRate = 150;
        FullLife = 100;

    }

    public Enemy_Stage9_2(int level) {
        this();
        Level = level;
    }

    @Override
    public void enemAct() {
        turnToPlayer();
        checkFire();
    }
}
