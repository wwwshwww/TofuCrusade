
import greenfoot.Greenfoot;
import greenfoot.GreenfootSound;


public class Button_GotoSingleMode extends Button{

    GreenfootSound bgm;
    public Button_GotoSingleMode(GreenfootSound bgm) {
        this.bgm = bgm;
        buttonText = "SINGLE PLAY";
        setButtomImages();
        setImage(imageDefault);
    }
    public Button_GotoSingleMode() {
        this(null);
    }
    
    @Override
    public void doOnClicked(){
        if(bgm != null){
            bgm.stop();
        }
        Greenfoot.setWorld(new Scene_SingleMode());
    }
    
}
