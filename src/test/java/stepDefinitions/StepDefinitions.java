package stepDefinitions;

import allRoundScoring.Competitor;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {

    @Given("I have typed competitors first name")
    public void i_have_typed_competitors_first_name() {
        String input = "Per";
        Competitor firstName = new Competitor();
        firstName.setFirstName(input);

        assertEquals("Per", firstName.getFirstName(input));
    }

    @When("I press submit")
    public void i_press_submit() {

    }
    @Then("The competitors first name is saved")
    public void the_competitors_first_name_is_saved() {

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

    @Given("I have typed competitors last name")
    public void i_have_typed_competitors_last_name() {
        String input = "Soderberg";
        Competitor comp = new Competitor();
        comp.setLastName(input);

        assertEquals("Soderberg", comp.getLastName(input));
    }


}
