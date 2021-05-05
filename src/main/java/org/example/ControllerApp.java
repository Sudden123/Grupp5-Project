package org.example;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerApp {
    public TextField txtFldFirstName;
    public TextField txtFldLastName;
    public Button btnRegister;

    public void registerCompetitor(ActionEvent actionEvent) {
        String firstName = txtFldFirstName.getText();
        String lastName = txtFldLastName.getText();
    }
}
