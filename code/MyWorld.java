
public class MyWorld extends Battlefield {

    public MyWorld() {
        Enemy s1 = new Enemy(4);
        s1.TotalEXP = 1000;
        addObject(s1, getWidth() / 2, getHeight() / 2);
    }

    public MyWorld(Player player) {
        this();
        this.player = player;
        addObject(player, getWidth() - 150, getHeight() / 2);
    }

}
