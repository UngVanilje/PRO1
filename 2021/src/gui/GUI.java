package gui;

import controller.Controller;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Deltagelse;
import model.Fag;
import model.Lektion;
import model.deltagerStatus;
import storage.Storage;

public class GUI extends Application{
    public static void main(String[] args) {Application.launch(args);}

    public void start(Stage stage) {
        stage.setTitle("Fraværssystem");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }
    private final ListView<Fag> lvwFag = new ListView<>();
    private final ListView<Lektion> lvwLektion = new ListView<>();
    private final ListView<Deltagelse> lvwDeltagelse = new ListView<>();
    private final RadioButton rbTilstede = new RadioButton("Tilstede");
    private final RadioButton rbFravær = new RadioButton("Fravær");
    private final RadioButton rbSyg = new RadioButton("Syg");
    private final RadioButton rbAfbud = new RadioButton("Afbud");
    private final Button btnRegistrer = new Button("Registrer");
    private final ToggleGroup group = new ToggleGroup();

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(20));
        pane.setHgap(20);
        pane.setVgap(10);
        pane.setGridLinesVisible(false);

        Label lblFag = new Label("Fag");
        pane.add(lblFag, 0, 0);

        pane.add(lvwFag, 0, 1);
        lvwFag.setPrefHeight(200);
        lvwFag.setPrefWidth(250);
        ChangeListener<Fag> listener =
                (obs, o, n) -> this.fagSelectionChanged();
        lvwFag.getSelectionModel().selectedItemProperty().addListener(listener);

        Label lblLektion = new Label("Lektion");
        pane.add(lblLektion, 1, 0);

        pane.add(lvwLektion, 1, 1);
        lvwLektion.setPrefHeight(200);
        lvwLektion.setPrefWidth(250);
        ChangeListener<Lektion> listener1 =
                (obs, o, n) -> this.lektionSelectionChanged();
        lvwLektion.getSelectionModel().selectedItemProperty().addListener(listener1);

        Label lblDeltagelse = new Label("Deltagelse");
        pane.add(lblDeltagelse, 2, 0);

        pane.add(lvwDeltagelse, 2, 1);
        lvwDeltagelse.setPrefHeight(200);
        lvwDeltagelse.setPrefWidth(250);

        Label lblÅrsager = new Label("Fraværsårsager");
        VBox box = new VBox(rbTilstede, rbFravær, rbSyg, rbAfbud, btnRegistrer);
        pane.add(lblÅrsager,3,0);
        pane.add(box,3, 1);
        btnRegistrer.setOnAction(event -> this.registrerAction());

        rbTilstede.setToggleGroup(group);
        rbTilstede.setUserData(deltagerStatus.TILSTEDE);

        rbFravær.setToggleGroup(group);
        rbFravær.setUserData(deltagerStatus.FRAVÆR);

        rbSyg.setToggleGroup(group);
        rbSyg.setUserData(deltagerStatus.SYG);

        rbAfbud.setToggleGroup(group);
        rbAfbud.setUserData(deltagerStatus.AFBUD);


        Controller.initStorage();
        this.fillFagList();


    }
    private void fillFagList() {
        lvwFag.getItems().clear();
        lvwFag.getItems().addAll(Storage.getFag());
    }
    private void fillLektionList(Fag fag){
        lvwLektion.getItems().clear();
        lvwLektion.getItems().addAll(fag.getLektioner());
    }
    private void fillDeltagelseList(Lektion lektion){
        lvwDeltagelse.getItems().clear();
        lvwDeltagelse.getItems().addAll(lektion.getDeltagelse());
    }

    private void fagSelectionChanged() {
        Fag selected = lvwFag.getSelectionModel().getSelectedItem();
        if (selected != null)
            this.fillLektionList(selected);
    }
    private void lektionSelectionChanged(){
        Lektion selected = lvwLektion.getSelectionModel().getSelectedItem();
        if(selected != null)
            this.fillDeltagelseList(selected);
    }

    public void registrerAction(){
        lvwDeltagelse.getSelectionModel().getSelectedItem().setRegistreret(true);
        lvwDeltagelse.getSelectionModel().getSelectedItem().setStatus((deltagerStatus) group.getSelectedToggle().getUserData());
        fillDeltagelseList(lvwLektion.getSelectionModel().getSelectedItem());
    }

}
