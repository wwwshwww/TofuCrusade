
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Scene_SingleMode extends Scene{
    
    boolean loadSuccess;
    StatusInfo info;
    
    public Scene_SingleMode(){
        setBackground("SinglePlayScreen.bmp");
        try {
            ObjectInputStream objInStrm = new ObjectInputStream(new FileInputStream("./player1.bin"));
            info = (StatusInfo)objInStrm.readObject();
            Class tofuClass = Class.forName(info.Class);
            player = (Player)tofuClass.newInstance();
            player.setStatusInfo(info);
            objInStrm.close();
            loadSuccess = true;
        }catch(Exception e){
            System.out.println("データが存在しないか、破損しています");
            loadSuccess = false;
        }
        Button_SingleGameStart btnNew = new Button_SingleGameStart();
        addObject(btnNew, getWidth()/2, 550);
        if(loadSuccess){
            Button_SingleGameStart btnRsm = new Button_SingleGameStart(player);
            addObject(btnRsm, getWidth()/2, 650);
            showText("LV."+player.Level, getWidth()/2+180, 650);
        }
        addObject(new Button_GotoTitle(), 150, 40);
    }
    
}
