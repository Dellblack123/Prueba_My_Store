package pages;

import Locators.CarritoLocator;
import Locators.PrincipalLocator;
import org.junit.Assert;

public class PaginaPrincipal extends BasePage{

    String inicioSesion = "//*[@id=\"_desktop_user_info\"]/div/a/span";
    String nav="//*[@id=\"top-menu\"]//li[.//text()[contains(., '%s')]]";



    public PaginaPrincipal(){
        super(driver);
    }

    public void navigateTo(){
        navigateToUrl(PrincipalLocator.BASE_URL);
    }

    public void clickInicioSesion(){
        click(PrincipalLocator.INICIO_SESION);
    }

    public void seleccionarCategoria(String opcion){
        String xpathSection = String.format(PrincipalLocator.PESTANA_CATEGORIA,opcion);
        click(xpathSection);
    }

    public void seleccionarSubCategoria(String opcion) {
        String xpathSection = String.format(PrincipalLocator.PESTANA_SUB_CATEGORIA,opcion);
        System.out.println(xpathSection);
        click(xpathSection);
    }

    public void posarMouseCategoria(String categoria){
        String xpathSection = String.format(PrincipalLocator.PESTANA_CATEGORIA,categoria);
        posarMouse(xpathSection);
    }

    public void posarMouseItem(){
        String xpathSection = String.format(PrincipalLocator.SELECCION_ITEM,1);
    }

    public void clickVistaRapida(){
        String xpathSection = String.format(PrincipalLocator.SELECCION_VISTA_RAPIDA,1,1);
        posarMouse(xpathSection);
    }

    public void validarProducto(){
        Assert.assertEquals("El producto agregado no es el esperado", "Mug The best is yet to come", getText(PrincipalLocator.NOMBRE_PRODUCTO));
    }

    public void validarMontoTotal(){
        int cantidad = Integer.parseInt(extractNumeric(getText(PrincipalLocator.CANTIDAD)));
        double precio = Double.parseDouble(extractNumeric(getText(PrincipalLocator.PRECIO_PRODUCTO)));
        double monto = cantidad*precio;
        System.out.println(cantidad +"-"+precio+"-" + monto);
        Assert.assertEquals("El monto no es el esperado", 11.9, monto,0.01);
    }

}