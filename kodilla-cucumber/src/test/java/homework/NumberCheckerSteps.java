package homework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class NumberCheckerSteps {

    private int number;
    private String result;


    @Given("number is {int}")
    public void number_is(int number) {
        this.number = number;
    }

    @When("I check if it's divisible by 3")
    public void i_check_if_it_is_divisible_by_3() {
        result = NumberChecker.check(number);
    }

    @When("I check if it's divisible by 5")
    public void i_check_if_it_is_divisible_by_5() {
        result = NumberChecker.check(number);
    }

    @When("I check if it's divisible by 3 and 5")
    public void i_check_if_it_is_divisible_by_3_and_5() {
        result = NumberChecker.check(number);
    }

    @Then("it should return {string}")
    public void it_should_return(String expected) {
        Assertions.assertEquals(expected, result);
    }

}
