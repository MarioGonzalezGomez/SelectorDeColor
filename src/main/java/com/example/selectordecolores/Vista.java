package com.example.selectordecolores;

import javafx.beans.binding.NumberBinding;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
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

    NumberBinding valorR;
    NumberBinding valorG;
    NumberBinding valorB;


    public Vista() {
        inciarElementos();
    }

    public void inciarElementos() {
        pantalla.setPrefSize(400, 100);

        sliderR.setShowTickMarks(true);
        sliderG.setShowTickMarks(true);
        sliderB.setShowTickMarks(true);

        valorR = sliderR.valueProperty().divide(255);
        valorG = sliderG.valueProperty().divide(255);
        valorB = sliderB.valueProperty().divide(255);

        labelValueR.textProperty().bind(valorR.asString());
        labelValueG.textProperty().bind(valorG.asString());
        labelValueB.textProperty().bind(valorB.asString());

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

        // pantalla.setBackground(new Background(new BackgroundFill(Color.color(valorR.intValue(), valorG.intValue(), valorB.intValue()), null, null));

        //pantalla.eightProperty()
      //  pantalla.widthProperty()

        valorR.addListener(e -> {
            BackgroundFill fill = new BackgroundFill(
                    Color.color(valorR.doubleValue(), valorG.doubleValue(), valorB.doubleValue()),
                    null,
                    null);
            pantalla.setBackground(new Background(fill));
        });

        valorG.addListener(e -> {
            BackgroundFill fill = new BackgroundFill(
                    Color.color(valorR.doubleValue(), valorG.doubleValue(), valorB.doubleValue()),
                    null,
                    null);
            pantalla.setBackground(new Background(fill));
        });

        valorB.addListener(e -> {
            BackgroundFill fill = new BackgroundFill(
                    Color.color(valorR.doubleValue(), valorG.doubleValue(), valorB.doubleValue()),
                    null,
                    null);
            pantalla.setBackground(new Background(fill));
        });

        // valores.add(valorR);
        // valores.add(valorG);
        // valores.add(valorB);

        // pantalla.backgroundProperty().bind(valorR.asString("Valor del slider: %.d"));
        // pantalla.backgroundProperty().bind(valorG.asString("Valor del slider: %.d"));
        // pantalla.backgroundProperty().bind(valorB.asString("Valor del slider: %.d"));

        //pantalla.backgroundProperty().bind(valores);


        sliderR.valueProperty().addListener((observable, oldValue, newValue) -> {
            // pantalla.setBackground(new Background(new BackgroundFill(Color.color(valorR.doubleValue(), valorG.doubleValue(), valorB.doubleValue())), CornerRadii.EMPTY, Insets.EMPTY);
            //new Color(valorR.intValue(), valorG.intValue(), valorB.intValue())))
        });

        //valorR.addListener(new ChangeListener<Number>() {
        //     @Override
        //         pantalla.setText(valorR);
        //    }
        // });
    }


    protected void onHelloButtonClick() {

    }
}