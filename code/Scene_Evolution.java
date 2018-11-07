
import greenfoot.Greenfoot;

public class Scene_Evolution extends Scene {

    StatusInfo info;
    final int BUTTON_FIRST = 500;
    final int BUTTON_SECOND = 700;
    final int BUTTON_Y = 500;

    public Scene_Evolution() {
        setBackground("BlackBack.bmp");
    }

    public Scene_Evolution(Player player) {
        this();
        this.player = player;
        addObject(new Button_GotoSelectStage(player), 170, 40);

        info = new StatusInfo(player);
        showText(info.Class, 550, 50);
        if (player.Level >= 5 && info.Class.equals("Player_Daizu")) {
            for (int i = 1; i <= 4; i++) {
                addObject(new Button_Evo(i, info), 300 + i * 150, BUTTON_Y);
            }
        } else if (player.Level >= 15 && info.Class.equals("Player_Sniper1")) {
            addObject(new Button_Evo(5, info), BUTTON_FIRST, BUTTON_Y);
            addObject(new Button_Evo(6, info), BUTTON_SECOND, BUTTON_Y);
        } else if (player.Level >= 15 && info.Class.equals("Player_Rapid1")) {
            addObject(new Button_Evo(7, info), BUTTON_FIRST, BUTTON_Y);
            addObject(new Button_Evo(8, info), BUTTON_SECOND, BUTTON_Y);
        } else if (player.Level >= 15 && info.Class.equals("Player_Radiation1")) {
            addObject(new Button_Evo(9, info), BUTTON_FIRST, BUTTON_Y);
            addObject(new Button_Evo(10, info), BUTTON_SECOND, BUTTON_Y);
        } else if (player.Level >= 15 && info.Class.equals("Player_Unique1")) {
            addObject(new Button_Evo(11, info), BUTTON_FIRST, BUTTON_Y);
            addObject(new Button_Evo(12, info), BUTTON_SECOND, BUTTON_Y);
        } else if (player.Level >= 30 && info.Class.equals("Player_Sniper1_1")) {
            addObject(new Button_Evo(13, info), BUTTON_FIRST, BUTTON_Y);
            addObject(new Button_Evo(14, info), BUTTON_SECOND, BUTTON_Y);
        } else if (player.Level >= 30 && info.Class.equals("Player_Sniper1_2")) {
            addObject(new Button_Evo(15, info), BUTTON_FIRST, BUTTON_Y);
            addObject(new Button_Evo(16, info), BUTTON_SECOND, BUTTON_Y);
        } else if (player.Level >= 30 && info.Class.equals("Player_Rapid1_1")) {
            addObject(new Button_Evo(17, info), BUTTON_FIRST, BUTTON_Y);
            addObject(new Button_Evo(18, info), BUTTON_SECOND, BUTTON_Y);
        } else if (player.Level >= 30 && info.Class.equals("Player_Rapid1_2")) {
            addObject(new Button_Evo(19, info), BUTTON_FIRST, BUTTON_Y);
            addObject(new Button_Evo(20, info), BUTTON_SECOND, BUTTON_Y);
        } else if (player.Level >= 30 && info.Class.equals("Player_Radiation1_1")) {
            addObject(new Button_Evo(21, info), BUTTON_FIRST, BUTTON_Y);
            addObject(new Button_Evo(22, info), BUTTON_SECOND, BUTTON_Y);
        } else if (player.Level >= 30 && info.Class.equals("Player_Radiation1_2")) {
            addObject(new Button_Evo(23, info), BUTTON_FIRST, BUTTON_Y);
            addObject(new Button_Evo(24, info), BUTTON_SECOND, BUTTON_Y);
        } else if (player.Level >= 30 && info.Class.equals("Player_Unique1_1")) {
            addObject(new Button_Evo(25, info), BUTTON_FIRST, BUTTON_Y);
            addObject(new Button_Evo(26, info), BUTTON_SECOND, BUTTON_Y);
        } else if (player.Level >= 30 && info.Class.equals("Player_Unique1_2")) {
            addObject(new Button_Evo(27, info), BUTTON_FIRST, BUTTON_Y);
            addObject(new Button_Evo(28, info), BUTTON_SECOND, BUTTON_Y);
        }
    }

    @Override
    public void act() {
        checkResumeKey();
    }

    public void checkResumeKey() {
        if (Greenfoot.isKeyDown("escape")) {
            Greenfoot.setWorld(new Scene_SelectStage(player));
            Greenfoot.delay(10);
        }
    }
}
