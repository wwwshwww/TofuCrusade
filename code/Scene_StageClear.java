
public class Scene_StageClear extends Scene{
    
    public Scene_StageClear(Player player){
        setBackground("StageClearScreen.bmp");
        this.player = player;
        Button_GotoSelectStage bss = new Button_GotoSelectStage(player);
        addObject(bss, getWidth()/2, 700);
    }
    
}
