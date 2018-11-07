
import greenfoot.Greenfoot;


public class Button_ResumeGameStart extends Button{
    
    Player player;
    
    public Button_ResumeGameStart(Player player){
        this.player = player;
        buttonText = "Resume Tofu";
        setButtomImages();
        setImage(imageDefault);
    }
    
    @Override
    public void doOnClicked(){
        Greenfoot.setWorld(new Scene_SelectStage(player));
    }
}
