
public class Stage8 extends Battlefield {

    public Stage8() {
        Enemy[] e = new Enemy[1];
        e[0] = new Enemy_Stage8_1(99);
        addObject(e[0], 100, 100);
    }

    public Stage8(Player player) {
        this();
        this.player = player;
        addObject(player, getWidth() - 150, getHeight() / 2);
    }
}
