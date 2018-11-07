import greenfoot.*;

public class Label_Level extends Actor{
    Tofu owner;
    GreenfootImage image;
    Color stringColor;
    Color bgColor;
    String level;
    
    public Label_Level(Tofu owner){
        this.owner = owner;
        stringColor = new Color(255,255,255);
        bgColor = new Color(0, 0, 0, 0);
        show();
    }
    
    @Override
    public void act(){
        setLocation(owner.getX() - 100, owner.getY() - 60);
        show();
    }
    
    public void show(){
        level = "Lv." + String.valueOf(owner.Level);
        image = new GreenfootImage(level, 36, stringColor, bgColor);
        setImage(image);
    }
}
