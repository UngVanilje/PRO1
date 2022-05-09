package Opgave_2;

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

        // Rectangle, upper left corner at (100,40), width 75, height 25
        Rectangle rektangel = new Rectangle(100, 100, 80,20 );
        pane.getChildren().add(rektangel);
        rektangel.setFill(Color.CORAL);


        // Text placed at (100,350)
        Text text = new Text(115, 110, "Emil");
        text.setFill(Color.BLUEVIOLET);
        pane.getChildren().add(text);
    }

}
