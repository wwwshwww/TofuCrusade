
import greenfoot.*;

public class Button_GotoBattle_pre extends Button {
    
    Player player;
    int stage;
    
    public Button_GotoBattle_pre(Player player, int stage) {
        this.stage = stage;
        this.player = player;
        setButtomImages();
        setImage(imageDefault);
    }
    
    @Override
    public void doOnClicked(){
        switch(stage){
            case 0: Greenfoot.setWorld(new MyWorld(player)); break;
            case 1: Greenfoot.setWorld(new Stage1(player)); break;
            case 2: Greenfoot.setWorld(new Stage2(player)); break;
            case 3: Greenfoot.setWorld(new Stage3(player)); break;
            case 4: Greenfoot.setWorld(new Stage4(player)); break;
            case 5: Greenfoot.setWorld(new Stage5(player)); break;
            case 6: Greenfoot.setWorld(new Stage6(player)); break;
            case 7: Greenfoot.setWorld(new Stage7(player)); break;
            case 8: Greenfoot.setWorld(new Stage8(player)); break;
            case 9: Greenfoot.setWorld(new Stage9(player)); break;
            case 10: Greenfoot.setWorld(new Stage10(player)); break;
            case 11: Greenfoot.setWorld(new Stage11(player)); break;
            case 12: Greenfoot.setWorld(new Stage12(player)); break;
            case 13: Greenfoot.setWorld(new Stage13(player)); break;
            case 14: Greenfoot.setWorld(new Stage14(player)); break;
            case 15: Greenfoot.setWorld(new Stage15(player)); break;
            case 16: Greenfoot.setWorld(new Stage16(player)); break;
            case 17: Greenfoot.setWorld(new Stage17(player)); break;
            case 18: Greenfoot.setWorld(new Stage18(player)); break;
        }
    }
    
    @Override
    public void setImageDefault() {
        imageDefault = new GreenfootImage(100,100);
        imageDefault.setColor(new Color(255,255,255,170));
        imageDefault.drawRect(0, 0, imageDefault.getWidth()-1, imageDefault.getHeight()-1);
        imageDefault.drawString("Stage "+Integer.toString(stage), 5, 15);
    }

    @Override
    public void setImageMouseOn() {
        imageMouseOn = new GreenfootImage(100,100);
        imageMouseOn.setColor(new Color(255,255,255,170));
        imageMouseOn.drawRect(0, 0, imageDefault.getWidth()-1, imageDefault.getHeight()-1);
        imageMouseOn.drawString("Stage "+Integer.toString(stage), 5, 15);
        imageMouseOn.setColor(new Color(255, 255, 255, 50));
        imageMouseOn.fill();
    }

    @Override
    public void setImageClicked() {
        imageClicked = new GreenfootImage(100,100);
        imageClicked.setColor(new Color(255,255,255,170));
        imageClicked.drawString("Stage "+Integer.toString(stage), 5, 15);
        imageClicked.fill();
    }
}
