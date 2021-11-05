module com.example.selectordecolores {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.selectordecolores to javafx.fxml;
    exports com.example.selectordecolores;
}