package ex3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class regningting extends Application {

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

    private final TextField txfInvestment = new TextField();
    private final TextField txfYears = new TextField();
    private final TextField txfInterest = new TextField();
    private final TextField txfFutureValue = new TextField();

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
        Label lblInvestment = new Label("Investment:");
        pane.add(lblInvestment, 1, 1);
        pane.add(txfInvestment, 2, 1, 1, 1);

        Label lblYears = new Label("Years:");
        pane.add(lblYears, 1, 2);
        pane.add(txfYears, 2, 2, 1, 1);

        Label lblInterest = new Label("Interest:");
        pane.add(lblInterest, 1, 3);
        pane.add(txfInterest, 2, 3, 1, 1);

        Label lblFutureValue = new Label("Future Value:");
        pane.add(lblFutureValue, 1, 5);
        pane.add(txfFutureValue, 2, 5, 1, 1);

        // add a button to the pane (at col=1, row=1)
        Button btnCalculate = new Button("Calculate");
        pane.add(btnCalculate, 1, 4);
        GridPane.setMargin(btnCalculate, new Insets(0, 0, 0, 0));

        // connect a method to the button
        btnCalculate.setOnAction(event -> this.calculateAction());

    }

    // -------------------------------------------------------------------------

    private void calculateAction() {
        int investment = Integer.parseInt(txfInvestment.getText().trim());
        double interest =Double.parseDouble(txfInterest.getText().trim()) / 100;
        int years = Integer.parseInt(txfYears.getText().trim());
        double FutureValue = investment * (1 + interest * years);
        txfFutureValue.setText(String.format("%.2f" , FutureValue));

    }


}
