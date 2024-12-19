package Bouncing;

import java.util.ArrayList;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class BallPane extends Pane {

	ArrayList<Ball> balls = new ArrayList<>();

	public BallPane() {
		Timeline animation = new Timeline(new KeyFrame(Duration.millis(25), e -> handleAnimation()));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();

	}

	public void handleAnimation() {
		double width = getWidth();
		double height = getHeight();
		for (Ball ball : balls) {
			ball.moveBall(width, height);
		}
	}

	public void addBall(Ball ball) {
		balls.add(ball);
		getChildren().add(ball);
	}

}
