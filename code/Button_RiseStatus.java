
import greenfoot.*;

public class Button_RiseStatus extends Button {

    int mode; // 0:体力, 1:攻撃力, 2:弾速, 3:攻撃速度, 4:移動速度 5:弾耐久 /-6:防御力 7:魔力 8:魔法防御-/
    Player owner;

    public Button_RiseStatus(Player owner, int mode) {
        this.owner = owner;
        this.mode = mode;
        setButtomImages();
        setImage(imageDefault);
    }

    @Override
    public void doOnClicked() {
        if (owner.StatusPoint > 0) {
            switch (mode) {
                case 0:
                    if (owner.SP_FullLife < 100) {
                        owner.SP_FullLife++;
                        owner.StatusPoint--;
                    }
                    break;
                case 1:
                    if (owner.SP_BulletPower < 100) {
                        owner.SP_BulletPower++;
                        owner.StatusPoint--;
                    }
                    break;
                case 2:
                    if (owner.SP_BulletDurability < 100) {
                        owner.SP_BulletDurability++;
                        owner.StatusPoint--;
                    }
                    break;
                case 3:
                    if (owner.SP_BulletSpeed < 100) {
                        owner.SP_BulletSpeed++;
                        owner.StatusPoint--;
                    }
                    break;
                case 4:
                    if (owner.SP_FireRate < 100) {
                        owner.SP_FireRate++;
                        owner.StatusPoint--;
                    }
                    break;
                case 5:
                    if (owner.SP_MovementSpeed < 100) {
                        owner.SP_MovementSpeed++;
                        owner.StatusPoint--;
                    }
                    break;
            }
            owner.setStatuses();
        }
    }

    @Override
    public void setImageDefault() {
        imageDefault = new GreenfootImage("StatusButtonWhite.bmp");
    }

    @Override
    public void setImageMouseOn() {
        imageMouseOn = new GreenfootImage("StatusButtonWhite.bmp");
        imageMouseOn.setColor(new Color(255, 255, 255, 170));
        imageMouseOn.fill();
    }

    @Override
    public void setImageClicked() {
        imageClicked = new GreenfootImage("StatusButtonWhite.bmp");
        imageClicked.setColor(new Color(255, 255, 255, 220));
        imageClicked.fill();
    }

    public void checkDelete() {
        getWorld().removeObject(this);
    }
}
