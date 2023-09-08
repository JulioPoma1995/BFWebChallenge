package steps;

import cucumber.api.java.en.*;
import org.junit.Assert;
import pages.DemoblazePage;

public class SeleccionProductoSteps {

    DemoblazePage demoblaze = new DemoblazePage();

    @Then("^Selecciono el producto$")
    public void ProductSeleccion() throws InterruptedException {

        demoblaze.SeleccionarProducto();

    }

    @Then("^Agrego el producto a la lista de compras$")
    public void AgregarProducto(){

        demoblaze.AgregaProducto();

    }

    @And("^Valido la seleccion de (.+)$")
    public void ValidaProductoSeleccionado(String producto){

     String esperado = demoblaze.ValidarProducto();

        Assert.assertEquals(producto,esperado);

    }

}
