package Opgave_3;

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
        circle.setFill(Color.CORNFLOWERBLUE);
        circle.setStroke(Color.BLACK);

        Circle circle1 = new Circle(75, 50, 2);
        pane.getChildren().add(circle1);
        //circle1.setFill(Color.CORNFLOWERBLUE);
        circle1.setStroke(Color.BLACK);

        Circle circle2 = new Circle(60 , 50, 2);
        pane.getChildren().add(circle2);
        //circle2.setFill(Color.CORNFLOWERBLUE);
        circle2.setStroke(Color.BLACK);

        // Line from (70,70) to (100,70)
        Line line = new Line(60, 80, 80, 80);
        pane.getChildren().add(line);




    }

}
