
import greenfoot.Color;

public class Enemy_Stage02 extends Enemy{
    
    
    boolean turnFlg;
    public int time;

    public Enemy_Stage02() {
        MovementSpeed = 1.0;
        BulletSpeed = 2;
        BulletSize = 15;
        BulletColor = new Color(255, 255, 255);
        BulletPower = 10;
        FireRate = 250;
        Life = 30;
        team = 3;

    }


    @Override
    public void act() {
        players = getPlayer();
        if (!players.isEmpty()) {
            enemAct();
        }
    }
    
    @Override
    public void enemAct(){
        turnTo(0);
        move(1.0);
        checkFire();
        checkKilled();

    }
    
    public void checkFire() {
        time++;
        if (time > FireRate) {       
            fire(90, 0, 0);
            fire(90, 20, 0);
            fire(90, 40, 0);
            time = 0;
        }
    }
    
    

}
   
    

