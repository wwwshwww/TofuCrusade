
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Enemy extends Tofu {

    List<Player> players;
    List<Enemy> Enemys;

    int motion = 0;
    boolean TurnFlag = true;

    public Enemy() {
        team = 3;

        BulletSize = 15;
        BulletColor = new Color(255, 255, 255);
        MovementSpeed = 1.5;
        BulletSpeed = 6;
        BulletDurability = 10;
        BulletPower = 10;
        FireRate = 30;
        FullLife = 50;

    }

    public Enemy(int level) {
        this();
        Level = level;
    }

    @Override
    public void addedToWorld(World world) {
        super.addedToWorld(world);
    }

    @Override
    public void act() {
        players = getPlayer();
        if (!players.isEmpty()) {
            enemAct();
            checkKilled();
        }
    }

//基本的にはここをオーバーライドすること
////////////////////////////////////////////////////////////////////////
    public void enemAct() {
        turnToPlayer();
        checkFire();
    }

////////////////////////////////////////////////////////////////////////
    public void checkFire() {
        if (world.time % FireRate == 0) {
            shot();
        }
    }

    public void turnToPlayer() {
        double pAngle = normalRelativeAngle(getAngleToPlayer());
        if (pAngle > 0) {
            turn(1);
        } else if (pAngle < 0) {
            turn(-1);
        }
    }

    public void turnTo(double degrees) {
        double angle = normalRelativeAngle(Math.toRadians(degrees - getRotation()));
        if (angle > 0) {
            turn(1);
        } else if (angle < 0) {
            turn(-1);
        }
    }

    public double getAngleToPlayer() {
        players = getPlayer();
        if (!players.isEmpty()) {
            double toX = players.get(0).getX() - getX();
            double toY = players.get(0).getY() - getY();
            return Math.atan2(toY, toX) - Math.toRadians(getRotation());
        } else {
            return 0;
        }
    }

    public List<Player> getPlayer() {
        return world.getObjects(Player.class);
    }

    public List<Enemy> getEnemy() {
        return world.getObjects(Enemy.class);
    }

    public double getAngleToEnemy() {
        Enemys = getEnemy();
        if (!Enemys.isEmpty()) {
            double toX = Enemys.get(0).getX() - getX();
            double toY = Enemys.get(0).getY() - getY();
            return Math.atan2(toY, toX) - Math.toRadians(getRotation());
        } else {
            return 0;
        }
    }

    public void turnToEnemy() {
        while (true) {
            int eAngle = (int) normalRelativeAngle(getAngleToEnemy());
            if (eAngle > 0) {
                turn(1);
            } else if (eAngle < 0) {
                turn(-1);
            } else {
                break;
            }
        }
    }

    public double getDistanceToPlayer() {
        players = getPlayer();
        if (!players.isEmpty()) {
            double toX = players.get(0).getX() - getX();
            double toY = players.get(0).getY() - getY();
            return Math.sqrt(toX * toX + toY * toY);

        } else {
            return 0;
        }
    }

    public double getDistanceToEnemy() {
        Enemys = getEnemy();
        if (!Enemys.isEmpty()) {
            double toX = Enemys.get(0).getX() - getX();
            double toY = Enemys.get(0).getY() - getY();
            return Math.sqrt(toX * toX + toY * toY);

        } else {
            return 0;
        }
    }

    public void chackpoint(double x, double y, double mx, double my) {
        
        if ((x - mx) <= MovementSpeed * 3 && (x - mx) >= 0 && (y - my) <= MovementSpeed * 3 && (y - my) >= 0) {
            //++
            TurnFlag = true;
            motion++;
        } else if ((x - mx) <= MovementSpeed * 3 && (x - mx) >= 0 && (y - my) >= -MovementSpeed * 3 && (y - my) <= 0) {
            //+-
            TurnFlag = true;
            motion++;
        } else if ((x - mx) >= -MovementSpeed * 3 && (x - mx) <= 0 && (y - my) <= MovementSpeed * 3 && (y - my) >= 0) {
            //-+
            TurnFlag = true;
            motion++;
        } else if ((x - mx) >= -MovementSpeed * 3 && (x - mx) <= 0 && (y - my) >= -MovementSpeed * 3 && (y - my) <= 0) {
            //--
            TurnFlag = true;
            motion++;

        }
    }

    public void checkTurn(double a) {
        double mA = getRotation();
        if (mA == a) {
            motion++;
        }
    }

    public double calcTurnDegrees(double x, double y, double x2, double y2) {
        double radian = Math.atan2(y2 - y, x2 - x);
        double degree = Math.round(Math.toDegrees(radian));
        return degree;
    }

}
