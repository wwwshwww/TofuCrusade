
import greenfoot.GreenfootSound;

public class Scene_Title extends Scene {

    public Scene_Title() {
        setBackground("Title.bmp");
//        bgm = new GreenfootSound("荒廃.mp3");
//        Button_GotoSingleMode btn = new Button_GotoSingleMode(bgm);
        addObject(new Button_GotoSingleMode(), getWidth() / 2, 530);
        addObject(new Button_GotoMultiMode(), getWidth() / 2, 630);
    }

    @Override
    public void act() {
//        if (!bgm.isPlaying()) {
//            bgm.playLoop();
//        }
    }
}
