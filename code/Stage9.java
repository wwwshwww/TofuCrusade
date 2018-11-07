
public class Stage9 extends Battlefield {

    public Stage9() {
        Enemy[] e = new Enemy[5];
        e[0] = new Enemy_Stage9_1(20);
        e[1] = new Enemy_Stage9_1(20);
        e[2] = new Enemy_Stage9_1(20);
        e[3] = new Enemy_Stage9_2(20);
        e[4] = new Enemy_Stage5_2(20);

        addObject(e[0], getWidth() / 4, getHeight() * 3 / 4);
        addObject(e[1], getWidth() / 2, getHeight() / 2);
        addObject(e[2], getWidth() * 3 / 4, getHeight() * 3 / 4);
        addObject(e[3], getWidth() / 2, getHeight());
        addObject(e[4], 0, 0);
    }

    public Stage9(Player player) {
        this();
        this.player = player;
        addObject(player, getWidth() - 150, getHeight() / 2);
    }
}
