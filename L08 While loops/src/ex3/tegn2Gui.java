package ex3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class tegn2Gui extends Application {

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
		int x1 = 90; // start point: (x1,y1)
		int y1 = 20;
		int x2 = 110; // end point: (x2,y2)
		//int y2 = 10;
		while (y1 <= 180) {
			gc.strokeLine(x1, y1, x2, y1);
			y1 = y1 + 40;
			x1 = x1 - 20;
			x2 = x2 + 20;
		}
	}
}
