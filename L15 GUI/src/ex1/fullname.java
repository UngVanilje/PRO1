package ex1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class fullname extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Gui Demo 1");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------
    TextField txfName = new TextField();
    TextField txflastName = new TextField();
    TextField txffullName = new TextField();

    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(40));
        // set horizontal gap between components
        pane.setHgap(20);
        // set vertical gap between components
        pane.setVgap(20);

        // add a label to the pane (at col=0, row=0)
        Label lblName = new Label("First name:");
        pane.add(lblName, 1, 0);

        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)

        pane.add(txfName, 1, 1, 1, 1);

        Label lblastName = new Label("Last name: ");
        pane.add(lblastName, 3, 0);

        pane.add(txflastName, 3, 1, 4, 1);




        // add a button to the pane (at col=1, row=1)
//        Button btnUpperCase = new Button("Upper Case");
//        pane.add(btnUpperCase, 1, 2);
//        GridPane.setMargin(btnUpperCase, new Insets(10, 10, 0, 10));

        // add a button to the pane (at col=2, row=1)
        Button btncombine = new Button("Combine");
        pane.add(btncombine, 2, 5);
        GridPane.setMargin(btncombine, new Insets(10, 10, 0, 10));

        btncombine.setOnAction(event -> this.combineAction());

        Label lblfullName = new Label("Full name: ");
        pane.add(lblfullName, 1, 3);

        pane.add(txffullName, 1, 4, 5, 1);


    }
    private void combineAction(){
        String fullName = txfName.getText().trim() + " " +  txflastName.getText().trim();
        txffullName.setText(fullName);
    }



}
