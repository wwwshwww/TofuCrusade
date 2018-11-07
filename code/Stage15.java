
public class Stage15 extends Battlefield{
    
    public Stage15(){
        Enemy[] e = new Enemy[5];
        for (int i=0; i<e.length; i++) {
            e[i] = new Enemy(99);
            addObject(e[i], getWidth() / 2, 150+50*i);
        }
    }
    
    public Stage15(Player player){
        this();
        this.player = player;
        addObject(player, getWidth() - 150, getHeight() / 2);
    }
}
