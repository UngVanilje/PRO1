package Random;

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

        // Line from (70,70) to (100,70)
        Line line = new Line(70, 70, 100, 70);
        pane.getChildren().add(line);

        // Rectangle, upper left corner at (100,40), width 75, height 25
        Rectangle rektangel = new Rectangle(100, 40, 75, 25);
        pane.getChildren().add(rektangel);
        rektangel.setFill(Color.);

        // Polygon with 3 points (100,100), (200,100) and (150,150)
        Polygon polygon = new Polygon(100, 100, 200, 100, 175, 175);
        pane.getChildren().add(polygon);
        polygon.setFill(Color.PINK);


        // Text placed at (100,350)
        Text text = new Text(100, 350, "Computer Science");
        text.setFill(Color.BLUEVIOLET);
        pane.getChildren().add(text);
    }

}
