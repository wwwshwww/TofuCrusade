
import greenfoot.*;

public class Label_Statuseslabel extends Actor{
    int mode; // 0:体力, 1:攻撃力, 2:弾速, 3:攻撃速度, 4:移動速度 5:弾耐久 /-6:防御力 7:魔力 8:魔法防御-/
    GreenfootImage image;
    Color stringColor;
    Color bgColor;
    String str;

    public Label_Statuseslabel(int mode){
        this.mode = mode;
        stringColor = new Color(255,255,255);
        bgColor = new Color(0, 0, 0, 0);
        show();
    }
    
    public void show(){
        switch (mode) {
            case 0:
                str = "体力：　　 ";
                break;
            case 1:
                str = "弾殺傷力： ";
                break;
            case 2:
                str = "対弾性能： ";
                break;
            case 3:
                str = "弾速：　　 ";
                break;
            case 4:
                str = "連射性能： ";
                break;
            case 5:
                str = "移動速度： ";
                break;
        }
        image = new GreenfootImage(str, 36, stringColor, bgColor);
        setImage(image);
    }
}
