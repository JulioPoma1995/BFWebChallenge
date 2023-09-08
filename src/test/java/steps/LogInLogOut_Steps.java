package steps;

import cucumber.api.java.en.*;
import pages.DemoblazePage;

public class LogInLogOut_Steps {
    DemoblazePage demoblaze = new DemoblazePage();

    @When("^Ingreso al Login$")
    public void ClickEnLogin(){

        demoblaze.ClickLogin();
    }

    @Then("^Agrego (.+) y (.+) de usuario creado$")
    public void IngresarCuenta(String usuario, String pass) throws InterruptedException{

        demoblaze.IngresarUsuario(usuario,pass);

    }

    @Then("^Click en LogIn$")
    public void FinalizarLogIn(){

        demoblaze.FinalizarLogIn();

    }

    @And("^Realizo el Logout$")
    public void RealizarLogOut(){

        demoblaze.RealizarLogOut();

    }

}
