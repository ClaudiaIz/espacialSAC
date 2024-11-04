package com.espacialSac.pe.pages;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;

import java.time.Duration;

public class RegistroVuelosPage extends PageObject {

    @FindBy(id="var1")
    protected WebElementFacade txtTripulante;

    @FindBy(id="addVar")
    protected WebElementFacade btnAgregarTripu;

    @FindBy(id="input_16")
    protected WebElementFacade dropdownBaseLanzamiento;

    @FindBy(id="input_17")
    protected WebElementFacade dropdownDestino;

    @FindBy(id="lite_mode_12")
    protected WebElementFacade txtFechaDespegue;

    @FindBy(id="label_19")
    protected WebElementFacade lblRuta;


    @FindBy(id="input_19")
    protected WebElementFacade dropdownRuta;

    @FindBy(id="input_20")
    protected WebElementFacade dropdownNave;

    @FindBy(id="input_2")
    protected WebElementFacade btnEnviar;

    @FindBy(css = ".thankyou-main-text.ty-text")
    protected WebElementFacade mensaje;


    public void ingresarTripulante(String nombre) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("customFieldFrame_22"));
        wait.until(ExpectedConditions.visibilityOf(txtTripulante)); // Espera a que el elemento sea visible

        // Desplaza el elemento a la vista
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", txtTripulante);
        txtTripulante.sendKeys(nombre);
        getDriver().switchTo().defaultContent();
    }
    public void darclicAgregarTripulante() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("customFieldFrame_22"));
        wait.until(ExpectedConditions.visibilityOf(txtTripulante)); // Espera a que el elemento sea visible
        btnAgregarTripu.click();
        getDriver().switchTo().defaultContent();
    }

    public void seleccionarBaseDeLanzamiento(String opcion) {
        Select select = new Select(dropdownBaseLanzamiento);
        select.selectByValue(opcion);
    }

    public void seleccionarDestino(String opcion) {
        Select select = new Select(dropdownDestino);
        select.selectByValue(opcion);
    }

    public void ingresarFechaDespegue(String fecha) {
        txtFechaDespegue.sendKeys(fecha + Keys.TAB+ Keys.TAB);
        getDriver().findElement(By.tagName("body")).click();
        //getDriver().switchTo().defaultContent();
    }

    public void seleccionarRuta(String opcion) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(dropdownRuta)); // Espera a que el dropdown sea visible
        wait.until(ExpectedConditions.elementToBeClickable(dropdownRuta)); // Espera a que sea clickeable

        dropdownRuta.click();
        Select select = new Select(dropdownRuta);
        select.selectByValue(opcion);
    }

    public void seleccionarNave(String opcion) {
        Select select = new Select(dropdownNave);
        select.selectByValue(opcion);
    }

    public void darClicEnviar() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        btnEnviar.click();
    }

    public String capturarMenwsaje() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        String textoTitulo = mensaje.getText();
        System.out.println("Texto del h1 capturado: " + textoTitulo);
        return textoTitulo;
    }


}
