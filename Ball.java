package Bouncing;

import java.util.Random;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Ball extends Circle {
	private double dx, dy;
	

	
	public Ball(double x, double y, double radius) {
		
		super(x, y, radius);
		setFill(Color.color(Math.random(), Math.random(), Math.random()));
		dx = 0;
		dy = 0;
		
	}
	
	public void movement(double dx, double dy) {
        this.dx = dx;
        this.dy = dy;
    }

	public void moveBall(double width, double height) {
		double x = getCenterX();
		double y = getCenterY();
		double radius = getRadius();

		if (x <= radius || x >= width - radius) {
			dx *= -1;
		}
		if (y <= radius || y >= height - radius) {
			dy *= -1;
		}
		x += dx;
		y += dy;
		setCenterX(x);
		setCenterY(y);
	}


	public void reverseDirection() {
		dx= -dx;
		dy = -dy;
	}
}
