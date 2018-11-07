import greenfoot.*;

public class Enemy_Stage1_1 extends Enemy {

    public Enemy_Stage1_1() {
        MovementSpeed = 1;
        BulletSpeed = 3.5;
        BulletSize = 7;
        BulletColor = new Color(0, 255, 100);
        BulletPower = 5;
        FireRate = 30;
        FullLife = 30;
        IncludeEXP = 100;
    }

    public Enemy_Stage1_1(int level) {
        this();
        Level = level;
    }

    @Override
    public void shot() {
        fire(Greenfoot.getRandomNumber(10) + 90, 0, 50);
    }

    @Override
    public void enemAct() {
        checkFire();
    }
}
