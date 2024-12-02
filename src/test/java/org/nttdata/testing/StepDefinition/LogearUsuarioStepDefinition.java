package org.nttdata.testing.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.nttdata.testing.Pages.HomePage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LogearUsuarioStepDefinition {
    @And("selecciona el boton de login de la pagina")
    public void seleccionaElBotonDeLoginDeLaPagina() {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.BTN_LOGIN));
    }

    @And("ingresa un nombre de usuario {string} y su password {string} en modal de login")
    public void ingresaUnNombreDeUsuarioYSuPasswordEnModalDeLogin(String usernamelog, String passwordlog) {
        theActorInTheSpotlight().attemptsTo(Enter.theValue(usernamelog).into(HomePage.INP_USERNAME_LOG));
        theActorInTheSpotlight().attemptsTo(Enter.theValue(passwordlog).into(HomePage.INP_PASSWORD_LOG));
    }

    @And("selecciona el boton de logeo del modal")
    public void seleccionaElBotonDeLogeoDelModal() {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.BTN_LOGEAR));
    }

    @Then("se realiza el logeo de manera exitosa")
    public void seRealizaElLogeoDeManeraExitosa() {
        System.out.println("Se realizó el logeo de manera exitosa");
    }
}
