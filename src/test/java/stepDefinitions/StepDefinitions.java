package stepDefinitions;

import competitor.Competitor;
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
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I have input Performance <value>")
    public void i_have_input_performance_value() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I press Save")
    public void i_press_save() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The result <value> should be saved")
    public void the_result_value_should_be_saved() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
