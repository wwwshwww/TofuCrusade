
public class Stage6 extends Battlefield {

    public Stage6() {
        Enemy[] e = new Enemy[3];

        e[0] = new Enemy_Stage6_Boss(10);
        e[1] = new Enemy_Stage6_1(7);
        e[2] = new Enemy_Stage6_2(7);
        addObject(e[0], getWidth() / 2, getHeight() / 2);
        addObject(e[1], 10, 10);
        addObject(e[2], getWidth()-10, getHeight()-10);
    }

    public Stage6(Player player) {
        this();
        this.player = player;
        addObject(player, getWidth() - 150, getHeight() / 2);
    }
}
