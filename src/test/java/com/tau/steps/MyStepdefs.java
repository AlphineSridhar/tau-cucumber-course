package com.tau.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {

    private WebDriver driver;

    @Given("I am login page of the internet banking customer")
    public void i_am_login_page_of_the_internet_banking_customer() {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\srid2212\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("I enter valid credentials {string} and {string}")
    public void iEnterValidCredentialsUsernameAndPassword(String username, String password) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
    }

/**@When("I enter valid credentials")
    public void i_enter_valid_credentials() {

        driver.findElement(By.name("username")).sendKeys("tautester");
        driver.findElement(By.name("password")).sendKeys("password");
        driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
    }**/

    @And("i can able to see the transaction list table {int}")
    public void iCanAbleToSeeTheTransactionListTable(int arg0) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"accountTable\"]/tbody/tr[1]/td[1]/a")).click();
        System.out.println("Success!! Your first cucumber test executed");
    }

    @Then("I should be able to see the logout button")
    public void i_should_be_able_to_see_the_logout_button() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.linkText("Log Out")).click();
        driver.quit();
    }

    @When("I enter valid credentials <username> and <password>")
    public void iEnterValidCredentialsUsernameAndPassword() {
    }
}