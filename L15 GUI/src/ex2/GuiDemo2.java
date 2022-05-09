package ex2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GuiDemo2 extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Exercise 2");
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfNumber = new TextField();

    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(30));
        // set horizontal gap between components
        pane.setHgap(20);
        // set vertical gap between components
        pane.setVgap(20);

        // add a label to the pane (at col=0, row=0)
        Label lblNumber = new Label("Number:");
        pane.add(lblNumber, 0, 2);

        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)
        // Deleted here is:

        pane.add(txfNumber, 1, 2, 1, 1);

        // add a button to the pane (at col=1, row=1)
        Button btnIncrement = new Button("Increment");
        pane.add(btnIncrement, 3, 1);
        GridPane.setMargin(btnIncrement, new Insets(10, 10, 0, 10));

        // connect a method to the button
        btnIncrement.setOnAction(event -> this.incrementAction());

        // add a button to the pane (at col=2, row=1)
        Button btnDecrement = new Button("Decrement");
        pane.add(btnDecrement, 3, 3);
        GridPane.setMargin(btnDecrement, new Insets(10, 10, 0, 10));

        // connect a method to the button
        btnDecrement.setOnAction(event -> this.decrementAction());
    }

    // -------------------------------------------------------------------------

    private void incrementAction() {
        int number = Integer.parseInt(txfNumber.getText().trim()) + 1;
        txfNumber.setText("" + number);
    }

    private void decrementAction() {
        int number = Integer.parseInt(txfNumber.getText().trim()) - 1;
        txfNumber.setText("" + number);
    }
}
