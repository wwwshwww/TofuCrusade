
import greenfoot.Greenfoot;
import greenfoot.GreenfootSound;


public class Button_GotoMultiMode extends Button{

    GreenfootSound bgm;
    public Button_GotoMultiMode(GreenfootSound bgm) {
        this.bgm = bgm;
        buttonText = "MULTI PLAY";
        setButtomImages();
        setImage(imageDefault);
    }
    public Button_GotoMultiMode() {
        this(null);
    }
    
    @Override
    public void doOnClicked(){
        if(bgm != null){
            bgm.stop();
        }
        Greenfoot.setWorld(new Scene_MultiMode());
    }
    
}
