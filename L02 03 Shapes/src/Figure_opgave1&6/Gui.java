package FigureO1;

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
        int x=100;
        // Circle center at (70,70) and radius 30
        Circle circle = new Circle(200+x, 70, 40);
        pane.getChildren().add(circle);
        circle.setFill(Color.YELLOW);
        circle.setStroke(Color.BLACK);

        // Line from (70,70) to (100,70)
        Line line = new Line(0, 320,400,320 );
        pane.getChildren().add(line);

        // Rectangle, upper left corner at (100,40), width 75, height 25
        Rectangle rektangel = new Rectangle(50+x, 200, 120, 120);
        pane.getChildren().add(rektangel);
        rektangel.setFill(Color.RED);

        // Polygon with 3 points (100,100), (200,100) and (150,150)
        Polygon polygon = new Polygon(125, 200, 295, 200, 210, 100);
        pane.getChildren().add(polygon);
        polygon.setFill(Color.GREEN);

        // Rectangle, upper left corner at (100,40), width 75, height 25
        Rectangle rektangel1 = new Rectangle(165, 225, 45, 45);
        pane.getChildren().add(rektangel1);
        rektangel1.setFill(Color.BLACK);

    }

}
