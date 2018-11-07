
import greenfoot.Greenfoot;


public class Button_GotoBattleMulti extends Button{
    
    Player p1, p2;
    
    public Button_GotoBattleMulti(Player p1, Player p2){
        this.p1 = p1;
        this.p2 = p2;
        buttonText = "START";
        setButtomImages();
        setImage(imageDefault);
    }
    
    @Override
    public void doOnClicked(){
        Greenfoot.setWorld(new Stage_Multi(p1, p2));
    }
}
