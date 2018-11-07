
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.Serializable;

/**
 * Write a description of class Tofu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tofu extends Actor{

    int Level;
    int BulletSize;
    int BulletLifetime;
    double BulletDurability;
    double BulletSpeed;
    double BulletPower;
    double FireRate;
    double MovementSpeed;
    double FullLife;
    double Life;
    double X, Y;
    long TotalEXP;
    long IncludeEXP;
    int team;
    Color BulletColor;
    Battlefield world;
    Bar_HP myBar;
    Label_Level showLev;

    public Tofu() {
        IncludeEXP = 15000;
        Level = 1;
        team = 1;
        BulletColor = new Color(0, 255, 0);
        BulletLifetime = 300;
    }

    @Override
    protected void addedToWorld(World world) {
        this.world = (Battlefield)world;
        X = getX();
        Y = getY();
        Life = FullLife;
        myBar = new Bar_HP((Tofu) this);
        showLev = new Label_Level((Tofu) this);
        world.addObject(myBar, getX(), getY() - 60);
        world.addObject(showLev, getX() - 100, getY() - 60);
    }

    public void move(double amount) {
        double angle = Math.toRadians(getRotation());
        double vectorX = Math.cos(angle) * amount;
        double vectorY = Math.sin(angle) * amount;
        if (isInsideWorld(X + vectorX, Y + vectorY)) {
            X += vectorX;
            Y += vectorY;
        } else if (isInsideWorld(X + vectorX, Y)) {
            X += vectorX;
        } else if (isInsideWorld(X, Y + vectorY)) {
            Y += vectorY;
        }
        setLocation((int) X, (int) Y);
    }

    public boolean isInsideWorld(double x, double y) {
        return x >= 0 && x < world.getWidth()
                && y >= 0 && y < world.getHeight();
    }

    public static double normalRelativeAngle(double angle) {
        double PI = Math.PI;
        double TWO_PI = PI * 2;
        if ((angle %= TWO_PI) >= 0) {
            if (angle < PI) {
                return angle;
            } else {
                return angle - TWO_PI;
            }
        } else {
            if (angle >= -PI) {
                return angle;
            } else {
                return angle + TWO_PI;
            }
        }
    }

    @Override
    public void act() {
        checkKilled();
    }

    public void checkKilled() {
        if (Life <= 0) {
            world.removeObject(this);
            world.removeObject(myBar);
            world.removeObject(showLev);
        }
    }

    public void shot() {
        fire(Greenfoot.getRandomNumber(10) - 5, 50, 0);
    }

    public void fire(double addAngle, double addX, double addY) {
        double calcAngle = Math.atan2(addY, addX) + Math.toRadians(getRotation());
        double range = Math.sqrt((addX * addX) + (addY * addY));
        double bx = getX() + range * Math.cos(calcAngle);
        double by = getY() + range * Math.sin(calcAngle);
        double bulletAngle = Math.toRadians(getRotation() + addAngle);
        Bullet bullet = new Bullet(this, bx, by, bulletAngle);
        world.addObject(bullet, (int) bx, (int) by);
    }
}
