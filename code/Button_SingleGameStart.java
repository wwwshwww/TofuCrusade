
import greenfoot.Greenfoot;


public class Button_SingleGameStart extends Button{
    
    Player player;
    
    public Button_SingleGameStart(){
        this.player = new Player_Daizu();
        buttonText = "New Tofu";
        setButtomImages();
        setImage(imageDefault);
    }
    
    public Button_SingleGameStart(Player player){
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
