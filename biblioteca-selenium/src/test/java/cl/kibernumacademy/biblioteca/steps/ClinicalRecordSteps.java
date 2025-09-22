package cl.kibernumacademy.biblioteca.steps;

import org.junit.jupiter.api.Assertions;

import cl.kibernumacademy.biblioteca.pages.ClinicalRecord;
import cl.kibernumacademy.biblioteca.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClinicalRecordSteps {
    private final ClinicalRecord clinicalRecord = new ClinicalRecord();
    private final LoginPage loginPage = new LoginPage();

    @When("ingresa los datos del paciente {string}, {string}, {string}, {string}")
    public void ingresa_los_datos_del_paciente(String nombre, String diagnostico, String edad, String tratamientoPaciente) {
        // Primero, asegurarse de que el usuario esté logueado
        loginPage.login("doctor", "password");
        
        // Luego, abrir la página de registro de ficha clínica
        clinicalRecord.registarFicha(nombre, diagnostico, edad, tratamientoPaciente);
    }

    @Then("se muestra un mensaje de confirmación {string}")
    public void se_muestra_un_mensaje_de_confirmacion(String mensaje) {
        String mensajeExito = clinicalRecord.obtenerMensajeExito();
        Assertions.assertEquals(mensaje, mensajeExito);
    }
}
