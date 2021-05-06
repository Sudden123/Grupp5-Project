module Grupp5.Project {

    requires javafx.controls;
    requires javafx.fxml;
    opens org.example to javafx.fxml;
    exports org.example;
}
