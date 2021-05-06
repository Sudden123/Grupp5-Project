package stepDefinitions;

import competitor.Competitor;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;


public class StepDefinitions {

    /*// Method to enter value into text field:
    public void sendKeys(By by, String input) {
        textField.sendKeys(input);
    }*/

    @Given("I have opened the app")
    public void i_have_opened_the_app() {
        Competitor firstName = new Competitor();

        String input = firstName.getFirstname();

        assertEquals("Per", input);

        //txtFldFirstName.sendKeys("Per");
    }


    @Given("I have typed competitors first name in textbox")
    public void i_have_typed_competitors_first_name_in_textbox() {

    }

    @When("I press submit")
    public void i_press_submit() {

    }

    @Then("The competitors first name is saved")
    public void the_competitors_first_name_is_saved() {

    }

}
