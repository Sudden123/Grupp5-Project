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
    Performance calc = new Performance();
    double actual;

    @Given("I have typed competitor's first name as {string}")
    public void i_have_typed_competitor_s_first_name_as(String inputFirstName) {
        firstName.setFirstName(inputFirstName);
    }

    @When("I press enter")
    public void i_press_enter() {
    }

    @Then("The competitor's first name is saved as {string}")
    public void the_competitor_s_first_name_is_saved_as(String inputFirstName) {
        if (inputFirstName.equals("Carolina")) {
            assertEquals("Carolina", firstName.getFirstName(inputFirstName));
        } else if (inputFirstName.equals("Katarina-Mary")) {
            assertEquals("Katarina-Mary", firstName.getFirstName(inputFirstName));
        } else if (inputFirstName.equals("Jorgen")) {
            assertEquals("Jorgen", firstName.getFirstName(inputFirstName));
        } else if (inputFirstName.equals("Hakan Mattias Peter")) {
            assertEquals("Hakan Mattias Peter", firstName.getFirstName(inputFirstName));
        }
        else
            System.out.println("Error with testing first name");
    }

    @Given("I have typed competitor's last name as {string}")
    public void i_have_typed_competitor_s_last_name_as(String stringLastName) {
        lastName.setLastName(stringLastName);
    }

    @Then("The competitor's last name is saved as {string}")
    public void the_competitor_s_last_name_is_saved_as(String stringLastName) {
        if (stringLastName.equals("Melnychenko")) {
            assertEquals("Melnychenko", lastName.getLastName(stringLastName));
        } else if (stringLastName.equals("Göransson")) {
            assertEquals("Göransson", lastName.getLastName(stringLastName));
        } else if (stringLastName.equals("Johnson-Thompson")) {
            assertEquals("Johnson-Thompson", lastName.getLastName(stringLastName));
        } else if (stringLastName.equals("O'Brien ")) {
            assertEquals("O'Brien", lastName.getLastName(stringLastName));
        }
        else
            System.out.println("Error with testing last name");
    }

    @Given("I have entered {int} cm for a high jump in decathlon")
    public void i_have_entered_cm_for_a_high_jump_in_decathlon(double height) {
        calc = new Performance();
        calc.setHeight(height);
    }

    @When("I ask for the result in high jump")
    public void i_ask_for_the_result_in_high_jump(){
        actual = calc.getHighJumpDeca();

    }
    @Then("I get {int} points in high jump")
    public void i_get_points_in_high_jump(Integer int1) {
        assertEquals(1111, actual, 0);
    }

    @Given("I have entered {int} cm for a long jump in decathlon")
    public void i_have_entered_cm_for_a_long_jump_in_decathlon(double distance) {
        calc = new Performance();
        calc.setDistance(distance);
    }
    @When("I ask for the result in long jump")
    public void i_ask_for_the_result_in_long_jump() {
        actual = calc.getLongJumpDeca();
    }
    @Then("I get {int} points in long jump")
    public void i_get_points_in_long_jump(Integer int1) {
        assertEquals(206, actual, 0);
    }
}