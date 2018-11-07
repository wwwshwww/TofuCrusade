
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RiseStatus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scene_Statuses extends Scene {
    
    public Scene_Statuses() {
        setBackground("BlackBack.bmp");
    }
    
    public Scene_Statuses(World preWorld, Player player){
        this();
        this.preWorld = preWorld;
        this.player = player;
        Label_SP showSP = new Label_SP(player);
        addObject(showSP, 190, 20);
        Button_RiseStatus[] status = new Button_RiseStatus[6];
        Label_Statuseslabel[] ssl = new Label_Statuseslabel[6];
        Label_Statuses[] ss = new Label_Statuses[6];
        for(int i=0; i<status.length; i++){
            status[i] = new Button_RiseStatus(player, i);
            addObject(status[i], 400, 70+i*50);
            ssl[i] = new Label_Statuseslabel(i);
            addObject(ssl[i], 130, 70+i*50);
            ss[i] = new Label_Statuses(player, i);
            addObject(ss[i], 240, 70+i*50);
        }
        
        
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
