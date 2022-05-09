package ex8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ex8Gui extends Application {

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
        Canvas canvas = new Canvas(250, 250);
        pane.add(canvas, 0, 0);
        this.drawShapes(canvas.getGraphicsContext2D());
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(GraphicsContext gc) {
        int y1 = 80; // start point: (x,y1)
        int y2 = 160; // end point: (x,y2)
        for (int i = 0; i < 10; i++) {
            int x = 16 + i * 16;
            gc.strokeLine(x, y1, x, y2);
            if (i < 10) {
                y1 = y1 - 4;
                y2 = y2 - 12;
            }
        }

    }
}
