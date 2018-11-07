
import greenfoot.*;

public class Label_Statuses extends Actor{
    int mode; // 0:体力, 1:攻撃力, 2:弾速, 3:攻撃速度, 4:移動速度 5:弾耐久 /-6:防御力 7:魔力 8:魔法防御-/
    Player owner;
    GreenfootImage image;
    Color stringColor;
    Color bgColor;
    String str;

    public Label_Statuses(Player owner, int mode){
        this.mode = mode;
        this.owner = owner;
        stringColor = new Color(255,255,255);
        bgColor = new Color(0, 0, 0, 0);
        show();
    }
    
    @Override
    public void act(){
        show();
    }
    
    public void show(){
        switch (mode) {
            case 0:
                str = Integer.toString(owner.SP_FullLife);
                break;
            case 1:
                str = Integer.toString(owner.SP_BulletPower);
                break;
            case 2:
                str = Integer.toString(owner.SP_BulletDurability);
                break;
            case 3:
                str = Integer.toString(owner.SP_BulletSpeed);
                break;
            case 4:
                str = Integer.toString(owner.SP_FireRate);
                break;
            case 5:
                str = Integer.toString(owner.SP_MovementSpeed);
                break;
        }
        image = new GreenfootImage(str, 36, stringColor, bgColor);
        setImage(image);
    }
}
