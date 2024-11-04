package com.espacialSac.pe.steps;

import com.espacialSac.pe.pages.RegistroVuelosPage;
import net.thucydides.core.annotations.Step;

public class RegistroVuelosStep extends RegistroVuelosPage {

    @Step("Ingresar Usuario")
    public void typeTripulante(String namesTripulantes) {
        ingresarTripulante(namesTripulantes);
    }
    @Step("Agregar tripulante")
    public void clickAgregar() {
        darclicAgregarTripulante();
    }
    @Step("Selecciono base")
    public void seleccionoBase(String base) {
        seleccionarBaseDeLanzamiento(base);
    }

    @Step("Selecciono destino")
    public void seleccionoDestino(String destino) {
        seleccionarDestino(destino);
    }

    @Step("Ingresar fecha de despegue")
    public void typeFechaDespegue(String fecha) {
        ingresarFechaDespegue(fecha);
    }

    @Step("Selecciono ruta")
    public void seleccionoRuta(String ruta) {
        seleccionarRuta(ruta);
    }

    @Step("Selecciono nave")
    public void seleccionoNave(String nave) {
        seleccionarNave(nave);
    }

    @Step("Selecciono nave")
    public void doyClicAlBotonEnviar() {
        darClicEnviar();
    }

    @Step("Obtengo Gracias")
    public void obtenerGracias() {
        capturarMenwsaje();
    }

}