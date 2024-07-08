package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LetTheCarWorkPage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class AddCar {


  @And("User clicks on Log in link")
  public void click_on_Login_link() {
    new HomePage(driver).clickOnLoginLink();
  }

  @And("User enters valid data")
  public void enters_valid_data() {
    new LoginPage(driver).enterData("hans@gm.com","Qwert007!");
  }

  @And("User clicks on Yalla button")
  public void clicks_on_Yalla_button() {
    new LoginPage(driver).clickOnYallaButton();
  }

  @And("User clicks on Let_the_car_work link")
  public void click_on_Let_the_car_work_link(){
    new LoginPage(driver).clickOnTheCarWorkLink();
  }


  @And("User enters location")
  public void enter_location(){
    new LetTheCarWorkPage(driver).enterLocation();
  }

  @And("User enter car manufacture")
  public void enter_manufacture(){
    new LetTheCarWorkPage(driver).enterManufacture();
  }

  @And("User enters model")
  public void enter_model(){
    new LetTheCarWorkPage(driver).enterModel();
  }

  @And("User enters year")
  public void enter_year(){
    new LetTheCarWorkPage(driver).enterYear();
  }

  @And("User selects the fuel")
  public void enter_fuel(){
    new LetTheCarWorkPage(driver).enterFuel();
  }

  @And("User enters seats")
  public void enter_seats(){
    new LetTheCarWorkPage(driver).seats();
  }

  @And("User enters car class")
  public void enter_car_class(){
    new LetTheCarWorkPage(driver).carClass();
  }

  @And("User enters rugistration number")
  public void enter_registration_number(){
    new LetTheCarWorkPage(driver).registrationNumber();
  }

  @And("User enters price")
  public void enter_price(){
    new LetTheCarWorkPage(driver).carPrice();
  }


  @And("User clicks on submit")
  public void click_on_submit_button(){
    new LetTheCarWorkPage(driver).clickSubmitButton();
  }

  @And ("User clicks in show car button")
  public void click_on_show_car_button(){
    new LetTheCarWorkPage(driver).clickShowCarButton();
  }

  @Then("User verifies Success Message is displayed")
  public void verify_Success_Message() {
    new LetTheCarWorkPage(driver).isMessageTextPresent("Still available in your area");
  }
////          And User quites browser


}


/*
 * Hans
 * Mustermann
 * hans@gm.com
 * Qwert007!
 * */



