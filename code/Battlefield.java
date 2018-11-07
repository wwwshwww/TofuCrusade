
import greenfoot.*;
import java.util.List;

public class Battlefield extends World{
    
    Player player;
    long time;
    long clearTime;
    long gameoverTime;
    boolean clear;
    boolean gameover;
    final int TIME_INTERVAL = 30;
    
    public Battlefield(){
        super(1200, 900, 1);
        setBackground("Back.png");
        clear = false;
        gameover = false;
    }
    
    public Battlefield(Player player){
        this();
        this.player = player;
        player.setRotation(0);
    }
    
    @Override
    public void act(){
        time ++;
        showText(Long.toString(time), 30, 30);
        bulleting();
        checkStageClear();
        checkGameover();
    }
    
    public void bulleting(){
        for (Bullet bullet : getObjects(Bullet.class)) {
            if(!bullet.colList.isEmpty()) bullet.colList.clear();
        }
    }
    
    public void checkStageClear(){
        if(getObjects(Enemy.class).isEmpty() && !clear){
            clear = true;
            clearTime = time + TIME_INTERVAL;
        }
        if(clear && time >= clearTime){
            Greenfoot.setWorld(new Scene_StageClear(player));
        }
    }
    
    public void checkGameover(){
        if(getObjects(Player.class).isEmpty() && !gameover){
            gameover = true;
            gameoverTime = time + TIME_INTERVAL;
        }
        if(gameover && time >= gameoverTime){
            Greenfoot.setWorld(new Scene_GameOver(player));
        }
    }
}
