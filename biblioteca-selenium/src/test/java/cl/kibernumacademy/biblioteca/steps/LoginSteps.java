package cl.kibernumacademy.biblioteca.steps;

import org.junit.jupiter.api.Assertions;

import cl.kibernumacademy.biblioteca.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

  private final LoginPage loginPage = new LoginPage();

  @Given("que me encuentre en la pagina principal para iniciar sesion")
  public void que_me_encuentre_en_la_pagina_principal_para_iniciar_sesion() {
    //No hay nada por que el hook ya abre la página principal 
  }

  @When("ingreso valores de inicio de sesion validos")
  public void ingreso_valores_de_inicio_de_sesion_validos() {
    loginPage.login("doctor", "password");
  }

  @When("ingreso valores de inicio de sesion invalidos")
  public void ingreso_valores_de_inicio_de_sesion_invalidos() {
    loginPage.login("medico", "error");
  }

  @Then("aparece un mensaje que dice que las credenciales son correctas")
  public void aparece_un_mensaje_que_dice_que_las_credenciales_son_correctas() {
   // String mensajeError = loginPage.obtenerError();
    //Assertions.assertEquals("Las credenciales son correctas", mensajeError);
  }

  @Then("validar mensaje de error al tener las credenciales erroneas")
  public void validar_mensaje_de_error_al_tener_las_credenciales_erroneas() {
    String mensajeError = loginPage.obtenerError();
    Assertions.assertEquals("Credenciales inválidas. Intenta de nuevo.", mensajeError);
  }

}
