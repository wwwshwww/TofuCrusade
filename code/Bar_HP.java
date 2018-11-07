
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bar_HP extends Actor {

    double fullLife;
    double barLength;
    double n;
    double cn;
    final double MAX_LENGTH = 100;
    GreenfootImage image;
    Tofu owner;

    public Bar_HP(Tofu owner) {
        image = new GreenfootImage((int)MAX_LENGTH, 10);
        this.owner = owner;
        show();
    }

    @Override
    public void act() {
        show();
    }
    
    public void show(){
        fullLife = owner.FullLife;
        n = MAX_LENGTH / fullLife;
        cn = 255 / (fullLife/2);
        Color color;
        if(owner.Life > fullLife / 2){
            double rr = Math.min(255, 255 - (fullLife - owner.Life) * cn);
            color = new Color(255-(int)rr, 255, 0);
        }else{
            double gg = 510 - (fullLife - owner.Life) * cn;
            color = new Color(255, (int)gg, 0);
        }
        barLength = MAX_LENGTH - (fullLife - owner.Life) * n;
        image.clear();
        setLocation(owner.getX(), owner.getY() - 60);
        image.setColor(color);
        image.fillRect(0, 0, (int) barLength, 10);
        setImage(image);
    }
}
