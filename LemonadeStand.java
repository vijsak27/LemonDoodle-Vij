// LemonadeStand.java
import doodlepad.*;

public class LemonadeStand {

    public static void main(String[] args) {
        // Create a Pad and a Sprite
        Pad pad = new Pad(1000, 1000);
        //Sprite sprite = new Sprite("FlyingBird.png", 50, 50, 190, 5);
        
        // Set Pad timer with a Java lambda function that advances sprite
        // pad.setTickHandler( (Pad p, long when) -> { sprite.advance(); } );
        // pad.setTickRate(10);
        // pad.startTimer();
        Line l1 = new Line(200, 600, 800, 600);
        Line l2 = new Line(200, 600, 200, 900);
        Line l3 = new Line(800, 600, 800, 900);
        Line l4 = new Line(200, 600, 200, 300);
        Line l5 = new Line(800, 600, 800, 300);
        Line l6 = new Line(800, 300, 200, 300);
        Line l7 = new Line(800, 400, 200, 400);
    }
}
