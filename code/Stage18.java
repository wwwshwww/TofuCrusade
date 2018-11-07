
public class Stage18 extends Battlefield {

    public Stage18() {
        Enemy[] e = new Enemy[2];
        e[0] = new Enemy_FinalBoss(83);
        e[1] = new Enemy_SubBoss(72);
        addObject(e[0], getWidth() / 2, getHeight() / 2);
        addObject(e[1], getWidth() / 2, getHeight() / 4);
    }

    public Stage18(Player player) {
        this();
        this.player = player;
        addObject(player, getWidth() - 150, getHeight() / 2);
    }
}
