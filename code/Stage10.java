
public class Stage10 extends Battlefield {

    public Stage10() {
        Enemy[] e = new Enemy[4];
        e[0] = new Enemy_Stage10_1(20);
        e[1] = new Enemy_Stage10_2(20);
        e[2] = new Enemy_Stage10_3(20);
        e[3] = new Enemy_Stage10_3(20);

        addObject(e[0], getWidth() / 2, getHeight());
        addObject(e[1], getWidth() / 2, 0);
        addObject(e[2], getWidth() / 4, getHeight() / 2);
        addObject(e[3], getWidth() * 3 / 4, getHeight() / 2);
    }

    public Stage10(Player player) {
        this();
        this.player = player;
        addObject(player, getWidth() - 150, getHeight() / 2);
    }
}
