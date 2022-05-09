package ex2;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GUIex2 extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("ListView Demo2");
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

        Button btnDelete = new Button("Delete");
        pane.add(btnDelete, 2, 3);
        GridPane.setValignment(btnDelete, VPos.TOP);
        btnDelete.setOnAction(event -> this.deleteAction());
    }

    //    private void selectionChanged() {
//        person selected = lvwNames.getSelectionModel().getSelectedItem();
//        if (selected != null) {
//            txfName.setText(selected.toString());
//        }
//    }
    private void addPersonAction() {
        String name = txfName.getText().trim();
        String title = txfTitle.getText().trim();
        if (name.length() > 0 && title.length() > 0) {
            person p = new person(name, txfTitle.getText(), checkBoxSenior.isSelected());
            names.add(p);
            lvwNames.getItems().setAll(names);
            txfName.clear();
            txfTitle.clear();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Missing input for either 'Name' or 'Title'");
            alert.setHeaderText("No name or title typed");
            alert.setContentText("Makes sure you have filled both 'Name' and 'Title' textfield");
            alert.show();

            // wait for the modal dialog to close
        }
    }

    private void deleteAction() {
        int index = lvwNames.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            names.remove(index);
            txfName.clear();
            txfTitle.clear();
            lvwNames.getItems().setAll(names);
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Delete person");
            alert.setHeaderText("No person selected");
            alert.setContentText("Select a person to be deleted");
            alert.show();

            // wait for the modal dialog to close
        }
    }

}


