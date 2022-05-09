package gui;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import model.YatzyDice;

public class YatzyGui extends Application {
    private YatzyDice dice = new YatzyDice();

    @Override
    public void start(Stage stage) {
        stage.setTitle("Yatzy");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    // -------------------------------------------------------------------------

    // Shows the face values of the 5 dice.
    private final TextField[] txfValues = new TextField[5];

    // Shows the hold status of the 5 dice.
    private final CheckBox[] cbxHolds = new CheckBox[5];
    // Shows the obtained results.
    // For results not set yet, the possible result of 
    // the actual face values of the 5 dice are shown.
    private final TextField[] txfResults = new TextField[15];
    // Shows points in sums, bonus and total.
    private final TextField txfSumSame = new TextField(), txfBonus = new TextField(),
            txfSumOther = new TextField(), txfTotal = new TextField();

    private final Label lblRolled = new Label();
    private final Button btnRoll = new Button(" Roll ");

    private void initContent(GridPane pane) {
        // pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);

        // ---------------------------------------------------------------------

        GridPane dicePane = new GridPane();
        pane.add(dicePane, 0, 0);
        // dicePane.setGridLinesVisible(true);
        dicePane.setPadding(new Insets(10));
        dicePane.setHgap(10);
        dicePane.setVgap(10);
        dicePane.setStyle("-fx-border-color: black");


        // add txfValues, chbHolds, lblRolled and btnRoll
        // TODO
        for (int i = 0; i < txfValues.length; i++) {
            txfValues[i] = new TextField();
            txfValues[i].setPrefSize(128, 128);
            dicePane.add(txfValues[i], i, 0);
            txfValues[i].setFont(Font.font(55));
            txfValues[i].setEditable(false);

            cbxHolds[i] = new CheckBox("Hold");
            dicePane.add(cbxHolds[i], i, 1);
            GridPane.setHalignment(cbxHolds[i], HPos.CENTER);
            cbxHolds[i].setDisable(true);
        }
        Label lblRolled = new Label();
        Button btnRoll = new Button(" Roll");
        dicePane.add(btnRoll, 2, 3);
        btnRoll.setMinSize(100, 40);
        btnRoll.setMaxSize(100, 40);
        btnRoll.setFont(Font.font(20));
        GridPane.setHalignment(btnRoll, HPos.CENTER);
        btnRoll.setOnAction(event -> this.rollAction());


        // ---------------------------------------------------------------------

        GridPane scorePane = new GridPane();
        pane.add(scorePane, 0, 1);
        //scorePane.setGridLinesVisible(true);
        scorePane.setPadding(new Insets(10));
        scorePane.setVgap(10);
        scorePane.setHgap(10);
        scorePane.setStyle("-fx-border-color: black");
        int w = 50; // width of the text fields

        // add labels for results, add txfResults,
        // add labels and text fields for sums, bonus and total.
        // TODO

        Label lbl1 = new Label("1's");
        scorePane.add(lbl1, 1, 0);

        Label lbl2 = new Label("2's");
        scorePane.add(lbl2, 1, 1);

        Label lbl3 = new Label("3's");
        scorePane.add(lbl3, 1, 2);

        Label lbl4 = new Label("4's");
        scorePane.add(lbl4, 1, 3);

        Label lbl5 = new Label("5's");
        scorePane.add(lbl5, 1, 4);

        Label lbl6 = new Label("6's");
        scorePane.add(lbl6, 1, 5);

        Label lblsum1 = new Label("Sum");
        scorePane.add(lblsum1, 1, 6);
        scorePane.add(txfSumSame, 0, 6);
        txfSumSame.setMinSize(50, 25);
        txfSumSame.setMaxSize(50, 25);

        Label lblbonus = new Label("Bonus");
        scorePane.add(lblbonus, 1, 7);
        scorePane.add(txfBonus, 0, 7);
        txfBonus.setMinSize(50, 25);
        txfBonus.setMaxSize(50, 25);

        //-------

        Label lblOnePair = new Label("One Pair");
        scorePane.add(lblOnePair, 39, 0);

        Label lblTwoPair = new Label("Two Pair");
        scorePane.add(lblTwoPair, 39, 1);

        Label lblThreeSame = new Label("Three-Same");
        scorePane.add(lblThreeSame, 39, 2);

        Label lblFourSame = new Label("Four-Same");
        scorePane.add(lblFourSame, 39, 3);

        Label lblFullHouse = new Label("Full House");
        scorePane.add(lblFullHouse, 39, 4);

        Label lblSmallStraight = new Label("Small Straight");
        scorePane.add(lblSmallStraight, 39, 5);

        Label lblLargeStraight = new Label("Large Straight");
        scorePane.add(lblLargeStraight, 39, 6);

        Label lblChance = new Label("Chance");
        scorePane.add(lblChance, 39, 7);

        Label lblYatzy = new Label("Yatzy");
        scorePane.add(lblYatzy, 39, 8);


        for (int i = 0; i < txfResults.length - 9; i++) {
            txfResults[i] = new TextField();
            txfResults[i].setMinSize(50, 25);
            txfResults[i].setMaxSize(50, 25);
            scorePane.add(txfResults[i], 0, i);
            txfResults[i].setOnMouseClicked(event -> this.mouseClicked(event));
        }
        for (int j = txfResults.length - 9; j < txfResults.length; j++) {
            txfResults[j] = new TextField();
            txfResults[j].setMinSize(50, 25);
            txfResults[j].setMaxSize(50, 25);
            scorePane.add(txfResults[j], 40, j - 6);
            txfResults[j].setOnMouseClicked(event -> this.mouseClicked(event));
        }
        Label lblsumOther = new Label("Sum");
        scorePane.add(txfSumOther, 40, 9);
        scorePane.add(lblsumOther, 39, 9);
        txfSumOther.setMinSize(50, 25);
        txfSumOther.setMaxSize(50, 25);


        Label lblTotal = new Label("Total");
        scorePane.add(txfTotal, 21, 9);
        scorePane.add(lblTotal, 20, 9);
        txfTotal.setMinSize(50, 25);
        txfTotal.setMaxSize(50, 25);


    }

    // -------------------------------------------------------------------------

    // Create an action method for btnRoll's action.
    // Hint: Create small helper methods to be used in the action method.
    // TODO

    private void rollAction() {
        if (dice.getThrowCount() < 3) {
            boolean[] hold = new boolean[5];
            for (int i = 0; i < cbxHolds.length; i++) {
                hold[i] = cbxHolds[i].isSelected();

            }
            dice.throwDice(hold);

            for (int i = 0; i < dice.getValues().length; i++) {
                txfValues[i].setText("" + dice.getValues()[i]);
                if (hold[i]) {
                    txfValues[i].setDisable(true);
                    cbxHolds[i].setDisable(true);
                } else {
                    txfValues[i].setDisable(false);
                    cbxHolds[i].setSelected(false);
                    cbxHolds[i].setDisable(false);
                }
            }
            for (int i = 0; i < txfResults.length; i++) {
                if (txfResults[i].isDisable() == false)
                    txfResults[i].setText("" + dice.getResults()[i]);
            }


        }
        if (dice.getThrowCount() == 0) {
            for (int i = 0; i < cbxHolds.length; i++) {
                cbxHolds[i].setDisable(false);
            }
        }

    }


    // -------------------------------------------------------------------------

    // Create a method for mouse click on one of the text fields in txfResults.
    // Hint: Create small helper methods to be used in the mouse click method.
    // TODO
    private void mouseClicked(MouseEvent event) {
        if (dice.getThrowCount() != 0) {
            TextField txf = (TextField) event.getSource();
            txf.setDisable(true);

            int sum = 0;
            for (int i = 0; i < 6; i++) {
                if (txfResults[i].isDisable() == true) {
                    sum = sum + Integer.parseInt(txfResults[i].getText());
                }
            }
            int sum2 = 0;
            for (int i = 6; i < 15; i++) {
                if (txfResults[i].isDisable() == true) {
                    sum2 = sum2 + Integer.parseInt(txfResults[i].getText());
                }
            }
            txfSumSame.setText("" + sum);
            txfSumOther.setText("" + sum2);
            int temp = 0;
            dice.resetThrowCount();
            if (sum >= 63) {
                txfBonus.setText("" + 50);
                temp = 50;
            }

            txfTotal.setText("" + (sum + sum2 + temp));

        }
        if (dice.getThrowCount() == 0) {
            for (int i = 0; i < cbxHolds.length; i++) {
                txfValues[i].setDisable(false);
                cbxHolds[i].setSelected(false);

            }
        }
        if (dice.getThrowCount() == 0) {
            for (CheckBox cbxHold : cbxHolds) {
                cbxHold.setDisable(true);
            }
        }
    }
}


