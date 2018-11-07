
import greenfoot.*;
import java.util.List;

public class Enemy_FinalBoss extends Enemy {

    private int num = 0;
    private int motion = 1;
    boolean mflag = false;
    public double y[] = {0, 7, 13, 18, 13, 7};
    public int i = 0;

    List<Player> Players;

    public Enemy_FinalBoss() {
        setImage("S0.png");
        
        MovementSpeed = 1.0;
        BulletSpeed = 3.5;
        BulletSize = 10;
        BulletColor = new Color(0, 255, 100);
        BulletPower = 30;
        FireRate = 100;
        FullLife = 800;
        IncludeEXP = 50000;
    }

    public Enemy_FinalBoss(int level) {
        this();
        Level = level;
    }

    private void changeMotion() {
        Enemys = getEnemy();
        if (Enemys.size() <= 1 && mflag == false) {
            num = 0;
            mflag = true;
            this.FireRate = 5;
            this.BulletPower = 15;
        }
    }

    @Override
    public void shot() {
        if (mflag == false) {
            Players = getPlayer();
            for (Player PlayerList : Players) {
                double toX = PlayerList.getX() - getX();
                double toY = PlayerList.getY() - getY();

                fire(210, toX + 200, toY + 200);
                fire(210, toX + 230, toY + 230);
                fire(210, toX + 260, toY + 260);
                fire(90, toX, toY - 200);
                fire(90, toX, toY - 230);
                fire(90, toX, toY - 260);
                fire(330, toX - 200, toY + 200);
                fire(330, toX - 230, toY + 230);
                fire(330, toX - 260, toY + 260);
            }
        } else if (mflag == true) {
            if (i >= 6) {
                i = 0;
            }
            fire(0, 20, y[i]);
            fire(0, 20, -y[i]);
            i++;
        }
    }

    @Override
    public void enemAct() {
        num++;
        changeMotion();
        if (mflag == true) {
            switch (motion) {
                case 1:
                    move(MovementSpeed);
                    break;
                case 2:
                    move(-MovementSpeed);
                    break;
                default:
                    break;
            }
            switch (num) {
                case 160:
                    motion = 2;
                    break;
                case 320:
                    motion = 1;
                    num = 0;
                    break;
                default:
                    break;
            }
            turnToPlayer();
        }
        checkFire();
    }
}
