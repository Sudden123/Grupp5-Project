module org.example {
  /*  requires javafx.controls;
    requires javafx.fxml;

    opens org.example to javafx.fxml;
    exports org.example;

   */
    requires javafx.fxml;
    requires javafx.controls;
    opens sample;
}