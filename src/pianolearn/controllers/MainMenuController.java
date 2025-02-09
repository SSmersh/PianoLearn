package pianolearn.controllers;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MainMenuController extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent menu = FXMLLoader.load(getClass().getResource("scenes/MainMenuScene.fxml"));

        Scene menuScene = new Scene(menu);
        stage.setTitle("PianoLearn");

        stage.setScene(menuScene);
        stage.show();
    }

    // when this method is called -> change scene to piano
    public void openPiano(ActionEvent actionEvent) {
        try {
            Stage window = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("scenes/PianoScene.fxml"))));
            window.show();
        } catch (IOException e) {
            System.err.println("Error: Cannot open piano.");
            e.printStackTrace();
        }
    }

    // when this method is called -> change scene to handbook
    public void openHandBook(ActionEvent actionEvent) {
        try {
            Stage window = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("scenes/HandBookScene.fxml"))));
            window.show();
        } catch (IOException e) {
            System.err.println("Error: Cannot open handbook.");
            e.printStackTrace();
        }
    }
}
