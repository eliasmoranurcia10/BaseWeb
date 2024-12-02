package org.nttdata.testing.StepDefinition;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.nttdata.testing.Pages.HomePage;
import org.nttdata.testing.Tasks.NavigateTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistrarUsuarioStepDefinition {
    @Given("el {actor} esta en la pagina de inicio")
    public void elUsuarioEstaEnLaPaginaDeInicio(Actor actor) {
        actor.attemptsTo(NavigateTo.theHomePage());
    }

    @And("selecciona el boton de registro")
    public void seleccionaElBotonDeRegistro() {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.BTN_SIGN_UP));
    }

    @And("ingresa un nombre de usuario {string} y contrasenia {string}")
    public void ingresaUnNombreDeUsuarioYContrasenia(String username, String password) {
        theActorInTheSpotlight().attemptsTo(Enter.theValue(username).into(HomePage.INP_USERNAME));
        theActorInTheSpotlight().attemptsTo(Enter.theValue(password).into(HomePage.INP_PASSWORD));
    }

    @And("selecciona el boton registrar")
    public void seleccionaElBotonRegistrar() {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.BTN_REGISTRAR));
    }

    @Then("se realiza el registro de manera exitosa")
    public void seRealizaElRegistroDeManeraExitosa() {
        System.out.println("exitoso");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
