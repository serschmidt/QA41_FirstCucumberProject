package com.ilcarro.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LetTheCarWorkPage extends BasePage {

  public LetTheCarWorkPage(WebDriver driver) {
    super(driver);
  }


  @FindBy(css = ".pac-target-input")
  WebElement location;

  public LetTheCarWorkPage enterLocation() {
    type(location, "Haifa");
    location.sendKeys(Keys.DOWN, Keys.ENTER);
    return this;
  }


  @FindBy(id = "make")
  WebElement manufacture;

  public LetTheCarWorkPage enterManufacture() {
    type(manufacture, "vw");
    return this;
  }

  @FindBy(id = "model")
  WebElement model;

  public LetTheCarWorkPage enterModel() {
    type(manufacture, "golf");
    return this;
  }

  @FindBy(id = "year")
  WebElement year;

  public LetTheCarWorkPage enterYear() {
    type(manufacture, "2015");
    return this;
  }

  @FindBy(css = "#fuel>option[value='Diesel']")
  WebElement fuel;

  public LetTheCarWorkPage enterFuel() {
    click(fuel);
    return this;
  }

  @FindBy(id = "seats")
  WebElement seats;

  public LetTheCarWorkPage seats() {
    type(seats,"5");
    return this;
  }

  @FindBy(id = "class")
  WebElement carClass;

  public LetTheCarWorkPage carClass() {
    type(carClass, "compact");
    return this;
  }

  @FindBy(id = "serialNumber")
  WebElement serialNumber;

  public LetTheCarWorkPage registrationNumber() {
    type(serialNumber, "789456123");
    return this;
  }


  @FindBy(id = "price")
  WebElement price;

  public LetTheCarWorkPage carPrice() {
    type(price, "100");
    return this;
  }


  @FindBy(css = "#form>button[type='submit']")
  WebElement submitButton;


  public LetTheCarWorkPage clickSubmitButton() {
    click(submitButton);
    return this;
  }

  @FindBy(css = ".positive-button")
  WebElement showCarButton;


  public LetTheCarWorkPage clickShowCarButton() {
    click(showCarButton);
    return this;
  }

  @FindBy(xpath = "//h1[contains(text(),'Still available in your area')]")
  WebElement successMessage;


  public LetTheCarWorkPage isMessageTextPresent(String message) {
    pause(1000);
    assert successMessage.getText().contains(message);
    return this;
  }

}
