
public class Scene_SelectStage extends Scene {
    
    public Scene_SelectStage() {
        this(new Player_Ayataka());
//        Button_GotoBattle_pre b_pre = new Button_GotoBattle_pre(player, 0);
//        addObject(b_pre, 500, 500);
    }
    
    public Scene_SelectStage(Player player){
        setBackground("SelectStageScreen.bmp");
        this.player = player;
        Button_GotoBattle_pre[][] btns = new Button_GotoBattle_pre[3][6];
        
        int count = 0;        
        for(int i=0; i<btns.length; i++){
            for(int j=0; j<btns[i].length; j++){
                count++;
                btns[i][j] = new Button_GotoBattle_pre(player, count);
                addObject(btns[i][j], 400+(j+1)*100, 400+(i+1)*100);
            }
        }
        
        addObject(new Button_GotoStatuses(player), 1050, 850);
        
        addObject(new Button_DataSave(player), 100, 850);
        
        addObject(new Button_GotoEvoScene(player), 800, 850);
        
        addObject(new Button_GotoTitle(), 350, 850);
    }
}
