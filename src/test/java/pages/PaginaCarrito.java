package pages;

import Locators.CarritoLocator;
import Locators.PrincipalLocator;
import org.junit.Assert;

public class PaginaCarrito extends BasePage{

    public PaginaCarrito(){
        super(driver);
    }

    public void validarTitulo(){
        Assert.assertEquals("El título de la página del carrito no es el esperado.", "CARRITO", getText(CarritoLocator.TITULO));
    }

    public void validarMontoTotal(){
        int cantidad = Integer.parseInt(getInputValue(CarritoLocator.CANTIDAD_PRODUCTO));
        double precio = Double.parseDouble(extractNumeric(getText(CarritoLocator.PRECIO)));
        double monto = cantidad*precio;
        System.out.println(cantidad +"-"+precio+"-" + monto);
        Assert.assertEquals("El monto no es el esperado", 11.9, monto,0.01);
    }

}
