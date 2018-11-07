
import greenfoot.*;

public class Button_GotoSelectStage extends Button{
    Player player;
    World world;
    
    public Button_GotoSelectStage(Player player){
        this.player = player;
        buttonText = "ステージ選択画面へ";
        setButtomImages();
        setImage(imageDefault);
    }
    
    @Override
    public void addedToWorld(World world){
        this.world = world;
    }
    
    @Override
    public void doOnClicked(){
        Greenfoot.setWorld(new Scene_SelectStage(player));
    }
}
