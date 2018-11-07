
public class Stage5 extends Battlefield {

    public Stage5() {
        Enemy[] e = new Enemy[3];
        e[0] = new Enemy_Stage5_2(5);
        e[1] = new Enemy_Stage5_1(5);
        e[2] = new Enemy_Stage5_1(5);

        addObject(e[0], 0, 0);
        addObject(e[1], getWidth() / 4, getHeight() / 2);
        addObject(e[2], getWidth() * 3 / 4, getHeight() / 2);
    }

    public Stage5(Player player) {
        this();
        this.player = player;
        addObject(player, getWidth() - 150, getHeight() / 2);
    }
}
