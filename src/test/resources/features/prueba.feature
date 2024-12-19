Feature: Product - Store

  Scenario Outline: Validacion del precio de un producto

    Given estoy en la página de la tienda
      And me logueo con mi usuario "<user>" y clave "<password>"
    When navego a la categoria "<categoria>" y subcategoria "<subCate>"
    #Arreglar la seleccion de subcategoria
      And agrego "<cantidad>" unidades del primer producto al carrito
    Then valido en el popup la confirmación del producto agregado
      And valido en el popup que el monto total sea calculado correctamente
    When finalizo la compra
    Then valido el titulo de la pagina del carrito
      And vuelvo a validar el calculo de precios en el carrito

    Examples:
      | user                   | password      | categoria | subCate | cantidad |
      | germanmp1002@gmail.com | 123123_321321 | Accesorios | Home Accessories | 2 |