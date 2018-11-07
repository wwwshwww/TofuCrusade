
public class Scene_GameOver extends Scene{
    
    public Scene_GameOver(Player player){
        setBackground("GameOverScreen.bmp");
        this.player = player;
        Button_GotoSelectStage bss = new Button_GotoSelectStage(player);
        addObject(bss, getWidth()/2, 700);
    }
}
