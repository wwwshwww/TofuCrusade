
import greenfoot.*;

public class Enemy_Stage6_Boss extends Enemy {

    boolean mflag = false;
    int i = 0;

    public Enemy_Stage6_Boss() {
        setImage("S0.png");
        MovementSpeed = 3.0;
        BulletSpeed = 9.0;
        BulletSize = 20;
        BulletColor = new Color(0, 255, 100);
        BulletPower = 10;
        FireRate = 15;
        FullLife = 300;
        IncludeEXP = 6000;
    }

    public Enemy_Stage6_Boss(int level) {
        this();
        Level = level;
    }

    private void changeMotion() {
        Enemys = getEnemy();
        if (Enemys.size() <= 1 && mflag == false) {
            mflag = true;
            Life = 10;
            this.BulletPower = 5;
            this.FireRate = 30;
        }
    }

    @Override
    public void shot() {
        //fire(digrees,x,y)
        fire(Greenfoot.getRandomNumber(10) + 67 + i, 0, 0);
        fire(Greenfoot.getRandomNumber(10) + 143 + i, 0, 0);
        fire(Greenfoot.getRandomNumber(10) + 215 + i, 0, 0);
        fire(Greenfoot.getRandomNumber(10) + 287 + i, 0, 0);
        fire(Greenfoot.getRandomNumber(10) + 355 + i, 0, 0);
        i += 10;
        if (i > 360) {
            i = 0;
        }
    }

    @Override
    public void enemAct() {
        changeMotion();
        double mx = getX();
        double my = getY();
        switch (motion) {
            case 0:
                move(MovementSpeed);
                chackpoint(1100, 450, mx, my);
                break;
            case 1:
                move(-MovementSpeed);
                chackpoint(100, 450, mx, my);
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
