
import java.util.List;

public class Enemy_SubBoss extends Enemy {

    List<Enemy> Enemys;
    List<Player> Players;

    boolean mflag = false;

    public Enemy_SubBoss() {
        BulletSize = 10;
        MovementSpeed = 1;
        BulletDurability = 1;
        BulletSpeed = 7;
        BulletPower = 20;
        FireRate = 30;
        FullLife = 500;
    }

    public Enemy_SubBoss(int level) {
        this();
        Level = level;
    }
    
    private void changeMotion() {
        Enemys = getEnemy();
        if (Enemys.size() <= 1 && mflag == false || Life <= FullLife * 3 / 4
                && mflag == false) {
            mflag = true;

            this.BulletSpeed = 7;
            this.BulletPower = 20;
            this.FireRate = 10;
        }
    }

    @Override
    public void shot() {
        if (mflag == true) {
            Enemys = getEnemy();
            double rad = 0;
            for (Enemy EnemyList : Enemys) {
                double toX = EnemyList.getX() - getX();
                double toY = EnemyList.getY() - getY();
                rad = Math.toDegrees(Math.atan2(toY, toX)) - getRotation();
            }
            fire(rad, 25, 0);
            fire(rad, -50, 0);

        } else {
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
        }
    }

    @Override
    public void enemAct() {

        changeMotion();
        if (mflag == false) {
            turnToEnemy();
            move(getDistanceToEnemy() + 10);
        } else {
            turnToPlayer();
            move(getDistanceToPlayer() + 10);
        }
        checkFire();
    }

}
