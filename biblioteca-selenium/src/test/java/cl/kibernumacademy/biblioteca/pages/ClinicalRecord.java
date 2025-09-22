package cl.kibernumacademy.biblioteca.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cl.kibernumacademy.biblioteca.hooks.DriverHolder;

public class ClinicalRecord {
    // Localizadores
    private By nombre = By.id("nombre");
    private By diagnostico = By.id("diagnostico");
    private By edad = By.id("edad");
    private By Tratamiento = By.id("tratamiento");
    private By botonGuardar = By.xpath("//button[@type='submit']");
    private By mensajeExito = By.xpath("//div[@class='alert alert-success']");
    
 // retornar driver web
  private WebDriver getDriver() {
    return DriverHolder.get();
  }
 // Abrir la página de registro de ficha clínica
  public void abrir() {
    getDriver().get("https://clinica-modular.netlify.app/");
  }
 // Registrar una nueva ficha clínica
  public void registarFicha(String nombrePaciente, String diagnosticoPaciente, String edadPaciente, String tratamientoPaciente) {
    WebDriver driver = getDriver();
    driver.findElement(nombre).sendKeys(nombrePaciente);
    driver.findElement(diagnostico).sendKeys(diagnosticoPaciente);
    driver.findElement(edad).sendKeys(edadPaciente);
    driver.findElement(Tratamiento).sendKeys(tratamientoPaciente);
    driver.findElement(botonGuardar).click();
  }

    public String obtenerMensajeExito() {
        WebElement messageSuccess = getDriver().findElement(mensajeExito);
        // Verifica si el mensaje de éxito está presente y devuelve su texto
        return messageSuccess.isDisplayed() ? messageSuccess.getText().trim() : "";
    }
    
}
