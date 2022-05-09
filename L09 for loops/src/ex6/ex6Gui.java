package ex6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ex6Gui extends Application {

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
        int y1 = 170; // start point: (x,y1)
        int y2 = 190; // end point: (x,y2)
        for (int i = 0; i < 20; i++) {
            int x = 10 + i * 8;
            if (i == 0 || i == 5 || i == 10 || i == 15) {
                y1 = y1 - 5;
                y2 = y2 + 5;
            }
            else { y1 = 170; y2 = 190;}
            gc.strokeLine(x, y1, x, y2);
        }
        gc.strokeLine(5, 180, 180, 180);
        gc.strokeLine(180, 180, 180 - 10, 180 - 10);
        gc.strokeLine(180, 180, 180 - 10, 180 + 10);
        gc.strokeText("0", 7, 205);
        gc.strokeText("5", 47, 205);
        gc.strokeText("10", 84, 205);
        gc.strokeText("15", 124, 205);
            }
}
