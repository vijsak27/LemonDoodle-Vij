//Main.java
import doodlepad.*;

public class Main{
	public static void main (String[] args){
		// create pad, lemonade stand, and add a water cup
		Pad pad = new Pad(1000, 1000);
		//Image im1 = new Image("cups.jfif", 600, 600, 100, 100);
        Image im2 = new Image("LemonadeBanner.jpg", 200, 200, 600, 200);
        //Image im3 = new Image("ice.jpg",300,550,100,150 );
        //Image im4 = new Image("lemons.png", 425, 600, 100, 150);
        //Image im5 = new Image("sugar.jpg", 200, 750, 150,150);
        Oval r1 = new Oval(660, 660, 70, 40);
        //Line l8 = need to add two lines for the cup
        
        //below lines have the general lemonade stand shape
        Line l1 = new Line(200, 700, 800, 700);
        Line l2 = new Line(200, 700, 200, 900);
        Line l3 = new Line(800, 700, 800, 900);
        Line l4 = new Line(200, 700, 200, 200);
        Line l5 = new Line(800, 700, 800, 200);
        Line l6 = new Line(800, 200, 200, 200);
        Line l7 = new Line(800, 400, 200, 400);
        
	}
}
