package ex3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class GUIex3 extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("ListView Demo2");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

        personWindow = new personInputWindow("Personal info", stage);
    }

    // -------------------------------------------------------------------------

    private final TextField txfName = new TextField();
    private final TextField txfTitle = new TextField();
    private final ListView<Person> lvwNames = new ListView<>();
    private final ArrayList<Person> names = new ArrayList<>();
    private personInputWindow personWindow;


    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);


        // add a label to the pane
        Label lblNames = new Label("Names:");
        pane.add(lblNames, 0, 0);
        GridPane.setValignment(lblNames, VPos.TOP);


        // add a listView to the pane
        pane.add(lvwNames, 1, 0);
        lvwNames.setPrefWidth(200);
        lvwNames.setPrefHeight(200);
        lvwNames.setEditable(false);

        Button btnDelete = new Button("Delete");
        pane.add(btnDelete, 2, 1);
        GridPane.setValignment(btnDelete, VPos.TOP);
        btnDelete.setOnAction(event -> this.deleteAction());

        Button btnAddPerson = new Button("Add Person");
        pane.add(btnAddPerson, 2, 0);
        GridPane.setValignment(btnAddPerson, VPos.TOP);
        btnAddPerson.setOnAction(event -> this.addPersonAction());
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

    private void addPersonAction() {

        personWindow.showAndWait();

        // wait for the modal dialog to close

        if (personWindow.getActualPerson() != null) {
            Person person1 = personWindow.getActualPerson();
            names.add(person1);
            lvwNames.getItems().setAll(names);
        }
//        String input = "";
//        if (result.isPresent()) {
//            input = result.get();
//            if (input.length() > 0) {
//                toString().setText(lvwNames. + input + "\n");
//            }
//        }
    }

}



