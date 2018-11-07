
import greenfoot.*;


public class Button_Evo extends Button {

    int mode;
    // 0：大豆（初期キャラ）
    // 1～4：第１進化
    // 5～12：第２進化
    // 13～28：第３進化
    // 29～44：第４進化
    StatusInfo info;
    Player evo;

    public Button_Evo(int mode, StatusInfo info) {
        this.mode = mode;
        this.info = info;
        
        switch (mode) {
            case 0:
                buttonText = "大豆";
                evo = new Player_Daizu();
                break;
            case 1:
                buttonText = "狙撃型Ⅰ";
                evo = new Player_Sniper1();
                break;
            case 2:
                buttonText = "連射型Ⅰ";
                evo = new Player_Rapid1();
                break;
            case 3:
                buttonText = "放射型Ⅰ";
                evo = new Player_Radiation1();
                break;
            case 4:
                buttonText = "特殊型Ⅰ";
                evo = new Player_Unique1();
                break;
            case 5:
                buttonText = "狙撃型Ⅱ-Ⅰ";
                evo = new Player_Sniper1_1();
                break;
            case 6:
                buttonText = "狙撃型Ⅱ-Ⅱ";
                evo = new Player_Sniper1_2();
                break;
            case 7:
                buttonText = "連射型Ⅱ-Ⅰ";
                evo = new Player_Rapid1_1();
                break;
            case 8:
                buttonText = "連射型Ⅱ-Ⅱ";
                evo = new Player_Rapid1_2();
                break;
            case 9:
                buttonText = "放射型Ⅱ-Ⅰ";
                evo = new Player_Radiation1_1();
                break;
            case 10:
                buttonText = "放射型Ⅱ-Ⅱ";
                evo = new Player_Radiation1_2();
                break;
            case 11:
                buttonText = "特殊型Ⅱ-Ⅰ";
                evo = new Player_Unique1_1();
                break;
            case 12:
                buttonText = "特殊型Ⅱ-Ⅱ";
                evo = new Player_Unique1_2();
                break;
            case 13:
                buttonText = "狙撃型Ⅲ-Ⅰ";
                evo = new Player_Sniper1_1_1();
                break;
            case 14:
                buttonText = "狙撃型Ⅲ-Ⅱ";
                evo = new Player_Sniper1_1_2();
                break;
            case 15:
                buttonText = "狙撃型Ⅲ-Ⅲ";
                evo = new Player_Sniper1_2_1();
                break;
            case 16:
                buttonText = "狙撃型Ⅲ-Ⅳ";
                evo = new Player_Sniper1_2_2();
                break;
            case 17:
                buttonText = "連射型Ⅲ-Ⅰ";
                evo = new Player_Rapid1_1_1();
                break;
            case 18:
                buttonText = "連射型Ⅲ-Ⅱ";
                evo = new Player_Rapid1_1_2();
                break;
            case 19:
                buttonText = "連射型Ⅲ-Ⅲ";
                evo = new Player_Rapid1_2_1();
                break;
            case 20:
                buttonText = "連射型Ⅲ-Ⅳ";
                evo = new Player_Rapid1_2_2();
                break;
            case 21:
                buttonText = "放射型Ⅲ-Ⅰ";
                evo = new Player_Radiation1_1_1();
                break;
            case 22:
                buttonText = "放射型Ⅲ-Ⅱ";
                evo = new Player_Radiation1_1_2();
                break;
            case 23:
                buttonText = "放射型Ⅲ-Ⅲ";
                evo = new Player_Radiation1_2_1();
                break;
            case 24:
                buttonText = "放射型Ⅲ-Ⅳ";
                evo = new Player_Radiation1_2_2();
                break;
            case 25:
                buttonText = "特殊型Ⅲ-Ⅰ";
                evo = new Player_Unique1_1_1();
                break;
            case 26:
                buttonText = "特殊型Ⅲ-Ⅱ";
                evo = new Player_Unique1_1_2();
                break;
            case 27:
                buttonText = "特殊型Ⅲ-Ⅲ";
                evo = new Player_Unique1_2_1();
                break;
            case 28:
                buttonText = "特殊型Ⅲ-Ⅳ";
                evo = new Player_Unique1_2_2();
                break;
        }
        setButtomImages();
        setImage(imageDefault);
    }
    
    @Override
    public void doOnClicked(){
        evo.setStatusInfo(info);
        Greenfoot.setWorld(new Scene_Evolution(evo));
    }
}

