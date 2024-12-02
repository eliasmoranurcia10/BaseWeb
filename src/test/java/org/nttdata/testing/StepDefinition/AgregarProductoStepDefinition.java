package org.nttdata.testing.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.nttdata.testing.Pages.HomePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AgregarProductoStepDefinition {

    @And("selecciona el Producto {string} de la pagina")
    public void seleccionaElProductoDeLaPagina(String producto) {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.BtnProducto(producto)));
    }

    @And("Agrega al carrito el producto capturando el texto de la alerta")
    public void agregaAlCarritoElProductoCapturandoElTextoDeLaAlerta() {

        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.BTN_ADD_TO_CARD));
        WebDriver driver = theActorInTheSpotlight().abilityTo(BrowseTheWeb.class).getDriver();
        //Espera la alerta para capturarla
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        //Captura el texto de la alerta y lo imprime
        String alertText = alert.getText();
        System.out.println("El Texto de la alerta es: " + alertText);

        alert.accept();
    }

    @Then("se agrega el producto de manera exitosa")
    public void seAgregaElProductoDeManeraExitosa() {
        System.out.println("Producto Agregado con éxito al carrito de compra");
    }
}
