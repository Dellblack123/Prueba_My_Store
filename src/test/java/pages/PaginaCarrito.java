package pages;

import Locators.CarritoLocator;
import org.junit.Assert;

public class PaginaCarrito extends BasePage{

    public PaginaCarrito(){
        super(driver);
    }

    public void validarTitulo(){
        Assert.assertEquals("El título de la página del carrito no es el esperado.", "Carrito", CarritoLocator.TITULO);
    }
}
