//Main.java
import doodlepad.*;

public class Main{
	public static void main (String[] args){
		// create pad, lemonade stand, and add a water cup
		Pad pad = new Pad(1000, 1000);
		Image background = new Image("output-onlinepngtools.png",0,0,1000,1000);
		//Image im1 = new Image("cups.jfif", 600, 600, 100, 100);
        Image im2 = new Image("LemonadeBanner.jpg", 200, 200, 600, 200);
        //Image im3 = new Image("ice.jpg",300,550,100,150 );
        //Image im4 = new Image("lemons.png", 425, 600, 100, 150);
        //Image im5 = new Image("sugar.jpg", 200, 750, 150,150);
        Oval o1 = new Oval(660, 660, 70, 40);
        o1.setFillColor(0,0,0,0);
        o1.setStrokeWidth(10);
        Line l8 = new Line(650,550,660,680);
        l8.setStrokeWidth(10);
        Line l9 = new Line(740,550,730,680);
        l9.setStrokeWidth(10);
        Oval o2 = new Oval(650,530,90,40);
        o2.setFillColor(0,0,0,0);
        o2.setStrokeWidth(10);
        
        //below lines have the general lemonade stand shape
        Line l1 = new Line(200, 700, 800, 700);
        l1.setStrokeWidth(20);
        Line l2 = new Line(200, 700, 200, 900);
        l2.setStrokeWidth(20);
        Line l3 = new Line(800, 700, 800, 900);
        l3.setStrokeWidth(20);
        Line l4 = new Line(200, 700, 200, 200);
        l4.setStrokeWidth(20);
        Line l5 = new Line(800, 700, 800, 200);
        l5.setStrokeWidth(20);
        Line l6 = new Line(800, 200, 200, 200);
        l6.setStrokeWidth(20);
        Line l7 = new Line(800, 400, 200, 400);
        l7.setStrokeWidth(20);
        
        //draw lemons
        int startCoordX =500;
        Oval lemon3 = new Oval(startCoordX,590,75,60);
        lemon3.setFillColor(255,255,0);
        Oval lemon1 = new Oval(startCoordX-25,640,75,60);
        lemon1.setFillColor(255,255,0);
        Oval lemon2 = new Oval(startCoordX+25,640,75,60);
        lemon2.setFillColor(255,255,0);
        
        //draw icebox
        Rectangle iceBox = new Rectangle(210,750,100,150);
        iceBox.setFillColor(16,152,247);
        
        Text ice = new Text("Ice",235,800,35);
        
        Rectangle sugarBox = new Rectangle(240,550,100,150);
        sugarBox.setFillColor(224,76,76);
        
        Text sugar = new Text("Sugar",265,600,20);
        
        //standardCupMaker(67,67);
        
	}
	
	
	
	
	/*
	public static void standardCupMaker(int topLeftX, int topLeftY){
			int uDiameter = 40;
			int height = 100;
			Oval o2 = new Oval(topLeftX,topLeftY,uDiameter,uDiameter-10);
			Oval o1 = new Oval(topLeftX+10, topLeftY+height, uDiameter-5, 20);
			Line l8 = new Line(topLeftX,topLeftY+20,topLeftX+10,topLeftY+height);
			Line l9 = new Line(topLeftX+uDiameter-10,topLeftY+100,topLeftX+uDiameter,topLeftY+20);
			
		}
		*/
}
