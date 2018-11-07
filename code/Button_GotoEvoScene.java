
import greenfoot.*;

public class Button_GotoEvoScene extends Button{
    Player player;
    World world;
    
    public Button_GotoEvoScene(Player player){
        this.player = player;
        buttonText = "進化させる";
        setButtomImages();
        setImage(imageDefault);
    }
    
    @Override
    public void addedToWorld(World world){
        this.world = world;
    }
    
    @Override
    public void doOnClicked(){
        Greenfoot.setWorld(new Scene_Evolution(player));
    }
}
