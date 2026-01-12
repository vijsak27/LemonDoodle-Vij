// FlyingBird.java
import doodlepad.*;

public class FlyingBird {

    public static void main(String[] args) {
        // Create a Pad and a Sprite
        Pad pad = new Pad(1000, 1000);
        Sprite sprite = new Sprite("FlyingBird.png", 50, 50, 190, 5);
        
        // Set Pad timer with a Java lambda function that advances sprite
        pad.setTickHandler( (Pad p, long when) -> { sprite.advance(); } );
        pad.setTickRate(10);
        pad.startTimer();
        Line l1 = new Line(300, 300, 400, 300);
        Line l2 = new Line(300, 300, 300, 400);
        Line l3 = new Line(300, 400, 400, 400);
        Line l4 = new Line(400, 400, 400, 500);
        Line l5 = new Line(400, 500, 300, 500);
        Line l6 = new Line(600, 300, 750, 500);
        Line l7 = new Line(750, 500, 900, 300);
    }
}
