
import greenfoot.Actor;
import greenfoot.Color;
import greenfoot.GreenfootImage;
import greenfoot.World;
import java.util.List;

/**
 * Write a description of class Bullet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bullet extends Actor {

    int width;
    int height;
    long Lifetime;
    double X, Y;
    double angle;
    double speed;
    double power;
    double durability;
    Color color;
    World w;
    Tofu shooter;
    GreenfootImage image;
    List<Bullet> colList;

    public Bullet(Tofu t, double PosX, double PosY, double angle) {
        shooter = t;
        w = shooter.getWorld();
        X = PosX;
        Y = PosY;
        Lifetime = shooter.world.time + shooter.BulletLifetime;
        speed = shooter.BulletSpeed;
        power = shooter.BulletPower;
        durability = shooter.BulletDurability;
        width = shooter.BulletSize + shooter.BulletSize * (int)(speed * 0.35);
        height = shooter.BulletSize;
        color = shooter.BulletColor;
        this.angle = angle;

        image = new GreenfootImage(width + 1, height + 1);
        image.setColor(color);
        image.fillOval(0, 0, width, height);
        image.setColor(Color.DARK_GRAY);
        image.drawOval(0, 0, width, height);
        setImage(image);
        setRotation((int) Math.toDegrees(angle));
    }

    @Override
    public void addedToWorld(World world) {
        colList = getIntersectingObjects(Bullet.class);
    }

    @Override
    public void act() {
        bulletTrajectory();
        bulletCollision();
        checkHit();
        bulletKill();
    }

    public void bulletTrajectory() {
        double vectorX = Math.cos(angle) * speed;
        double vectorY = Math.sin(angle) * speed;
        X += vectorX;
        Y += vectorY;
        setLocation((int) X, (int) Y);
    }

    public void bulletCollision() {
        colList = getIntersectingObjects(Bullet.class);
        if (!colList.isEmpty()) {
            for (Bullet bullet : colList) {
                if (!bullet.colList.contains(this)
                        && bullet.shooter.team != shooter.team
                        && durability > 0 && bullet.durability > 0) {
                    double tempDura = bullet.durability;
                    bullet.durability -= durability;
                    durability -= tempDura;
                }
            }
        }
    }

    public void checkHit() {
        Tofu hitTofu = (Tofu) getOneIntersectingObject(Tofu.class);
        if (hitTofu != null && hitTofu.team != shooter.team && power > 0 && durability > 0) {
            hitTofu.Life -= power;
            power = 0;
            if (hitTofu.Life <= 0) {
                shooter.TotalEXP += hitTofu.IncludeEXP;
                hitTofu.checkKilled();
            }
        }
    }

    public void bulletKill() {
        if ((power <= 0 || durability <= 0) || isAtEdge() || shooter.world.time >= Lifetime) {
            w.removeObject(this);
        }
    }

}
