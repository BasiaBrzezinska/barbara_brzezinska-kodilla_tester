package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class WalletSteps {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Cashier cashier = new Cashier(cashSlot);
    private String message;
    private int displayBalance;
    private String depositMessage;
    private String debitMessage;

// Feature: Cash withdrawal
    @Given ("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        Assertions.assertEquals(200, wallet.getBalance());
    }

    @When("I request {int}")
    public void i_request_amount(int requested) {
        cashier.withdraw(wallet, requested);
    }

    @Then("{int} should be dispensed")
    public void should_be_dispensed(int dispensed) {
        Assertions.assertEquals(dispensed, cashSlot.getContents());
    }

    @Then ("The balance of my wallet should be {int}")
    public void balance_should_be(int balance){
        Assertions.assertEquals(balance, wallet.getBalance());
    }


    //Feature: Prevent users from taking out more money than their wallet contains
    @Given("there is ${int} in my wallet")
    public void there_is_$_in_my_wallet(int money) {
        wallet.deposit (money);
        Assertions.assertEquals(money, wallet.getBalance());
    }

    @When("I withdraw ${int}")
    public void i_withdraw_$(int amount) {
       message = cashier.withdraw(wallet, amount);
    }

    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        Assertions.assertEquals(0, cashSlot.getContents());
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_i_don_t_have_enough_money_in_my_wallet() {
        Assertions.assertEquals("You don't have enough money in your wallet", message);
    }

    //Feature: Display balance
    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
       displayBalance = wallet.getBalance();
    }

    @Then("I should see that the balance is ${int}")
    public void i_should_see_that_the_balance_is_$(int amount) {
        Assertions.assertEquals(amount, displayBalance);

    }

    //Feature: Display deposit amount
    @Given("My wallet is empty")
    public void my_wallet_is_empty() {
        wallet.getBalance();
    }

    @When("I deposited ${int}")
    public void i_deposited_$(int amount) {
       depositMessage = wallet.deposit(amount);
    }

    @Then("I should see {string}")
    public void i_should_see(String expectedMessage) {
       Assertions.assertEquals(expectedMessage, depositMessage);
    }

    //Feature: Display debit amount
    @Given("There is ${int} in the wallet")
    public void there_is_$_in_the_wallet(int money) {
        wallet.deposit(money);
    }

    @When("I tried to withdraw ${int}")
    public void tried_to_withdraw_$50(int amount) {
        debitMessage = wallet.debit(amount);
    }

    @Then("The message should be {string}")
    public void message_should_be (String expectedMessage) {
        Assertions.assertEquals(expectedMessage, debitMessage);
    }








}
