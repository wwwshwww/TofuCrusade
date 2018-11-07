import greenfoot.*;

public class Label_SP extends Actor{
    Player owner;
    GreenfootImage image;
    Color stringColor;
    Color bgColor;
    String level;
    
    public Label_SP(Player owner){
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
        level = "残りステータスポイント：" + String.valueOf(owner.StatusPoint);
        image = new GreenfootImage(level, 30, stringColor, bgColor);
        setImage(image);
    }
}
