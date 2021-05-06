package stepDefinitions;

import competitor.Competitor;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {

    @Given("I have typed competitors first name")
    public void i_have_typed_competitors_first_name() {
        Competitor firstName = new Competitor();

        String input = "Per";
        String FirstName = firstName.getFirstName(input);

        assertEquals("Per", FirstName);
    }
    @When("I press submit")
    public void i_press_submit() {

    }
    @Then("The competitors first name is saved")
    public void the_competitors_first_name_is_saved() {

    }

}
