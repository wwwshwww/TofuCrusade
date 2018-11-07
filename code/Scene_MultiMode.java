
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Scene_MultiMode extends Scene {

    boolean loadSuccess;
    boolean loadSuccess2P;
    boolean addableButton;
    Player player2P;

    public Scene_MultiMode() {
        setBackground("MultiPlayScreen.bmp");
        try {
            ObjectInputStream objInStrm = new ObjectInputStream(new FileInputStream("./player1.bin"));
            StatusInfo info = (StatusInfo) objInStrm.readObject();
            Class tofuClass = Class.forName(info.Class);
            player = (Player) tofuClass.newInstance();
            player.setStatusInfo(info);
            objInStrm.close();
            loadSuccess = true;
            showText("player1 load complete!", 300, 650);
            showText("Lv." + player.Level, 300, 750);
        } catch (Exception e) {
            showText("player1's data is not found or invalid...", 300, 650);
            loadSuccess = false;
        } finally {
            loadSuccess2P = false;
            addableButton = false;
        }
        addObject(new Button_Load2p(this), 900, 700);
        addObject(new Button_GotoTitle(), 150, 40);
    }

    @Override
    public void act() {
        if (loadSuccess && loadSuccess2P && addableButton) {
            addObject(new Button_GotoBattleMulti(player, player2P), getWidth() / 2, 650);
            addableButton = false;
        }
    }

    public void set2P() {
        try {
            ObjectInputStream objInStrm = new ObjectInputStream(new FileInputStream("./player2.bin"));
            StatusInfo info = (StatusInfo) objInStrm.readObject();
            Class tofuClass = Class.forName(info.Class);
            player2P = (Player) tofuClass.newInstance();
            player2P.setStatusInfo(info);
            player2P.mode_2p = true;
            objInStrm.close();
            loadSuccess2P = true;
            addableButton = true;
            showText("player2 load complete!", 900, 650);
            showText("Lv." + player2P.Level, 900, 750);
        } catch (Exception e) {
            showText("player2's data is not found or invalid...", 900, 650);
            loadSuccess2P = false;
            addableButton = false;
        } finally {
            removeObjects(getObjects(Button_GotoBattleMulti.class));
        }
    }
}
