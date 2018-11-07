
public class Stage11 extends Battlefield {

    public Stage11() {
        Enemy[] e = new Enemy[1];
        e[0] = new Enemy_Stage11_1(20);
        addObject(e[0], getWidth() / 2, getHeight() / 2);

    }

    public Stage11(Player player) {
        this();
        this.player = player;
        addObject(player, getWidth() - 150, getHeight() / 2);
    }
}
