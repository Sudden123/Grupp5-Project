package stepDefinitions;

import allRoundScoring.Competitor;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {

    @Given("I have typed competitors first name as {string}")
    public void i_have_typed_competitors_first_name_as(String inputFirstName) {
        //String input = "Malin";
        Competitor firstName = new Competitor();
        firstName.setFirstName(inputFirstName);

        if (inputFirstName.equals("Carolina")) {
            assertEquals("Carolina", firstName.getFirstName(inputFirstName));
        } else if (inputFirstName.equals("Katarina Mary")) {
            assertEquals("Katarina Mary", firstName.getFirstName(inputFirstName));
        } else if (inputFirstName.equals("Bjorn")) {
            assertEquals("Bjorn", firstName.getFirstName("Bjorn"));
        } else if (inputFirstName.equals("Ake")) {
            assertEquals("Ake", firstName.getFirstName("Ake"));
        }
    }

    @When("I press enter")
    public void i_press_enter() {

    }

    @Then("The competitors first name is saved")
    public void the_competitors_first_name_is_saved() {

    }

    @Given("I have typed competitors last name as {string}")
    public void i_have_typed_competitors_last_name_as(String stringLastName) {
        Competitor lastName = new Competitor();
        lastName.setLastName(stringLastName);

        if (stringLastName.equals("Melnychenko")) {
            assertEquals("Melnychenko", lastName.getLastName(stringLastName));
        } else if (stringLastName.equals("Kluft")) {
            assertEquals("Kluft", lastName.getLastName(stringLastName));
        } else if (stringLastName.equals("Johnson-Thompson")) {
            assertEquals("Johnson-Thompson", lastName.getLastName(stringLastName));
        } else if (stringLastName.equals("O'Brien")) {
            assertEquals("O'Brien", lastName.getLastName(stringLastName));
        }
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
