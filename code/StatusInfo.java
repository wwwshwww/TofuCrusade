
import java.io.Serializable;

public class StatusInfo implements Serializable{
    String Class;
    long TotalEXP;
    int Level;
    int StatusPoint;
    int SP_FireRate, SP_MovementSpeed, SP_BulletSpeed, SP_BulletPower, SP_BulletDurability, SP_FullLife;
    
    public StatusInfo(Player player){
        Class = player.getClass().getSimpleName();
        Level = player.Level;
        StatusPoint = player.StatusPoint;
        TotalEXP = player.TotalEXP;
        SP_FireRate = player.SP_FireRate;
        SP_MovementSpeed = player.SP_MovementSpeed;
        SP_BulletSpeed = player.SP_BulletSpeed;
        SP_BulletPower = player.SP_BulletPower;
        SP_BulletDurability = player.SP_BulletDurability;
        SP_FullLife = player.SP_FullLife;
    }
}
