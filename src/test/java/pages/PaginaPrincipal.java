package pages;

import Locators.PrincipalLocator;

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

}