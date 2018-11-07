
import greenfoot.*;

public final class Bar_EXP extends Actor{

    Player owner;
    int preLevel;
    double fullEXP;
    double barLength;
    double n;
    final int MAX_LENGTH = 100;
    Color color;
    GreenfootImage image;

    public Bar_EXP(Player owner) {
        this.owner = owner;
        image = new GreenfootImage(MAX_LENGTH, 5);
        color = new Color(0, 200, 255);
        owner.checkLevelUp();
        setLength();
    }

    @Override
    public void act() {
        setLocation(owner.getX(), owner.getY() - 50);
        owner.checkLevelUp();
        setLength();
    }

    public void setLength() {
        int preExp = 0;
        fullEXP = (owner.Level * owner.Level) * 10;
        for (int i = 1; i < owner.Level; i++) {
            preExp += (i * i) * 10;
        }
        n = (owner.TotalEXP - preExp) / fullEXP;
        barLength = MAX_LENGTH * n;
        image.clear();
        image.setColor(color);
        image.fillRect(0, 0, (int) barLength, 5);
        setImage(image);
    }
}
