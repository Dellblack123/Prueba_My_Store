package Locators;

public class PrincipalLocator {

    public static final String BASE_URL = "https://qalab.bensg.com/store/pe/";
    public static final String INICIO_SESION = "//*[@id=\"_desktop_user_info\"]/div/a/span";
    public static final String CORREO = "//*[@id=\"field-email\"]";
    public static final String PASSWORD = "//*[@id=\"field-password\"]";
    public static final String BOTON_INICIO = "//*[@id=\"submit-login\"]";
    public static final String PESTANA_CATEGORIA = "//*[@id=\"_desktop_top_menu\"]/ul/li[.//text()[contains(., '%s')]]";
    public static final String PESTANA_SUB_CATEGORIA = "//*[@id=\"_desktop_top_menu\"]/ul/li/div[.//text()[contains(., '%s')]]";
    public static final String SELECCION_ITEM  = "//*[@id=\"js-product-list\"]/div/div[%s]";
    public static final String SELECCION_VISTA_RAPIDA  = "//*[@id=\"js-product-list\"]/div/div[%s]//a[.//text()[contains(., 'Vista')]]";

}
