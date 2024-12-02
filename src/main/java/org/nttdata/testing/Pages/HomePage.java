package org.nttdata.testing.Pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://www.demoblaze.com/")
public class HomePage extends PageObject {


    //  SIGN UP
    public static final Target BTN_SIGN_UP = Target
            .the("Boton para hacer el registro")
            .located(By.id("signin2"));

    public static final Target REGISTER_MODAL = Target
            .the("Modal de registro")
            .located(By.id("signInModalLabel"));

    public static final Target INP_USERNAME = Target
            .the("Nombre de usuario")
            .located(By.id("sign-username"));

    public static final Target INP_PASSWORD = Target
            .the("Contraseña")
            .located(By.id("sign-password"));

    public static final Target BTN_REGISTRAR = Target
            .the("Boton Registrar")
            .located(By.xpath("//button[text()='Sign up']"));

    //  LOG IN
    public static final Target BTN_LOGIN = Target
            .the("Boton para iniciar sesion")
            .located(By.id("login2"));

    public static final Target INP_USERNAME_LOG = Target
            .the("Nombre del usuario de logeo")
            .located(By.id("loginusername"));

    public static final Target INP_PASSWORD_LOG = Target
            .the("Password de logeo")
            .located(By.id("loginpassword"));

    public static final Target BTN_LOGEAR = Target
            .the("Boton Logear")
            .located(By.xpath("//button[text()='Log in']"));

    // PRODUCT
    public static Target BtnProducto(String nombreproducto){
        return Target
                .the("Boton del producto " + nombreproducto)
                .located(By.xpath("//a[text()='"+nombreproducto+"']"));
    }

    public static final Target BTN_ADD_TO_CARD = Target
            .the("Boton para agregar al carrito")
            .located(By.xpath("//a[text()='Add to cart']"));

}