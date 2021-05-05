package org.example;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class AllRoundController {
    public TextField txtFldFirstName;
    public TextField txtFldLastName;
    public Button btnRegister;
    public Label lblRegistrationMessage;
    public RadioButton rdBtnMale;
    public RadioButton rdBtnFemale;

    public void registerCompetitor(ActionEvent actionEvent) {
        String firstName = txtFldFirstName.getText();
        String lastName = txtFldLastName.getText();

        String decaOrHepta= "0";
        if (rdBtnFemale.isSelected())
            decaOrHepta="heptathlon";
        else if(rdBtnMale.isSelected())
            decaOrHepta="decathlon";

        lblRegistrationMessage.setText("Competitor " + firstName + " " + lastName + " successfully registered for " + decaOrHepta + ".");
    }


    public void saveMale(ActionEvent actionEvent) {
    }

    public void saveFemale(ActionEvent actionEvent) {
    }
}
