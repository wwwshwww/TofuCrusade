
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Button_DataSave extends Button {

    Player player;

    public Button_DataSave(Player player) {
        this.player = player;
        buttonText = "セーブ";
        setButtomImages();
        setImage(imageDefault);
    }

    @Override
    public void doOnClicked() {
        try {
            ObjectOutputStream objOutStream = new ObjectOutputStream(new FileOutputStream("./player1.bin"));
            objOutStream.writeObject(new StatusInfo(player));
            objOutStream.close();
            getWorld().showText("OK!", 100, 800);
        } catch (Exception e) {
            System.out.println("データの作成に失敗しました");
            e.printStackTrace();
        }
        
    }

}
