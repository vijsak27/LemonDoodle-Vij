// LemonadeStand.java
import doodlepad.*;

public class LemonadeStand {

   // public LemonadeStand(){
       
       
    //}
    public void draw(){
		// create pad, lemonade stand, and add a water cup
		Pad pad = new Pad(1000, 1000);

        Line l1 = new Line(200, 600, 800, 600);
        Line l2 = new Line(200, 600, 200, 900);
        Line l3 = new Line(800, 600, 800, 900);
        Line l4 = new Line(200, 600, 200, 300);
        Line l5 = new Line(800, 600, 800, 300);
        Line l6 = new Line(800, 300, 200, 300);
        Line l7 = new Line(800, 400, 200, 400);
        Image im = new Image("WaterCup.jpg", 0, 0, 100, 100);
	}
}
