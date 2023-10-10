package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Pages.Locators.GoogleLocators.*;

public class GooglePage extends BasePage{
    public GooglePage(){
        super();

    }

    public void navegarGoogle(){
        navigateTo(URL_GOOGLE);
    }
    public void botonGalletas(){

        click(BOTON_COOKIES_GOOGLE);
    }
    public void escribirBusqueda(){

        write(INPUT_BUSCAR_GOOGLE,"automatizacion");
    }

    public void pulsarBotonBuscar(){

        driver.findElement(BOTON_BUSCAR_GOOGLE).click();

    }

    public void clickEnlace(){
        driver.findElement(By.partialLinkText("wikipedia")).click();
    }

    public void obtenerTexto(){

        List<WebElement> parrafos = driver.findElements(By.tagName("p"));

        for(WebElement parrafo:parrafos){
            String textoparrafo = parrafo.getText();
            if(textoparrafo.contains("primer mecanismo")){
                System.out.println(textoparrafo);
            }

        }
    }

}
