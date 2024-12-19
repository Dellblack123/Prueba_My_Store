package steps;

import Locators.PrincipalLocator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaginaCarrito;
import pages.PaginaPrincipal;

public class PruebaStep {

    PaginaPrincipal principal = new PaginaPrincipal();
    PaginaCarrito carrito;

    @Given("estoy en la página de la tienda")
    public void estoyEnLaPáginaDeLaTienda() {
        principal.navigateTo();
        principal.clickInicioSesion();
    }

    @And("me logueo con mi usuario {string} y clave {string}")
    public void meLogueoConMiUsuarioYClave(String mail, String password) {
        principal.write(PrincipalLocator.CORREO,mail);
        principal.write(PrincipalLocator.PASSWORD,password);
        principal.click(PrincipalLocator.BOTON_INICIO);
    }

    @When("navego a la categoria {string} y subcategoria {string}")
    public void navegoALaCategoriaYSubcategoria(String categoria, String subCategoria) throws InterruptedException {
        principal.posarMouseCategoria(categoria);
        principal.seleccionarSubCategoria(subCategoria);
    }

    @And("agrego {string} unidades del primer producto al carrito")
    public void agregoUnidadesDelPrimerProductoAlCarrito(String posicion) {
        principal.posarMouseItem();
        principal.clickVistaRapida();
    }

    @Then("valido en el popup la confirmación del producto agregado")
    public void validoEnElPopupLaConfirmaciónDelProductoAgregado() {
    }

    @And("valido en el popup que el monto total sea calculado correctamente")
    public void validoEnElPopupQueElMontoTotalSeaCalculadoCorrectamente() {
    }

    @When("finalizo la compra")
    public void finalizoLaCompra() {
    }

    @Then("valido el titulo de la pagina del carrito")
    public void validoElTituloDeLaPaginaDelCarrito() {
    }

    @And("vuelvo a validar el calculo de precios en el carrito")
    public void vuelvoAValidarElCalculoDePreciosEnElCarrito() {

    }

}