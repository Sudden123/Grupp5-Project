package stepDefinitions;

import allRoundScoring.Competitor;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {

    @Given("I have typed competitors first name")
    public void i_have_typed_competitors_first_name() {
        String input = "Malin";
        Competitor firstName = new Competitor();
        firstName.setFirstName(input);

        assertEquals("Malin", firstName.getFirstName(input));
    }

    @When("I press enter")
    public void i_press_enter() {

    }

    @Then("The competitors first name is saved")
    public void the_competitors_first_name_is_saved() {

    }

    @Given("I have typed competitors last name")
    public void i_have_typed_competitors_last_name() {
        String input = "Göransson";
        Competitor lastName = new Competitor();
        lastName.setLastName(input);

        assertEquals("Göransson", lastName.getLastName(input));
    }


    @Then("The competitors last name is saved")
    public void the_competitors_last_name_is_saved() {

    }

    @Given("I have Performance results <value>")
    public void i_have_performance_results_value() {

    }

    @Given("I have input Performance <value>")
    public void i_have_input_performance_value() {

    }
    @When("I press Save")
    public void i_press_save() {

    }
    @Then("The result <value> should be saved")
    public void the_result_value_should_be_saved() {

    }


}
