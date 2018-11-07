
import greenfoot.Color;
import java.util.List;

public class Enemy_Stage3_Boss extends Enemy {

    List<Player> Players;


    public Enemy_Stage3_Boss() {
        MovementSpeed = 3.0;
        BulletSpeed = 3.0;
        BulletSize = 50;
        BulletColor = new Color(255, 0, 0);
        BulletPower = 50;
        FireRate = 150;
        FullLife = 100;
        IncludeEXP = 3000;
    }

    public Enemy_Stage3_Boss(int level) {
        this();
        Level = level;
    }

    @Override
    public void shot() {
        Players = getPlayer();
        double rad = 0;
        for (Player PlayerList : Players) {
            double toX = PlayerList.getX() - getX();
            double toY = PlayerList.getY() - getY();
            rad = Math.toDegrees(Math.atan2(toY, toX)) - getRotation();
        }
        fire(rad + 30, -30, 0);
        fire(rad, 0, 0);
        fire(rad - 30, 30, 0);
    }

    @Override
    public void enemAct() {
        double mx = getX();
        double my = getY();
        switch (motion) {
            case 0:
                move(MovementSpeed);
                chackpoint(1100, 150, mx, my);
                break;
            case 1:
                move(-MovementSpeed);
                chackpoint(100, 150, mx, my);
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
