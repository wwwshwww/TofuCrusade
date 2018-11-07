
import greenfoot.*;
import java.util.List;

/**
 * Write a description of class Sekiya here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player_Sekiya extends Player {

    public Player_Sekiya() {
        BulletSize = 5;
        BulletColor = new Color(255, 0, 0);
        
        default_MovementSpeed = 3;
        default_BulletDurability = 3;
        default_BulletPower = 3;
        default_BulletSpeed = 8;
        default_FireRate = 12;
        default_FullLife = 500;
        setStatuses();
    }

    public Player_Sekiya(int p) {
        this();
        mode_2p = true;
    }

    @Override
    public void shot() {
        List<Tofu> tofuList = world.getObjects(Tofu.class);
        double rad = 0;
        double eneX = 0, eneY = 0;
        for (Tofu tofu : tofuList) {
            if (tofu != this) {
                eneX = tofu.X;
                eneY = tofu.Y;
                double toX = tofu.getX() - getX();
                double toY = tofu.getY() - getY();
                rad = Math.toDegrees(Math.atan2(toY, toX)) - getRotation();
            }
        }
        fire(rad, 25, 0);
//        List<Bullet> myBullet = world.getObjects(Bullet.class);
//
//        double brad = rad;
//        for (Bullet bullet : myBullet) {
//            double vecX = eneX - bullet.X;
//            double vecY = eneY - bullet.Y;
//            brad = Math.atan2(vecY, vecX);
//            bullet.angle = brad;
//        }
    }

}
