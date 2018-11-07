
import greenfoot.*;

public class Button extends Actor {

    GreenfootImage imageDefault;
    GreenfootImage imageMouseOn;
    GreenfootImage imageClicked;
//    GreenfootSound onCursor;
//    GreenfootSound onClick;
    Color stringColor;
    Color backColor;
    MouseInfo mouse;
    String buttonText;
    boolean isMouseDown;
//    boolean onCursorPlayed;

    public Button() {
        buttonText = "Button";
        setButtomImages();
        setImage(imageDefault);
        isMouseDown = false;
//        onCursorPlayed = true;
//        onCursor = new GreenfootSound("./button71.mp3");
        
    }

    @Override
    public void act() {
        buttonAct();
    }

    public void buttonAct() {
        if (checkMouseOn()) {
//            if(onCursorPlayed){
//                onCursor.play();
//                onCursorPlayed = false;
//            }
            if (!isMouseDown && Greenfoot.mousePressed(this)) {
                setImage(imageClicked);
                isMouseDown = true;
//                onClick = new GreenfootSound("./button70.mp3");
//                onClick.play();
            }
            if (isMouseDown) setImage(imageClicked);
            else setImage(imageMouseOn);
            if (isMouseDown && Greenfoot.mouseClicked(this)) {
                setImage(imageMouseOn);
                isMouseDown = false;
                doOnClicked();
            }
        } else {
            setImage(imageDefault);
            isMouseDown = false;
//            onCursorPlayed = true;
        }

    }

    //method that have to be Overrided
    public void doOnClicked() {

    }

    public void setButtomImages() {
        setImageDefault();
        setImageMouseOn();
        setImageClicked();
    }

    public boolean checkMouseOn() {
        int minimumX = getX() - imageDefault.getWidth() / 2;;
        int minimumY = getY() - imageDefault.getHeight() / 2;
        int maximumX = getX() + imageDefault.getWidth() / 2;
        int maximumY = getY() + imageDefault.getHeight() / 2;
        mouse = Greenfoot.getMouseInfo();
        if (mouse != null) {
            return (mouse.getX() >= minimumX && mouse.getY() >= minimumY
                    && mouse.getX() <= maximumX && mouse.getY() <= maximumY);
        } else {
            return false;
        }
    }

    public void setImageDefault() {
        stringColor = new Color(255, 255, 255, 170);
        backColor = new Color(255, 255, 255, 0);
        imageDefault = new GreenfootImage(buttonText, 40, stringColor, backColor);
    }

    public void setImageMouseOn() {
        stringColor = new Color(255, 255, 255, 170);
        backColor = new Color(255, 255, 255, 40);
        imageMouseOn = new GreenfootImage(buttonText, 40, stringColor, backColor);
        imageMouseOn.setColor(new Color(255, 255, 255, 100));
        imageMouseOn.drawRect(0, 0, imageMouseOn.getWidth()-1, imageMouseOn.getHeight()-1);
    }

    public void setImageClicked() {
        stringColor = new Color(255, 255, 255, 170);
        backColor = new Color(255, 255, 255, 100);
        imageClicked = new GreenfootImage(buttonText, 40, stringColor, backColor);
    }
}
