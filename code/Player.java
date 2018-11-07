
import greenfoot.*;

public class Player extends Tofu{

    long time;
    int LevelLength;
    int StatusPoint;
    //
    int SP_FireRate, SP_MovementSpeed, SP_BulletSpeed, SP_BulletPower, SP_BulletDurability, SP_FullLife;
    //
    int default_FireRate;
    double default_MovementSpeed;
    double default_BulletSpeed;
    double default_BulletPower;
    double default_BulletDurability;
    double default_FullLife;
    //
    boolean mode_2p;
    boolean pausable;
    String key_ahead, key_back, key_rTurn, key_lTurn, key_fire;
    Bar_EXP myBarExp;

    public Player() {
        pausable = true;
        mode_2p = false;
        BulletSize = 15;
        BulletColor = new Color(0, 255, 0);
        IncludeEXP = 0;

        default_FireRate = 30;
        default_MovementSpeed = 2;
        default_BulletSpeed = 12;
        default_BulletPower = 40;
        default_BulletDurability = 20;
        default_FullLife = 150;
        setStatuses();
        setLevelLength();
    }

    public Player(int p) {
        this();
        mode_2p = true;
    }
    
    public void setStatusInfo(StatusInfo info){
        Level = info.Level;
        StatusPoint = info.StatusPoint;
        TotalEXP = info.TotalEXP;
        SP_BulletDurability = info.SP_BulletDurability;
        SP_BulletPower = info.SP_BulletPower;
        SP_BulletSpeed = info.SP_BulletSpeed;
        SP_FireRate = info.SP_FireRate;
        SP_FullLife = info.SP_FullLife;
        SP_MovementSpeed = info.SP_MovementSpeed;
        setStatuses();
        setLevelLength();
    }

    @Override
    protected void addedToWorld(World world) {
        setStatuses();
        checkLevelUp();
        super.addedToWorld(world);
        myBarExp = new Bar_EXP(this);
        world.addObject(myBarExp, getX(), getY() - 50);

        if (mode_2p) {
            key_ahead = "up";
            key_back = "down";
            key_rTurn = "right";
            key_lTurn = "left";
            key_fire = "enter";
            team = 2;
        } else {
            key_ahead = "w";
            key_back = "s";
            key_rTurn = "d";
            key_lTurn = "a";
            key_fire = "space";
            team = 1;
        }
    }

    @Override
    public void act() {
        checkLevelUp();
        checkMove();
        checkTurn();
        checkFire();
        checkKilled();
        checkPaused();
    }

    public void setStatuses() {
        MovementSpeed = default_MovementSpeed + default_MovementSpeed * SP_MovementSpeed * 0.025;
        BulletSpeed = default_BulletSpeed + default_BulletSpeed * SP_BulletSpeed * 0.025;
        BulletPower = default_BulletPower + default_BulletPower * SP_BulletPower * 0.04;
        BulletDurability = default_BulletDurability + default_BulletDurability * SP_BulletDurability * 0.04;
        FullLife = default_FullLife + default_FullLife * SP_FullLife * 0.05;
        FireRate = (int)(default_FireRate - (default_FireRate*0.8) * SP_FireRate * 0.01);
    }

    public void checkPaused() {
        if (pausable && Greenfoot.isKeyDown("escape")) {
            Greenfoot.setWorld(new Scene_Pause(world, this));
            Greenfoot.delay(10);
        }
    }

    public void setLevelLength() {
        LevelLength = 0;
        for(int i=Level; i>0; i--){
            LevelLength += i*i*10;
        }
    }

    public void checkLevelUp() {
        if (TotalEXP >= LevelLength) {
            Level++;
            StatusPoint += 2;
            setLevelLength();
            checkLevelUp();
        }
    }

    public void checkMove() {
        if (Greenfoot.isKeyDown(key_ahead)) {
            move(MovementSpeed);
        } else if (Greenfoot.isKeyDown(key_back)) {
            move(-MovementSpeed);
        }
    }

    public void checkTurn() {
        if (Greenfoot.isKeyDown(key_rTurn)) {
            turn(1);
        } else if (Greenfoot.isKeyDown(key_lTurn)) {
            turn(-1);
        }
    }

    public void checkFire() {
        time++;
        if (Greenfoot.isKeyDown(key_fire) && time >= FireRate) {
            shot();
            time = 0;
        }
    }

    @Override
    public void checkKilled() {
        if (Life <= 0) {
            world.removeObject(this);
            world.removeObject(myBar);
            world.removeObject(myBarExp);
            world.removeObject(showLev);
        }
    }
}
