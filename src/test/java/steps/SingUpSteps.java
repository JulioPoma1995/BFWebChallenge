package steps;

import cucumber.api.java.en.*;
import pages.DemoblazePage;

public class SingUpSteps {

    DemoblazePage demoblaze = new DemoblazePage();

    @Given("^Demoblaze url$")
    public void ingresaraDemoblaze(){

        demoblaze.NavegarEnDemoblaze();

    }
    @When("^Ingresar al SingUp$")
    public void ClickEnLogin(){

        demoblaze.ClickSingUp();
    }
    @Then("^Registrar (.+) y (.+)$")
    public void RegistrarUsuario(String usuario, String pass) throws InterruptedException{
    demoblaze.IngresarDatos(usuario,pass);
    }
    @Then("^Click en Sing Up$")
    public void FinalizarRegistro(){
    demoblaze.Finalizar();
    }
    @And("^Aceptar Alerta$")
    public void Aceptar(){
        demoblaze.AceptarAlerta();
    }

}

