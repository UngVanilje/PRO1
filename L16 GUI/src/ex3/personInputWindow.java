package ex3;

import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class personInputWindow extends Stage {
    public personInputWindow(String title, Stage owner) {
        this.initOwner(owner);
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setMinHeight(100);
        this.setMinWidth(200);
        this.setResizable(false);

        this.setTitle("Personal info");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);

    }
    //----------------------------------------------

    private final TextField txfName = new TextField();
    private final TextField txfTitle = new TextField();
    private final ListView<Person> lvwNames = new ListView<>();
    private final ArrayList<Person> names = new ArrayList<>();
    CheckBox checkBoxSenior = new CheckBox();
    private Person actualPerson = null;


    private void initContent(GridPane pane) {


        // pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(20);
        pane.setVgap(10);

        // add a label to the pane (at col=0, row=0)
        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 0);
        pane.add(txfName, 1, 0);

        Label lblTitle = new Label("Title: ");
        pane.add(lblTitle, 0, 1);
        pane.add(txfTitle, 1, 1);

        checkBoxSenior.setText("Senior");
        pane.add(checkBoxSenior, 0, 2);

        Button btnAddPerson = new Button("Ok");
        pane.add(btnAddPerson, 1, 3);
        btnAddPerson.setOnAction(event -> this.okAction());

        Button btnCancel = new Button("Cancel");
        pane.add(btnCancel, 0, 3);
        //buttonBox.getChildren().add(btnCancel);
        btnCancel.setOnAction(event -> this.cancelAction());

    }

    private void okAction() {
        String name = txfName.getText().trim();
        String title = txfTitle.getText().trim();
        if (name.length() > 0 && title.length() > 0) {
            actualPerson = new Person(name, txfTitle.getText(), checkBoxSenior.isSelected());
            names.add(actualPerson);
            lvwNames.getItems().setAll(names);
            txfName.clear();
            txfTitle.clear();
            personInputWindow.this.hide();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Missing input for either 'Name' or 'Title'");
            alert.setHeaderText("No name or title typed");
            alert.setContentText("Makes sure you have filled both 'Name' and 'Title' textfield");
            alert.show();

            // wait for the modal dialog to close
        }
    }

    //----------------------------------------------------
    private void cancelAction() {
        txfName.clear();
        txfTitle.clear();
        personInputWindow.this.hide();
    }

    public Person getActualPerson() {
        return actualPerson;
    }


}