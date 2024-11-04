package com.espacialSac.pe.stepDefinitions;


import com.espacialSac.pe.steps.RegistroVuelosStep;
import com.espacialSac.pe.utilities.website.WebSite;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.pt.Dado;
import net.thucydides.core.annotations.Steps;

import static org.junit.Assert.assertEquals;

public class RegistroVuelosStepDefinition {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    RegistroVuelosStep registroVuelosStep;

    @Given("que ingresamos a la página web")
    public void userNavigateTo(){
        url.mavigateTo("https://form.jotform.com/243067705485058");
    }

    @When("ingreso el nombre del tripulante {string}")
    public void ingresoElNombreDelTripulante(String nombre) {
        registroVuelosStep.typeTripulante(nombre);
    }

    @Then("Entonces se muestra el mensaje {string}")
    public void entoncesSeMuestraElMensaje(String mensaje) {
        assertEquals(mensaje, registroVuelosStep.capturarMenwsaje());
    }

    @And("doy click a Agregar Tripulante")
    public void doyClickAAgregarTripulante() {
        registroVuelosStep.clickAgregar();
    }

    @And("selecciono la base {string}")
    public void seleccionoLaBase(String base) {
        registroVuelosStep.seleccionoBase(base);
    }

    @And("selecciono el destino {string}")
    public void seleccionoElDestino(String destino) {
        registroVuelosStep.seleccionarDestino(destino);
    }

    @And("ingreso la fecha de despegue {string}")
    public void ingresoLaFechaDeDespegue(String fecha) {
        registroVuelosStep.typeFechaDespegue(fecha);
    }

    @And("selecciono la ruta {string}")
    public void seleccionoLaRuta(String ruta) {
        registroVuelosStep.seleccionoRuta(ruta);
    }

    @And("selecciono la nave {string}")
    public void seleccionoLaNave(String nave) {
        registroVuelosStep.seleccionarNave(nave);
    }

    @And("doy click al boton Enviar")
    public void doyClickAlBotonEnviar() {
        registroVuelosStep.doyClicAlBotonEnviar();
    }
}