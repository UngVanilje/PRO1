package Opgave_5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();

    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(400, 400);
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {
        // Circle center at (70,70) and radius 30
        Circle circle = new Circle(70, 70, 30);
        pane.getChildren().add(circle);
        circle.setFill(null);
        circle.setStroke(Color.BLUE);
        circle.setStrokeWidth(5);


        Circle circle1 = new Circle(130, 70, 30);
        pane.getChildren().add(circle1);
        circle1.setFill(null);
        circle1.setStroke(Color.BLACK);
        circle1.setStrokeWidth(5);


        Circle circle2 = new Circle(190, 70, 30);
        pane.getChildren().add(circle2);
        circle2.setFill(null);
        circle2.setStroke(Color.RED);
        circle2.setStrokeWidth(5);


        Circle circle3 = new Circle(100, 100, 30);
        pane.getChildren().add(circle3);
        circle3.setFill(null);
        circle3.setStroke(Color.YELLOW);
        circle3.setStrokeWidth(5);


        Circle circle4 = new Circle(160, 100, 30);
        pane.getChildren().add(circle4);
        circle4.setFill(null);
        circle4.setStroke(Color.GREEN);
        circle4.setStrokeWidth(5);



    }

}
