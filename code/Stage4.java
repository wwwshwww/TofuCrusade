
public class Stage4 extends Battlefield {

    public Stage4() {
        Enemy[] e = new Enemy[2];
        e[0] = new Enemy_Stage4_1(5);
        e[1] = new Enemy_Stage4_1(5);

        addObject(e[0], getWidth() / 4, getHeight() * 3 / 4);
        addObject(e[1], getWidth() * 3 / 4, getHeight() * 3 / 4);
    }

    public Stage4(Player player) {
        this();
        this.player = player;
        addObject(player, getWidth() - 150, getHeight() / 2);
    }
}
