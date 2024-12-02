package org.nttdata.testing.Tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.nttdata.testing.Pages.HomePage;

public class RegistrarUsuario implements Task {
    private final String username;
    private final String password;

    public RegistrarUsuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.BTN_SIGN_UP),
                Enter.theValue(username).into(HomePage.INP_USERNAME),
                Enter.theValue(password).into(HomePage.INP_PASSWORD),
                Click.on(HomePage.BTN_REGISTRAR)
        );
    }
}
