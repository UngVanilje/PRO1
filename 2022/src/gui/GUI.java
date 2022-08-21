package gui;
import controller.Controller;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import model.Medarbejder;
import model.Vagt;
import storage.Storage;

public class GUI extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage stage) {
        stage.setTitle("Indsæt navn");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private final ListView<Medarbejder> lvwMedarbejdere = new ListView<>();
    private final ListView<Vagt> lvwVagter = new ListView<>();
    private final TextField txfvagtInfo = new TextField();
    private final Button btnTildelVagt = new Button("Tildel vagt");
    private final Button btnUdskrivVagtTilFil = new Button("Udskriv vagt til fil");

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(20));
        pane.setHgap(20);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);


        
        Label lblMedarbejdere = new Label("Alle medarbejdere");
        pane.add(lblMedarbejdere, 0, 0);

        pane.add(lvwMedarbejdere, 0, 1);
        lvwMedarbejdere.setPrefHeight(200);
        lvwMedarbejdere.setPrefWidth(250);
        ChangeListener<Medarbejder> listener =
                (obs, o, n) -> this.medarbejderSelectionChanged();
        lvwMedarbejdere.getSelectionModel().selectedItemProperty().addListener(listener);


        Label lblVagter = new Label("Alle vagter");
        pane.add(lblVagter, 1, 0);

        pane.add(lvwVagter, 1, 1);
        lvwVagter.setPrefHeight(200);
        lvwVagter.setPrefWidth(250);
        ChangeListener<Vagt> listener1 =
                (obs, o, n) -> this.vagterSelectionChanged();
        lvwVagter.getSelectionModel().selectedItemProperty().addListener(listener1);

        pane.add(btnTildelVagt, 1, 2);
        btnTildelVagt.setOnAction(event -> this.tildelAction());


        
        Label lblvagtInfo = new Label("Valgt vagt");
        pane.add(lblvagtInfo, 2, 0);

        pane.add(txfvagtInfo, 2, 1);
        txfvagtInfo.setPrefHeight(200);
        txfvagtInfo.setPrefWidth(250);

        pane.add(btnUdskrivVagtTilFil, 2, 2);
        btnUdskrivVagtTilFil.setOnAction(event -> this.udskrivAction());


        Controller.initStorage();

        this.fillMedarbejderList();

        Controller.initStorage();
        this.fillMedarbejderList();

    }
    private void fillMedarbejderList() {
        lvwMedarbejdere.getItems().clear();
        lvwMedarbejdere.getItems().addAll(Storage.getMedarbejderS());
    }
    private void fillVagterList(){
        lvwVagter.getItems().clear();
        lvwVagter.getItems().addAll(Storage.getVagterS());
    }
    private void fillvagtInfoList(){
        txfvagtInfo.setText(this.txfvagtInfo.getText());
    }
    private void medarbejderSelectionChanged() {
        Medarbejder selected = lvwMedarbejdere.getSelectionModel().getSelectedItem();
        if (selected != null)
            this.fillVagterList();
    }
    private void vagterSelectionChanged(){
        Vagt selected = lvwVagter.getSelectionModel().getSelectedItem();
        if(selected != null)
            this.fillvagtInfoList();
    }

    private void tildelAction(){}

    private void udskrivAction(){}
}
