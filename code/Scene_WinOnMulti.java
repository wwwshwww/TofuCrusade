
public class Scene_WinOnMulti extends Scene{
    
    public Scene_WinOnMulti(Player player){
        if(player.mode_2p){
            setBackground("2pWinScreen.bmp");
        }else{
            setBackground("1pWinScreen.bmp");
        }
        addObject(new Button_GotoTitle(), getWidth()/2, 700);
    }
    
}
