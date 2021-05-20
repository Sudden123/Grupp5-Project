package stepDefinitions;

import allRoundScoring.Competitor;
import allRoundScoring.Performance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {
    Competitor firstName = new Competitor();
    Competitor lastName = new Competitor();

    @Given("I have typed competitors first name as {string}")
    public void i_have_typed_competitors_first_name_as(String inputFirstName) {
        firstName.setFirstName(inputFirstName);
    }

    @When("I press enter")
    public void i_press_enter() {

    }

    @Then("The competitors first name is saved as {string}")
    public void the_competitors_first_name_is_saved_as(String inputFirstName) {

        if (inputFirstName.equals("Carolina")) {
            assertEquals("Carolina", firstName.getFirstName(inputFirstName));
        } else if (inputFirstName.equals("Katarina-Mary")) {
            assertEquals("Katarina-Mary", firstName.getFirstName(inputFirstName));
        } else if (inputFirstName.equals("Björn")) {
            assertEquals("Björn", firstName.getFirstName(inputFirstName));
        } else if (inputFirstName.equals("Sven Åke")) {
            assertEquals("Sven Åke", firstName.getFirstName(inputFirstName));
        }
        else
            System.out.println("Error with testing first name");
    }

    @Given("I have typed competitors last name as {string}")
    public void i_have_typed_competitors_last_name_as(String stringLastName) {
        lastName.setLastName(stringLastName);
    }


    @Then("The competitors last name is saved as {string}")
    public void the_competitors_last_name_is_saved_as(String stringLastName) {
        if (stringLastName.equals("Melnychenko")) {
            assertEquals("Melnychenko", lastName.getLastName(stringLastName));
        } else if (stringLastName.equals("Göransson")) {
            assertEquals("Göransson", lastName.getLastName(stringLastName));
        } else if (stringLastName.equals("Johnson-Thompson")) {
            assertEquals("Johnson-Thompson", lastName.getLastName(stringLastName));
        } else if (stringLastName.equals("O'Brien")) {
            assertEquals("O'Brien", lastName.getLastName(stringLastName));
        }
        else
            System.out.println("Error with testing last name");
    }

    @Given("I have Performance results <value>")
    public void i_have_performance_results_value() {
        int input = 200;
        Performance highJump = new Performance();
        highJump.setPerformanceValue(input);
        assertEquals(200, highJump.setPerformanceValue(input), 0);
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
