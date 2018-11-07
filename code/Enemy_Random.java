
import greenfoot.*;
import java.util.Random;

public class Enemy_Random extends Enemy {

    int a = 6;
    int b;
    int c;
    int count = 0;

    public Enemy_Random() {
        MovementSpeed = 1;
        BulletSpeed = 3.5;
        BulletSize = 7;
        BulletColor = new Color(0, 255, 100);
        BulletPower = 2;
        FireRate = 3;
        FullLife = 10;
    }

    public Enemy_Random(int level) {
        this();
        Level = level;
    }

    @Override
    public void shot() {
        Random r = new Random();
        b = r.nextInt(1600) - 800;
        c = r.nextInt(1600) - 800;
        for (int i = 0; i < a; i++) {
            fire(count, b, c);
            count += 360 / a;
        }
    }

    @Override
    public void enemAct() {
        checkFire();
    }
}
