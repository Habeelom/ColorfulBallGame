package Bouncing;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Driver extends Application {
	private double startX, startY;

	public void start(Stage primaryStage) {
		BallPane ballPane = new BallPane();
		Ball ballInitial = new Ball(250, 250, 30);
		ballInitial.movement(3, 3);
		ballPane.addBall(ballInitial);
		ballPane.setOnMousePressed(e -> {
			startX = e.getX();
			startY = e.getY();
		});

		ballPane.setOnMouseReleased(e -> {
			double endX = e.getX();
			double endY = e.getY();
			double dx = (endX - startX) / 50;
			double dy = (endY - startY) / 50;
			if (e.getTarget() == ballPane) {
				Ball ball = new Ball(startX, startY, 30);
				ball.movement(dx, dy);
				ballPane.addBall(ball);
			}
		});

		ballPane.setOnMouseClicked(e -> {
			if (e.getTarget() instanceof Ball) {
				Ball click = (Ball) e.getTarget();
				click.reverseDirection();
			}
		});

		Scene scene = new Scene(ballPane, 500, 500);
		primaryStage.setTitle("BouncingBalls");
		primaryStage.setScene(scene);
		primaryStage.show();

		ballPane.requestFocus();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

}
