package ex4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class temperatur extends Application {

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

    private final TextField txfCelsius = new TextField();
    private final TextField txfConvertedCelsius = new TextField();
    private final TextField txfFahrenheit = new TextField();
    private final TextField txfConvertedFahrenheit = new TextField();

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
        Label lblCelsius = new Label("Celsius:");
        pane.add(lblCelsius, 1, 1);
        pane.add(txfCelsius, 2, 1, 1, 1);

        Label lblConvertedCelsius = new Label("Fahrenheit:");
        pane.add(lblConvertedCelsius, 4, 1);
        pane.add(txfConvertedCelsius, 5, 1, 1, 1);

        Label lblFahrenheit = new Label("Fahrenheit:");
        pane.add(lblFahrenheit, 1, 2);
        pane.add(txfFahrenheit, 2, 2, 1, 1);

        Label lblConvertedFahrenheit = new Label("Celsius:");
        pane.add(lblConvertedFahrenheit, 4, 2);
        pane.add(txfConvertedFahrenheit, 5, 2, 1, 1);

        // add a button to the pane (at col=1, row=1)
        Button btnConvertCelsius = new Button("Convert to Fahrenheit -->");
        pane.add(btnConvertCelsius, 3, 1);
        GridPane.setMargin(btnConvertCelsius, new Insets(0, 0, 0, 0));

        // connect a method to the button
        btnConvertCelsius.setOnAction(event -> this.convertCelsiusAction());

        Button btnConvertFahrenheit = new Button("Convert to Celsius -->");
        pane.add(btnConvertFahrenheit, 3, 2);
        GridPane.setMargin(btnConvertFahrenheit, new Insets(0, 0, 0, 0));

        // connect a method to the button
        btnConvertFahrenheit.setOnAction(event -> this.convertFahrenheitAction());

    }

    // -------------------------------------------------------------------------

    private void convertCelsiusAction() {
        double c = Double.parseDouble(txfCelsius.getText().trim());
        double convertedcelsius = 9.0 / 5 * c + 32;
        txfConvertedCelsius.setText(String.format("%.2f" , convertedcelsius));

    }
    private void convertFahrenheitAction() {
        double fh = Double.parseDouble(txfFahrenheit.getText().trim());
        double convertedfahrenheit = (fh - 32) * 5 / 9;
        txfConvertedFahrenheit.setText(String.format("%.2f" ,convertedfahrenheit ));

    }


}
