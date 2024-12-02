package org.nttdata.testing;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
            features = "src/test/resources/features",
            glue = "org.nttdata.testing",
            tags = "@InteraccionesdelUsuario"
        )
public class RunnerTest {
}
