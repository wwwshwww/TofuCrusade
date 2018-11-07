
import greenfoot.*;

public class Button_GotoStatuses extends Button{
    Player player;
    World world;
    
    public Button_GotoStatuses(Player player){
        this.player = player;
        buttonText = "ステータス画面へ";
        setButtomImages();
        setImage(imageDefault);
    }
    
    @Override
    public void addedToWorld(World world){
        this.world = world;
    }
    
    @Override
    public void doOnClicked(){
        Greenfoot.setWorld(new Scene_Statuses(world, player));
    }
}
