package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Color base = new Color(128, 170, 255);
	
		
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledRectangle(.5, .5, .5, .16);
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledEllipse(.5, .82, .6, .3);
		StdDraw.setPenColor(0,179,89);
		StdDraw.filledEllipse(.5, .18, .6, .3);
	
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.setPenRadius(.05);
		StdDraw.rectangle(0.5, .5, .5, .5);
		
				
	}
}