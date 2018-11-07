import greenfoot.Color;

public class Enemy_Stage10_3 extends Enemy {

    public Enemy_Stage10_3() {
        MovementSpeed = 3.0;
        BulletSpeed = 10;
        BulletSize = 10;
        BulletColor = new Color(255, 255, 0);
        BulletPower = 15;
        FireRate = 30;
        FullLife = 100;
        IncludeEXP = 3000;
    }

    public Enemy_Stage10_3(int level) {
        this();
        Level = level;
    }


    @Override
    public void enemAct() {
        getPlayer();
        turnToPlayer();
        move(MovementSpeed);
        checkFire();
    }
}
