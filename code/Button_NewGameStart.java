
import greenfoot.Greenfoot;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Button_NewGameStart extends Button {

    Player player;
    StatusInfo info;

    public Button_NewGameStart() {
        player = new Player_Daizu();
        buttonText = "New Tofu";
        setButtomImages();
        setImage(imageDefault);
    }

    @Override
    public void doOnClicked() {
        try {
            ObjectOutputStream objOutStream = new ObjectOutputStream(new FileOutputStream("./player1.bin"));
            objOutStream.writeObject(new StatusInfo(player));
            objOutStream.close();
        } catch (Exception e) {
            System.out.println("データの作成に失敗しました");
        }
        Greenfoot.setWorld(new Scene_SelectStage(player));
    }

}
