package ex1;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GUIex1 extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("ListView Demo1");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfName = new TextField();
    private final TextField txfTitle = new TextField();
    private final ListView<person> lvwNames = new ListView<>();
    private final ArrayList<person> names = new ArrayList<>();
    CheckBox checkBoxSenior = new CheckBox();


    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        // add a label to the pane (at col=0, row=0)
        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 0);


        // add a label to the pane (at col=0, row=1)
        Label lblNames = new Label("Names:");
        pane.add(lblNames, 0, 3);
        GridPane.setValignment(lblNames, VPos.TOP);

        // add a text field to the pane (at col=1, row=0)
        pane.add(txfName, 1, 0);

        Label lblTitle = new Label("Title: ");
        pane.add(lblTitle, 0, 1);

        pane.add(txfTitle, 1, 1);

        // add a listView to the pane(at col=1, row=1)
        pane.add(lvwNames, 1, 3);
        lvwNames.setPrefWidth(200);
        lvwNames.setPrefHeight(200);
        lvwNames.setEditable(false);


        checkBoxSenior.setText("Senior");
        pane.add(checkBoxSenior, 0, 2);


//        ChangeListener<person> listener = (ov, o, n) -> this.selectionChanged();
//        lvwNames.getSelectionModel().selectedItemProperty().addListener(listener);

        Button btnAddPerson = new Button("Add person");
        pane.add(btnAddPerson, 2, 2);
        GridPane.setValignment(btnAddPerson, VPos.CENTER);

        // connect a method to the button
        btnAddPerson.setOnAction(event -> this.addPersonAction());
    }

    private void addPersonAction() {
        String name = txfName.getText().trim();
        if (name.length() > 0) {
            person p = new person(name, txfTitle.getText(), checkBoxSenior.isSelected());
            names.add(p);
            lvwNames.getItems().setAll(names);
            txfName.clear();
            txfTitle.clear();
        }
    }

    private void noInputAction() {
        String name = txfName.getText().trim();
        String title = txfTitle.getText().trim();
        boolean senior = checkBoxSenior.isSelected();

        if (name.isEmpty() || title.isEmpty()) {

        }
    }

}

