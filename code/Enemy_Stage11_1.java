
import greenfoot.Color;
import java.util.List;

public class Enemy_Stage11_1 extends Enemy {

    List<Player> players;
    
    public Enemy_Stage11_1() {
        MovementSpeed = 5.0;
        BulletSpeed = 10;
        BulletSize = 5;
        BulletColor = new Color(255, 0, 255);
        BulletPower = 10;
        FireRate = 10;
        FullLife = 100;
        IncludeEXP = 6000;
    }

    public Enemy_Stage11_1(int level) {
        this();
        Level = level;
    }

    @Override
    public void shot() {
        players = getPlayer();
        double rad = 0;
        for (Player PlayerList : players) {
            double toX = PlayerList.getX() - getX();
            double toY = PlayerList.getY() - getY();
            rad = Math.toDegrees(Math.atan2(toY, toX)) - getRotation();
        }
        fire(rad, -20, 0);
        fire(rad, 0, 20);
        fire(rad, 20, 0);
    }

    @Override
    public void enemAct() {
        double mx = getX();
        double my = getY();
        switch (motion) {
            case 0:
                if (TurnFlag == true) {
                    turn(0 - getRotation());
                    turn((int) calcTurnDegrees(getX(), getY(), 100, 100));
                    TurnFlag = false;
                }
                chackpoint(100, 100, mx, my);
                break;
            case 1:
                if (TurnFlag == true) {
                    turn(0 - getRotation());
                    turn((int) calcTurnDegrees(getX(), getY(), 100, 800));
                    TurnFlag = false;
                }
                chackpoint(100, 800, mx, my);
                break;
            case 2:
                if (TurnFlag == true) {
                    turn(0 - getRotation());
                    turn((int) calcTurnDegrees(getX(), getY(), 1100, 800));
                    TurnFlag = false;
                }
                chackpoint(1100, 800, mx, my);
                break;
            case 3:
                if (TurnFlag == true) {
                    turn(0 - getRotation());
                    turn((int) calcTurnDegrees(getX(), getY(), 1100, 100));
                    TurnFlag = false;
                }
                chackpoint(1100, 100, mx, my);
                break;
            case 4:
                motion = 0;
                TurnFlag = true;
                break;
            default:
                break;
        }
        move(MovementSpeed);
        checkFire();
    }
}
