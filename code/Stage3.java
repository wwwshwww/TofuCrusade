
public class Stage3 extends Battlefield {

    public Stage3() {
        Enemy[] e = new Enemy[1];
        e[0] = new Enemy_Stage3_Boss(5);

        addObject(e[0], getWidth() / 2, getHeight() / 6);
    }

    public Stage3(Player player) {
        this();
        this.player = player;
        addObject(player, getWidth() - 150, getHeight() / 2);
    }
}
