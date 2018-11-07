
public class Stage7 extends Battlefield {

    public Stage7() {
        Enemy[] e = new Enemy[6];
        e[0] = new Enemy_Stage6_1(10);
        e[1] = new Enemy_Stage6_2(10);
        e[2] = new Enemy_Stage7_1(10);
        e[3] = new Enemy_Stage7_2(10);
        e[4] = new Enemy_Stage7_3(10);
        e[5] = new Enemy_Stage7_4(10);

        addObject(e[0], 0, 0);
        addObject(e[1], getWidth(), getHeight());
        addObject(e[2], getWidth(), 0);
        addObject(e[3], 0, getHeight());
        addObject(e[4], getWidth() / 2, getHeight());
        addObject(e[5], getWidth() / 2, 0);

    }

    public Stage7(Player player) {
        this();
        this.player = player;
        addObject(player, getWidth() - 150, getHeight() / 2);
    }
}
