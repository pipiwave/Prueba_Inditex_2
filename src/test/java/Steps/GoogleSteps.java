package Steps;

import Pages.GooglePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class GoogleSteps {
    GooglePage google = new GooglePage();

    @Given("navego a google")
    public void navigateToGoogle(){
        google.navegarGoogle();
        google.botonGalletas();
    }

    @And("hago la busqueda")
    public void searchGoogle(){

        google.escribirBusqueda();
        google.pulsarBotonBuscar();

    }

    @When("entro en el enlace")
    public void clickToSearch(){

        google.clickEnlace();
        google.obtenerTexto();
    }

    @Then("hago una captura de pantalla")
    public void takeScreenShot() throws IOException {
        google.takeScreen();
    }


}
