package cl.kibernumacademy.biblioteca.hooks;

import org.openqa.selenium.WebDriver;

public class DriverHolder {
  // almacena un webdriver por hilo, util para ejecución paralela
  private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

  public static void set(WebDriver webDriver) {
    driver.set(webDriver);
  }

  public static WebDriver get() {
    WebDriver webDriver = driver.get();
    // webDriver no esta inicializado
    if(webDriver == null) {
      // Configuración del ChromeDriver
      throw new IllegalStateException("WebDriver no inicializado");
    }
    return webDriver;
  }

  // Eliminar el webdriver
  public static void remove() {
    driver.remove();
  }
}
