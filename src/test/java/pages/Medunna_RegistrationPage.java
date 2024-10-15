package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Medunna_RegistrationPage {
   public Medunna_RegistrationPage(){ PageFactory.initElements(Driver.getDriver(), this); }



 @FindBy(id = "ssn")
 public WebElement ssnField;

 @FindBy(id = "firstName")
 public WebElement firstnameField;

 @FindBy(id = "lastName")
 public WebElement lastNameField;

 @FindBy(id = "username")
 public WebElement usernameField;

 @FindBy(id = "email")
 public WebElement emailField;

 @FindBy(id = "firstPassword")
 public WebElement firstPasswordField;

 @FindBy(id = "secondPassword")
 public WebElement secondPasswordField;

 @FindBy(id = "register-submit")
 public WebElement submitButton;

 @FindBy(className = "Toastify__toast-body")
 public WebElement message;




}

