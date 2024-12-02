package org.nttdata.testing.Tasks;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import org.nttdata.testing.Pages.HomePage;

public class NavigateTo {
    public static Performable theHomePage() {
        return Task.where("{0} opens the Home page", Open.browserOn().the(HomePage.class));
    }
}

