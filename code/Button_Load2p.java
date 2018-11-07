
public class Button_Load2p extends Button{
    
    Scene_MultiMode scene;
    
    public Button_Load2p(Scene_MultiMode scene){
        this.scene = scene;
        buttonText = "load 2P";
        setButtomImages();
        setImage(imageDefault);
    }
    
    @Override
    public void doOnClicked(){
        scene.set2P();
    }
}
