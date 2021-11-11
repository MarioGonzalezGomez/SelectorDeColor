package com.example.selectordecolores;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class Vista extends VBox {
    Label pantalla = new Label();
    HBox hboxR = new HBox();
    HBox hboxG = new HBox();
    HBox hboxB = new HBox();

    Label labelR = new Label();
    Label labelG = new Label();
    Label labelB = new Label();

    Label labelValueR = new Label();
    Label labelValueG = new Label();
    Label labelValueB = new Label();

    Slider sliderR = new Slider(0, 255, 0);
    Slider sliderG = new Slider(0, 255, 0);
    Slider sliderB = new Slider(0, 255, 0);

    SimpleIntegerProperty valorR;
    SimpleIntegerProperty valorG;
    SimpleIntegerProperty valorB;


    public Vista() {
        inciarElementos();
    }

    public void inciarElementos() {

        pantalla.setPrefSize(400, 100);

        sliderR.setShowTickMarks(true);
        sliderG.setShowTickMarks(true);
        sliderB.setShowTickMarks(true);

        valorR = new SimpleIntegerProperty();
        valorG = new SimpleIntegerProperty();
        valorB = new SimpleIntegerProperty();

        valorR.bind(sliderR.valueProperty());
        valorG.bind(sliderG.valueProperty());
        valorB.bind(sliderB.valueProperty());

        labelValueR.textProperty().bind(valorR.asString());
        labelValueG.textProperty().bind(valorG.asString());
        labelValueB.textProperty().bind(valorB.asString());

        labelValueR.setMinWidth(30);
        labelValueG.setMinWidth(30);
        labelValueB.setMinWidth(30);

        hboxR.getChildren().add(labelR);
        hboxR.getChildren().add(sliderR);
        hboxR.getChildren().add(labelValueR);

        hboxG.getChildren().add(labelG);
        hboxG.getChildren().add(sliderG);
        hboxG.getChildren().add(labelValueG);

        hboxB.getChildren().add(labelB);
        hboxB.getChildren().add(sliderB);
        hboxB.getChildren().add(labelValueB);

        this.getChildren().add(pantalla);
        this.getChildren().add(hboxR);
        this.getChildren().add(hboxG);
        this.getChildren().add(hboxB);

        labelR.setText("Red: ");
        labelG.setText("Green: ");
        labelB.setText("Blue: ");

        labelR.setMinWidth(40);
        labelG.setMinWidth(40);
        labelB.setMinWidth(40);


        sliderR.prefWidthProperty().bind(this.widthProperty().subtract(labelR.getWidth()).subtract(labelValueR.getWidth()));
        sliderG.prefWidthProperty().bind(this.widthProperty().subtract(labelG.getWidth()).subtract(labelValueG.getWidth()));
        sliderB.prefWidthProperty().bind(this.widthProperty().subtract(labelB.getWidth()).subtract(labelValueB.getWidth()));

        pantalla.prefWidthProperty().bind(this.widthProperty());
        pantalla.prefHeightProperty().bind(this.heightProperty().subtract(hboxR.getHeight()).multiply(3));


        valorR.addListener(e -> {
            BackgroundFill fill = new BackgroundFill(
                    Color.rgb(valorR.intValue(), valorG.intValue(), valorB.intValue()),
                    null,
                    null);
            pantalla.setBackground(new Background(fill));
        });

        valorG.addListener(e -> {
            BackgroundFill fill = new BackgroundFill(
                    Color.rgb(valorR.intValue(), valorG.intValue(), valorB.intValue()),
                    null,
                    null);
            pantalla.setBackground(new Background(fill));
        });

        valorB.addListener(e -> {
            BackgroundFill fill = new BackgroundFill(
                    Color.rgb(valorR.intValue(), valorG.intValue(), valorB.intValue()),
                    null,
                    null);
            pantalla.setBackground(new Background(fill));
        });
    }

    protected void onHelloButtonClick() {

    }
}