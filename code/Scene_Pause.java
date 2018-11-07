
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PauseScreen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scene_Pause extends Scene {

    boolean isResume;
    boolean isGotoRiseStatus;

    public Scene_Pause() {
        setBackground("PauseScreen.bmp");
    }

    public Scene_Pause(World preStage, Player player) {
        this();
        this.preWorld = preStage;
        this.player = player;
        isResume = false;
        Button bips = new Button_GotoStatuses(player);
        addObject(bips, getWidth() / 2, 600);
        Button bss = new Button_GotoSelectStage(player);
        addObject(bss, getWidth() / 2, 700);
    }

    @Override
    public void act() {
        checkResumeKey();
    }

    public void checkResumeKey() {
        if (Greenfoot.isKeyDown("escape")) {
            Greenfoot.setWorld(preWorld);
            Greenfoot.delay(10);
        }
    }
    
}
