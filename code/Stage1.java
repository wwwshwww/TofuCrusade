public class Stage1 extends Battlefield {

    public Stage1() {
        Enemy[] e = new Enemy[3];

        e[0] = new Enemy_Stage1_1(2);
        e[1] = new Enemy_Stage1_1(2);
        e[2] = new Enemy_Stage1_1(2);

        addObject(e[0], getWidth() / 2, getHeight() /4);
        addObject(e[1], getWidth() / 4, getHeight() / 4);
        addObject(e[2], getWidth() * 3 / 4, getHeight() / 4);
    }

    public Stage1(Player player) {
        this();
        this.player = player;
        addObject(player, getWidth() - 150, getHeight() / 2);
    }
}
