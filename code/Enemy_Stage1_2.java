
import greenfoot.Color;
import greenfoot.*;
import java.util.List;

public class Enemy_Stage1_2 extends Enemy {

    List<Enemy> enemys;
    boolean flag = false;
    int num = 0;

    public Enemy_Stage1_2() {
        MovementSpeed = 1;
        BulletSpeed = 3.5;
        BulletSize = 7;
        BulletColor = new Color(0, 255, 100);
        BulletPower = 2;
        FireRate = 30;
        FullLife = 10;
        team = 3;
        IncludeEXP = 100;
    }

    public Enemy_Stage1_2(int level) {
        this();
        Level = level;
    }

    public List<Enemy> getEnemy() {
        return world.getObjects(Enemy.class);
    }

    @Override
    public void shot() {
        fire(Greenfoot.getRandomNumber(10) + 260, 0, 50);
    }

    @Override
    public void enemAct() {
        if (flag) {
            move(1.0);
            turnTo(360);
            num++;
        } else {
            move(1.0);
            turnTo(180);
            num++;
        }
        switch (num) {
            case 210:
                flag = true;
                break;
            case 420:
                flag = false;
                num = 0;
                break;
            default:
                break;
        }
        
        checkFire();
        checkKilled();
    }
}
