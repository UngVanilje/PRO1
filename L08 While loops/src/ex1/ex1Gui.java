package ex1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;

public class ex1Gui extends Application {

	@Override
	public void start(Stage stage) {
		GridPane root = this.initContent();
		Scene scene = new Scene(root);

		stage.setTitle("Loops");
		stage.setScene(scene);
		stage.show();
	}

	private GridPane initContent() {
		GridPane pane = new GridPane();
		Canvas canvas = new Canvas(200, 200);
		pane.add(canvas, 0, 0);
		this.drawShapes(canvas.getGraphicsContext2D());
		return pane;
	}

	// ------------------------------------------------------------------------

	private void drawShapes(GraphicsContext gc) {
		// Replace the statement here with your code.
		//gc.strokeLine(10, 10, 150, 80);


		int x = 100;
		int x1 = x + 20;
		int y = 75;
		gc.strokeLine(x, y, x1, y - 4);
		gc.strokeLine(x, y, x1, y + 4);

		x = 100;
		y = 125;
		gc.strokeLine(x, y, x1, y - 4);
		gc.strokeLine(x, y, x1, y + 4);

		x = 20;
		x1 = x + 20;
		y = 50;
		gc.strokeLine(x, y, x1, y - 4);
		gc.strokeLine(x, y, x1, y + 4);
	}
}
