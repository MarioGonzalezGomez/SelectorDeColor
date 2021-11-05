package com.example.selectordecolores;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Vista vista = new Vista();
        stage.setTitle("ColorPicker");
        stage.initStyle(StageStyle.DECORATED);
        Scene scene = new Scene(vista, 400, 200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}