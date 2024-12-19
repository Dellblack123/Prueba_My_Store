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
    public static final String AGREGAR_CARRO = "//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button";
                                    String s = "//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button]";
    public static final String FINALIZAR_COMPRA = "//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a";

    public static final String NOMBRE_PRODUCTO = "//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[1]/div/div[2]/h6";

    public static final String PRECIO_PRODUCTO = "//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[1]/div/div[2]/p";
    public static final String CANTIDAD = "//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[1]/div/div[2]/span/strong";
}
