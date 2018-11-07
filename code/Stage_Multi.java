
import greenfoot.Greenfoot;


public class Stage_Multi extends Battlefield{
    
    Player p1, p2;
    Player winner;
    boolean winFlg;
    
    public Stage_Multi(Player p1, Player p2){
        this.p1 = p1;
        this.p2 = p2;
        p1.setRotation(0);
        p2.setRotation(180);
        p1.pausable = false;
        p2.pausable = false;
        
        addObject(p1, 150, getHeight() / 2);
        addObject(p2, getWidth() - 150, getHeight() / 2);
    }
    
    @Override
    public void act(){
        time ++;
        showText(Long.toString(time), 30, 30);
        bulleting();
        checkWinner();
    }
    
    public void checkWinner(){
        if(getObjects(Player.class).size() == 1 && !winFlg){
            winFlg = true;
            clearTime = time + TIME_INTERVAL;
            winner = getObjects(Player.class).get(0);
        }
        if(winFlg && time >= clearTime){
            Greenfoot.setWorld(new Scene_WinOnMulti(winner));
        }
    }
}
