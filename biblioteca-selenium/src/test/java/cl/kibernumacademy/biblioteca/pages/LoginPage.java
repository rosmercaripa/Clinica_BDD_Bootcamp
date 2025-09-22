package cl.kibernumacademy.biblioteca.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cl.kibernumacademy.biblioteca.hooks.DriverHolder;


public class LoginPage {
  // Localizadores
  private By user = By.id("username");
  private By pass = By.id("password");
  private By botonLogin = By.xpath("//form[@id='login-form']//button[@type='submit']");
  private By mensajeLabel = By.id("login-message");

  // retornar driver web

  private WebDriver getDriver() {
    return DriverHolder.get();
  }

  public void abrir() {
    getDriver().get("https://clinica-modular.netlify.app/");
  }

  public void login(String usuario, String password) {
    WebDriver driver = getDriver();
    driver.findElement(user).sendKeys(usuario);
    driver.findElement(pass).sendKeys(password);  
    driver.findElement(botonLogin).click();
  }

  public String obtenerError() {
    List<WebElement> messageErrors = getDriver().findElements(mensajeLabel);
    return messageErrors.isEmpty() ? "" : messageErrors.get(0).getText().trim();
  }



}
