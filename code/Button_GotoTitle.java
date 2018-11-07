
import greenfoot.Greenfoot;


public class Button_GotoTitle extends Button{

    public Button_GotoTitle() {
        buttonText = "タイトル画面へ";
        setButtomImages();
        setImage(imageDefault);
    }
    
    @Override
    public void doOnClicked(){
        Greenfoot.setWorld(new Scene_Title());
    }
    
}
