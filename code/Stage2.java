
//ButtleFieldSize
//1200 x 900
//addObject(class,x,y)
public class Stage2 extends Battlefield {

    public Stage2() {
        Enemy[] e = new Enemy[2];

        e[0] = new Enemy_Stage2_2(2);
        e[1] = new Enemy_Stage2_1(2);
        
        addObject(e[0], 1050, getHeight() / 4);
        addObject(e[1], 150, getHeight() * 3 / 4);
    }

    public Stage2(Player player) {
        this();
        this.player = player;
        addObject(player, getWidth() / 2, getHeight() / 2);
    }
}
