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


    //ObservableList<NumberBinding> valores = FXCollections.observableArrayList();
    // ListProperty<NumberBinding> valores;

    public Vista() {
        inciarElementos();
    }

    public void inciarElementos() {
        pantalla.setPrefSize(400, 100);

        valorR = (NumberBinding) sliderR.valueProperty();
        valorG = (NumberBinding) sliderG.valueProperty();
        valorB = (NumberBinding) sliderB.valueProperty();

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

        labelValueG.setText(valorR.toString());
        labelValueG.setText(valorG.toString());
        labelValueG.setText(valorB.toString());


        sliderR.setShowTickMarks(true);
        sliderG.setShowTickMarks(true);
        sliderB.setShowTickMarks(true);

       // pantalla.setBackground(new Background(new BackgroundFill(Color.color(valorR.doubleValue(), valorG.doubleValue(), valorB.doubleValue()));

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